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
 * Comunicado generated by hbm2java
 */
@Entity
@Table(name = "comunicado")
public class Comunicado implements java.io.Serializable {

	private long id;
	private Tecnico tecnicoByIdTecnicoAlteracao;
	private Tecnico tecnicoByIdTecnicoCriacao;
	private String titulo;
	private Date dataCriacao;
	private Date dataAlteracao;
	private String descricao;
	private int situacao;
	private Set anexoComunicados = new HashSet(0);
	private Set centros = new HashSet(0);

	public Comunicado() {
	}

	public Comunicado(long id, Tecnico tecnicoByIdTecnicoAlteracao, Tecnico tecnicoByIdTecnicoCriacao, String titulo,
			Date dataCriacao, Date dataAlteracao, String descricao, int situacao) {
		this.id = id;
		this.tecnicoByIdTecnicoAlteracao = tecnicoByIdTecnicoAlteracao;
		this.tecnicoByIdTecnicoCriacao = tecnicoByIdTecnicoCriacao;
		this.titulo = titulo;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public Comunicado(long id, Tecnico tecnicoByIdTecnicoAlteracao, Tecnico tecnicoByIdTecnicoCriacao, String titulo,
			Date dataCriacao, Date dataAlteracao, String descricao, int situacao, Set anexoComunicados, Set centros) {
		this.id = id;
		this.tecnicoByIdTecnicoAlteracao = tecnicoByIdTecnicoAlteracao;
		this.tecnicoByIdTecnicoCriacao = tecnicoByIdTecnicoCriacao;
		this.titulo = titulo;
		this.dataCriacao = dataCriacao;
		this.dataAlteracao = dataAlteracao;
		this.descricao = descricao;
		this.situacao = situacao;
		this.anexoComunicados = anexoComunicados;
		this.centros = centros;
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
	@JoinColumn(name = "id_tecnico_alteracao", nullable = false)
	public Tecnico getTecnicoByIdTecnicoAlteracao() {
		return this.tecnicoByIdTecnicoAlteracao;
	}

	public void setTecnicoByIdTecnicoAlteracao(Tecnico tecnicoByIdTecnicoAlteracao) {
		this.tecnicoByIdTecnicoAlteracao = tecnicoByIdTecnicoAlteracao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tecnico_criacao", nullable = false)
	public Tecnico getTecnicoByIdTecnicoCriacao() {
		return this.tecnicoByIdTecnicoCriacao;
	}

	public void setTecnicoByIdTecnicoCriacao(Tecnico tecnicoByIdTecnicoCriacao) {
		this.tecnicoByIdTecnicoCriacao = tecnicoByIdTecnicoCriacao;
	}

	@Column(name = "titulo", nullable = false)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao", nullable = false, length = 29)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_alteracao", nullable = false, length = 29)
	public Date getDataAlteracao() {
		return this.dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@Column(name = "descricao", nullable = false)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comunicado")
	public Set getAnexoComunicados() {
		return this.anexoComunicados;
	}

	public void setAnexoComunicados(Set anexoComunicados) {
		this.anexoComunicados = anexoComunicados;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "comunicado_centro", joinColumns = {
			@JoinColumn(name = "id_comunicado", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_centro", nullable = false, updatable = false) })
	public Set getCentros() {
		return this.centros;
	}

	public void setCentros(Set centros) {
		this.centros = centros;
	}

}
