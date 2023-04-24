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
	
	static public void imprimir1() {
		limpa();
		System.out.println("+------------------------------+");
		System.out.println("|        OPCOES PETSHOP        |");
		System.out.println("|(1) - CADASTRAR CLIENTE       |");
		System.out.println("|(2) - CADASTRAR PET CLIENTE   |");
		System.out.println("|(3) - AGENDAR SERVICO CLIENTE |");
		System.out.println("|(4) - REALIZAR SERVICO CLIENTE|");
		System.out.println("|(6) - EDITAR CLIENTE          |");
		System.out.println("|(7) - REMOVER CLIENTE         |");
		System.out.println("|(8) - ADICIONAR SERVICOS      |");
		System.out.println("|(9) - EDITAR SERVICOS         |");
		System.out.println("|(10) - SAIR SISTEMA           |");
		System.out.println("+------------------------------+");
	}
	static public void edicaocliente() {
		limpa();
		System.out.println("+------------------------------+");
		System.out.println("|        EDICAO CLIENTE        |");
		System.out.println("|(1) - EXCLUIR CLIENTE         |");
		System.out.println("|(2) - MODIFICAR NOME CLIENTE  |");
		System.out.println("|(3) - VOLTAR AO INICIO        |");
		System.out.println("+------------------------------+");
	}
	
	static public void edicaoservicos() {
		limpa();
		System.out.println("+------------------------------+");
		System.out.println("|       EDICAO SERVICOS        |");
		System.out.println("|(1) - EXCLUIR SERVICO         |");
		System.out.println("|(2) - MODIFICAR NOME SERVICO  |");
		System.out.println("|(3) - MODIFICAR PRECO SERVICO |");
		System.out.println("|(3) - VOLTAR AO INICIO        |");
		System.out.println("+------------------------------+");
	}
	
	static public void limpa() {
		try{
			for(int i=0;i<20;i++) {
				System.out.println();
			}
			
        }catch(Exception e){
            System.out.println(e);
        }
	}
	
	public static void main(String[] args) {
		int opcao = 0;
		Scanner ler = new Scanner(System.in);
		imprimir1();
		edicaoservicos();
		
		
		
	}
}
