package view;

import model.Tradicional;
import service.DeliveryService;
import service.TradicionalService;

public class Tela {

	public static void main(String[] args)  {
	
		// CADASTRAR FUNCIONARIO
//		Funcionario f = new Funcionario();
//		f.setId(9);
//		f.setLogin("IdeaoTESTE");
//		f.setSenha("123456");
//		f.setTelefone("9999-9999");
//		f.setEmail("guga123@gmail.com");
//		f.setCpf("999.999.999.-99");
//		f.setCargo("Analista");
//		f.setSalario(20000);		
//		FuncionarioService fs = new FuncionarioService();
//		f = fs.buscar(f);
//		fs.inserir(f);
//		f.setNome("Guga Ideão");
//		f.setSalario(10);
//		fs.atualizar(f);
//		System.out.println(f);
//		fs.remover(f);
//		System.out.println(fs.listar());
		
		//CADASTRAR CLIENTE
//		Cliente c = new Cliente();
//		c.setId(11);
		//		c.setNome("Pedro");
//		c.setCpf("999.999.999-99");
//		Calendar ca = Calendar.getInstance();
//		ca.set(1995, 10, 9);
//		Date date = ca.getTime();
////		System.out.println(date);
//		c.setDataNasc(date);
//		c.setTelefone("9999-9999");		
//		ClienteService cs = new ClienteService();
//		c = cs.buscar(c);
//		System.out.println(c.getPedidos());
//		c.setNome("guga");
//		cs.atualizar(c);
//		cs.remover(c);
//		cs.inserir(c);
//		System.out.println(cs.listar());
//		
		//Reserva
//		ReservaService rs = new ReservaService();
//		Reserva re = new Reserva();
		
//		rs.inserir(re);
//		MesaService ms = new MesaService();
//		Mesa m = new Mesa();
//		m.setId(1);
//		m = ms.buscar(m);
//		re.setMesa(m);
//		rs.inserir(re);
//		re.setId(1);
//		re = rs.buscar(re);
//		rs.atualizar(re);
//		m.setCapacidade(10);
//		ms.atualizar(m);
//		rs.remover(re);
//		m.setDescricao("Mesa 1");
//		ms.inserir(m);
		
//	System.out.println(rs.listar());
		
		
		
	//CADASTRAR CATEGORIA
//		Categoria ct = new Categoria();
//		CategoriaService cas = new CategoriaService();
//		cas.inserir(ct);
//		ct.setId(4);
//		ct = cas.buscar(ct);
//		ct.setNome("Salgados");
//		ct.setNome("Bebibas");
//		cas.atualizar(ct);
//		cas.remover(ct);
//		System.out.println(cas.listar());	
				
		//CADASTRAR PRODUTO		
//		Produto pro = new Cardapio();
//		pro.setId(4);
//		CategoriaService cas = new CategoriaService();
//		Categoria ca = new Categoria();
//		ProdutoService pros = new ProdutoService();
//		pro = pros.buscar(pro);
//		ca.setId(3);
//		pro.setCategoria(cas.buscar(ca));
//		pro.setPreco(20);
//		pro.setNome("coxinha");
//		pros.atualizar(pro);
//		pros.inserir(pro);
//		pros.remover(pro);
//		System.out.println(pros.listar());
		
		
		//FAZER PEDIDO DELIVERY
//		DeliveryService ds = new DeliveryService();
//		Delivery del = new Delivery();
//		ProdutoService pros = new ProdutoService();
//		ClienteService cs = new ClienteService();
//		Cliente c = new Cliente();
//		c.setId(11);
		
//		System.out.println();
//		c = cs.buscar(c);
//		del.setCliente(c);
//		CategoriaService cats = new CategoriaService();
//		Produto car = new Cardapio();
//		car.setId(5);
//		del.addProduto(2,pros.buscar(car));
//		ds.inserir(del);
//		del.setId(1);
//		del = ds.buscar(del);
//		//System.out.println(del.getTrocoPara());
//		del.setTrocoPara(50);
//		ds.atualizar(del);
//		ds.remover(del);
//		System.out.println(ds.listar());
//		car = pros.buscar(car);
//		ds.inserir(del);
		
		


//		del.addProduto(3, car);
//		DeliveryService dser = new DeliveryService();
//		ds.inserir(del);
//		System.out.println(dser.listar());
		
		//FAZER PEDIDO TRADICIONAL
		Tradicional tra = new Tradicional();
//		ProdutoService pros = new ProdutoService();
//		MesaService ms = new MesaService();
//		Mesa mesa = new Mesa();
//		mesa.setId(1);
//		mesa = ms.buscar(mesa);
//		tra.setMesa(mesa);
//		mesa.setDescricao("Mesa 1");
//		ms.inserir(mesa);
//		mesa.setId(3);
//		tra.setMesa(ms.buscar(mesa));
//		Produto car = new Cardapio();
//		car.setId(5);
//		car = pros.buscar(car);
////		car.setPreco(10);
////		pros.atualizar(car);
//		//		car.setId(1);
////		car = pros.buscar(car);
//		tra.addProduto(3,car);
		TradicionalService ts = new TradicionalService();
		tra.setId(2);
		tra = ts.buscar(tra);
		ts.remover(tra);
//		tra.setStatus(Status.ATENDIDO);
//		ts.inserir(tra);
//		ts.atualizar(tra);
		System.out.println(ts.listar());
//		
//		c = cs.buscar(c);
//		System.out.println(c.getPedidos());
		
		
		
		
	}

}
