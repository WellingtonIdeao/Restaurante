package model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SequenceGenerator(name = "cliente_id", sequenceName = "cliente_seq", allocationSize = 1)
public class Cliente implements EntityGeneric {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_id")
	@Column(name = "cliente_id")
	private long id;
	private String nome;
	private String cpf;
	private String telefone;
	
	@Temporal(TemporalType.DATE)
	private Date dataNasc;
	
	@OneToMany(mappedBy = "cliente")
	private List<Delivery> pedidos;
	
	@OneToOne
	private Reserva reserva;

	@Embedded
	private Endereco ende;

	public Cliente(){
		this.ende = new Endereco();
	}
	
	@Override
	public long getId() {
		return id;
	}

	@Override
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEnde() {
		return ende;
	}

	public void setEnde(Endereco ende) {
		this.ende = ende;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}
	
	public List<Delivery> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Delivery> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Id: "+getId()+" Nome: "+getNome();
	}
	
	
}
