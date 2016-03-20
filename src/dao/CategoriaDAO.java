package dao;

import javax.persistence.EntityManager;
import model.Categoria;

public class CategoriaDAO extends PadraoDAO<Categoria> {

	public CategoriaDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Categoria> entityClass() {
		return Categoria.class;
	}

}
