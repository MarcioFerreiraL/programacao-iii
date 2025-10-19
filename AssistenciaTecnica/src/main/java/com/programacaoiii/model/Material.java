package com.programacaoiii.model;

import java.util.ArrayList;

public class Material {
	ArrayList<Peca> pecasUtilizadas = new ArrayList<>();

	public Material(ArrayList<Peca> pecasUtilizadas) {
		this.pecasUtilizadas = pecasUtilizadas;
	}

	public ArrayList<Peca> getPecasUtilizadas() {
		return pecasUtilizadas;
	}

	public void setPecasUtilizadas(ArrayList<Peca> pecasUtilizadas) {
		this.pecasUtilizadas = pecasUtilizadas;
	}
	
	
}
