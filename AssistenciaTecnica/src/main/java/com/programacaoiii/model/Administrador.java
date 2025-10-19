package com.programacaoiii.model;

import java.time.LocalDate;

public class Administrador extends Pessoa implements Relatorio{

	public Administrador(int id, String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(id, nome, cpf, dataNascimento, endereco);
	}
	
	public void abrirOS(Cliente cliente, Hardware hardware) {
		
	}
	
	public void atualizarOS(OrdemServico os, Cliente cliente, Hardware hardware) {
		
	}
	
	public void excluirOS(OrdemServico os) {
		
	}

	@Override
	public void verRelatorioFinanceiro() {
		
	}

	@Override
	public void verRelatorioEstoque() {
		
	}

	@Override
	public void verRelatorioOS() {		
		
	}

}
