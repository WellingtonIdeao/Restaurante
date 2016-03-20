package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
@Entity
@SequenceGenerator (name = "mesa_id",sequenceName = "mesa_seq", allocationSize = 1)
public class Mesa extends EntityGeneric {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mesa_id")
	@Column(name = "mesa_id")
	private long id;
	private int numero;
	private int capacidade;
	
	@OneToMany(mappedBy = "mesa")
	private List<Reserva> reservas;
	
	@OneToMany(mappedBy = "mesa")
	private List<PedidoTradicional> pedidos;

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return this.id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public List<PedidoTradicional> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoTradicional> pedidos) {
		this.pedidos = pedidos;
	}

}
