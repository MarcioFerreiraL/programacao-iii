package com.programacaoiii.model;

public class Hardware extends Produto{
	private TipoHardware tipoHardware;
	private Cliente cliente;
	
	public Hardware(TipoHardware tipoHardware, String numeroSerie, Cliente cliente) {
		super(numeroSerie);
		this.tipoHardware = tipoHardware;
		this.cliente = cliente;
	}

	public TipoHardware getTipoHardware() {
		return tipoHardware;
	}

	public void setTipoHardware(TipoHardware tipoHardware) {
		this.tipoHardware = tipoHardware;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
