package service;

import javax.persistence.EntityManager;

import dao.ItemPedidoDAO;
import dao.PedidoDAO;
import model.ItemPedido;
import model.Tradicional;

public class TradicionalService extends PedidoService {

	public void inserir(Tradicional p) {
		EntityManager manager = fac.createEntityManager();
		
			try {
				PedidoDAO Pdao = new PedidoDAO(manager);
				ItemPedidoDAO ipdao = new ItemPedidoDAO(manager);
				if(p.getMesa() == null)
					throw new Exception("Pedido Tradicional sem mesa");
				
				if(p.getItens().size() == 0)
					throw new Exception("Pedido Tradicional sem itens");
				else{
					for(ItemPedido i : p.getItens() ){
						if(i.getProduto()== null)
							throw new Exception("Item  sem produto");
						i.setPedido(p);
						ipdao.inserir(i);
					
					}
				}
				
				Pdao.inserir(p);
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
