package br.com.livrariaecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@RequestMapping(value = "carrinhoDeCompras")
	public ModelAndView carrinho() {
		if (this.carrinho.getLivros().size() > 0) {
			return new ModelAndView("carrinho/carrinhodecompras").addObject("mensage",
					"Você não tem nenhum produto no carrinho!");
		}
		return new ModelAndView("carrinho/carrinhodecompras").addObject("produto", this.carrinho.getLivros());
		
	}

	@RequestMapping(value = "adicionaCarrinho")
	public ModelAndView adiciona(@RequestParam("id") Long id) {
		this.carrinho.getLivros().add(repository.selectObjectById(id));
		return new ModelAndView("carrinho/carrinhodecompras").addObject("produto", this.carrinho);
	}
}
