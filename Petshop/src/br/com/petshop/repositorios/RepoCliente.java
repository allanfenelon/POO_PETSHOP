
package br.com.petshop.repositorios;
import br.com.petshop.classes.*;
import java.util.ArrayList;

public class RepoCliente {

	private ArrayList<Cliente> clientes;
		
		
	public RepoCliente() {
		this.clientes= new ArrayList<Cliente>();
	}
		
	public ArrayList<Cliente> getCliente() {
		return clientes;
	}
		
	public void setClientes(Cliente clientes) {
		this.clientes.add(clientes);
	}
		
		

}
