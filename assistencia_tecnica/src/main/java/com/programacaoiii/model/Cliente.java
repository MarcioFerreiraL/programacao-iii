package com.programacaoiii.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
	
	List<Hardware> hardware = new ArrayList<>();

	public Cliente(int id, String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(id, nome, cpf, dataNascimento, endereco);
	}
	
	public void cadastrarHardware() {
		
	}
	
	public void verHardwares() {
		
	}
	
	public void aprovarOrcamento() {
		
	}
	
	public void cancelarOS() {
		
	}
	
}
