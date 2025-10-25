package com.programacaoiii.assistencia_tecnica.service.patterns.state;

import com.programacaoiii.assistencia_tecnica.model.entity.OrdemServico;

public abstract class AbstractEstadoOS implements State {

    protected void proibir(String acao) {
        throw new IllegalStateException("Ação '" + acao + "' não é permitida neste estado.");
    }

    @Override
    public void abrir(OrdemServico os) {
        proibir("Abrir");
    }

    @Override
    public void orcamentar(OrdemServico os) {
        proibir("Orçamentar");
    }

    @Override
    public void aprovar(OrdemServico os) {
        proibir("Aprovar");
    }

    @Override
    public void executar(OrdemServico os) {
        proibir("Executar");
    }

    @Override
    public void finalizar(OrdemServico os) {
        proibir("Finalizar");
    }

    @Override
    public void cancelar(OrdemServico os) {
        proibir("Cancelar");
    }
}