package com.programacaoiii.assistencia_tecnica.service.patterns.state;

// Estado final, nenhuma transição é permitida.
public class EstadoFinalizada extends AbstractEstadoOS {
    
    public EstadoFinalizada() {
        System.out.println("OS Finalizada. Pronta para retirada.");
    }
    
    // Nenhuma transição é válida a partir daqui.
}