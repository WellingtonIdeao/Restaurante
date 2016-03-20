package service;

import java.util.List;

import javax.persistence.EntityManager;
import dao.ReservaDAO;

import model.Reserva;

public class ReservaService extends AbstractService {
	public void inserir(Reserva r)  {
		EntityManager manager = fac.createEntityManager();
			try {
				ReservaDAO Rdao = new ReservaDAO(manager);
				
			
				Rdao.inserir(r);
				manager.getTransaction().begin();
				manager.getTransaction().commit();
			} catch (Exception e) {
				manager.getTransaction().rollback();
			} finally {
				manager.close();
			}	

}

	public List<Reserva> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Reserva> list = null;
		try {
			ReservaDAO Rdao = new ReservaDAO(manager);
			list = Rdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Reserva r) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ReservaDAO Rdao = new ReservaDAO(manager);
			Rdao.remover(r);
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

	public boolean atualizar(Reserva r) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ReservaDAO Rdao = new ReservaDAO(manager);
			Rdao.atualizar(r);
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

	public Reserva buscar(Reserva r) {
		EntityManager manager = fac.createEntityManager();
		try{
			ReservaDAO Rdao = new ReservaDAO(manager);
			r = Rdao.buscarPorId(r.getId());
		}catch(Exception e){
			e.getStackTrace();
		}finally{
			manager.close();
		}
		return r;	
	}

}

