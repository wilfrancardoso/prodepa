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
 * FridaPerguntas generated by hbm2java
 */
@Entity
@Table(name = "frida_perguntas")
public class FridaPerguntas implements java.io.Serializable {

	private long id;
	private String descricao;
	private Set fridaSubrespostas = new HashSet(0);
	private Set atendimentoFridaRespotases = new HashSet(0);

	public FridaPerguntas() {
	}

	public FridaPerguntas(long id) {
		this.id = id;
	}

	public FridaPerguntas(long id, String descricao, Set fridaSubrespostas, Set atendimentoFridaRespotases) {
		this.id = id;
		this.descricao = descricao;
		this.fridaSubrespostas = fridaSubrespostas;
		this.atendimentoFridaRespotases = atendimentoFridaRespotases;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "descricao", length = 300)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fridaPerguntas")
	public Set getFridaSubrespostas() {
		return this.fridaSubrespostas;
	}

	public void setFridaSubrespostas(Set fridaSubrespostas) {
		this.fridaSubrespostas = fridaSubrespostas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fridaPerguntas")
	public Set getAtendimentoFridaRespotases() {
		return this.atendimentoFridaRespotases;
	}

	public void setAtendimentoFridaRespotases(Set atendimentoFridaRespotases) {
		this.atendimentoFridaRespotases = atendimentoFridaRespotases;
	}

}