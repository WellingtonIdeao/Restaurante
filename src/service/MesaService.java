package service;

import java.util.List;

import javax.persistence.EntityManager;
import dao.MesaDAO;
import model.Mesa;

public class MesaService extends AbstractService{
	
	public void inserir(Mesa m) throws Exception {
		EntityManager manager = fac.createEntityManager();
			try {
				MesaDAO Mdao = new MesaDAO(manager);
				
			
				Mdao.inserir(m);
				manager.getTransaction().begin();
				manager.getTransaction().commit();
			} catch (Exception e) {
				manager.getTransaction().rollback();
			} finally {
				manager.close();
			}	

}

	public List<Mesa> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Mesa> list = null;
		try {
			MesaDAO Mdao = new MesaDAO(manager);
			list = Mdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Mesa m) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			MesaDAO Mdao = new MesaDAO(manager);
			Mdao.remover(m);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			ret = true;
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return ret;

	}

	public boolean atualizar(Mesa m) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			MesaDAO Mdao = new MesaDAO(manager);
			Mdao.atualizar(m);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
			ret = true;
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return ret;
	}

	public Mesa buscar(Mesa m) {
		EntityManager manager = fac.createEntityManager();
		MesaDAO Mdao = new MesaDAO(manager);
		return m = Mdao.buscarPorId(m.getId());
	}

}

