package service;

import javax.persistence.EntityManager;

import dao.ItemPedidoDAO;
import dao.PedidoDAO;
import model.Delivery;
import model.ItemPedido;

public class DeliveryService extends PedidoService {
	public void inserir(Delivery d) {
		EntityManager manager = fac.createEntityManager();
		
			try {
				PedidoDAO Pdao = new PedidoDAO(manager);
				ItemPedidoDAO ipdao = new ItemPedidoDAO(manager);
				
				if(d.getCliente() == null)
					throw new Exception("Pedido sem cliente");
				
				if(d.getItens().size() == 0)
					throw new Exception("Pedido sem itens");
				for(ItemPedido i : d.getItens() ){
					if(i.getProduto() == null)
						throw new Exception("item pedido sem produto");
					i.setPedido(d);
					ipdao.inserir(i);
				}
				
				Pdao.inserir(d);
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
			
}
