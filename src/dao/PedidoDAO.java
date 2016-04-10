package dao;

import model.Pedido;

public class PedidoDAO extends PadraoDAO<Pedido> {

	@Override
	public Class<Pedido> entityClass() {
		return Pedido.class;
	}

}
