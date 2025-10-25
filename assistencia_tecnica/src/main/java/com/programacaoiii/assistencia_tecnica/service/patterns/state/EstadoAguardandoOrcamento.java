package com.programacaoiii.assistencia_tecnica.service.patterns.state;

import com.programacaoiii.assistencia_tecnica.model.entity.OrdemServico;
import com.programacaoiii.assistencia_tecnica.model.enums.EstadoOS;

public class EstadoAguardandoOrcamento extends AbstractEstadoOS{
    @Override
    public void orcamentar(OrdemServico os) {
        System.out.println("Tecnico fazendo orcamento");
        os.setEstado(EstadoOS.EM_REPARO);
    }
    
    @Override
    public void cancelar(OrdemServico os) {
        System.out.println("Cancelado");
        os.setEstado(EstadoOS.CANCELADA);
    }
}
