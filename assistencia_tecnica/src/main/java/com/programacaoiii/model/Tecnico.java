package com.programacaoiii.model;

import java.time.LocalDate;

public class Tecnico extends Pessoa{
	
	private TemplateMethod templateMethod;

	public Tecnico(int id, String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(id, nome, cpf, dataNascimento, endereco);
	}
	
	public void fazerOrcamento(OrdemServico os, float valor) {
		
	}
	
	public void assumirOS(OrdemServico os) {
		
	}
	
	public void executarOS(OrdemServico os, Material material) {
		
	}
	
	public void finalizarOS(OrdemServico os) {
		
	}

}
