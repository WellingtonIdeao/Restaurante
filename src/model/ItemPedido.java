package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "itemPed_id",sequenceName = "itemPed_seq",allocationSize = 1)
public class ItemPedido extends EntityGeneric {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "itemPed_id")
	@Column(name = "itemPed_id")
	private long id;
	
	private int qtd;
	private double precoitem;
	
	@ManyToOne
	private Cardapio cardapio;

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


	public Cardapio getCardapio() {
		return cardapio;
	}

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}
	public double getPrecoitem() {
		return  getPrecoitem();
	}

	public void setPrecoitem(double precoitem) {
		this.precoitem = precoitem;
	}
	private void total(){
		this.precoitem = qtd * getCardapio().getPreco();
	}
}
