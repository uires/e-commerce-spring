package br.com.livrariaecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.livrariaecommerce.dao.LivroDAO;
import br.com.livrariaecommerce.entity.Livro;

@Controller
public class LivroController {

	@Autowired
	private LivroDAO repository;

	@RequestMapping("cadastroLivro")
	public ModelAndView cadastroLivroMapping() {
		return new ModelAndView("livro/livro-formulario").addObject("livro", new Livro());
	}

	@RequestMapping("cadastrarLivro")
	public ModelAndView e(@ModelAttribute("livro") Livro livro) {
		System.out.println(livro.getDescricao());
		System.out.println(livro.getTituloDoLivro());
		System.out.println(livro.getPaginas().intValue());
		return cadastroLivroMapping();
	}
}
