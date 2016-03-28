package model;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@SequenceGenerator (name = "ped_id", sequenceName = "ped_seq",allocationSize = 1)
public abstract class Pedido implements EntityGeneric {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ped_id")
	@Column(name = "pedido_id")
	private long id;
	private String telefone;
	private double precoPedido;
	private Status status;
	
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	private Funcionario funcionario;
	
	@OneToMany(mappedBy= "pedido")
	private List<ItemPedido> itens;
	
	public Pedido(){
		this.itens = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		this.data = calendar.getTime();
			
	} 
	
	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return this.id;
	}

	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Funcionario getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}


	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
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

	public List<ItemPedido>getItens() {
		return itens;
	}

	public void setItem(ItemPedido item) {
		this.itens.add(item);
		this.total();
	}


	public double getPrecoPedido() {
		return this.precoPedido;
	}

	public void setPrecoPedido(double precoPedido) {
		this.precoPedido = precoPedido;
	}
	public void addProduto(int qtd, Produto produto) {
		ItemPedido item = new ItemPedido();
		item.setProduto(produto);
		item.setQtd(qtd);
		this.itens.add(item);
		item.subTotal();
		this.total();
	}
	private void total(){
		double total = 0;
		for(ItemPedido i: itens){
			total+= i.getPrecoitem();
		}
		this.precoPedido = total;
		
	}

	
}
