package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * VwNivelEscolaridade generated by hbm2java
 */
@Entity
@Table(name = "vw_nivel_escolaridade")
public class VwNivelEscolaridade implements java.io.Serializable {

	private VwNivelEscolaridadeId id;

	public VwNivelEscolaridade() {
	}

	public VwNivelEscolaridade(VwNivelEscolaridadeId id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "id")),
			@AttributeOverride(name = "descricao", column = @Column(name = "descricao")) })
	public VwNivelEscolaridadeId getId() {
		return this.id;
	}

	public void setId(VwNivelEscolaridadeId id) {
		this.id = id;
	}

}
