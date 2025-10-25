package com.programacaoiii.assistencia_tecnica.service.patterns.state;

// Estado final, nenhuma transição é permitida.
public class EstadoCancelada extends AbstractEstadoOS {

    public EstadoCancelada() {
        System.out.println("OS foi Cancelada.");
    }
    
    // Nenhuma transição é válida a partir daqui.
}