package model;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Delivery extends Pedido {
	private double trocoPara;
	
	@ManyToOne
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTrocoPara() {
		return trocoPara;
	}

	public void setTrocoPara(double trocoPara) {
		this.trocoPara = trocoPara;
	}

	@Override
	public String toString() {
		return "Id: "+getId()+" Data: "+getData()+" Total: "+this.getPrecoPedido()+" Status: "+getStatus()+" Cliente: "+this.cliente.getNome()+
				" Tipo: "+getClass().getSimpleName()+"\n";
	}
	
}
