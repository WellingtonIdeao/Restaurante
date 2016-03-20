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
@SequenceGenerator(name = "categ_id",sequenceName = "categ_seq",allocationSize = 1)
public class Categoria extends EntityGeneric {
	@Id
	@GeneratedValue (strategy =GenerationType.SEQUENCE, generator = "categ_id")
	@Column(name = "categ_id")
	private long id;
	
	private String nome;
	
	@OneToMany(mappedBy="categoria")
	private List<Cardapio> cardapios;

	@Override
	public void setId(long id) {
		this.id = id;
	}

	@Override
	public long getId() {
		return this.id;
	}
}
