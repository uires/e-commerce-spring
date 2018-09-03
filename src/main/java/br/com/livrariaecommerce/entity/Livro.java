package br.com.livrariaecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "loja")
@ToString
public class Livro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "titulo", nullable = false, length = 155, unique = true)
	@NotNull(message = "Esse campo é obrigatório")
	@Size(min = 5, max = 155, message = "Esse campo deve ter no mínino 5 caracteres e no máximo 155")
	private String tituloDoLivro;
	@Column(name = "descricao", nullable = false)
	@NotNull(message = "Esse campo é obrigatório")
	@Size(min = 5, message = "Esse campo deve ter no mínino 5 caracteres")
	private String descricao;
	@Column(name = "paginas", nullable = false)
	@NotNull(message = "Esse campo é obrigatório")
	private Integer paginas;
	@Column(name = "preco", nullable = false)
	@NotNull(message = "Esse campo é obrigatório")
	private Float preco;
	@Column(name = "url", length = 500)
	private String urlImagemLivro;

}
