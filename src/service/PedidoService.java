package service;

import java.util.List;

import javax.persistence.EntityManager;

import dao.PedidoDAO;
import model.ItemPedido;
import model.Pedido;

public class PedidoService extends AbstractService {

	public void inserir(Pedido p) {
		EntityManager manager = fac.createEntityManager();
			try {
				PedidoDAO Pdao = new PedidoDAO(manager);		
				Pdao.inserir(p);
				manager.getTransaction().begin();
				manager.getTransaction().commit();
			} catch (Exception e) {
				manager.getTransaction().rollback();
			} finally {
				manager.close();
			}	

}

	public List<Pedido> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Pedido> list = null;
		try {
			PedidoDAO Pdao = new PedidoDAO(manager);
			list = Pdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Pedido p) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			PedidoDAO Pdao = new PedidoDAO(manager);
			Pdao.remover(p);
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

	public boolean atualizar(Pedido p) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			PedidoDAO Pdao = new PedidoDAO(manager);
			Pdao.atualizar(p);
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

	public Pedido buscar(Pedido p) {
		EntityManager manager = fac.createEntityManager();
		try{
			PedidoDAO Pdao = new PedidoDAO(manager);
			p = Pdao.buscarPorId(p.getId());
		}catch(Exception e){
			e.getStackTrace();
		}finally{
			manager.close();
		}
		return p;	
	}

}
