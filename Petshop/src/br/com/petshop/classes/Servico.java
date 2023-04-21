package br.com.petshop.classes;

public class Servico {
	private String servico;
	private double valor;
	
	public Servico(String servico, double d) {
		this.setServico(servico);
		this.valor = d;
	}
	
	public void setValor(float valor) {
		if(valor!=this.valor) {
			this.valor = valor;
		}
	}
	
	private double valor() {
		return valor;
	}
	
	public double getValor() {
		return valor();
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}
	
	
}
