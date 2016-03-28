package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "itemPed_id", sequenceName = "itemPed_seq", allocationSize = 1)
public class ItemPedido implements EntityGeneric {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itemPed_id")
	@Column(name = "itemPed_id")
	private long id;
	private int qtd;
	private double precoitem;

	@ManyToOne
	private Produto produto;

	@ManyToOne
	private Pedido pedido;

	@Override
	public long getId() {
		return this.id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Produto getProduto() {
		return this.produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getPrecoitem() {
		return this.precoitem;
	}

	public void setPrecoitem(double precoitem) {
		this.precoitem = precoitem;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public void addProduto(int qtd, Produto produto) {
		this.qtd = qtd;
		this.produto = produto;
		this.subTotal();
	}

	private void subTotal() {
		this.precoitem = this.qtd * this.produto.getPreco();
	}

	@Override
	public String toString() {
		return "Id: " + getId() + " Descricao: " + this.produto.getNome() + " Quantidade: " + this.getQtd()
				+ " Total: R$ " + getPrecoitem();
	}

}
