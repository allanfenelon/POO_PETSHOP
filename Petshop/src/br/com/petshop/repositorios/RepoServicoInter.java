package br.com.petshop.repositorios;

import java.util.ArrayList;

import br.com.petshop.classes.Servico;

public interface RepoServicoInter {
	// CRUD -> Servicos
	public void setServicos(Servico servicos);
	public ArrayList<Servico> getServicos();
	public void atualizarServico(Servico busca, Servico atualizar);
	public void removerServico(Servico busca);
}
