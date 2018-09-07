package br.com.livrariaecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.livrariaecommerce.controller.CarrinhoController;
import br.com.livrariaecommerce.controller.HomeController;
import br.com.livrariaecommerce.dao.LivroDAO;
import br.com.livrariaecommerce.entity.Carrinho;

@EnableWebMvc
@ComponentScan(basePackageClasses = { HomeController.class, LivroDAO.class, CarrinhoController.class, Carrinho.class })
public class AppWebConfiguration {

	@Bean	
	public InternalResourceViewResolver internalResourceViewResolver() {
		InternalResourceViewResolver resourceViewResolver = new InternalResourceViewResolver();
		resourceViewResolver.setPrefix("/WEB-INF/view/");
		resourceViewResolver.setSuffix(".jsp");
		return resourceViewResolver;
	}
}
