package br.com.petshop.classes;

public class Servico {
	private String servico;
	private float valor;
	
	public Servico(String servico, float valor) {
		this.setServico(servico);
		this.valor = valor;
	}
	
	public void setValor(float valor) {
		if(valor!=this.valor) {
			this.valor = valor;
		}
	}
	
	private float valor() {
		return valor;
	}
	
	public float getValor() {
		return valor();
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
}
