package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.ClienteDAO;
import dao.PedidoDAO;
import model.Cliente;
import model.Pedido;

public class ClienteService {
	public static EntityManagerFactory fac = Persistence.createEntityManagerFactory("Restaurante");

	public void CadastrarCliente(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		ClienteDAO dao = new ClienteDAO(manager);
		dao.inserir(c);
		PedidoDAO daopedido = new PedidoDAO(manager);
		
		for(Pedido p: c.getPedidos()){
			daopedido.inserir(p);
			p.setCliente(c);
			
		}
		
		manager.getTransaction().begin();
		manager.getTransaction().commit();

	}

	public void mostrarClientes() {
		EntityManager manager = fac.createEntityManager();
		ClienteDAO dao = new ClienteDAO(manager);
		List<Cliente> list = dao.listar();
		for (Cliente c : list) {
			System.out.println("id: " + c.getId() + "\tnome: " + c.getNome() + "\n");
		}

	}

	public boolean remover(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		ClienteDAO dao = new ClienteDAO(manager);
		manager.getTransaction().begin();
		if (dao.remover(c)) {
			manager.getTransaction().commit();
			return true;
		} else {
			manager.getTransaction().rollback();
			return false;
		}
	}

	public void atualizar(Cliente c) {
		EntityManager manager = fac.createEntityManager();
		ClienteDAO dao = new ClienteDAO(manager);
		Cliente c1 = c;
		dao.atualizar(c);
		c1.setNome("paulo");
		manager.getTransaction().begin();
		manager.getTransaction().commit();

	}

}
