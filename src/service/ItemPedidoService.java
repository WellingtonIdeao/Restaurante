package service;

import java.util.List;

import javax.persistence.EntityManager;

import dao.ItemPedidoDAO;
import model.ItemPedido;

public class ItemPedidoService extends AbstractService {

	public void inserir(ItemPedido i) {
		EntityManager manager = fac.createEntityManager();
		
		try {
			ItemPedidoDAO Ipdao = new ItemPedidoDAO(manager);
			Ipdao.inserir(i);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

	}

	public List<ItemPedido> listar() {
		EntityManager manager = fac.createEntityManager();
		List<ItemPedido> list = null;
		try {
			ItemPedidoDAO Ipdao = new ItemPedidoDAO(manager);
			list = Ipdao.listar();
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(ItemPedido i) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ItemPedidoDAO Ipdao = new ItemPedidoDAO(manager);
			Ipdao.remover(i);
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

	public boolean atualizar(ItemPedido i) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ItemPedidoDAO Ipdao = new ItemPedidoDAO(manager);
			Ipdao.atualizar(i);
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

	public ItemPedido buscar(ItemPedido i) {
		EntityManager manager = fac.createEntityManager();
		try {
			ItemPedidoDAO Ipdao = new ItemPedidoDAO(manager);
			i = Ipdao.buscarPorId(i.getId());
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			manager.close();
		}
		return i;
	}

}
