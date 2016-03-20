package view;

import model.Endereco;
import model.Funcionario;
import model.Pedido;
import model.PedidoDelivery;
import model.PedidoTradicional;
import service.FuncionarioService;
import service.PedidoService;

public class Tela {

	public static void main(String[] args)  {
//		Cliente c = new Cliente();
//		c.setNome("Finished");
//		Date date = new Date("11/11/1998");
//		c.setDataNasc(date);
//		c.setCpf("123.456.789-12");
//		c.setTelefone("9999-9999");
		Endereco ende = new Endereco();
		ende.setRua("rua projetada");
		ende.setBairro("josé américo");
		ende.setCep("58000-000");
		ende.setNum(80);
		ende.setCidade("joão pessoa");
		ende.setComplemento("nenhum");
//		c.setEnde(ende);
//		Pedido pedido = new PedidoDelivery();  
//		c.setPedidos(pedido);
//		//ClienteService cliService = new ClienteService();
//		//cliService.CadastrarCliente(c);
//		
//		ClienteService cliService = new ClienteService();
//		cliService.CadastrarCliente(c);
////		cliService.mostrarClientes();
////		
////		c.setId(6);
////		c.setNome("Paulo");
////		c.setEnde(ende);
//		
////		System.out.println(cliService.remover(c));
////		cliService.atualizar(c);
//		cliService.mostrarClientes();
		Funcionario fun = new Funcionario();
		FuncionarioService service = new FuncionarioService();
		//fun.setEndereco(ende);
//		fun.setId(10);
//		fun.setCargo(Cargo.GERENTE);
//		fun.setEndereco(new Endereco());
//		service.atualizar(fun);
//		fun.setId(11);
//		service.remover(fun);
		Pedido pe = new PedidoTradicional();
		Pedido pb = new PedidoDelivery();
		PedidoService s = new PedidoService();
		try {
			s.inserir(pb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//	
//		System.out.println(service.listar());
	}

}
