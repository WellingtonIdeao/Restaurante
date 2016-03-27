package dao;

import javax.persistence.EntityManager;
import model.Cardapio;

public class CardapioDAO extends PadraoDAO<Cardapio> {

	public CardapioDAO(EntityManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Class<Cardapio> entityClass() {
		return Cardapio.class;
	}

}
