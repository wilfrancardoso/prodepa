package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AtendimentoAgressor generated by hbm2java
 */
@Entity
@Table(name = "atendimento_agressor")
public class AtendimentoAgressor implements java.io.Serializable {

	private AtendimentoAgressorId id;
	private Agressor agressor;
	private Atendimento atendimento;
	private GrauRelacao grauRelacao;
	private Integer idade;
	private Date dataNascimento;

	public AtendimentoAgressor() {
	}

	public AtendimentoAgressor(AtendimentoAgressorId id, Agressor agressor, Atendimento atendimento,
			GrauRelacao grauRelacao) {
		this.id = id;
		this.agressor = agressor;
		this.atendimento = atendimento;
		this.grauRelacao = grauRelacao;
	}

	public AtendimentoAgressor(AtendimentoAgressorId id, Agressor agressor, Atendimento atendimento,
			GrauRelacao grauRelacao, Integer idade, Date dataNascimento) {
		this.id = id;
		this.agressor = agressor;
		this.atendimento = atendimento;
		this.grauRelacao = grauRelacao;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idAtendimento", column = @Column(name = "id_atendimento", nullable = false)),
			@AttributeOverride(name = "idAgressor", column = @Column(name = "id_agressor", nullable = false)),
			@AttributeOverride(name = "idGrauRelacao", column = @Column(name = "id_grau_relacao", nullable = false)) })
	public AtendimentoAgressorId getId() {
		return this.id;
	}

	public void setId(AtendimentoAgressorId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agressor", nullable = false, insertable = false, updatable = false)
	public Agressor getAgressor() {
		return this.agressor;
	}

	public void setAgressor(Agressor agressor) {
		this.agressor = agressor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atendimento", nullable = false, insertable = false, updatable = false)
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_grau_relacao", nullable = false, insertable = false, updatable = false)
	public GrauRelacao getGrauRelacao() {
		return this.grauRelacao;
	}

	public void setGrauRelacao(GrauRelacao grauRelacao) {
		this.grauRelacao = grauRelacao;
	}

	@Column(name = "idade")
	public Integer getIdade() {
		return this.idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", length = 13)
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
