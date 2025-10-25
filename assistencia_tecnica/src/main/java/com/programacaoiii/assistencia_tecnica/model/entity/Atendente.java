package com.programacaoiii.assistencia_tecnica.model.entity;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atendente")
public class Atendente extends Pessoa{
	
	public Atendente() {
		super();
	}

	public Atendente(String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(nome, cpf, dataNascimento, endereco);
	}
	
	public void abrirOS(Cliente cliente, Hardware hardware) {
		
	}
	
	public void atualizarOS(OrdemServico os, Cliente cliente, Hardware hardware) {
		
	}
	
	public void reqExclusaoOS(OrdemServico os) {
		
	}
	
}
