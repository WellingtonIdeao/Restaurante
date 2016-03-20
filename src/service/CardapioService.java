package service;
import java.util.List;

import javax.persistence.EntityManager;

import dao.CardapioDAO;
import dao.ClienteDAO;
import dao.ReservaDAO;
import model.Cardapio;
import model.Cliente;
import model.ItemPedido;

public class CardapioService extends AbstractService {
	public void inserir(Cardapio c) throws Exception {
		EntityManager manager = fac.createEntityManager();
			try {
				CardapioDAO Cdao = new CardapioDAO(manager);
				Cdao.inserir(c);
				manager.getTransaction().begin();
				manager.getTransaction().commit();
			} catch (Exception e) {
				manager.getTransaction().rollback();
			} finally {
				manager.close();
			}	

}

	public List<Cardapio> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Cardapio> list = null;
		try {
			CardapioDAO Cdao = new CardapioDAO(manager);
			list = Cdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Cardapio c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			CardapioDAO Cdao = new CardapioDAO(manager);
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

	public boolean atualizar(Cardapio c) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			CardapioDAO Cdao = new CardapioDAO(manager);
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

	public Cardapio buscar(Cardapio c) {
		EntityManager manager = fac.createEntityManager();
		try{
			CardapioDAO Cdao = new CardapioDAO(manager);
			c = Cdao.buscarPorId(c.getId());
		}catch(Exception e){
			e.getStackTrace();
		}finally{
			manager.close();
		}
		return c;	
	}


}
