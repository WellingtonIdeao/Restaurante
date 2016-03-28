package dao;

import javax.persistence.EntityManager;
import model.Cardapio;
import model.Produto;

public class ProdutoDAO extends PadraoDAO<Produto> {

	public ProdutoDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Produto> entityClass() {
		return Produto.class;
	}

}
