package br.com.livrariaecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Carrinho {
	private Float valorTotal;
	private List<Livro> livros = new ArrayList<>();

	public Float getValorTotal() {
		if (livros.size() < 0) {
			this.valorTotal = new Float(0);
		} else {
			float sum = 0;
			for (Livro livro : livros) {
				sum += livro.getPreco();
			}
			this.valorTotal = sum;
		}
		return this.valorTotal;
	}

}
