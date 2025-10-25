package com.programacaoiii.assistencia_tecnica.controller;

import java.util.ArrayList;
import com.programacaoiii.assistencia_tecnica.model.entity.Peca;

public class MaterialController {
	ArrayList<Peca> pecasUtilizadas = new ArrayList<>();

	public MaterialController(ArrayList<Peca> pecasUtilizadas) {
		this.pecasUtilizadas = pecasUtilizadas;
	}

	public ArrayList<Peca> getPecasUtilizadas() {
		return pecasUtilizadas;
	}

	public void setPecasUtilizadas(ArrayList<Peca> pecasUtilizadas) {
		this.pecasUtilizadas = pecasUtilizadas;
	}
	
	
}
