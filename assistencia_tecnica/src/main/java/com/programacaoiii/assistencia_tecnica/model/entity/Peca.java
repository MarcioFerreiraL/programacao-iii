package com.programacaoiii.assistencia_tecnica.model.entity;

import com.programacaoiii.assistencia_tecnica.model.enums.TipoPeca;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_peca")
public class Peca extends Produto{
	
	private String nome;
	
	@Enumerated(EnumType.STRING)
	private TipoPeca tipoPeca;
	
	public Peca() {
    	super();
    }
	
	public Peca(String nome, TipoPeca tipoPeca) {
		super();
		initUUID();
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
