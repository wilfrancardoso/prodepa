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
 * UnidadeTempo generated by hbm2java
 */
@Entity
@Table(name = "unidade_tempo")
public class UnidadeTempo implements java.io.Serializable {

	private long id;
	private double valCoeficienteConversaoUb;
	private String descricao;
	private Set atendimentos = new HashSet(0);

	public UnidadeTempo() {
	}

	public UnidadeTempo(long id, double valCoeficienteConversaoUb, String descricao) {
		this.id = id;
		this.valCoeficienteConversaoUb = valCoeficienteConversaoUb;
		this.descricao = descricao;
	}

	public UnidadeTempo(long id, double valCoeficienteConversaoUb, String descricao, Set atendimentos) {
		this.id = id;
		this.valCoeficienteConversaoUb = valCoeficienteConversaoUb;
		this.descricao = descricao;
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

	@Column(name = "val_coeficiente_conversao_ub", nullable = false, precision = 17, scale = 17)
	public double getValCoeficienteConversaoUb() {
		return this.valCoeficienteConversaoUb;
	}

	public void setValCoeficienteConversaoUb(double valCoeficienteConversaoUb) {
		this.valCoeficienteConversaoUb = valCoeficienteConversaoUb;
	}

	@Column(name = "descricao", nullable = false)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unidadeTempo")
	public Set getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set atendimentos) {
		this.atendimentos = atendimentos;
	}

}
