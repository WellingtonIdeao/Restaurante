package model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator (name = "ped_id", sequenceName = "ped_seq",allocationSize = 1)
public abstract class Pedido extends EntityGeneric {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ped_id")
	@Column(name = "pedido_id")
	private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	private double precoPedido;
	private Status status;
	
	@OneToMany
	private List<ItemPedido> itens;
	
	@ManyToOne
	@JoinColumn(name="cliente_id")
	private Cliente cliente;

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return this.id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getPrecoPedido() {
		return this.precoPedido;
	}

	public void setPrecoPedido(double precoPedido) {
		this.precoPedido = precoPedido;
	}
	private void total(){
		double total = 0;
		for(ItemPedido i: itens){
			total+= i.getPrecoitem();
		}
		this.precoPedido = total;
		
	}

}
