package br.gov.pa.prodepa;
// Generated Nov 1, 2019 4:29:22 PM by Hibernate Tools 5.2.12.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Usuaria generated by hbm2java
 */
@Entity
@Table(name = "usuaria")
public class Usuaria implements java.io.Serializable {

	private long id;
	private CondicaoSaneamento condicaoSaneamento;
	private CondicoesMoradia condicoesMoradia;
	private Ocupacao ocupacaoByIdOcupacaoProfissao;
	private Ocupacao ocupacaoByIdOcupacao;
	private Religiao religiao;
	private TipoMoradia tipoMoradia;
	private Long numeroRegistro;
	private Date dataCadastro;
	private String nome;
	private Integer sexo;
	private Date dataNascimento;
	private String nomeMae;
	private Integer estadoNascimento;
	private String rg;
	private String orgaoExpedicaoRg;
	private String cpf;
	private Integer municipioNascimento;
	private Integer iniciativaPropria;
	private Integer estuda;
	private Integer desejaVoltarEstudar;
	private String porqueNaoEstuda;
	private Integer possuiFilhos;
	private String tempoMoradia;
	private Integer areaMoradia;
	private Integer possuiEnergiaEletrica;
	private Integer geraContaLuz;
	private Integer geraContaAgua;
	private Integer possuiAbastecimentoAgua;
	private Integer tipoAbastecimentoAgua;
	private Integer possuiInstalacaoSanitaria;
	private Integer realizaColetaLixo;
	private Integer trabalhaFora;
	private String porqueNaoTrabalha;
	private String localTrabalho;
	private Integer raca;
	private Integer nivelEscolaridade;
	private Integer situacaoMercadoTrabalho;
	private Integer orientacaoSexual;
	private Integer estadoCivil;
	private BigDecimal rendaTotal;
	private Integer possuiRenda;
	private BigDecimal renda;
	private Integer possuiQualificacaoProfissional;
	private String qualificacaoQuePossui;
	private String qualificacaoQueDeseja;
	private Integer agressorInfancia;
	private Integer agressorAdolescencia;
	private Integer situacaoUsuaria;
	private Date dataChegada;
	private Integer fazUsoAlcool;
	private Integer fazUsoDroga;
	private Integer fazUsoMedicacao;
	private Integer frequenciaUsoAlcool;
	private Long usuario;
	private int situacao;
	private String nacionalidade;
	private String nomeFon;
	private String observacao;
	private String nomeInstituicao;
	private Integer gestante;
	private Integer numeroComodoCasa;
	private String numeroNis;
	private Long idRendaFamiliar;
	private Integer possuiAntecedente;
	private Integer idNacionalidade;
	private Integer isEstrangeiro;
	private Set usuariaTipoEntorpecentes = new HashSet(0);
	private Set tipoProblemaPsicologicos = new HashSet(0);
	private Set necessidadeEspecials = new HashSet(0);
	private Set historicoUsuarias = new HashSet(0);
	private Set usuariaTipoMedicacaos = new HashSet(0);
	private Set programaGovernos = new HashSet(0);
	private Set dependentes = new HashSet(0);
	private Set usuariaViolencias = new HashSet(0);
	private Set enderecos = new HashSet(0);
	private Set preAcolhimentos = new HashSet(0);
	private Set residentes = new HashSet(0);
	private Set atendimentoGrupos = new HashSet(0);
	private Set documentoses = new HashSet(0);
	private Set origemRendas = new HashSet(0);
	private Set agendaAtendimentoUsuarias = new HashSet(0);
	private Set atendimentoVisitaDomiciliars = new HashSet(0);
	private Set atendimentos = new HashSet(0);
	private Set antecedenteCriminals = new HashSet(0);

	public Usuaria() {
	}

	public Usuaria(long id, String nome, Date dataNascimento, String nomeMae, int situacao) {
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.nomeMae = nomeMae;
		this.situacao = situacao;
	}

	public Usuaria(long id, CondicaoSaneamento condicaoSaneamento, CondicoesMoradia condicoesMoradia,
			Ocupacao ocupacaoByIdOcupacaoProfissao, Ocupacao ocupacaoByIdOcupacao, Religiao religiao,
			TipoMoradia tipoMoradia, Long numeroRegistro, Date dataCadastro, String nome, Integer sexo,
			Date dataNascimento, String nomeMae, Integer estadoNascimento, String rg, String orgaoExpedicaoRg,
			String cpf, Integer municipioNascimento, Integer iniciativaPropria, Integer estuda,
			Integer desejaVoltarEstudar, String porqueNaoEstuda, Integer possuiFilhos, String tempoMoradia,
			Integer areaMoradia, Integer possuiEnergiaEletrica, Integer geraContaLuz, Integer geraContaAgua,
			Integer possuiAbastecimentoAgua, Integer tipoAbastecimentoAgua, Integer possuiInstalacaoSanitaria,
			Integer realizaColetaLixo, Integer trabalhaFora, String porqueNaoTrabalha, String localTrabalho,
			Integer raca, Integer nivelEscolaridade, Integer situacaoMercadoTrabalho, Integer orientacaoSexual,
			Integer estadoCivil, BigDecimal rendaTotal, Integer possuiRenda, BigDecimal renda,
			Integer possuiQualificacaoProfissional, String qualificacaoQuePossui, String qualificacaoQueDeseja,
			Integer agressorInfancia, Integer agressorAdolescencia, Integer situacaoUsuaria, Date dataChegada,
			Integer fazUsoAlcool, Integer fazUsoDroga, Integer fazUsoMedicacao, Integer frequenciaUsoAlcool,
			Long usuario, int situacao, String nacionalidade, String nomeFon, String observacao, String nomeInstituicao,
			Integer gestante, Integer numeroComodoCasa, String numeroNis, Long idRendaFamiliar,
			Integer possuiAntecedente, Integer idNacionalidade, Integer isEstrangeiro, Set usuariaTipoEntorpecentes,
			Set tipoProblemaPsicologicos, Set necessidadeEspecials, Set historicoUsuarias, Set usuariaTipoMedicacaos,
			Set programaGovernos, Set dependentes, Set usuariaViolencias, Set enderecos, Set preAcolhimentos,
			Set residentes, Set atendimentoGrupos, Set documentoses, Set origemRendas, Set agendaAtendimentoUsuarias,
			Set atendimentoVisitaDomiciliars, Set atendimentos, Set antecedenteCriminals) {
		this.id = id;
		this.condicaoSaneamento = condicaoSaneamento;
		this.condicoesMoradia = condicoesMoradia;
		this.ocupacaoByIdOcupacaoProfissao = ocupacaoByIdOcupacaoProfissao;
		this.ocupacaoByIdOcupacao = ocupacaoByIdOcupacao;
		this.religiao = religiao;
		this.tipoMoradia = tipoMoradia;
		this.numeroRegistro = numeroRegistro;
		this.dataCadastro = dataCadastro;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.nomeMae = nomeMae;
		this.estadoNascimento = estadoNascimento;
		this.rg = rg;
		this.orgaoExpedicaoRg = orgaoExpedicaoRg;
		this.cpf = cpf;
		this.municipioNascimento = municipioNascimento;
		this.iniciativaPropria = iniciativaPropria;
		this.estuda = estuda;
		this.desejaVoltarEstudar = desejaVoltarEstudar;
		this.porqueNaoEstuda = porqueNaoEstuda;
		this.possuiFilhos = possuiFilhos;
		this.tempoMoradia = tempoMoradia;
		this.areaMoradia = areaMoradia;
		this.possuiEnergiaEletrica = possuiEnergiaEletrica;
		this.geraContaLuz = geraContaLuz;
		this.geraContaAgua = geraContaAgua;
		this.possuiAbastecimentoAgua = possuiAbastecimentoAgua;
		this.tipoAbastecimentoAgua = tipoAbastecimentoAgua;
		this.possuiInstalacaoSanitaria = possuiInstalacaoSanitaria;
		this.realizaColetaLixo = realizaColetaLixo;
		this.trabalhaFora = trabalhaFora;
		this.porqueNaoTrabalha = porqueNaoTrabalha;
		this.localTrabalho = localTrabalho;
		this.raca = raca;
		this.nivelEscolaridade = nivelEscolaridade;
		this.situacaoMercadoTrabalho = situacaoMercadoTrabalho;
		this.orientacaoSexual = orientacaoSexual;
		this.estadoCivil = estadoCivil;
		this.rendaTotal = rendaTotal;
		this.possuiRenda = possuiRenda;
		this.renda = renda;
		this.possuiQualificacaoProfissional = possuiQualificacaoProfissional;
		this.qualificacaoQuePossui = qualificacaoQuePossui;
		this.qualificacaoQueDeseja = qualificacaoQueDeseja;
		this.agressorInfancia = agressorInfancia;
		this.agressorAdolescencia = agressorAdolescencia;
		this.situacaoUsuaria = situacaoUsuaria;
		this.dataChegada = dataChegada;
		this.fazUsoAlcool = fazUsoAlcool;
		this.fazUsoDroga = fazUsoDroga;
		this.fazUsoMedicacao = fazUsoMedicacao;
		this.frequenciaUsoAlcool = frequenciaUsoAlcool;
		this.usuario = usuario;
		this.situacao = situacao;
		this.nacionalidade = nacionalidade;
		this.nomeFon = nomeFon;
		this.observacao = observacao;
		this.nomeInstituicao = nomeInstituicao;
		this.gestante = gestante;
		this.numeroComodoCasa = numeroComodoCasa;
		this.numeroNis = numeroNis;
		this.idRendaFamiliar = idRendaFamiliar;
		this.possuiAntecedente = possuiAntecedente;
		this.idNacionalidade = idNacionalidade;
		this.isEstrangeiro = isEstrangeiro;
		this.usuariaTipoEntorpecentes = usuariaTipoEntorpecentes;
		this.tipoProblemaPsicologicos = tipoProblemaPsicologicos;
		this.necessidadeEspecials = necessidadeEspecials;
		this.historicoUsuarias = historicoUsuarias;
		this.usuariaTipoMedicacaos = usuariaTipoMedicacaos;
		this.programaGovernos = programaGovernos;
		this.dependentes = dependentes;
		this.usuariaViolencias = usuariaViolencias;
		this.enderecos = enderecos;
		this.preAcolhimentos = preAcolhimentos;
		this.residentes = residentes;
		this.atendimentoGrupos = atendimentoGrupos;
		this.documentoses = documentoses;
		this.origemRendas = origemRendas;
		this.agendaAtendimentoUsuarias = agendaAtendimentoUsuarias;
		this.atendimentoVisitaDomiciliars = atendimentoVisitaDomiciliars;
		this.atendimentos = atendimentos;
		this.antecedenteCriminals = antecedenteCriminals;
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
	@JoinColumn(name = "id_condicao_saneamento")
	public CondicaoSaneamento getCondicaoSaneamento() {
		return this.condicaoSaneamento;
	}

	public void setCondicaoSaneamento(CondicaoSaneamento condicaoSaneamento) {
		this.condicaoSaneamento = condicaoSaneamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_condicoes_moradia")
	public CondicoesMoradia getCondicoesMoradia() {
		return this.condicoesMoradia;
	}

	public void setCondicoesMoradia(CondicoesMoradia condicoesMoradia) {
		this.condicoesMoradia = condicoesMoradia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ocupacao_profissao")
	public Ocupacao getOcupacaoByIdOcupacaoProfissao() {
		return this.ocupacaoByIdOcupacaoProfissao;
	}

	public void setOcupacaoByIdOcupacaoProfissao(Ocupacao ocupacaoByIdOcupacaoProfissao) {
		this.ocupacaoByIdOcupacaoProfissao = ocupacaoByIdOcupacaoProfissao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_ocupacao")
	public Ocupacao getOcupacaoByIdOcupacao() {
		return this.ocupacaoByIdOcupacao;
	}

	public void setOcupacaoByIdOcupacao(Ocupacao ocupacaoByIdOcupacao) {
		this.ocupacaoByIdOcupacao = ocupacaoByIdOcupacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_religiao")
	public Religiao getReligiao() {
		return this.religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_moradia")
	public TipoMoradia getTipoMoradia() {
		return this.tipoMoradia;
	}

	public void setTipoMoradia(TipoMoradia tipoMoradia) {
		this.tipoMoradia = tipoMoradia;
	}

	@Column(name = "numero_registro")
	public Long getNumeroRegistro() {
		return this.numeroRegistro;
	}

	public void setNumeroRegistro(Long numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_cadastro", length = 29)
	public Date getDataCadastro() {
		return this.dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	@Column(name = "nome", nullable = false)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "sexo")
	public Integer getSexo() {
		return this.sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_nascimento", nullable = false, length = 13)
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Column(name = "nome_mae", nullable = false)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(name = "estado_nascimento")
	public Integer getEstadoNascimento() {
		return this.estadoNascimento;
	}

	public void setEstadoNascimento(Integer estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}

	@Column(name = "rg")
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Column(name = "orgao_expedicao_rg", length = 50)
	public String getOrgaoExpedicaoRg() {
		return this.orgaoExpedicaoRg;
	}

	public void setOrgaoExpedicaoRg(String orgaoExpedicaoRg) {
		this.orgaoExpedicaoRg = orgaoExpedicaoRg;
	}

	@Column(name = "cpf", length = 14)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "municipio_nascimento")
	public Integer getMunicipioNascimento() {
		return this.municipioNascimento;
	}

	public void setMunicipioNascimento(Integer municipioNascimento) {
		this.municipioNascimento = municipioNascimento;
	}

	@Column(name = "iniciativa_propria")
	public Integer getIniciativaPropria() {
		return this.iniciativaPropria;
	}

	public void setIniciativaPropria(Integer iniciativaPropria) {
		this.iniciativaPropria = iniciativaPropria;
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

	@Column(name = "area_moradia")
	public Integer getAreaMoradia() {
		return this.areaMoradia;
	}

	public void setAreaMoradia(Integer areaMoradia) {
		this.areaMoradia = areaMoradia;
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

	@Column(name = "gera_conta_agua")
	public Integer getGeraContaAgua() {
		return this.geraContaAgua;
	}

	public void setGeraContaAgua(Integer geraContaAgua) {
		this.geraContaAgua = geraContaAgua;
	}

	@Column(name = "possui_abastecimento_agua")
	public Integer getPossuiAbastecimentoAgua() {
		return this.possuiAbastecimentoAgua;
	}

	public void setPossuiAbastecimentoAgua(Integer possuiAbastecimentoAgua) {
		this.possuiAbastecimentoAgua = possuiAbastecimentoAgua;
	}

	@Column(name = "tipo_abastecimento_agua")
	public Integer getTipoAbastecimentoAgua() {
		return this.tipoAbastecimentoAgua;
	}

	public void setTipoAbastecimentoAgua(Integer tipoAbastecimentoAgua) {
		this.tipoAbastecimentoAgua = tipoAbastecimentoAgua;
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

	@Column(name = "raca")
	public Integer getRaca() {
		return this.raca;
	}

	public void setRaca(Integer raca) {
		this.raca = raca;
	}

	@Column(name = "nivel_escolaridade")
	public Integer getNivelEscolaridade() {
		return this.nivelEscolaridade;
	}

	public void setNivelEscolaridade(Integer nivelEscolaridade) {
		this.nivelEscolaridade = nivelEscolaridade;
	}

	@Column(name = "situacao_mercado_trabalho")
	public Integer getSituacaoMercadoTrabalho() {
		return this.situacaoMercadoTrabalho;
	}

	public void setSituacaoMercadoTrabalho(Integer situacaoMercadoTrabalho) {
		this.situacaoMercadoTrabalho = situacaoMercadoTrabalho;
	}

	@Column(name = "orientacao_sexual")
	public Integer getOrientacaoSexual() {
		return this.orientacaoSexual;
	}

	public void setOrientacaoSexual(Integer orientacaoSexual) {
		this.orientacaoSexual = orientacaoSexual;
	}

	@Column(name = "estado_civil")
	public Integer getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(Integer estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "renda_total", precision = 9)
	public BigDecimal getRendaTotal() {
		return this.rendaTotal;
	}

	public void setRendaTotal(BigDecimal rendaTotal) {
		this.rendaTotal = rendaTotal;
	}

	@Column(name = "possui_renda")
	public Integer getPossuiRenda() {
		return this.possuiRenda;
	}

	public void setPossuiRenda(Integer possuiRenda) {
		this.possuiRenda = possuiRenda;
	}

	@Column(name = "renda", precision = 9)
	public BigDecimal getRenda() {
		return this.renda;
	}

	public void setRenda(BigDecimal renda) {
		this.renda = renda;
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

	@Column(name = "qualificacao_que_deseja")
	public String getQualificacaoQueDeseja() {
		return this.qualificacaoQueDeseja;
	}

	public void setQualificacaoQueDeseja(String qualificacaoQueDeseja) {
		this.qualificacaoQueDeseja = qualificacaoQueDeseja;
	}

	@Column(name = "agressor_infancia")
	public Integer getAgressorInfancia() {
		return this.agressorInfancia;
	}

	public void setAgressorInfancia(Integer agressorInfancia) {
		this.agressorInfancia = agressorInfancia;
	}

	@Column(name = "agressor_adolescencia")
	public Integer getAgressorAdolescencia() {
		return this.agressorAdolescencia;
	}

	public void setAgressorAdolescencia(Integer agressorAdolescencia) {
		this.agressorAdolescencia = agressorAdolescencia;
	}

	@Column(name = "situacao_usuaria")
	public Integer getSituacaoUsuaria() {
		return this.situacaoUsuaria;
	}

	public void setSituacaoUsuaria(Integer situacaoUsuaria) {
		this.situacaoUsuaria = situacaoUsuaria;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "data_chegada", length = 13)
	public Date getDataChegada() {
		return this.dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
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

	@Column(name = "usuario")
	public Long getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Long usuario) {
		this.usuario = usuario;
	}

	@Column(name = "situacao", nullable = false)
	public int getSituacao() {
		return this.situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	@Column(name = "nacionalidade")
	public String getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@Column(name = "nome_fon")
	public String getNomeFon() {
		return this.nomeFon;
	}

	public void setNomeFon(String nomeFon) {
		this.nomeFon = nomeFon;
	}

	@Column(name = "observacao")
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "nome_instituicao", length = 250)
	public String getNomeInstituicao() {
		return this.nomeInstituicao;
	}

	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}

	@Column(name = "gestante")
	public Integer getGestante() {
		return this.gestante;
	}

	public void setGestante(Integer gestante) {
		this.gestante = gestante;
	}

	@Column(name = "numero_comodo_casa")
	public Integer getNumeroComodoCasa() {
		return this.numeroComodoCasa;
	}

	public void setNumeroComodoCasa(Integer numeroComodoCasa) {
		this.numeroComodoCasa = numeroComodoCasa;
	}

	@Column(name = "numero_nis", length = 14)
	public String getNumeroNis() {
		return this.numeroNis;
	}

	public void setNumeroNis(String numeroNis) {
		this.numeroNis = numeroNis;
	}

	@Column(name = "id_renda_familiar")
	public Long getIdRendaFamiliar() {
		return this.idRendaFamiliar;
	}

	public void setIdRendaFamiliar(Long idRendaFamiliar) {
		this.idRendaFamiliar = idRendaFamiliar;
	}

	@Column(name = "possui_antecedente")
	public Integer getPossuiAntecedente() {
		return this.possuiAntecedente;
	}

	public void setPossuiAntecedente(Integer possuiAntecedente) {
		this.possuiAntecedente = possuiAntecedente;
	}

	@Column(name = "id_nacionalidade")
	public Integer getIdNacionalidade() {
		return this.idNacionalidade;
	}

	public void setIdNacionalidade(Integer idNacionalidade) {
		this.idNacionalidade = idNacionalidade;
	}

	@Column(name = "is_estrangeiro")
	public Integer getIsEstrangeiro() {
		return this.isEstrangeiro;
	}

	public void setIsEstrangeiro(Integer isEstrangeiro) {
		this.isEstrangeiro = isEstrangeiro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getUsuariaTipoEntorpecentes() {
		return this.usuariaTipoEntorpecentes;
	}

	public void setUsuariaTipoEntorpecentes(Set usuariaTipoEntorpecentes) {
		this.usuariaTipoEntorpecentes = usuariaTipoEntorpecentes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "problema_psicologico_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_tipo_problema_psicologico", nullable = false, updatable = false) })
	public Set getTipoProblemaPsicologicos() {
		return this.tipoProblemaPsicologicos;
	}

	public void setTipoProblemaPsicologicos(Set tipoProblemaPsicologicos) {
		this.tipoProblemaPsicologicos = tipoProblemaPsicologicos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "necessidade_especial_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_necessidade_especial", nullable = false, updatable = false) })
	public Set getNecessidadeEspecials() {
		return this.necessidadeEspecials;
	}

	public void setNecessidadeEspecials(Set necessidadeEspecials) {
		this.necessidadeEspecials = necessidadeEspecials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getHistoricoUsuarias() {
		return this.historicoUsuarias;
	}

	public void setHistoricoUsuarias(Set historicoUsuarias) {
		this.historicoUsuarias = historicoUsuarias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getUsuariaTipoMedicacaos() {
		return this.usuariaTipoMedicacaos;
	}

	public void setUsuariaTipoMedicacaos(Set usuariaTipoMedicacaos) {
		this.usuariaTipoMedicacaos = usuariaTipoMedicacaos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "programa_governo_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_programa_governo", nullable = false, updatable = false) })
	public Set getProgramaGovernos() {
		return this.programaGovernos;
	}

	public void setProgramaGovernos(Set programaGovernos) {
		this.programaGovernos = programaGovernos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getDependentes() {
		return this.dependentes;
	}

	public void setDependentes(Set dependentes) {
		this.dependentes = dependentes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getUsuariaViolencias() {
		return this.usuariaViolencias;
	}

	public void setUsuariaViolencias(Set usuariaViolencias) {
		this.usuariaViolencias = usuariaViolencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getEnderecos() {
		return this.enderecos;
	}

	public void setEnderecos(Set enderecos) {
		this.enderecos = enderecos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getPreAcolhimentos() {
		return this.preAcolhimentos;
	}

	public void setPreAcolhimentos(Set preAcolhimentos) {
		this.preAcolhimentos = preAcolhimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getResidentes() {
		return this.residentes;
	}

	public void setResidentes(Set residentes) {
		this.residentes = residentes;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_grupo_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_atendimento_grupo", nullable = false, updatable = false) })
	public Set getAtendimentoGrupos() {
		return this.atendimentoGrupos;
	}

	public void setAtendimentoGrupos(Set atendimentoGrupos) {
		this.atendimentoGrupos = atendimentoGrupos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "documentos_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_documentos", nullable = false, updatable = false) })
	public Set getDocumentoses() {
		return this.documentoses;
	}

	public void setDocumentoses(Set documentoses) {
		this.documentoses = documentoses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuaria_origem_renda", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_origem_da_renda", nullable = false, updatable = false) })
	public Set getOrigemRendas() {
		return this.origemRendas;
	}

	public void setOrigemRendas(Set origemRendas) {
		this.origemRendas = origemRendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getAgendaAtendimentoUsuarias() {
		return this.agendaAtendimentoUsuarias;
	}

	public void setAgendaAtendimentoUsuarias(Set agendaAtendimentoUsuarias) {
		this.agendaAtendimentoUsuarias = agendaAtendimentoUsuarias;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "atendimento_visita_domiciliar_usuaria", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_atendimento_visita_domiciliar", nullable = false, updatable = false) })
	public Set getAtendimentoVisitaDomiciliars() {
		return this.atendimentoVisitaDomiciliars;
	}

	public void setAtendimentoVisitaDomiciliars(Set atendimentoVisitaDomiciliars) {
		this.atendimentoVisitaDomiciliars = atendimentoVisitaDomiciliars;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuaria")
	public Set getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set atendimentos) {
		this.atendimentos = atendimentos;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "usuaria_antecedente_criminal", joinColumns = {
			@JoinColumn(name = "id_usuaria", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "id_antecedente_criminal", nullable = false, updatable = false) })
	public Set getAntecedenteCriminals() {
		return this.antecedenteCriminals;
	}

	public void setAntecedenteCriminals(Set antecedenteCriminals) {
		this.antecedenteCriminals = antecedenteCriminals;
	}

}