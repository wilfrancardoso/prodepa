package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VwNivelEscolaridadeId generated by hbm2java
 */
@Embeddable
public class VwNivelEscolaridadeId implements java.io.Serializable {

	private Integer id;
	private String descricao;

	public VwNivelEscolaridadeId() {
	}

	public VwNivelEscolaridadeId(Integer id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	@Column(name = "id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "descricao")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwNivelEscolaridadeId))
			return false;
		VwNivelEscolaridadeId castOther = (VwNivelEscolaridadeId) other;

		return ((this.getId() == castOther.getId())
				|| (this.getId() != null && castOther.getId() != null && this.getId().equals(castOther.getId())))
				&& ((this.getDescricao() == castOther.getDescricao()) || (this.getDescricao() != null
						&& castOther.getDescricao() != null && this.getDescricao().equals(castOther.getDescricao())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result + (getDescricao() == null ? 0 : this.getDescricao().hashCode());
		return result;
	}

}