package br.com.livrariaecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Livro {

	@Getter
	@Setter
	private String tituloDoLivro;
	@Getter
	@Setter
	private String descricao;

}
