package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

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
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * DetalheViolencia generated by hbm2java
 */
@Entity
@Table(name = "detalhe_violencia", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class DetalheViolencia implements java.io.Serializable {

	private long id;
	private Violencia violencia;
	private String descricao;
	private int situacao;
	private Set agressors = new HashSet(0);
	private Set atendimentos = new HashSet(0);

	public DetalheViolencia() {
	}

	public DetalheViolencia(long id, Violencia violencia, String descricao, int situacao) {
		this.id = id;
		this.violencia = violencia;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public DetalheViolencia(long id, Violencia violencia, String descricao, int situacao, Set agressors,
			Set atendimentos) {
		this.id = id;
		this.violencia = violencia;
		this.descricao = descricao;
		this.situacao = situacao;
		this.agressors = agressors;
		this.atendimentos = atendimentos;
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
	@JoinColumn(name = "id_violencia", nullable = false)
	public Violencia getViolencia() {
		return this.violencia;
	}

	public void setViolencia(Violencia violencia) {
		this.violencia = violencia;
	}

	@Column(name = "descricao", unique = true, nullable = false)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "situacao", nullable = false)
	public int getSituacao() {
		return this.situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "agressor_detalhe_violencia", joinColumns = {
			@JoinColumn(name = "id_detalhe_violencia", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_agressor", nullable = false, updatable = false) })
	public Set getAgressors() {
		return this.agressors;
	}

	public void setAgressors(Set agressors) {
		this.agressors = agressors;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_detalhe_violencia", joinColumns = {
			@JoinColumn(name = "id_detalhe_violencia", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_atendimento", nullable = false, updatable = false) })
	public Set getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set atendimentos) {
		this.atendimentos = atendimentos;
	}

}