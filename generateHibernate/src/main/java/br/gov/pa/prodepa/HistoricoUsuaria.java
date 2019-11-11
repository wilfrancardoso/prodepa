package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
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
 * HistoricoUsuaria generated by hbm2java
 */
@Entity
@Table(name = "historico_usuaria")
public class HistoricoUsuaria implements java.io.Serializable {

	private long id;
	private Atendimento atendimento;
	private AtendimentoGrupo atendimentoGrupo;
	private EvolucaoAtendimento evolucaoAtendimento;
	private Usuaria usuaria;
	private String nome;
	private Integer estuda;
	private Integer desejaVoltarEstudar;
	private String porqueNaoEstuda;
	private Integer possuiFilhos;
	private String tempoMoradia;
	private Integer possuiEnergiaEletrica;
	private Integer geraContaLuz;
	private Integer possuiAbastecimentoAgua;
	private Integer geraContaAgua;
	private Integer trabalhaFora;
	private String porqueNaoTrabalha;
	private String localTrabalho;
	private Integer nivelEscolaridade;
	private BigDecimal renda;
	private BigDecimal rendaTotal;
	private Integer possuiInstalacaoSanitaria;
	private Integer realizaColetaLixo;
	private Integer possuiQualificacaoProfissional;
	private String qualificacaoQuePossui;
	private Integer possuiRenda;
	private String qualificacaoQueDeseja;
	private String listaNecessidadeEspecial;
	private String listaTipoProblemaPsicologico;
	private Integer areaMoradia;
	private String condicoesMoradia;
	private String tipoMoradia;
	private String tipoAbastecimentoAgua;
	private Integer estadoCivil;
	private Integer orientacaoSexual;
	private Integer situacaoUsuaria;
	private String religiao;
	private Integer situacaoMercadoTrabalho;
	private String ocupacao;
	private String profissao;
	private String listaDocumentos;
	private Date dataInicio;
	private Date dataFim;
	private Integer situacao;
	private String listaProgramaGoverno;
	private String nomeMae;
	private String listaUsuariaTipoMedicacao;
	private Integer fazUsoAlcool;
	private Integer fazUsoDroga;
	private Integer fazUsoMedicacao;
	private Integer frequenciaUsoAlcool;
	private Date dataHoraCadastro;
	private Long usuario;
	private String listaUsuariaTipoEntorpecente;
	private Long idAtendimentoVisitaDomiciliar;

	public HistoricoUsuaria() {
	}

	public HistoricoUsuaria(long id, Usuaria usuaria, String nome) {
		this.id = id;
		this.usuaria = usuaria;
		this.nome = nome;
	}

	public HistoricoUsuaria(long id, Atendimento atendimento, AtendimentoGrupo atendimentoGrupo,
			EvolucaoAtendimento evolucaoAtendimento, Usuaria usuaria, String nome, Integer estuda,
			Integer desejaVoltarEstudar, String porqueNaoEstuda, Integer possuiFilhos, String tempoMoradia,
			Integer possuiEnergiaEletrica, Integer geraContaLuz, Integer possuiAbastecimentoAgua, Integer geraContaAgua,
			Integer trabalhaFora, String porqueNaoTrabalha, String localTrabalho, Integer nivelEscolaridade,
			BigDecimal renda, BigDecimal rendaTotal, Integer possuiInstalacaoSanitaria, Integer realizaColetaLixo,
			Integer possuiQualificacaoProfissional, String qualificacaoQuePossui, Integer possuiRenda,
			String qualificacaoQueDeseja, String listaNecessidadeEspecial, String listaTipoProblemaPsicologico,
			Integer areaMoradia, String condicoesMoradia, String tipoMoradia, String tipoAbastecimentoAgua,
			Integer estadoCivil, Integer orientacaoSexual, Integer situacaoUsuaria, String religiao,
			Integer situacaoMercadoTrabalho, String ocupacao, String profissao, String listaDocumentos, Date dataInicio,
			Date dataFim, Integer situacao, String listaProgramaGoverno, String nomeMae,
			String listaUsuariaTipoMedicacao, Integer fazUsoAlcool, Integer fazUsoDroga, Integer fazUsoMedicacao,
			Integer frequenciaUsoAlcool, Date dataHoraCadastro, Long usuario, String listaUsuariaTipoEntorpecente,
			Long idAtendimentoVisitaDomiciliar) {
		this.id = id;
		this.atendimento = atendimento;
		this.atendimentoGrupo = atendimentoGrupo;
		this.evolucaoAtendimento = evolucaoAtendimento;
		this.usuaria = usuaria;
		this.nome = nome;
		this.estuda = estuda;
		this.desejaVoltarEstudar = desejaVoltarEstudar;
		this.porqueNaoEstuda = porqueNaoEstuda;
		this.possuiFilhos = possuiFilhos;
		this.tempoMoradia = tempoMoradia;
		this.possuiEnergiaEletrica = possuiEnergiaEletrica;
		this.geraContaLuz = geraContaLuz;
		this.possuiAbastecimentoAgua = possuiAbastecimentoAgua;
		this.geraContaAgua = geraContaAgua;
		this.trabalhaFora = trabalhaFora;
		this.porqueNaoTrabalha = porqueNaoTrabalha;
		this.localTrabalho = localTrabalho;
		this.nivelEscolaridade = nivelEscolaridade;
		this.renda = renda;
		this.rendaTotal = rendaTotal;
		this.possuiInstalacaoSanitaria = possuiInstalacaoSanitaria;
		this.realizaColetaLixo = realizaColetaLixo;
		this.possuiQualificacaoProfissional = possuiQualificacaoProfissional;
		this.qualificacaoQuePossui = qualificacaoQuePossui;
		this.possuiRenda = possuiRenda;
		this.qualificacaoQueDeseja = qualificacaoQueDeseja;
		this.listaNecessidadeEspecial = listaNecessidadeEspecial;
		this.listaTipoProblemaPsicologico = listaTipoProblemaPsicologico;
		this.areaMoradia = areaMoradia;
		this.condicoesMoradia = condicoesMoradia;
		this.tipoMoradia = tipoMoradia;
		this.tipoAbastecimentoAgua = tipoAbastecimentoAgua;
		this.estadoCivil = estadoCivil;
		this.orientacaoSexual = orientacaoSexual;
		this.situacaoUsuaria = situacaoUsuaria;
		this.religiao = religiao;
		this.situacaoMercadoTrabalho = situacaoMercadoTrabalho;
		this.ocupacao = ocupacao;
		this.profissao = profissao;
		this.listaDocumentos = listaDocumentos;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.situacao = situacao;
		this.listaProgramaGoverno = listaProgramaGoverno;
		this.nomeMae = nomeMae;
		this.listaUsuariaTipoMedicacao = listaUsuariaTipoMedicacao;
		this.fazUsoAlcool = fazUsoAlcool;
		this.fazUsoDroga = fazUsoDroga;
		this.fazUsoMedicacao = fazUsoMedicacao;
		this.frequenciaUsoAlcool = frequenciaUsoAlcool;
		this.dataHoraCadastro = dataHoraCadastro;
		this.usuario = usuario;
		this.listaUsuariaTipoEntorpecente = listaUsuariaTipoEntorpecente;
		this.idAtendimentoVisitaDomiciliar = idAtendimentoVisitaDomiciliar;
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
	@JoinColumn(name = "id_atendimento")
	public Atendimento getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(Atendimento atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_atendimento_grupo")
	public AtendimentoGrupo getAtendimentoGrupo() {
		return this.atendimentoGrupo;
	}

	public void setAtendimentoGrupo(AtendimentoGrupo atendimentoGrupo) {
		this.atendimentoGrupo = atendimentoGrupo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_evolucao_atendimento")
	public EvolucaoAtendimento getEvolucaoAtendimento() {
		return this.evolucaoAtendimento;
	}

	public void setEvolucaoAtendimento(EvolucaoAtendimento evolucaoAtendimento) {
		this.evolucaoAtendimento = evolucaoAtendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_usuaria", nullable = false)
	public Usuaria getUsuaria() {
		return this.usuaria;
	}

	public void setUsuaria(Usuaria usuaria) {
		this.usuaria = usuaria;
	}

	@Column(name = "nome", nullable = false)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "estuda")
	public Integer getEstuda() {
		return this.estuda;
	}

	public void setEstuda(Integer estuda) {
		this.estuda = estuda;
	}

	@Column(name = "deseja_voltar_estudar")
	public Integer getDesejaVoltarEstudar() {
		return this.desejaVoltarEstudar;
	}

	public void setDesejaVoltarEstudar(Integer desejaVoltarEstudar) {
		this.desejaVoltarEstudar = desejaVoltarEstudar;
	}

	@Column(name = "porque_nao_estuda")
	public String getPorqueNaoEstuda() {
		return this.porqueNaoEstuda;
	}

	public void setPorqueNaoEstuda(String porqueNaoEstuda) {
		this.porqueNaoEstuda = porqueNaoEstuda;
	}

	@Column(name = "possui_filhos")
	public Integer getPossuiFilhos() {
		return this.possuiFilhos;
	}

	public void setPossuiFilhos(Integer possuiFilhos) {
		this.possuiFilhos = possuiFilhos;
	}

	@Column(name = "tempo_moradia", length = 50)
	public String getTempoMoradia() {
		return this.tempoMoradia;
	}

	public void setTempoMoradia(String tempoMoradia) {
		this.tempoMoradia = tempoMoradia;
	}

	@Column(name = "possui_energia_eletrica")
	public Integer getPossuiEnergiaEletrica() {
		return this.possuiEnergiaEletrica;
	}

	public void setPossuiEnergiaEletrica(Integer possuiEnergiaEletrica) {
		this.possuiEnergiaEletrica = possuiEnergiaEletrica;
	}

	@Column(name = "gera_conta_luz")
	public Integer getGeraContaLuz() {
		return this.geraContaLuz;
	}

	public void setGeraContaLuz(Integer geraContaLuz) {
		this.geraContaLuz = geraContaLuz;
	}

	@Column(name = "possui_abastecimento_agua")
	public Integer getPossuiAbastecimentoAgua() {
		return this.possuiAbastecimentoAgua;
	}

	public void setPossuiAbastecimentoAgua(Integer possuiAbastecimentoAgua) {
		this.possuiAbastecimentoAgua = possuiAbastecimentoAgua;
	}

	@Column(name = "gera_conta_agua")
	public Integer getGeraContaAgua() {
		return this.geraContaAgua;
	}

	public void setGeraContaAgua(Integer geraContaAgua) {
		this.geraContaAgua = geraContaAgua;
	}

	@Column(name = "trabalha_fora")
	public Integer getTrabalhaFora() {
		return this.trabalhaFora;
	}

	public void setTrabalhaFora(Integer trabalhaFora) {
		this.trabalhaFora = trabalhaFora;
	}

	@Column(name = "porque_nao_trabalha")
	public String getPorqueNaoTrabalha() {
		return this.porqueNaoTrabalha;
	}

	public void setPorqueNaoTrabalha(String porqueNaoTrabalha) {
		this.porqueNaoTrabalha = porqueNaoTrabalha;
	}

	@Column(name = "local_trabalho")
	public String getLocalTrabalho() {
		return this.localTrabalho;
	}

	public void setLocalTrabalho(String localTrabalho) {
		this.localTrabalho = localTrabalho;
	}

	@Column(name = "nivel_escolaridade")
	public Integer getNivelEscolaridade() {
		return this.nivelEscolaridade;
	}

	public void setNivelEscolaridade(Integer nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}

	@Column(name = "renda", precision = 9)
	public BigDecimal getRenda() {
		return this.renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
	}

	@Column(name = "renda_total", precision = 9)
	public BigDecimal getRendaTotal() {
		return this.rendaTotal;
	}

	public void setRendaTotal(BigDecimal rendaTotal) {
		this.rendaTotal = rendaTotal;
	}

	@Column(name = "possui_instalacao_sanitaria")
	public Integer getPossuiInstalacaoSanitaria() {
		return this.possuiInstalacaoSanitaria;
	}

	public void setPossuiInstalacaoSanitaria(Integer possuiInstalacaoSanitaria) {
		this.possuiInstalacaoSanitaria = possuiInstalacaoSanitaria;
	}

	@Column(name = "realiza_coleta_lixo")
	public Integer getRealizaColetaLixo() {
		return this.realizaColetaLixo;
	}

	public void setRealizaColetaLixo(Integer realizaColetaLixo) {
		this.realizaColetaLixo = realizaColetaLixo;
	}

	@Column(name = "possui_qualificacao_profissional")
	public Integer getPossuiQualificacaoProfissional() {
		return this.possuiQualificacaoProfissional;
	}

	public void setPossuiQualificacaoProfissional(Integer possuiQualificacaoProfissional) {
		this.possuiQualificacaoProfissional = possuiQualificacaoProfissional;
	}

	@Column(name = "qualificacao_que_possui")
	public String getQualificacaoQuePossui() {
		return this.qualificacaoQuePossui;
	}

	public void setQualificacaoQuePossui(String qualificacaoQuePossui) {
		this.qualificacaoQuePossui = qualificacaoQuePossui;
	}

	@Column(name = "possui_renda")
	public Integer getPossuiRenda() {
		return this.possuiRenda;
	}

	public void setPossuiRenda(Integer possuiRenda) {
		this.possuiRenda = possuiRenda;
	}

	@Column(name = "qualificacao_que_deseja")
	public String getQualificacaoQueDeseja() {
		return this.qualificacaoQueDeseja;
	}

	public void setQualificacaoQueDeseja(String qualificacaoQueDeseja) {
		this.qualificacaoQueDeseja = qualificacaoQueDeseja;
	}

	@Column(name = "lista_necessidade_especial")
	public String getListaNecessidadeEspecial() {
		return this.listaNecessidadeEspecial;
	}

	public void setListaNecessidadeEspecial(String listaNecessidadeEspecial) {
		this.listaNecessidadeEspecial = listaNecessidadeEspecial;
	}

	@Column(name = "lista_tipo_problema_psicologico")
	public String getListaTipoProblemaPsicologico() {
		return this.listaTipoProblemaPsicologico;
	}

	public void setListaTipoProblemaPsicologico(String listaTipoProblemaPsicologico) {
		this.listaTipoProblemaPsicologico = listaTipoProblemaPsicologico;
	}

	@Column(name = "area_moradia")
	public Integer getAreaMoradia() {
		return this.areaMoradia;
	}

	public void setAreaMoradia(Integer areaMoradia) {
		this.areaMoradia = areaMoradia;
	}

	@Column(name = "condicoes_moradia", length = 100)
	public String getCondicoesMoradia() {
		return this.condicoesMoradia;
	}

	public void setCondicoesMoradia(String condicoesMoradia) {
		this.condicoesMoradia = condicoesMoradia;
	}

	@Column(name = "tipo_moradia", length = 100)
	public String getTipoMoradia() {
		return this.tipoMoradia;
	}

	public void setTipoMoradia(String tipoMoradia) {
		this.tipoMoradia = tipoMoradia;
	}

	@Column(name = "tipo_abastecimento_agua", length = 100)
	public String getTipoAbastecimentoAgua() {
		return this.tipoAbastecimentoAgua;
	}

	public void setTipoAbastecimentoAgua(String tipoAbastecimentoAgua) {
		this.tipoAbastecimentoAgua = tipoAbastecimentoAgua;
	}

	@Column(name = "estado_civil")
	public Integer getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "orientacao_sexual")
	public Integer getOrientacaoSexual() {
		return this.orientacaoSexual;
	}

	public void setOrientacaoSexual(Integer orientacaoSexual) {
		this.orientacaoSexual = orientacaoSexual;
	}

	@Column(name = "situacao_usuaria")
	public Integer getSituacaoUsuaria() {
		return this.situacaoUsuaria;
	}

	public void setSituacaoUsuaria(Integer situacaoUsuaria) {
		this.situacaoUsuaria = situacaoUsuaria;
	}

	@Column(name = "religiao", length = 50)
	public String getReligiao() {
		return this.religiao;
	}

	public void setReligiao(String religiao) {
		this.religiao = religiao;
	}

	@Column(name = "situacao_mercado_trabalho")
	public Integer getSituacaoMercadoTrabalho() {
		return this.situacaoMercadoTrabalho;
	}

	public void setSituacaoMercadoTrabalho(Integer situacaoMercadoTrabalho) {
		this.situacaoMercadoTrabalho = situacaoMercadoTrabalho;
	}

	@Column(name = "ocupacao", length = 100)
	public String getOcupacao() {
		return this.ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	@Column(name = "profissao", length = 100)
	public String getProfissao() {
		return this.profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	@Column(name = "lista_documentos")
	public String getListaDocumentos() {
		return this.listaDocumentos;
	}

	public void setListaDocumentos(String listaDocumentos) {
		this.listaDocumentos = listaDocumentos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_inicio", length = 29)
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_fim", length = 29)
	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Column(name = "situacao")
	public Integer getSituacao() {
		return this.situacao;
	}

	public void setSituacao(Integer situacao) {
		this.situacao = situacao;
	}

	@Column(name = "lista_programa_governo")
	public String getListaProgramaGoverno() {
		return this.listaProgramaGoverno;
	}

	public void setListaProgramaGoverno(String listaProgramaGoverno) {
		this.listaProgramaGoverno = listaProgramaGoverno;
	}

	@Column(name = "nome_mae")
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(name = "lista_usuaria_tipo_medicacao")
	public String getListaUsuariaTipoMedicacao() {
		return this.listaUsuariaTipoMedicacao;
	}

	public void setListaUsuariaTipoMedicacao(String listaUsuariaTipoMedicacao) {
		this.listaUsuariaTipoMedicacao = listaUsuariaTipoMedicacao;
	}

	@Column(name = "faz_uso_alcool")
	public Integer getFazUsoAlcool() {
		return this.fazUsoAlcool;
	}

	public void setFazUsoAlcool(Integer fazUsoAlcool) {
		this.fazUsoAlcool = fazUsoAlcool;
	}

	@Column(name = "faz_uso_droga")
	public Integer getFazUsoDroga() {
		return this.fazUsoDroga;
	}

	public void setFazUsoDroga(Integer fazUsoDroga) {
		this.fazUsoDroga = fazUsoDroga;
	}

	@Column(name = "faz_uso_medicacao")
	public Integer getFazUsoMedicacao() {
		return this.fazUsoMedicacao;
	}

	public void setFazUsoMedicacao(Integer fazUsoMedicacao) {
		this.fazUsoMedicacao = fazUsoMedicacao;
	}

	@Column(name = "frequencia_uso_alcool")
	public Integer getFrequenciaUsoAlcool() {
		return this.frequenciaUsoAlcool;
	}

	public void setFrequenciaUsoAlcool(Integer frequenciaUsoAlcool) {
		this.frequenciaUsoAlcool = frequenciaUsoAlcool;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_hora_cadastro", length = 29)
	public Date getDataHoraCadastro() {
		return this.dataHoraCadastro;
	}

	public void setDataHoraCadastro(Date dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	@Column(name = "usuario")
	public Long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

	@Column(name = "lista_usuaria_tipo_entorpecente")
	public String getListaUsuariaTipoEntorpecente() {
		return this.listaUsuariaTipoEntorpecente;
	}

	public void setListaUsuariaTipoEntorpecente(String listaUsuariaTipoEntorpecente) {
		this.listaUsuariaTipoEntorpecente = listaUsuariaTipoEntorpecente;
	}

	@Column(name = "id_atendimento_visita_domiciliar")
	public Long getIdAtendimentoVisitaDomiciliar() {
		return this.idAtendimentoVisitaDomiciliar;
	}

	public void setIdAtendimentoVisitaDomiciliar(Long idAtendimentoVisitaDomiciliar) {
		this.idAtendimentoVisitaDomiciliar = idAtendimentoVisitaDomiciliar;
	}

}