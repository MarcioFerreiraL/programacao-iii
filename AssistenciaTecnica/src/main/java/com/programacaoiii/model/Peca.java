package com.programacaoiii.model;

public class Peca extends Produto{
	private String nome;
	private TipoPeca tipoPeca;
	
	public Peca(String numeroSerie, String nome, TipoPeca tipoPeca) {
		super(numeroSerie);
		this.nome = nome;
		this.tipoPeca = tipoPeca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPeca getTipoPeca() {
		return tipoPeca;
	}

	public void setTipoPeca(TipoPeca tipoPeca) {
		this.tipoPeca = tipoPeca;
	}
	
	
	
}
