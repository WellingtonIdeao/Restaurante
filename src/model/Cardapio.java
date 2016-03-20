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
@SequenceGenerator(name = "cardap_id",sequenceName = "cardap_seq",allocationSize = 1)
public class Cardapio extends EntityGeneric {
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator = "cardap_id")
	@Column(name = "cardap_id")
	private long id;
	private String nome;
	private double preco;
	
	@ManyToOne
	@JoinColumn(name = "categ_id")
	private Categoria categoria;

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
