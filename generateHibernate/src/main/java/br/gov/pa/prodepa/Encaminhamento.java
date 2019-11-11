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
 * Encaminhamento generated by hbm2java
 */
@Entity
@Table(name = "encaminhamento")
public class Encaminhamento implements java.io.Serializable {

	private long id;
	private Atendimento atendimento;
	private Centro centro;
	private OrigemEncaminhamento origemEncaminhamento;
	private PreAcolhimento preAcolhimento;
	private Tecnico tecnico;
	private String descricao;
	private Date dataCadastro;
	private Date dataEncaminhamento;
	private long numero;
	private long usuario;
	private Integer retornoCentro;
	private String observacao;

	public Encaminhamento() {
	}

	public Encaminhamento(long id, Centro centro, OrigemEncaminhamento origemEncaminhamento, Tecnico tecnico,
			String descricao, Date dataCadastro, Date dataEncaminhamento, long numero, long usuario) {
		this.id = id;
		this.centro = centro;
		this.origemEncaminhamento = origemEncaminhamento;
		this.tecnico = tecnico;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.dataEncaminhamento = dataEncaminhamento;
		this.numero = numero;
		this.usuario = usuario;
	}

	public Encaminhamento(long id, Atendimento atendimento, Centro centro, OrigemEncaminhamento origemEncaminhamento,
			PreAcolhimento preAcolhimento, Tecnico tecnico, String descricao, Date dataCadastro,
			Date dataEncaminhamento, long numero, long usuario, Integer retornoCentro, String observacao) {
		this.id = id;
		this.atendimento = atendimento;
		this.centro = centro;
		this.origemEncaminhamento = origemEncaminhamento;
		this.preAcolhimento = preAcolhimento;
		this.tecnico = tecnico;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.dataEncaminhamento = dataEncaminhamento;
		this.numero = numero;
		this.usuario = usuario;
		this.retornoCentro = retornoCentro;
		this.observacao = observacao;
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
	@JoinColumn(name = "id_centro", nullable = false)
	public Centro getCentro() {
		return this.centro;
	}

	public void setCentro(Centro centro) {
		this.centro = centro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_origem_encaminhamento", nullable = false)
	public OrigemEncaminhamento getOrigemEncaminhamento() {
		return this.origemEncaminhamento;
	}

	public void setOrigemEncaminhamento(OrigemEncaminhamento origemEncaminhamento) {
		this.origemEncaminhamento = origemEncaminhamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_pre_acolhimento")
	public PreAcolhimento getPreAcolhimento() {
		return this.preAcolhimento;
	}

	public void setPreAcolhimento(PreAcolhimento preAcolhimento) {
		this.preAcolhimento = preAcolhimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico", nullable = false)
	public Tecnico getTecnico() {
		return this.tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = false, length = 13)
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_encaminhamento", nullable = false, length = 13)
	public Date getDataEncaminhamento() {
		return this.dataEncaminhamento;
	}

	public void setDataEncaminhamento(Date dataEncaminhamento) {
		this.dataEncaminhamento = dataEncaminhamento;
	}

	@Column(name = "numero", nullable = false)
	public long getNumero() {
		return this.numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	@Column(name = "usuario", nullable = false)
	public long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}

	@Column(name = "retorno_centro")
	public Integer getRetornoCentro() {
		return this.retornoCentro;
	}

	public void setRetornoCentro(Integer retornoCentro) {
		this.retornoCentro = retornoCentro;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
