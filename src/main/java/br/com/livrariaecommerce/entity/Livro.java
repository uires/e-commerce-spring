package br.com.livrariaecommerce.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "livro")
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
	@Id
	private Long id;
	private String tituloDoLivro;
	private String descricao;
	private Integer paginas;

}
