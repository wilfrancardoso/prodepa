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
 * ClassificacaoCaso generated by hbm2java
 */
@Entity
@Table(name = "classificacao_caso")
public class ClassificacaoCaso implements java.io.Serializable {

	private long id;
	private String descricao;
	private int situacao;
	private Set atendimentos = new HashSet(0);

	public ClassificacaoCaso() {
	}

	public ClassificacaoCaso(long id, String descricao, int situacao) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public ClassificacaoCaso(long id, String descricao, int situacao, Set atendimentos) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
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

	@Column(name = "descricao", nullable = false, length = 100)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "classificacaoCaso")
	public Set getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set atendimentos) {
		this.atendimentos = atendimentos;
	}

}
