package com.programacaoiii.assistencia_tecnica.model.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_cliente")
public class Cliente extends Pessoa{
	
	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	List<Hardware> hardware = new ArrayList<>();

	public Cliente() {
		super();
	}
	
	public Cliente(String nome, String cpf, LocalDate dataNascimento, String endereco) {
		super(nome, cpf, dataNascimento, endereco);
	}
	
	public void verHardwares() {
		
	}
	
	public void aprovarOrcamento() {
		
	}
	
	public void cancelarOS() {
		
	}
	
}
