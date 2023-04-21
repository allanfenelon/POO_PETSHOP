package br.com.petshop.repositorios;

import java.util.ArrayList;

import br.com.petshop.classes.Cliente;

public interface RepoClienteInter{
	// CRUD -> Cliente
	public void setClientes(Cliente clientes); // C
	public ArrayList<Cliente> getCliente(); // R
	public void modificaCliente(String busca, Cliente atualiza); // U
	public void excluirCliente(String busca); // D
	
	
}
