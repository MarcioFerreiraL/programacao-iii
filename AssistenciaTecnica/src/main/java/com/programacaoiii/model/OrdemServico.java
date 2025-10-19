package com.programacaoiii.model;

public class OrdemServico{
	private int id;
	private double valorOrcamento;
	private String descricao;
	private Material materialUtilizado;
	private Cliente cliente;
	private Hardware hardware;
	private Tecnico tecnicoResponsavel;
	private State estadoOS;
	
	public OrdemServico(int id, double valorOrcamento, String descricao, Material materialUtilizado, Cliente cliente,
			Hardware hardware, Tecnico tecnicoResponsavel, State estadoOS) {
		super();
		this.id = id;
		this.valorOrcamento = valorOrcamento;
		this.descricao = descricao;
		this.materialUtilizado = materialUtilizado;
		this.cliente = cliente;
		this.hardware = hardware;
		this.tecnicoResponsavel = tecnicoResponsavel;
		this.estadoOS = estadoOS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(double valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Material getMaterialUtilizado() {
		return materialUtilizado;
	}

	public void setMaterialUtilizado(Material materialUtilizado) {
		this.materialUtilizado = materialUtilizado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Tecnico getTecnicoResponsavel() {
		return tecnicoResponsavel;
	}

	public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
		this.tecnicoResponsavel = tecnicoResponsavel;
	}

	public State getEstadoOS() {
		return estadoOS;
	}

	public void setEstadoOS(State estadoOS) {
		this.estadoOS = estadoOS;
	}
	
	
	
	
}
