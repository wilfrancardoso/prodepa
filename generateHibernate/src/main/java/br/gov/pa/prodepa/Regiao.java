package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Regiao generated by hbm2java
 */
@Entity
@Table(name = "regiao")
public class Regiao implements java.io.Serializable {

	private long id;
	private String nome;
	private int situacao;
	private Set municipios = new HashSet(0);
	private Set enderecos = new HashSet(0);

	public Regiao() {
	}

	public Regiao(long id, String nome, int situacao) {
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
	}

	public Regiao(long id, String nome, int situacao, Set municipios, Set enderecos) {
		this.id = id;
		this.nome = nome;
		this.situacao = situacao;
		this.municipios = municipios;
		this.enderecos = enderecos;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "nome", nullable = false)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "regiao")
	public Set getMunicipios() {
		return this.municipios;
	}

	public void setMunicipios(Set municipios) {
		this.municipios = municipios;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "regiao")
	public Set getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(Set enderecos) {
		this.enderecos = enderecos;
	}

}