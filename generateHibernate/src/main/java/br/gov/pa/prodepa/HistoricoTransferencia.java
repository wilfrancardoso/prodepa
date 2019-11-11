package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HistoricoTransferencia generated by hbm2java
 */
@Entity
@Table(name = "historico_transferencia")
public class HistoricoTransferencia implements java.io.Serializable {

	private long id;
	private Atendimento atendimento;
	private Centro centroByIdCentroDestino;
	private Centro centroByIdCentroOrigem;
	private Tecnico tecnico;
	private Date data;

	public HistoricoTransferencia() {
	}

	public HistoricoTransferencia(long id) {
		this.id = id;
	}

	public HistoricoTransferencia(long id, Atendimento atendimento, Centro centroByIdCentroDestino,
			Centro centroByIdCentroOrigem, Tecnico tecnico, Date data) {
		this.id = id;
		this.atendimento = atendimento;
		this.centroByIdCentroDestino = centroByIdCentroDestino;
		this.centroByIdCentroOrigem = centroByIdCentroOrigem;
		this.tecnico = tecnico;
		this.data = data;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atendimento")
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_centro_destino")
	public Centro getCentroByIdCentroDestino() {
		return this.centroByIdCentroDestino;
	}

	public void setCentroByIdCentroDestino(Centro centroByIdCentroDestino) {
		this.centroByIdCentroDestino = centroByIdCentroDestino;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_centro_origem")
	public Centro getCentroByIdCentroOrigem() {
		return this.centroByIdCentroOrigem;
	}

	public void setCentroByIdCentroOrigem(Centro centroByIdCentroOrigem) {
		this.centroByIdCentroOrigem = centroByIdCentroOrigem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico")
	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

}
