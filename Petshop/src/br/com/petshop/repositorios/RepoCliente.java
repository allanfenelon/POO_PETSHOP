
package br.com.petshop.repositorios;
import br.com.petshop.classes.*;
import java.util.ArrayList;

public class RepoCliente implements RepoClienteInter{

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
		
	
	private int indiceBusca(String buscaNome) {
		int i;
	
		for(i = 0; i<(clientes.size()-1);i++) {
			Cliente aux;
			aux = clientes.get(i);
			if(aux.getNomeCliente() == buscaNome) {
				return i;
			}else {
				return -1;
			}
		}
		
		return -555;
		
	}
	public void modificaCliente(String buscaNome, Cliente atualiza) {
		int indice;
		indice = indiceBusca(buscaNome);
		clientes.set(indice, atualiza);
	}
	
	public void excluirCliente(String busca) {
		int indice;
		indice = indiceBusca(busca);
		clientes.remove(indice);
	}

}
