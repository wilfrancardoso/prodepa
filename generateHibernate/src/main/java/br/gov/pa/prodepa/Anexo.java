package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Anexo generated by hbm2java
 */
@Entity
@Table(name = "anexo")
public class Anexo implements java.io.Serializable {

	private long id;
	private Atendimento atendimento;
	private String nome;
	private Serializable arquivo;
	private String observacao;
	private Integer tamanho;
	private Date dataCadastro;

	public Anexo() {
	}

	public Anexo(long id, Atendimento atendimento, String nome, Serializable arquivo, Date dataCadastro) {
		this.id = id;
		this.atendimento = atendimento;
		this.nome = nome;
		this.arquivo = arquivo;
		this.dataCadastro = dataCadastro;
	}

	public Anexo(long id, Atendimento atendimento, String nome, Serializable arquivo, String observacao,
			Integer tamanho, Date dataCadastro) {
		this.id = id;
		this.atendimento = atendimento;
		this.nome = nome;
		this.arquivo = arquivo;
		this.observacao = observacao;
		this.tamanho = tamanho;
		this.dataCadastro = dataCadastro;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atendimento", nullable = false)
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@Column(name = "nome", nullable = false)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "arquivo", nullable = false)
	public Serializable getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(Serializable arquivo) {
		this.arquivo = arquivo;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "tamanho")
	public Integer getTamanho() {
		return this.tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro", nullable = false, length = 29)
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
