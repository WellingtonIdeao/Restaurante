package dao;

import javax.persistence.EntityManager;

import model.Pedido;

public class PedidoDAO extends PadraoDAO<Pedido> {

	
	public PedidoDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Pedido> entityClass() {
		return Pedido.class;
	}

}
