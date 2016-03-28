package view;

import model.Cardapio;
import model.ItemPedido;
import model.Mesa;
import model.Tradicional;
import service.MesaService;
import service.ProdutoService;
import service.TradicionalService;

public class Tela {

	public static void main(String[] args)  {
	
		// CADASTRAR FUNCIONARIO
//		Funcionario f = new Funcionario();
//		f.setNome("Wellington Ideão");
//		f.setLogin("guga");
//		f.setSenha("123456");
//		f.setTelefone("9999-9999");
//		f.setEmail("guga123@gmail.com");
//		f.setCpf("999.999.999.-99");
//		f.setCargo("Gerente");
//		f.setSalario(10000);		
//		FuncionarioService fs = new FuncionarioService();
//		fs.inserir(f);
//		System.out.println(fs.listar());
		
		//CADASTRAR CLIENTE
//		Cliente c = new Cliente();
//		c.setNome("joão");
//		c.setCpf("999.999.999-99");
//		Calendar ca = Calendar.getInstance();
//		ca.set(1995, 10, 9);
//		Date date = ca.getTime();
//		System.out.println(date);
//		c.setDataNasc(date);
//		c.setTelefone("9999-9999");		
//		ClienteService cs = new ClienteService();
//		cs.inserir(c);
//		System.out.println(cs.listar());
		
	//CADASTRAR CATEGORIA
//		Categoria ct = new Categoria();
//		CategoriaService cas = new CategoriaService();
//		ct.setNome("Bebidas");
//		cas.inserir(ct);
//		System.out.println(cas.listar());	
				
		//CADASTRAR PRODUTO		
//		Produto pro = new Cardapio();
//		CategoriaService cas = new CategoriaService();
//		Categoria ca = new Categoria();
//		ca.setId(3);
//		pro.setNome("refrigerante");
//		pro.setCategoria(cas.buscar(ca));
//		pro.setPreco(20);
//		ProdutoService pros = new ProdutoService();
//		pros.atualizar(pro);
//		System.out.println(pros.listar());
		
		
		//FAZER PEDIDO DELIVERY
//		Delivery del = new Delivery();
//		ItemPedido item = new ItemPedido();
//		ProdutoService pros = new ProdutoService();
//		ClienteService cs = new ClienteService();
//		Cliente c =new Cliente();
//		c.setId(3);
//		del.setCliente(cs.buscar(c));
//		Cardapio car = new Cardapio();
//		car.setId(1);
//		item.addProduto(2,pros.buscar(car));
//		del.setItem(item);
//		del.setItem(item);
//		DeliveryService dser = new DeliveryService();
//		dser.inserir(del);
//		System.out.println(dser.listar());
//		
		//FAZER PEDIDO TRADICIONAL
//		Tradicional tra = new Tradicional();
//		ItemPedido item = new ItemPedido();
//		ProdutoService pros = new ProdutoService();
//		MesaService ms = new MesaService();
//		Mesa mesa = new Mesa();
//		mesa.setDescricao("Mesa 1");
//		ms.inserir(mesa);
//		mesa.setId(3);
//		tra.setMesa(ms.buscar(mesa));
//		Cardapio car = new Cardapio();
//		car.setId(1);
//		item.addProduto(5,pros.buscar(car));
//		tra.setItem(item);
//		TradicionalService ts = new TradicionalService();
//		ts.inserir(tra);
//		System.out.println(ts.listar());
		
		
		
		
	}

}
