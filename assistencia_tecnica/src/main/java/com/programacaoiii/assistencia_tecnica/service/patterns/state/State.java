package com.programacaoiii.assistencia_tecnica.service.patterns.state;

import com.programacaoiii.assistencia_tecnica.model.entity.OrdemServico;

public interface State {
	public abstract void abrir(OrdemServico os);
	public abstract void orcamentar(OrdemServico os);
	public abstract void aprovar(OrdemServico os);
	public abstract void executar(OrdemServico os);
	public abstract void finalizar(OrdemServico os);
	public abstract void cancelar(OrdemServico os);
}