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
 * FormularioQuestaoResposta generated by hbm2java
 */
@Entity
@Table(name = "formulario_questao_resposta")
public class FormularioQuestaoResposta implements java.io.Serializable {

	private long idQuestaoResposta;
	private FormularioQuestao formularioQuestao;
	private FormularioResposta formularioResposta;
	private Boolean flgSubResposta;

	public FormularioQuestaoResposta() {
	}

	public FormularioQuestaoResposta(long idQuestaoResposta) {
		this.idQuestaoResposta = idQuestaoResposta;
	}

	public FormularioQuestaoResposta(long idQuestaoResposta, FormularioQuestao formularioQuestao,
			FormularioResposta formularioResposta, Boolean flgSubResposta) {
		this.idQuestaoResposta = idQuestaoResposta;
		this.formularioQuestao = formularioQuestao;
		this.formularioResposta = formularioResposta;
		this.flgSubResposta = flgSubResposta;
	}

	@Id

	@Column(name = "id_questao_resposta", unique = true, nullable = false)
	public long getIdQuestaoResposta() {
		return this.idQuestaoResposta;
	}

	public void setIdQuestaoResposta(long idQuestaoResposta) {
		this.idQuestaoResposta = idQuestaoResposta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_questao")
	public FormularioQuestao getFormularioQuestao() {
		return this.formularioQuestao;
	}

	public void setFormularioQuestao(FormularioQuestao formularioQuestao) {
		this.formularioQuestao = formularioQuestao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_resposta")
	public FormularioResposta getFormularioResposta() {
		return this.formularioResposta;
	}

	public void setFormularioResposta(FormularioResposta formularioResposta) {
		this.formularioResposta = formularioResposta;
	}

	@Column(name = "flg_sub_resposta")
	public Boolean getFlgSubResposta() {
		return this.flgSubResposta;
	}

	public void setFlgSubResposta(Boolean flgSubResposta) {
		this.flgSubResposta = flgSubResposta;
	}

}
