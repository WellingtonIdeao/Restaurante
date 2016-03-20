package dao;

import javax.persistence.EntityManager;
import model.ItemPedido;

public class ItemPedidoDAO extends PadraoDAO<ItemPedido> {

	public ItemPedidoDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<ItemPedido> entityClass() {
		return ItemPedido.class;
	}

}
