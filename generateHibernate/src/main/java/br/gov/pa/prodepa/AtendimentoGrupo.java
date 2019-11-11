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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AtendimentoGrupo generated by hbm2java
 */
@Entity
@Table(name = "atendimento_grupo")
public class AtendimentoGrupo implements java.io.Serializable {

	private long id;
	private AgendaAtendimento agendaAtendimento;
	private Centro centro;
	private long numero;
	private Date dataCadastro;
	private Date dataAtendimentoGrupo;
	private String objetivo;
	private String metodologiaAplicada;
	private String observacaoTecnica;
	private long usuario;
	private Set historicoUsuarias = new HashSet(0);
	private Set usuarias = new HashSet(0);
	private Set tecnicos = new HashSet(0);

	public AtendimentoGrupo() {
	}

	public AtendimentoGrupo(long id, AgendaAtendimento agendaAtendimento, Centro centro, long numero, Date dataCadastro,
			Date dataAtendimentoGrupo, String objetivo, String metodologiaAplicada, long usuario) {
		this.id = id;
		this.agendaAtendimento = agendaAtendimento;
		this.centro = centro;
		this.numero = numero;
		this.dataCadastro = dataCadastro;
		this.dataAtendimentoGrupo = dataAtendimentoGrupo;
		this.objetivo = objetivo;
		this.metodologiaAplicada = metodologiaAplicada;
		this.usuario = usuario;
	}

	public AtendimentoGrupo(long id, AgendaAtendimento agendaAtendimento, Centro centro, long numero, Date dataCadastro,
			Date dataAtendimentoGrupo, String objetivo, String metodologiaAplicada, String observacaoTecnica,
			long usuario, Set historicoUsuarias, Set usuarias, Set tecnicos) {
		this.id = id;
		this.agendaAtendimento = agendaAtendimento;
		this.centro = centro;
		this.numero = numero;
		this.dataCadastro = dataCadastro;
		this.dataAtendimentoGrupo = dataAtendimentoGrupo;
		this.objetivo = objetivo;
		this.metodologiaAplicada = metodologiaAplicada;
		this.observacaoTecnica = observacaoTecnica;
		this.usuario = usuario;
		this.historicoUsuarias = historicoUsuarias;
		this.usuarias = usuarias;
		this.tecnicos = tecnicos;
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
	@JoinColumn(name = "id_agenda_atendimento", nullable = false)
	public AgendaAtendimento getAgendaAtendimento() {
		return this.agendaAtendimento;
	}

	public void setAgendaAtendimento(AgendaAtendimento agendaAtendimento) {
		this.agendaAtendimento = agendaAtendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_centro", nullable = false)
	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	@Column(name = "numero", nullable = false)
	public long getNumero() {
		return this.numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro", nullable = false, length = 29)
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_atendimento_grupo", nullable = false, length = 13)
	public Date getDataAtendimentoGrupo() {
		return this.dataAtendimentoGrupo;
	}

	public void setDataAtendimentoGrupo(Date dataAtendimentoGrupo) {
		this.dataAtendimentoGrupo = dataAtendimentoGrupo;
	}

	@Column(name = "objetivo", nullable = false)
	public String getObjetivo() {
		return this.objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	@Column(name = "metodologia_aplicada", nullable = false)
	public String getMetodologiaAplicada() {
		return this.metodologiaAplicada;
	}

	public void setMetodologiaAplicada(String metodologiaAplicada) {
		this.metodologiaAplicada = metodologiaAplicada;
	}

	@Column(name = "observacao_tecnica")
	public String getObservacaoTecnica() {
		return this.observacaoTecnica;
	}

	public void setObservacaoTecnica(String observacaoTecnica) {
		this.observacaoTecnica = observacaoTecnica;
	}

	@Column(name = "usuario", nullable = false)
	public long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "atendimentoGrupo")
	public Set getHistoricoUsuarias() {
		return this.historicoUsuarias;
	}

	public void setHistoricoUsuarias(Set historicoUsuarias) {
		this.historicoUsuarias = historicoUsuarias;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_grupo_usuaria", joinColumns = {
			@JoinColumn(name = "id_atendimento_grupo", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) })
	public Set getUsuarias() {
		return this.usuarias;
	}

	public void setUsuarias(Set usuarias) {
		this.usuarias = usuarias;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_grupo_tecnico", joinColumns = {
			@JoinColumn(name = "id_atendimento_grupo", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_tecnico", nullable = false, updatable = false) })
	public Set getTecnicos() {
		return this.tecnicos;
	}

	public void setTecnicos(Set tecnicos) {
		this.tecnicos = tecnicos;
	}

}
