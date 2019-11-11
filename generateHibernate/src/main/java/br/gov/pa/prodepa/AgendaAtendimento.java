package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AgendaAtendimento generated by hbm2java
 */
@Entity
@Table(name = "agenda_atendimento")
public class AgendaAtendimento implements java.io.Serializable {

	private long id;
	private Centro centro;
	private PreAcolhimento preAcolhimento;
	private Date dataAgendamento;
	private String observacao;
	private int tipoAgendamento;
	private int statusAgeAtendimento;
	private int diaSemana;
	private Integer tipoAtendimento;
	private Long idTecnicoCriacao;
	private Long idTecnicoAlteracao;
	private Date dataCriacao;
	private Date dataAlteracao;
	private Set agendaTecnicos = new HashSet(0);
	private Set evolucaoAtendimentos = new HashSet(0);
	private Set agendaAtendimentoUsuarias = new HashSet(0);
	private Set atendimentos = new HashSet(0);
	private Set atendimentoVisitaDomiciliars = new HashSet(0);
	private Set atendimentoGrupos = new HashSet(0);

	public AgendaAtendimento() {
	}

	public AgendaAtendimento(long id, Centro centro, Date dataAgendamento, int tipoAgendamento,
			int statusAgeAtendimento, int diaSemana) {
		this.id = id;
		this.centro = centro;
		this.dataAgendamento = dataAgendamento;
		this.tipoAgendamento = tipoAgendamento;
		this.statusAgeAtendimento = statusAgeAtendimento;
		this.diaSemana = diaSemana;
	}

	public AgendaAtendimento(long id, Centro centro, PreAcolhimento preAcolhimento, Date dataAgendamento,
			String observacao, int tipoAgendamento, int statusAgeAtendimento, int diaSemana, Integer tipoAtendimento,
			Long idTecnicoCriacao, Long idTecnicoAlteracao, Date dataCriacao, Date dataAlteracao, Set agendaTecnicos,
			Set evolucaoAtendimentos, Set agendaAtendimentoUsuarias, Set atendimentos, Set atendimentoVisitaDomiciliars,
			Set atendimentoGrupos) {
		this.id = id;
		this.centro = centro;
		this.preAcolhimento = preAcolhimento;
		this.dataAgendamento = dataAgendamento;
		this.observacao = observacao;
		this.tipoAgendamento = tipoAgendamento;
		this.statusAgeAtendimento = statusAgeAtendimento;
		this.diaSemana = diaSemana;
		this.tipoAtendimento = tipoAtendimento;
		this.idTecnicoCriacao = idTecnicoCriacao;
		this.idTecnicoAlteracao = idTecnicoAlteracao;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
		this.agendaTecnicos = agendaTecnicos;
		this.evolucaoAtendimentos = evolucaoAtendimentos;
		this.agendaAtendimentoUsuarias = agendaAtendimentoUsuarias;
		this.atendimentos = atendimentos;
		this.atendimentoVisitaDomiciliars = atendimentoVisitaDomiciliars;
		this.atendimentoGrupos = atendimentoGrupos;
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
	@JoinColumn(name = "id_centro", nullable = false)
	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pre_atendimento")
	public PreAcolhimento getPreAcolhimento() {
		return this.preAcolhimento;
	}

	public void setPreAcolhimento(PreAcolhimento preAcolhimento) {
		this.preAcolhimento = preAcolhimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_agendamento", nullable = false, length = 13)
	public Date getDataAgendamento() {
		return this.dataAgendamento;
	}

	public void setDataAgendamento(Date dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "tipo_agendamento", nullable = false)
	public int getTipoAgendamento() {
		return this.tipoAgendamento;
	}

	public void setTipoAgendamento(int tipoAgendamento) {
		this.tipoAgendamento = tipoAgendamento;
	}

	@Column(name = "status_age_atendimento", nullable = false)
	public int getStatusAgeAtendimento() {
		return this.statusAgeAtendimento;
	}

	public void setStatusAgeAtendimento(int statusAgeAtendimento) {
		this.statusAgeAtendimento = statusAgeAtendimento;
	}

	@Column(name = "dia_semana", nullable = false)
	public int getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	@Column(name = "tipo_atendimento")
	public Integer getTipoAtendimento() {
		return this.tipoAtendimento;
	}

	public void setTipoAtendimento(Integer tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	@Column(name = "id_tecnico_criacao")
	public Long getIdTecnicoCriacao() {
		return this.idTecnicoCriacao;
	}

	public void setIdTecnicoCriacao(Long idTecnicoCriacao) {
		this.idTecnicoCriacao = idTecnicoCriacao;
	}

	@Column(name = "id_tecnico_alteracao")
	public Long getIdTecnicoAlteracao() {
		return this.idTecnicoAlteracao;
	}

	public void setIdTecnicoAlteracao(Long idTecnicoAlteracao) {
		this.idTecnicoAlteracao = idTecnicoAlteracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao", length = 29)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_alteracao", length = 29)
	public Date getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getAgendaTecnicos() {
		return this.agendaTecnicos;
	}

	public void setAgendaTecnicos(Set agendaTecnicos) {
		this.agendaTecnicos = agendaTecnicos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getEvolucaoAtendimentos() {
		return this.evolucaoAtendimentos;
	}

	public void setEvolucaoAtendimentos(Set evolucaoAtendimentos) {
		this.evolucaoAtendimentos = evolucaoAtendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getAgendaAtendimentoUsuarias() {
		return this.agendaAtendimentoUsuarias;
	}

	public void setAgendaAtendimentoUsuarias(Set agendaAtendimentoUsuarias) {
		this.agendaAtendimentoUsuarias = agendaAtendimentoUsuarias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set atendimentos) {
		this.atendimentos = atendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getAtendimentoVisitaDomiciliars() {
		return this.atendimentoVisitaDomiciliars;
	}

	public void setAtendimentoVisitaDomiciliars(Set atendimentoVisitaDomiciliars) {
		this.atendimentoVisitaDomiciliars = atendimentoVisitaDomiciliars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agendaAtendimento")
	public Set getAtendimentoGrupos() {
		return this.atendimentoGrupos;
	}

	public void setAtendimentoGrupos(Set atendimentoGrupos) {
		this.atendimentoGrupos = atendimentoGrupos;
	}

}