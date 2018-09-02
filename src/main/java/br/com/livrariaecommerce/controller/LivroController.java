package br.com.livrariaecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.livrariaecommerce.dao.LivroDAO;
import br.com.livrariaecommerce.entity.Livro;

@Controller
@RequestMapping("/livro")
public class LivroController {

	@Autowired
	private LivroDAO repository;

	@RequestMapping("/cadastroLivro")
	public ModelAndView cadastroLivroMapping() {
		return new ModelAndView("livro/livro-formulario").addObject("livro", new Livro());
	}

	@RequestMapping("cadastrarLivro")
	public ModelAndView e(@ModelAttribute("livro") Livro livro, RedirectAttributes redirectAttributes,
			BeanPropertyBindingResult beanPropertyBindingResult) {
		if (beanPropertyBindingResult.hasErrors()) {
			return new ModelAndView("livro/livro-formulario");
		}
		repository.save(livro);
		redirectAttributes.addFlashAttribute("sucess", "Livro cadastrado com sucesso!");
		return new ModelAndView("redirect:/listaLivros");
	}

	@RequestMapping("/listaLivros")
	public ModelAndView listaLivros() {
		System.out.println("mapping \"/lista-livros\"");
		return new ModelAndView("livro/livro-listagem").addObject("livros", repository.selectAllLivros());
	}

	public ModelAndView buscaLivro(@RequestParam("filtre") String filtro, RedirectAttributes atributters) {
		List<Livro> seachLivros = repository.seachLivros(filtro);
		if ((seachLivros != null) && seachLivros.size() > 0) {
			return new ModelAndView("livro/livro-listagem").addObject("livros", seachLivros);
		} else {
			atributters.addFlashAttribute("emptyResult", "Nenhum registro encontrado!");
			return new ModelAndView("livro/livro-listagem");
		}
	}
}
