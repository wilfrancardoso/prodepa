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
 * FormularioModelo generated by hbm2java
 */
@Entity
@Table(name = "formulario_modelo")
public class FormularioModelo implements java.io.Serializable {

	private long idModelo;
	private String dscModelo;
	private Set formularioQuestaos = new HashSet(0);

	public FormularioModelo() {
	}

	public FormularioModelo(long idModelo) {
		this.idModelo = idModelo;
	}

	public FormularioModelo(long idModelo, String dscModelo, Set formularioQuestaos) {
		this.idModelo = idModelo;
		this.dscModelo = dscModelo;
		this.formularioQuestaos = formularioQuestaos;
	}

	@Id

	@Column(name = "id_modelo", unique = true, nullable = false)
	public long getIdModelo() {
		return this.idModelo;
	}

	public void setIdModelo(long idModelo) {
		this.idModelo = idModelo;
	}

	@Column(name = "dsc_modelo")
	public String getDscModelo() {
		return this.dscModelo;
	}

	public void setDscModelo(String dscModelo) {
		this.dscModelo = dscModelo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formularioModelo")
	public Set getFormularioQuestaos() {
		return this.formularioQuestaos;
	}

	public void setFormularioQuestaos(Set formularioQuestaos) {
		this.formularioQuestaos = formularioQuestaos;
	}

}
