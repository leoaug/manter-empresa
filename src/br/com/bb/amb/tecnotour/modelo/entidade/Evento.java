package br.com.bb.amb.tecnotour.modelo.entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;
import br.com.bb.amb.tecnotour.constantes.PeriodicidadeEnum;


@Entity
@Table(name = "evt", schema = "TECNOTOUR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Evento extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_evt")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "TS_INC_EVT", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataInicio;
		
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "TS_FIM_EVT" , nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFim;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	@Column(name = "TS_CAD_EVT" , nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastro;

	@ManyToOne
	@JoinColumn(name = "nr_cpxo" , referencedColumnName = "nr_cpxo" , nullable = false)
	private Complexo complexo;
	

	@ManyToOne
	@JoinColumn(name = "nr_est_evt" , referencedColumnName = "nr_est_evt" , nullable = false)
	private StatusEvento statusEvento;
	
	
	@Column(name = "NM_EVT", columnDefinition = "char(50)" , nullable = false )
	private String nome;
	
	
	@Column(name = "QT_MAX_PCT_EVT", nullable = false)
	private Integer qtdeMaximaVisitantes;
	
	
	@Column(name = "IN_PMS_CVCD" , columnDefinition = "CHAR(1)", nullable = false)
	private String indicadorPermissaoConvocado;
	
	
	@Column(name = "CD_CHV_SSBB_CAD_EVT", columnDefinition = "CHAR(8)", nullable = false)
	private String codigoChaveSisbb;
	
	
	@Column(name = "TX_INF_EVT" , columnDefinition = "VARCHAR(2000)", nullable = false)
	private String textoInformacao;

	@OneToMany(fetch =  FetchType.LAZY , mappedBy = "evento")
	private List <FuncionarioEvento> listaFuncionariosEventos;
	
	@OneToMany(fetch =  FetchType.LAZY , mappedBy = "evento")
	private List <EventoAcesso> listaEventoAcesso;
	
	@JsonIgnore
	@Transient
	private PeriodicidadeEnum periodicidadeEnum;
	
	@JsonIgnore
	@Transient
	private Integer qtdeDoPeriodo;
	
	/*
	@Transient
	@JsonProperty("jsonComplexo")
	private String jsonComplexo;
	*/
	
	/*
	@Transient
	@JsonProperty("jsonStatusEvento")
	private String jsonStatusEvento;
	*/
	
	/*
	@Transient
	@JsonProperty("jsonListaFuncionarios")
	private List <String> jsonListaFuncionarios;
	*/
	
	@Transient
	@JsonProperty("jsonChaveUsuarioLogado")
	private String jsonChaveUsuarioLogado;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public PeriodicidadeEnum getPeriodicidadeEnum() {
		return periodicidadeEnum;
	}

	public void setPeriodicidadeEnum(PeriodicidadeEnum periodicidadeEnum) {
		this.periodicidadeEnum = periodicidadeEnum;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Complexo getComplexo() {
		return complexo;
	}

	public void setComplexo(Complexo complexo) {
		this.complexo = complexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public Integer getQtdeMaximaVisitantes() {
		return qtdeMaximaVisitantes;
	}

	public void setQtdeMaximaVisitantes(Integer qtdeMaximaVisitantes) {
		this.qtdeMaximaVisitantes = qtdeMaximaVisitantes;
	}

	public Integer getQtdeDoPeriodo() {
		return qtdeDoPeriodo;
	}

	public void setQtdeDoPeriodo(Integer qtdeDoPeriodo) {
		this.qtdeDoPeriodo = qtdeDoPeriodo;
	}

	public String getIndicadorPermissaoConvocado() {
		return indicadorPermissaoConvocado;
	}

	public void setIndicadorPermissaoConvocado(String indicadorPermissaoConvocado) {
		this.indicadorPermissaoConvocado = indicadorPermissaoConvocado;
	}

	public String getCodigoChaveSisbb() {
		return codigoChaveSisbb;
	}

	public void setCodigoChaveSisbb(String codigoChaveSisbb) {
		this.codigoChaveSisbb = codigoChaveSisbb;
	}

	public StatusEvento getStatusEvento() {
		return statusEvento;
	}

	public void setStatusEvento(StatusEvento statusEvento) {
		this.statusEvento = statusEvento;
	}

	public String getTextoInformacao() {
		return textoInformacao;
	}

	public void setTextoInformacao(String textoInformacao) {
		this.textoInformacao = textoInformacao;
	}

	public List<FuncionarioEvento> getListaFuncionariosEventos() {
		return listaFuncionariosEventos;
	}

	public void setListaFuncionariosEventos(List<FuncionarioEvento> listaFuncionariosEventos) {
		this.listaFuncionariosEventos = listaFuncionariosEventos;
	}
	

	/*
	public String getJsonComplexo() {
		return jsonComplexo;
	}

	public void setJsonComplexo(String jsonComplexo) {
		this.jsonComplexo = jsonComplexo;
	}
	*/

	/*
	public String getJsonStatusEvento() {
		return jsonStatusEvento;
	}

	public void setJsonStatusEvento(String jsonStatusEvento) {
		this.jsonStatusEvento = jsonStatusEvento;
	}
*/
	
	/*
	public List<String> getJsonListaFuncionarios() {
		return jsonListaFuncionarios;
	}

	public void setJsonListaFuncionarios(List<String> jsonListaFuncionarios) {
		this.jsonListaFuncionarios = jsonListaFuncionarios;
	}
	*/
	

	public List<EventoAcesso> getListaEventoAcesso() {
		return listaEventoAcesso;
	}

	public void setListaEventoAcesso(List<EventoAcesso> listaEventoAcesso) {
		this.listaEventoAcesso = listaEventoAcesso;
	}

	public String getJsonChaveUsuarioLogado() {
		return jsonChaveUsuarioLogado;
	}

	public void setJsonChaveUsuarioLogado(String jsonChaveUsuarioLogado) {
		this.jsonChaveUsuarioLogado = jsonChaveUsuarioLogado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codigoChaveSisbb == null) ? 0 : codigoChaveSisbb.hashCode());
		result = prime * result + ((complexo == null) ? 0 : complexo.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((dataFim == null) ? 0 : dataFim.hashCode());
		result = prime * result + ((dataInicio == null) ? 0 : dataInicio.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((indicadorPermissaoConvocado == null) ? 0 : indicadorPermissaoConvocado.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((periodicidadeEnum == null) ? 0 : periodicidadeEnum.hashCode());
		result = prime * result + ((qtdeDoPeriodo == null) ? 0 : qtdeDoPeriodo.hashCode());
		result = prime * result + ((qtdeMaximaVisitantes == null) ? 0 : qtdeMaximaVisitantes.hashCode());
		result = prime * result + ((statusEvento == null) ? 0 : statusEvento.hashCode());
		result = prime * result + ((textoInformacao == null) ? 0 : textoInformacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Evento other = (Evento) obj;
		if (codigoChaveSisbb == null) {
			if (other.codigoChaveSisbb != null)
				return false;
		} else if (!codigoChaveSisbb.equals(other.codigoChaveSisbb))
			return false;
		if (complexo == null) {
			if (other.complexo != null)
				return false;
		} else if (!complexo.equals(other.complexo))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataFim == null) {
			if (other.dataFim != null)
				return false;
		} else if (!dataFim.equals(other.dataFim))
			return false;
		if (dataInicio == null) {
			if (other.dataInicio != null)
				return false;
		} else if (!dataInicio.equals(other.dataInicio))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (indicadorPermissaoConvocado == null) {
			if (other.indicadorPermissaoConvocado != null)
				return false;
		} else if (!indicadorPermissaoConvocado.equals(other.indicadorPermissaoConvocado))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (periodicidadeEnum != other.periodicidadeEnum)
			return false;
		if (qtdeDoPeriodo == null) {
			if (other.qtdeDoPeriodo != null)
				return false;
		} else if (!qtdeDoPeriodo.equals(other.qtdeDoPeriodo))
			return false;
		if (qtdeMaximaVisitantes == null) {
			if (other.qtdeMaximaVisitantes != null)
				return false;
		} else if (!qtdeMaximaVisitantes.equals(other.qtdeMaximaVisitantes))
			return false;
		if (statusEvento == null) {
			if (other.statusEvento != null)
				return false;
		} else if (!statusEvento.equals(other.statusEvento))
			return false;
		if (textoInformacao == null) {
			if (other.textoInformacao != null)
				return false;
		} else if (!textoInformacao.equals(other.textoInformacao))
			return false;
		return true;
	}

	@Override
    public String toString() {
    	ObjectMapper mapper = new ObjectMapper();
    	
    	String jsonString = "";
		try {
			//mapper.enable(SerializationFeature.INDENT_OUTPUT);
			jsonString = mapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
    	return jsonString;
    }
	
}
