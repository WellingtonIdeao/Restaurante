package model;
import javax.persistence.Entity;

@Entity
public class PedidoDelivery extends Pedido {
	private double trocoPara;

	public double getTrocoPara() {
		return trocoPara;
	}

	public void setTrocoPara(double trocoPara) {
		this.trocoPara = trocoPara;
	}
	
}
