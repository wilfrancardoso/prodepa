package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VwMunicipioId generated by hbm2java
 */
@Embeddable
public class VwMunicipioId implements java.io.Serializable {

	private Long idMunicipio;
	private String nomeMunicipio;
	private Long idUf;
	private String nomeUf;
	private String siglaUf;

	public VwMunicipioId() {
	}

	public VwMunicipioId(Long idMunicipio, String nomeMunicipio, Long idUf, String nomeUf, String siglaUf) {
		this.idMunicipio = idMunicipio;
		this.nomeMunicipio = nomeMunicipio;
		this.idUf = idUf;
		this.nomeUf = nomeUf;
		this.siglaUf = siglaUf;
	}

	@Column(name = "id_municipio")
	public Long getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(Long idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	@Column(name = "nome_municipio", length = 100)
	public String getNomeMunicipio() {
		return this.nomeMunicipio;
	}

	public void setNomeMunicipio(String nomeMunicipio) {
		this.nomeMunicipio = nomeMunicipio;
	}

	@Column(name = "id_uf")
	public Long getIdUf() {
		return this.idUf;
	}

	public void setIdUf(Long idUf) {
		this.idUf = idUf;
	}

	@Column(name = "nome_uf", length = 100)
	public String getNomeUf() {
		return this.nomeUf;
	}

	public void setNomeUf(String nomeUf) {
		this.nomeUf = nomeUf;
	}

	@Column(name = "sigla_uf", length = 2)
	public String getSiglaUf() {
		return this.siglaUf;
	}

	public void setSiglaUf(String siglaUf) {
		this.siglaUf = siglaUf;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VwMunicipioId))
			return false;
		VwMunicipioId castOther = (VwMunicipioId) other;

		return ((this.getIdMunicipio() == castOther.getIdMunicipio()) || (this.getIdMunicipio() != null
				&& castOther.getIdMunicipio() != null && this.getIdMunicipio().equals(castOther.getIdMunicipio())))
				&& ((this.getNomeMunicipio() == castOther.getNomeMunicipio())
						|| (this.getNomeMunicipio() != null && castOther.getNomeMunicipio() != null
								&& this.getNomeMunicipio().equals(castOther.getNomeMunicipio())))
				&& ((this.getIdUf() == castOther.getIdUf()) || (this.getIdUf() != null && castOther.getIdUf() != null
						&& this.getIdUf().equals(castOther.getIdUf())))
				&& ((this.getNomeUf() == castOther.getNomeUf()) || (this.getNomeUf() != null
						&& castOther.getNomeUf() != null && this.getNomeUf().equals(castOther.getNomeUf())))
				&& ((this.getSiglaUf() == castOther.getSiglaUf()) || (this.getSiglaUf() != null
						&& castOther.getSiglaUf() != null && this.getSiglaUf().equals(castOther.getSiglaUf())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getIdMunicipio() == null ? 0 : this.getIdMunicipio().hashCode());
		result = 37 * result + (getNomeMunicipio() == null ? 0 : this.getNomeMunicipio().hashCode());
		result = 37 * result + (getIdUf() == null ? 0 : this.getIdUf().hashCode());
		result = 37 * result + (getNomeUf() == null ? 0 : this.getNomeUf().hashCode());
		result = 37 * result + (getSiglaUf() == null ? 0 : this.getSiglaUf().hashCode());
		return result;
	}

}