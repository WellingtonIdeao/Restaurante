package dao;

import javax.persistence.EntityManager;
import model.Cliente;

public class ClienteDAO extends PadraoDAO<Cliente> {

	public ClienteDAO(EntityManager manager) {
		super(manager);
	}


	@Override
	public Class<Cliente> entityClass() {
		return  Cliente.class;
	}

}
