package service;

import java.util.List;

import javax.persistence.EntityManager;

import dao.CategoriaDAO;
import model.Categoria;

public class CategoriaService extends AbstractService {

	public void inserir(Categoria c) {
		EntityManager manager = fac.createEntityManager();
		try {
			CategoriaDAO Cdao = new CategoriaDAO(manager);
			Cdao.inserir(c);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

	}

	public List<Categoria> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Categoria> list = null;
		try {
			CategoriaDAO Cdao = new CategoriaDAO(manager);
			list = Cdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Categoria c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			CategoriaDAO Cdao = new CategoriaDAO(manager);
			Cdao.remover(c);
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

	public boolean atualizar(Categoria c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			CategoriaDAO Cdao = new CategoriaDAO(manager);
			Cdao.atualizar(c);
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

	public Categoria buscar(Categoria c) {
		EntityManager manager = fac.createEntityManager();
		try{
			CategoriaDAO Cdao = new CategoriaDAO(manager);
			c = Cdao.buscarPorId(c.getId());
		}catch(Exception e){
			e.getStackTrace();
		}finally{
			manager.close();
		}
		return c;	
	}

}
