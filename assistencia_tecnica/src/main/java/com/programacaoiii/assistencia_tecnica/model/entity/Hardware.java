package com.programacaoiii.assistencia_tecnica.model.entity;

import com.programacaoiii.assistencia_tecnica.model.enums.TipoHardware;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hardware")
public class Hardware extends Produto{
	
	@Enumerated(EnumType.STRING)
	private TipoHardware tipoHardware;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	public Hardware() {
    	super();
    }
	
	public Hardware(TipoHardware tipoHardware, Cliente cliente) {
		super();
		initUUID();
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
