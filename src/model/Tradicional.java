package model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
@Entity
public class Tradicional extends Pedido {
	
	@ManyToOne
	private Mesa mesa;

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	@Override
	public String toString() {
		return "Id: "+getId()+" Data: "+getData()+" Total: "+this.getPrecoPedido()+" Status: "+getStatus()+" Cliente: "+this.mesa.getDescricao()+
				"("+this.mesa.getId()+") Atendido: "+null+" Tipo: "+getClass().getSimpleName()+"\n";

	}

}
