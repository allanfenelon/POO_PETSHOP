package br.com.petshop.repositorios;
import br.com.petshop.classes.*;
import java.util.ArrayList;

public class RepoServico implements RepoServicoInter{

	private ArrayList<Servico> servicos;
	
	
	public RepoServico() {
		this.servicos= new ArrayList<Servico>();
	}
	
	public ArrayList<Servico> getServicos() {
		return servicos;
	}
	
	public void setServicos(Servico servicos) {
		this.servicos.add(servicos);
	}
	
	private int indiceBusca(Servico busca) {
		int i;
	
		for(i = 0; i<(servicos.size()-1);i++) {
			Servico aux;
			aux = servicos.get(i);
			if(aux.getServico()==busca.getServico()) {
				return i;
			}else {
				return -1;
			}
		}
		
		return -555;
		
	}
	
	public void atualizarServico(Servico busca, Servico atualizar) {
		int indice;
		indice = indiceBusca(busca);
		
		servicos.set(indice, atualizar);
	}
	
	
	public void removerServico(Servico busca) {
		int indice;
		indice = indiceBusca(busca);
		
		servicos.remove(indice);
	}
	
}
