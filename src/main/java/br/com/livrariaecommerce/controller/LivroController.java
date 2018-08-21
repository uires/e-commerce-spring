package br.com.livrariaecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LivroController {
	
	@RequestMapping("livro/cadastroLivro")
	public ModelAndView cadastroLivroMapping() {
		return new ModelAndView("livro/livro-formulario").addObject("livro", new Livro());
	}
}
