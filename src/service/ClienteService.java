package service;

import java.util.List;

import javax.persistence.EntityManager;
import dao.ClienteDAO;
import model.Cliente;



public class ClienteService extends AbstractService {

	public void inserir(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		ClienteDAO Cdao = new ClienteDAO(manager);
		
		try {
			Cdao.inserir(c);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if(manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

	}

	public List<Cliente> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Cliente> list = null;
		try {
			ClienteDAO Cdao = new ClienteDAO(manager);
			list = Cdao.listar();
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ClienteDAO Cdao = new ClienteDAO(manager);
			Cdao.remover(c);
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

	public boolean atualizar(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ClienteDAO Cdao = new ClienteDAO(manager);
			Cdao.atualizar(c);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			ret = true;
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();;
		} finally {
			manager.close();
		}
		return ret;
	}

	public Cliente buscar(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		try{
			ClienteDAO Cdao = new ClienteDAO(manager);
			c = Cdao.buscarPorId(c.getId());
		}catch(Exception e){
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		}finally{
			manager.close();
		}
		return c;	
	}

}
