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
import javax.persistence.UniqueConstraint;

/**
 * CondicoesMoradia generated by hbm2java
 */
@Entity
@Table(name = "condicoes_moradia", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class CondicoesMoradia implements java.io.Serializable {

	private long id;
	private String descricao;
	private int situacao;
	private Set usuarias = new HashSet(0);

	public CondicoesMoradia() {
	}

	public CondicoesMoradia(long id, String descricao, int situacao) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public CondicoesMoradia(long id, String descricao, int situacao, Set usuarias) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
		this.usuarias = usuarias;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "condicoesMoradia")
	public Set getUsuarias() {
		return this.usuarias;
	}

	public void setUsuarias(Set usuarias) {
		this.usuarias = usuarias;
	}

}
