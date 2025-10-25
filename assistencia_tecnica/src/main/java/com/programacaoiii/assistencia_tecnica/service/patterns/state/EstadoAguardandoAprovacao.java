package com.programacaoiii.assistencia_tecnica.service.patterns.state;

import com.programacaoiii.assistencia_tecnica.model.entity.OrdemServico;
import com.programacaoiii.assistencia_tecnica.model.enums.EstadoOS;

public class EstadoAguardandoAprovacao extends AbstractEstadoOS {

    @Override
    public void aprovar(OrdemServico os) {
        System.out.println("Transição: AGUARDANDO_APROVACAO -> EM_REPARO");
        os.setEstado(EstadoOS.EM_REPARO);
    }
    
    @Override
    public void cancelar(OrdemServico os) {
        System.out.println("Transição: AGUARDANDO_APROVACAO -> CANCELADA");
        os.setEstado(EstadoOS.CANCELADA);
    }
}