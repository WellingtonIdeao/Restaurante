package service;

import java.util.List;

import javax.persistence.EntityManager;

import dao.FuncionarioDAO;
import model.EntityGeneric;
import model.Funcionario;

public class FuncionarioService extends AbstractService {

	public void inserir(Funcionario f)  {
		EntityManager manager = fac.createEntityManager();
		
		try {

			FuncionarioDAO Fdao = new FuncionarioDAO(manager);
			Fdao.inserir(f);
			manager.getTransaction().begin();
			manager.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

	}

	public boolean remover(Funcionario f) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			FuncionarioDAO Fdao = new FuncionarioDAO(manager);
			Fdao.remover(f);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			ret = true;

		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return ret;
	}

	public boolean atualizar(Funcionario f) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			FuncionarioDAO Fdao = new FuncionarioDAO(manager);
			Fdao.atualizar(f);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			ret = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

		return ret;
	}

	public List<Funcionario> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Funcionario> list = null;
		try {
			FuncionarioDAO Fdao = new FuncionarioDAO(manager);
			list = Fdao.listar();
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return list;
	}

	public Funcionario buscar(Funcionario f) {
		EntityManager manager = fac.createEntityManager();
		try {
			FuncionarioDAO Fdao = new FuncionarioDAO(manager);
			f = Fdao.buscarPorId(f.getId());
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return f;
	}
}
