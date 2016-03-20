package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class PedidoTradicional extends Pedido {
	
	@ManyToOne
	private Mesa mesa;

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

}
