package br.com.livrariaecommerce.controller;

import org.hibernate.HibernateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.livrariaecommerce.dao.LivroDAO;
import br.com.livrariaecommerce.entity.Carrinho;

@Controller
@RequestMapping("carrinho")
public class CarrinhoController {
	@Autowired
	private Carrinho carrinho;
	@Autowired
	private LivroDAO repository;

	@RequestMapping(value = "/carrinho-de-compras")
	public ModelAndView carrinho() {
		if (carrinho.getLivros().size() <= 0) {
			System.out.println("Entrou no getLivros if");
			return new ModelAndView("carrinho/carrinhodecompras").addObject("mensage",
					"Você não tem nenhum produto no carrinho!");
		}
		return new ModelAndView("carrinho/carrinhodecompras").addObject("produto", carrinho.getLivros());

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
