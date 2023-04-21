package br.com.petshop.classes;


public class Cliente {
	private String nomeCliente;
	private Pets pet;
	private String servicoData;
	private String servicoHora;
	private float valorDivida;
	private int servicoMarcado = 0;
	private Servico servico;
	
	
	
	public Cliente(String nomeCliente, Pets pet) {
		this.setNomeCliente(nomeCliente);
		this.setPet(pet);
		this.setValorDivida(0);
	}
	
	public void marcarServico(String data, String hora, Servico servico){
		this.servicoData = data;
		this.servicoHora = hora;
		this.setServicoMarcado(1);
		this.setServico(servico);
	}
	
	public String getdata() {
		return this.servicoData;
	}
	
	public String gethora() {
		return this.servicoHora;
	}
	
	public void getDataeHora() {
		System.out.println("Data marcada: " + getdata() + " Horário: " + gethora());
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Pets getPet() {
		return pet;
	}

	public void setPet(Pets pet) {
		this.pet = pet;
	}

	public int getServicoMarcado() {
		return servicoMarcado;
	}

	public void setServicoMarcado(int servicoMarcado) {
		this.servicoMarcado = servicoMarcado;
	}

	public float getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(float valorDivida) {
		this.valorDivida = valorDivida;
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public String servicoARealizar() {
		if(getServicoMarcado()==1) {
			return "Sim";
		}else {
			return "Nao";
		}
	}
	public void realizarServico() {
		
	}
	
	
}
