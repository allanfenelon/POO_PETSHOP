package br.com.petshop.repositorios;


import java.util.ArrayList;


import br.com.petshop.classes.Pets;

public class RepoPets implements RepoPetsInter{
	private ArrayList<Pets> pets;

	public RepoPets() {
		this.pets= new ArrayList<Pets>();
	}
	
	public ArrayList<Pets> getPets(){
		return this.pets;
	}
	
	public void setPets(Pets pets){
		this.pets.add(pets);
	}
			
	
	private int indiceBusca(String buscaNome) {
		for(int i = 0; i<(pets.size()-1);i++) {
			Pets aux;
			aux = pets.get(i);
			if(aux.getNome() == buscaNome) {
				return i;
			}else {
				return -1;
			}
		}
		
		return -555;
		
	}
	
	public void modificaPet(String buscaNome, Pets atualiza) {
		int indice;
		indice = indiceBusca(buscaNome);
		pets.set(indice, atualiza);
	}
	
	public void excluirCliente(String busca) {
		int indice;
		indice = indiceBusca(busca);
		pets.remove(indice);
	}
}


