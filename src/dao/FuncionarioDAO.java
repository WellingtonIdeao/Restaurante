package dao;

import javax.persistence.EntityManager;
import model.Funcionario;

public class FuncionarioDAO extends PadraoDAO<Funcionario> {

	public FuncionarioDAO(EntityManager manager) {
		super(manager);
	}

	@Override
	public Class<Funcionario> entityClass() {
		return Funcionario.class;
	}

}
