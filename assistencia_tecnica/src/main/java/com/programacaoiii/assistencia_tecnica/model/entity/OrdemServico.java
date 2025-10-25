package com.programacaoiii.assistencia_tecnica.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import com.programacaoiii.assistencia_tecnica.model.enums.EstadoOS;
import com.programacaoiii.assistencia_tecnica.service.patterns.state.EstadoAberta;
import com.programacaoiii.assistencia_tecnica.service.patterns.state.*;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "tb_ordem_servico")
public class OrdemServico implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private UUID id;
	private double valorOrcamento;
	private String descricao;
	
	@Transient
    private State comportamentoEstado;
	
	@Enumerated(EnumType.STRING)
	private EstadoOS estado;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "hardware_id")
	private Hardware hardware;

	@ManyToOne
	@JoinColumn(name = "tecnico_id")
	private Tecnico tecnicoResponsavel;

	
	@ManyToMany
    @JoinTable(
        name = "tb_os_pecas",
        joinColumns = @JoinColumn(name = "ordem_servico_id"),
        inverseJoinColumns = @JoinColumn(name = "peca_id")
    )
    private Set<Peca> pecasUtilizadas = new HashSet<>();
	
	public OrdemServico() {
	}
	
	public OrdemServico(double valorOrcamento, String descricao, Cliente cliente, Hardware hardware, Tecnico tecnicoResponsavel) {
		this.id = UUID.randomUUID();
		this.valorOrcamento = valorOrcamento;
		this.descricao = descricao;
		this.cliente = cliente;
		this.hardware = hardware;
		this.tecnicoResponsavel = tecnicoResponsavel;
		// Define o estado inicial (e o comportamento)
		this.setEstado(EstadoOS.ABERTA); 
	}

	public UUID getId() {
		return id;
	}

	public double getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(double valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Hardware getHardware() {
		return hardware;
	}

	public void setHardware(Hardware hardware) {
		this.hardware = hardware;
	}

	public Tecnico getTecnicoResponsavel() {
		return tecnicoResponsavel;
	}

	public void setTecnicoResponsavel(Tecnico tecnicoResponsavel) {
		this.tecnicoResponsavel = tecnicoResponsavel;
	}
    
    // --- MÉTODOS DE DELEGAÇÃO DO PADRÃO STATE ---
    
	public void aprovar() {
        this.comportamentoEstado.aprovar(this);
    }
    
    public void orcamentar() {
        this.comportamentoEstado.orcamentar(this);
    }
    
    public void executar() {
        this.comportamentoEstado.executar(this);
    }
    
    public void finalizar() {
        this.comportamentoEstado.finalizar(this);
    }
    
    public void cancelar() {
        this.comportamentoEstado.cancelar(this);
    }

    // ---------------------------------------------
    
    public EstadoOS getEstado() {
        return estado;
    }

    public void setEstado(EstadoOS novoEstado) {
        this.estado = novoEstado; // Salva o Enum no banco

        // Atualiza o objeto de comportamento (Padrão State)
        // com base no Enum que foi salvo!
        switch (novoEstado) {
            case ABERTA:
                this.comportamentoEstado = new EstadoAberta();
                break;
            case AGUARDANDO_APROVACAO:
                this.comportamentoEstado = new EstadoAguardandoAprovacao();
                break;
            case EM_REPARO:
                this.comportamentoEstado = new EstadoEmReparo();
                break;
            case FINALIZADA:
                this.comportamentoEstado = new EstadoFinalizada();
                break;
            case CANCELADA:
                this.comportamentoEstado = new EstadoCancelada();
                break;
            case AGUARDANDO_ORCAMENTO:
            	this.comportamentoEstado = new EstadoAguardandoOrcamento();
            default:
                this.comportamentoEstado = new EstadoAberta();
        }
    }
}