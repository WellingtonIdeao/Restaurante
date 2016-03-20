package dao;

import javax.persistence.EntityManager;
import model.Mesa;

public class MesaDAO extends PadraoDAO<Mesa> {

	public MesaDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Mesa> entityClass() {
		return Mesa.class;
	}

}
