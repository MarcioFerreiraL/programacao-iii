package com.programacaoiii.model;

public abstract class Produto {
	private String numeroSerie;

	public Produto(String numeroSerie) {
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	
}
