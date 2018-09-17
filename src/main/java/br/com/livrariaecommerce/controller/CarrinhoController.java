package br.com.livrariaecommerce.controller;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import br.com.livrariaecommerce.dao.LivroDAO;
import br.com.livrariaecommerce.entity.Carrinho;

@Controller
@RequestMapping("carrinho")
@Scope(value = WebApplicationContext.SCOPE_REQUEST)
public class CarrinhoController {
	@Autowired
	private Carrinho carrinho;
	@Autowired
	private LivroDAO repository;

	@RequestMapping(value = "/carrinho-de-compras")
	public ModelAndView carrinho() {
		if (carrinho.getLivros().size() <= 0) {
			return new ModelAndView("carrinho/carrinhodecompras").addObject("mensage",
					"Você não tem nenhum produto no carrinho!");
		}
		return new ModelAndView("carrinho/carrinhodecompras").addObject("produto", carrinho);

	}

	@RequestMapping(value = "/adicionaCarrinho", method = RequestMethod.GET)
	public ModelAndView adiciona(@RequestParam("id") Long id) {
		try {
			carrinho.getLivros().add(repository.selectObjectById(id));
			return new ModelAndView("redirect:/carrinho/carrinho-de-compras");
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
		}
		return new ModelAndView("redirect:/livro/listaLivros");
	}
}
