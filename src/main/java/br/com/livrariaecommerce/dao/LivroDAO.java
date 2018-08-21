package br.com.livrariaecommerce.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.livrariaecommerce.entity.Livro;

@Repository
public class LivroDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Livro livro) {
		manager.persist(livro);
	}
}
