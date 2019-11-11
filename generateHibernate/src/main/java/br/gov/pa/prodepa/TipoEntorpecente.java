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
import javax.persistence.UniqueConstraint;

/**
 * TipoEntorpecente generated by hbm2java
 */
@Entity
@Table(name = "tipo_entorpecente", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class TipoEntorpecente implements java.io.Serializable {

	private long id;
	private String descricao;
	private int situacao;
	private Set usuariaTipoEntorpecentes = new HashSet(0);
	private Set agressorTipoEntorpecentes = new HashSet(0);

	public TipoEntorpecente() {
	}

	public TipoEntorpecente(long id, String descricao, int situacao) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public TipoEntorpecente(long id, String descricao, int situacao, Set usuariaTipoEntorpecentes,
			Set agressorTipoEntorpecentes) {
		this.id = id;
		this.descricao = descricao;
		this.situacao = situacao;
		this.usuariaTipoEntorpecentes = usuariaTipoEntorpecentes;
		this.agressorTipoEntorpecentes = agressorTipoEntorpecentes;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "descricao", unique = true, nullable = false)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "situacao", nullable = false)
	public int getSituacao() {
		return this.situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEntorpecente")
	public Set getUsuariaTipoEntorpecentes() {
		return this.usuariaTipoEntorpecentes;
	}

	public void setUsuariaTipoEntorpecentes(Set usuariaTipoEntorpecentes) {
		this.usuariaTipoEntorpecentes = usuariaTipoEntorpecentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEntorpecente")
	public Set getAgressorTipoEntorpecentes() {
		return this.agressorTipoEntorpecentes;
	}

	public void setAgressorTipoEntorpecentes(Set agressorTipoEntorpecentes) {
		this.agressorTipoEntorpecentes = agressorTipoEntorpecentes;
	}

}