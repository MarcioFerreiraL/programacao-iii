package com.programacaoiii.model;

public abstract class TemplateMethod {
	private static final void executarProcessoReparo() {}
	public abstract void diagnosticarProblema();
	public abstract void realizarReparo();
	public abstract void realizarTestes();
	public abstract void separarMateriais();
	public abstract void limpezaFinal();
}
