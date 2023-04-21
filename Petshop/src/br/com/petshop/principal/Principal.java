package br.com.petshop.principal;
import java.util.ArrayList;

import br.com.petshop.classes.Cliente;
import br.com.petshop.classes.Pets;
import br.com.petshop.repositorios.RepoCliente;
import br.com.petshop.repositorios.RepoServico;

public class Principal {
	public static void main(String[] args) {
		
		ArrayList<Cliente> retorno = new ArrayList<Cliente>();
		RepoCliente clientes = new RepoCliente();
		RepoServico servicos = new RepoServico();
		Pets p1 = new Pets("Zeca", "Pit-Bull", "Cachorro", "Média");
		Cliente c1 = new Cliente("Allan", p1);
		
		Pets p2 = new Pets("Urubu", "De briga", "Galo", "pequeno");
		Cliente c2 = new Cliente("Pedro", p2);
		
		clientes.setClientes(c1);
		clientes.setClientes(c2);
		
		retorno = clientes.getCliente();
		
		for(Cliente s:retorno) {
			System.out.println("Nome do cliente: " + s.getNomeCliente());
			System.out.println("Nome do Pet " + s.getPet().getNome());
			System.out.println("Ha servicos a fazer? " + s.servicoARealizar());
		}
		
		
		
	}
}
