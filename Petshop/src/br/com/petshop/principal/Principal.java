package br.com.petshop.principal;
import java.util.ArrayList;
import java.util.Scanner;

import br.com.petshop.classes.Cliente;
import br.com.petshop.classes.Pets;
import br.com.petshop.classes.Servico;
import br.com.petshop.repositorios.RepoCliente;
import br.com.petshop.repositorios.RepoServico;

public class Principal {
	static ArrayList<Cliente> retorno = new ArrayList<Cliente>();
	static RepoCliente clientes = new RepoCliente();
	static RepoServico servicos = new RepoServico();
	
	public void inter(int resposta) {
		Scanner ler = new Scanner(System.in);
		switch(resposta) {
			case 1:
				String nomeCliente, nomePet, raca, tipo, estatura;
				//cadastrar novo cliente
				System.out.println("Digite o nome do Cliente:");
				nomeCliente = ler.next();
				System.out.println("Digite o nome do seu pet:");
				nomePet = ler.next();
				System.out.println("Digite a raca do pet: ");
				raca = ler.next();
				System.out.println("Digite o tipo do pet:  ");
				tipo = ler.next();
				System.out.println("Digite a estatura do pet:  ");
				estatura = ler.next();
				Pets auxpet = new Pets(nomePet, raca, tipo, estatura);
				Cliente auxclie = new Cliente(nomeCliente, auxpet);
				clientes.setClientes(auxclie);
				
				break;
						
			case 2:
				// Cadastrar Serviços do PetShop
				String tipoServico;
				int valor;
				System.out.println("Digite o nome do Servico: ");
				tipoServico = ler.next();
				System.out.println("Digite o valor deste servico: ");
				valor = ler.nextInt();
				Servico auxserv = new Servico(tipoServico, valor);
				servicos.setServicos(auxserv);
				break;
		}
	}
	
	public static void main(String[] args) {
		

		Servico s1 = new Servico("Tosa", 50.35);
		
		servicos.setServicos(s1);

		
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
