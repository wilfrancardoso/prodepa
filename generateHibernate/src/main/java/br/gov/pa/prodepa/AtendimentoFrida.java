package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AtendimentoFrida generated by hbm2java
 */
@Entity
@Table(name = "atendimento_frida")
public class AtendimentoFrida implements java.io.Serializable {

	private int id;
	private Atendimento atendimento;
	private Long idTecnicoCriacao;
	private Long idTecnicoAlteracao;

	public AtendimentoFrida() {
	}

	public AtendimentoFrida(int id) {
		this.id = id;
	}

	public AtendimentoFrida(int id, Atendimento atendimento, Long idTecnicoCriacao, Long idTecnicoAlteracao) {
		this.id = id;
		this.atendimento = atendimento;
		this.idTecnicoCriacao = idTecnicoCriacao;
		this.idTecnicoAlteracao = idTecnicoAlteracao;
	}

	@Id

	@Column(name = "Id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	@Column(name = "id_tecnico_criacao")
	public Long getIdTecnicoCriacao() {
		return this.idTecnicoCriacao;
	}

	public void setIdTecnicoCriacao(Long idTecnicoCriacao) {
		this.idTecnicoCriacao = idTecnicoCriacao;
	}

	@Column(name = "id_tecnico_alteracao")
	public Long getIdTecnicoAlteracao() {
		return this.idTecnicoAlteracao;
	}

	public void setIdTecnicoAlteracao(Long idTecnicoAlteracao) {
		this.idTecnicoAlteracao = idTecnicoAlteracao;
	}

}
