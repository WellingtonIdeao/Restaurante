package service;

import java.util.List;
import javax.persistence.EntityManager;
import dao.ProdutoDAO;
import model.Produto;

public class ProdutoService extends AbstractService {
	public void inserir(Produto p) {
		EntityManager manager = fac.createEntityManager();
		try {
			if (p.getCategoria() == null) {
				throw new Exception("Cardapio Sem categoria");
			}

			ProdutoDAO Pdao = new ProdutoDAO(manager);
			Pdao.inserir(p);
			manager.getTransaction().begin();
			manager.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}

	}

	public List<Produto> listar() {
		EntityManager manager = fac.createEntityManager();
		List<Produto> list = null;
		try {
			ProdutoDAO Pdao = new ProdutoDAO(manager);
			list = Pdao.listar();
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return list;
	}

	public boolean remover(Produto p) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ProdutoDAO Pdao = new ProdutoDAO(manager);
			Pdao.remover(p);
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

	public boolean atualizar(Produto p) {
		EntityManager manager = fac.createEntityManager();
		boolean ret = false;
		try {
			ProdutoDAO Pdao = new ProdutoDAO(manager);
			if(p.getCategoria() == null)
				throw new Exception("Cardapio Sem categoria");
			Pdao.atualizar(p);
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

	public Produto buscar(Produto p) {
		EntityManager manager = fac.createEntityManager();
		try {
			ProdutoDAO Pdao = new ProdutoDAO(manager);
			p = Pdao.buscarPorId(p.getId());
		} catch (Exception e) {
			e.printStackTrace();
			if (manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
		return p;
	}

}
