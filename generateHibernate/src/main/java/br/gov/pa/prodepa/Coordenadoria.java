package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Coordenadoria generated by hbm2java
 */
@Entity
@Table(name = "coordenadoria", uniqueConstraints = @UniqueConstraint(columnNames = "nome"))
public class Coordenadoria implements java.io.Serializable {

	private long id;
	private String nome;
	private int situacao;
	private Date dataCadastro;
	private Set centros = new HashSet(0);

	public Coordenadoria() {
	}

	public Coordenadoria(long id, String nome, int situacao, Date dataCadastro) {
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
		this.dataCadastro = dataCadastro;
	}

	public Coordenadoria(long id, String nome, int situacao, Date dataCadastro, Set centros) {
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
		this.dataCadastro = dataCadastro;
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

	@Column(name = "nome", unique = true, nullable = false)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "situacao", nullable = false)
	public int getSituacao() {
		return this.situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = false, length = 13)
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coordenadoria")
	public Set getCentros() {
		return this.centros;
	}

	public void setCentros(Set centros) {
		this.centros = centros;
	}

}
