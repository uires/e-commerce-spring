package br.com.livrariaecommerce.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import br.com.livrariaecommerce.entity.Livro;

public class LivroValidation {

	public void validObject(Livro livro, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "tituloDoLivro", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "descricao", "field.required");
		if (livro.getPaginas() <= 5) {
			errors.rejectValue("paginas", "field.required");
		}
	}
}
