package br.com.petshop.repositorios;

import java.util.ArrayList;

import br.com.petshop.classes.Pets;

public interface RepoPetsInter {
	public ArrayList<Pets> getPets();
	public void setPets(Pets pets);
	public void modificaPet(String buscaNome, Pets atualiza);
	public void excluirCliente(String busca);
}
