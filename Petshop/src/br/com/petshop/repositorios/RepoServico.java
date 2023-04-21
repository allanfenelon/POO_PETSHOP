package br.com.petshop.repositorios;
import br.com.petshop.classes.*;
import java.util.ArrayList;

public class RepoServico {

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
	
	
}
