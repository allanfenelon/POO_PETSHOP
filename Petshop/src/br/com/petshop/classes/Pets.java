package br.com.petshop.classes;

public class Pets {
	private String nome;
	private String raca;
	private String tipo;
	private String estatura;
	
	public Pets(String nome, String raca, String tipo, String estatura) {
		setNome(nome);
		setRaca(raca);
		setTipo(tipo);
		setEstatura(estatura);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(!(nome.isEmpty())) {
			this.nome = nome;
		}
	}
	
	public void setRaca(String raca){
		if(!(raca.isEmpty())) {
			this.raca = raca;
		}
	}
	
	public String getRaca() {
		return this.raca;
	}
	
	public void setTipo(String tipo) {
		if(!(tipo.isEmpty())) {
			this.tipo = tipo;
		}
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setEstatura(String estatura) {
		if(!(estatura.isEmpty())) {
			this.estatura = estatura;
		}
	}
	
	public String getEstatura() {
		return this.estatura;
	}
}
