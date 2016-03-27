package view;

import model.Cardapio;
import model.Categoria;
import model.Cliente;
import model.Delivery;
import model.Funcionario;
import model.ItemPedido;
import model.Mesa;
import model.Tradicional;
import service.CardapioService;
import service.CategoriaService;
import service.ClienteService;
import service.DeliveryService;
import service.MesaService;
import service.PedidoService;
import service.TradicionalService;

public class Tela {

	public static void main(String[] args)  {
	
//		Cliente c = new Cliente();
//		ClienteService cs = new ClienteService();
//		c.setNome("guga");
//		c.setCpf("777.777.777-77");
//		Calendar  car = Calendar.getInstance();
//		car.set(1987, 10, 9);
//		c.setDataNasc(car.getTime());
////		List<PedidoDelivery> delverys =  new  ArrayList<>();
		
		
		// categoria
		
		Categoria categ = new Categoria();
		CategoriaService catserv = new CategoriaService();
//		categ.setNome("Alimentos");
//		catserv.inserir(categ);	
//		
		//cardapio
		CardapioService carserv = new CardapioService();
		Cardapio cardapp = new Cardapio();
//		cardapp.setNome("Prato Principal");
//		//busca categoria
		categ.setId(1);
		categ = catserv.buscar(categ);
//		cardapp.setCategoria(categ);
//		carserv.inserir(cardapp);
		
		//item Cardapio
	cardapp.setId(1);
		cardapp = carserv.buscar(cardapp);
//		ItemPedido item = new ItemPedido();
//		item.setCardapio(cardapp);
////		//pedido
		
////		ms.inserir(mesa);
//		mesa.setId(1L);
		Cliente c = new Cliente();
		ClienteService cs = new ClienteService();
//		c.setNome("JAMPA");
//		cs.inserir(c);
		c.setId(1l);
//		c.setId(4);
//		c.setNome("emOrdem");
//	//	c.setNome("Guga");
////		cs.atualizar(c);
////		c = cs.buscar(c);
//		
////		delivery.setItem(item)
////		delivery.setCliente(c);
		Delivery d = new Delivery();
		Tradicional t = new Tradicional();
		DeliveryService ps = new DeliveryService();
		Mesa mesa = new Mesa();
		MesaService ms = new MesaService();
//		ms.inserir(mesa);
		mesa.setId(2);
		mesa = ms.buscar(mesa);
//		t.setMesa(mesa);
//		d.setItem(new ItemPedido());
//		c = cs.buscar(c);
//		d.setCliente(c);
//		ps.inserir(d);
		
		//tradicional
//		PedidoTradicionalService ts = new PedidoTradicionalService();
//		Tradicional tradicional = new Tradicional();
		ItemPedido i = new ItemPedido();
//		tradicional.setMesa(mesa);
//		i.setCardapio(cardapp);
//		tradicional.setItem(i);
//		ts.inserir(tradicional);
		//delivery
//PedidoDeliveryService pds = new PedidoDeliveryService();
//Delivery de = new Delivery();
//Cliente cliente = new Cliente();
//ClienteService css = new ClienteService();
//cliente.setId(1);
//cliente = css.buscar(cliente);
//CardapioService carser = new CardapioService();
//Cardapio car = new Cardapio();
//car.setId(1);
//car = carser.buscar(car);
//de.setCliente(cliente);
//i.setCardapio(car);
//de.setItem(i);
//pds.inserir(de);
PedidoService ppp= new TradicionalService();
Cliente cccc= new Cliente();
Tradicional eee = new Tradicional();
Mesa m = new Mesa();
eee.setMesa(mesa);
Funcionario fun =new Funcionario();
		System.out.println(eee);
		
		
		
		
		
	}

}
