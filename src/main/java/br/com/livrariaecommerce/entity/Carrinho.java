package br.com.livrariaecommerce.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Carrinho {
	private Float valorTotal;
	private List<Livro> livros = null;

	public Float getValorTotal() {
		if (livros == null) {
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
