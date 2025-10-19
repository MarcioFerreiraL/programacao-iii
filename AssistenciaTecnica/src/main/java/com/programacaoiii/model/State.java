package com.programacaoiii.model;

public interface State {
	public abstract void abrir();
	public abstract void orcamentar();
	public abstract void aprovar();
	public abstract void executar();
	public abstract void finalizar();
	public abstract void cancelar();
}
