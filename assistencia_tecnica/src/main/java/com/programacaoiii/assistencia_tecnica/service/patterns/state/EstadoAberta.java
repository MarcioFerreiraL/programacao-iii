package com.programacaoiii.assistencia_tecnica.service.patterns.state;

import com.programacaoiii.assistencia_tecnica.model.entity.OrdemServico;
import com.programacaoiii.assistencia_tecnica.model.enums.EstadoOS;

public class EstadoAberta extends AbstractEstadoOS {

    @Override
    public void orcamentar(OrdemServico os) {
        System.out.println("Transição: ABERTA -> AGUARDANDO_APROVACAO");
        os.setEstado(EstadoOS.AGUARDANDO_APROVACAO);
    }
    
    @Override
    public void cancelar(OrdemServico os) {
        System.out.println("Transição: ABERTA -> CANCELADA");
        os.setEstado(EstadoOS.CANCELADA);
    }
}