package br.com.livrariaecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage() {
		System.out.println("mapping: \"/\"");
		return "index";
	}
}
