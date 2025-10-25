package com.programacaoiii.assistencia_tecnica.model.entity;

import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Produto {
	@Id
	private UUID numeroSerie;

	public Produto() {
    }
	
	public void initUUID() {
		this.numeroSerie = UUID.randomUUID();
	}

	public UUID getNumeroSerie() {
		return numeroSerie;
	}
	
	
}
