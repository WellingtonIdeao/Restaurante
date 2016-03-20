
package model;


import javax.persistence.Embedded;
import javax.persistence.Entity;
@Entity
public class Funcionario extends Usuario {
	
	private double salario;
	private String cpf;
	private Cargo cargo;

	@Embedded
	private Endereco endereco;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "id: "+this.getId()+" nome: "+this.getNome()+" "+this.getCargo();
	}

	

}
