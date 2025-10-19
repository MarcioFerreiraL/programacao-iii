package com.programacaoiii.model;

import java.time.LocalDate;

public class Atendente extends Pessoa{

	public Atendente(int id, String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(id, nome, cpf, dataNascimento, endereco);
	}
	
	public void abrirOS(Cliente cliente, Hardware hardware) {
		
	}
	
	public void atualizarOS(OrdemServico os, Cliente cliente, Hardware hardware) {
		
	}
	
	public void reqExclusaoOS(OrdemServico os) {
		
	}
	
}
