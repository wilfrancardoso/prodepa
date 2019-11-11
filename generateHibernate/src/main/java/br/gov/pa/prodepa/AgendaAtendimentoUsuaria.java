package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * AgendaAtendimentoUsuaria generated by hbm2java
 */
@Entity
@Table(name = "agenda_atendimento_usuaria")
public class AgendaAtendimentoUsuaria implements java.io.Serializable {

	private AgendaAtendimentoUsuariaId id;
	private AgendaAtendimento agendaAtendimento;
	private Usuaria usuaria;
	private int presenca;

	public AgendaAtendimentoUsuaria() {
	}

	public AgendaAtendimentoUsuaria(AgendaAtendimentoUsuariaId id, AgendaAtendimento agendaAtendimento, Usuaria usuaria,
			int presenca) {
		this.id = id;
		this.agendaAtendimento = agendaAtendimento;
		this.usuaria = usuaria;
		this.presenca = presenca;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "idAgendaAtendimento", column = @Column(name = "id_agenda_atendimento", nullable = false)),
			@AttributeOverride(name = "idUsuaria", column = @Column(name = "id_usuaria", nullable = false)) })
	public AgendaAtendimentoUsuariaId getId() {
		return this.id;
	}

	public void setId(AgendaAtendimentoUsuariaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_agenda_atendimento", nullable = false, insertable = false, updatable = false)
	public AgendaAtendimento getAgendaAtendimento() {
		return this.agendaAtendimento;
	}

	public void setAgendaAtendimento(AgendaAtendimento agendaAtendimento) {
		this.agendaAtendimento = agendaAtendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuaria", nullable = false, insertable = false, updatable = false)
	public Usuaria getUsuaria() {
		return this.usuaria;
	}

	public void setUsuaria(Usuaria usuaria) {
		this.usuaria = usuaria;
	}

	@Column(name = "presenca", nullable = false)
	public int getPresenca() {
		return this.presenca;
	}

	public void setPresenca(int presenca) {
		this.presenca = presenca;
	}

}
