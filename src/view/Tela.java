package view;

import java.util.Calendar;
import java.util.Date;

import model.Cardapio;
import model.Cliente;
import model.Delivery;
import model.Produto;
import service.ClienteService;
import service.DeliveryService;
import service.ProdutoService;

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
//		c.setNome("Pedro");
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
//		ProdutoService pros = new ProdutoService();
//		ClienteService cs = new ClienteService();
//		Cliente c =new Cliente();
//		c.setId(4);
//		del.setCliente(cs.buscar(c));
//		Produto car = new Cardapio();
//		car.setId(1);
//		car = pros.buscar(car);
//		del.addProduto(3, car);
//		DeliveryService dser = new DeliveryService();
//		dser.inserir(del);
//		System.out.println(dser.listar());
		
		//FAZER PEDIDO TRADICIONAL
//		Tradicional tra = new Tradicional();
//		ProdutoService pros = new ProdutoService();
//		MesaService ms = new MesaService();
//		Mesa mesa = new Mesa();
//		mesa.setDescricao("Mesa 1");
//		ms.inserir(mesa);
//		mesa.setId(3);
//		tra.setMesa(ms.buscar(mesa));
//		Produto car = new Cardapio();
//		car.setId(1);
//		car = pros.buscar(car);
//		tra.addProduto(3,car);
//		TradicionalService ts = new TradicionalService();
//		ts.inserir(tra);
//		System.out.println(ts.listar());
		
//		c = cs.buscar(c);
//		System.out.println(c.getPedidos());
		
		
		
		
	}

}
