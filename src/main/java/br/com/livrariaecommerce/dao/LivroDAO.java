package br.com.livrariaecommerce.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.livrariaecommerce.entity.Livro;

@Repository
@Transactional
public class LivroDAO {

	@PersistenceContext
	private EntityManager manager;

	public void save(Livro livro) {
		manager.persist(livro);
	}

	public List<Livro> selectAllLivros() {
		return manager.createQuery("from Livro", Livro.class).getResultList();
	}

	public List<Livro> seachLivros(String filter) {
		return manager.createQuery("from Livro l WHERE l.tituloDoLivro LIKE '%" + filter + "%'").getResultList();
	}

	public Livro selectObjectById(Long id) {
		return manager.find(Livro.class, id);
	}
}
