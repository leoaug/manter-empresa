package br.com.bb.amb.sadc.modelo.entidade;



 
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;
import br.com.bb.amb.constantes.SadcVerdadeiroFalsoEnum;
 

/**
 * Classe de Solicita  es de Acesso do Sistema SADC
 * <p>
 * tabela: slct_acss
 * <p>
 * relacionamentos ManyToOne: sadcAcessoPai, sadcTipoAcesso, sadcStatusAcesso, sadcTipoAcessoExclusivo
 * <p>
 * relacionamentos OneToMany: listaSadcAcessoFilhos, 
 * listaSadcSalasAcessos, listaSadcArquivosAcessos, listaSadcAtualizacaoAcessos, listaSadcUsuariosAcessos
 *
 * @author c1277736 
 */
@Entity
@Table(name = "slct_acss", schema = SadcConstantes.SADC_SCHEMA)
public class SadcAcesso extends SadcEntidade {

	

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_slct_acss")
	@SequenceGenerator(name = "SEQ_SLCT_ACSS_GEN", sequenceName = SadcConstantes.SADC_SCHEMA+".SEQ_SLCT_ACSS", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SLCT_ACSS_GEN")
	private Long id; 
	
	@Column(name = "tx_jst_acss" , columnDefinition = "varchar(4000)")
	private String justificativa; 
	
	@Column(name = "cd_reg_doc_alt" , columnDefinition = "character(14)")
	private String codigoRegistroDocAlteracao;	
	
	@Column(name = "cd_ssbb_usu_sltt", columnDefinition = "character(8)")
	private String codigoSisbbUsuarioSolicitante;
	
	@Column(name = "tx_eqp_sltt", columnDefinition = "character(50)")
	private String equipeSolicitante;
	
	@Column(name="nr_eqp_usu_sltt", length = 7)
	private Integer numeroEquipeUsuarioSolicitante;  
	    
	@Column(name = "tx_tel_sltt", columnDefinition = "character(20)")
	private String telefoneSolicitante;
	
	@Column(name = "nm_sltt", columnDefinition = "character(50)")
	private String nomeSolicitante;
	
	@Column(name = "tx_eqp_exec_doc", columnDefinition = "character(50)")
	private String equipeExecutora;
	
	@Column(name = "tx_tit_doc", columnDefinition = "varchar(255)")
	private String tituloDocumento;
	
	@Column(name = "nm_anlt_rsp", columnDefinition = "character(50)")
	private String nomeAnalistaResponsavel;
	
	@Column(name = "tx_tel_anlt_rsp", columnDefinition = "character(50)")
	private String telefoneAnalistaResponsavel;
	
	@Column(name = "cd_ssbb_anlt_rsp", columnDefinition = "character(8)")
	private String codigoSisbbAnalistaResponsavel;

	@Column(name = "tx_dcr_acss")
	private String descricao; 
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_inc_acss")
	
	private Date dataInicioAcesso;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_fim_acss")
	
	private Date dataFimAcesso;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_cad_slct_acss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss",timezone = "GMT-3")
	private Date dataCadastroAcesso;
			
	@ManyToOne 
	@JoinColumn(name = "nr_slct_acss_ref" , referencedColumnName = "nr_slct_acss") 
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcAcesso.class)
	private SadcAcesso sadcAcessoPai;
	
	@ManyToOne
	@JoinColumn(name = "nr_tip_acss", referencedColumnName = "nr_tip_acss")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcTipoAcesso.class)
	private SadcTipoAcesso sadcTipoAcesso;
		
	@ManyToOne
	@JoinColumn(name = "nr_est_acss", referencedColumnName = "nr_est_acss")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcStatusAcesso.class)
	private SadcStatusAcesso sadcStatusAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_tip_acss_excs", referencedColumnName = "nr_tip_acss_excs")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcTipoAcessoExclusivo.class)
	private SadcTipoAcessoExclusivo sadcTipoAcessoExclusivo;
	
	@Enumerated(EnumType.ORDINAL)  
	@Column(name = "in_exea_rtin_sis", nullable = false, columnDefinition = "char(1)") 	
	private SadcVerdadeiroFalsoEnum indicadorExecucaoRotinaSistema; 
	
	@OneToMany(mappedBy = "sadcAcessoPai")
	@LazyCollection(LazyCollectionOption.FALSE)	
	private List <SadcAcesso> listaSadcAcessoFilhos;	
	
	
	@OneToMany(mappedBy = "sadcAcesso")
	@LazyCollection(LazyCollectionOption.FALSE)	
	private List <SadcSalaAcesso> listaSadcSalasAcessos;

	 
	@OneToMany(mappedBy = "sadcAcesso")
	@LazyCollection(LazyCollectionOption.FALSE)
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcArquivoAcesso> listaSadcArquivosAcessos;
	
	
	@OneToMany(mappedBy = "sadcAcesso")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List <SadcUsuarioAcesso> listaSadcUsuariosAcessos;
	
	
	@OneToMany(mappedBy = "sadcAcesso")
	@OrderBy(value = "dataHoraCadastro")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List <SadcAtualizacaoAcesso> listaSadcAtualizacaoAcessos;
	


	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getJustificativa() {
		return justificativa;
	}

	
	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	
	public String getCodigoRegistroDocAlteracao() {
		return codigoRegistroDocAlteracao;
	}

	
	public void setCodigoRegistroDocAlteracao(String codigoRegistroDocAlteracao) {
		this.codigoRegistroDocAlteracao = codigoRegistroDocAlteracao;
	}

	
	public String getCodigoSisbbUsuarioSolicitante() {
		return codigoSisbbUsuarioSolicitante;
	}

	
	public void setCodigoSisbbUsuarioSolicitante(String codigoSisbbUsuarioSolicitante) {
		this.codigoSisbbUsuarioSolicitante = codigoSisbbUsuarioSolicitante;
	}

	
	public String getEquipeSolicitante() {
		if(equipeSolicitante != null) {
			return equipeSolicitante.trim();
		}
		return equipeSolicitante;
	}

	
	public void setEquipeSolicitante(String equipeSolicitante) {
		this.equipeSolicitante = equipeSolicitante;
	}

	
	public Integer getNumeroEquipeUsuarioSolicitante() {
		return numeroEquipeUsuarioSolicitante;
	}

	
	public void setNumeroEquipeUsuarioSolicitante(Integer numeroEquipeUsuarioSolicitante) {
		this.numeroEquipeUsuarioSolicitante = numeroEquipeUsuarioSolicitante;
	}

	
	public String getTelefoneSolicitante() {
		if(telefoneSolicitante != null) {
			return telefoneSolicitante.trim();
		}
		return telefoneSolicitante;
	}

	
	public void setTelefoneSolicitante(String telefoneSolicitante) {
		this.telefoneSolicitante = telefoneSolicitante;
	}

	
	public String getNomeSolicitante() {
		if(nomeSolicitante != null) {
			return nomeSolicitante.trim();
		}
		return nomeSolicitante;
	}

	
	public void setNomeSolicitante(String nomeSolicitante) {
		this.nomeSolicitante = nomeSolicitante;
	}

	
	public String getEquipeExecutora() {
		if(equipeExecutora != null) {
			return equipeExecutora.trim();
		}
		return equipeExecutora;
	}

	
	public void setEquipeExecutora(String equipeExecutora) {
		this.equipeExecutora = equipeExecutora;
	}

	
	public String getTituloDocumento() {
		return tituloDocumento;
	}

	
	public void setTituloDocumento(String tituloDocumento) {
		this.tituloDocumento = tituloDocumento;
	}

	
	public String getNomeAnalistaResponsavel() {
		return nomeAnalistaResponsavel;
	}

	
	public void setNomeAnalistaResponsavel(String nomeAnalistaResponsavel) {
		this.nomeAnalistaResponsavel = nomeAnalistaResponsavel;
	}

	
	public String getTelefoneAnalistaResponsavel() {
		return telefoneAnalistaResponsavel;
	}

	public void setTelefoneAnalistaResponsavel(String telefoneAnalistaResponsavel) {
		this.telefoneAnalistaResponsavel = telefoneAnalistaResponsavel;
	}

	
	public String getCodigoSisbbAnalistaResponsavel() {
		return codigoSisbbAnalistaResponsavel;
	}

	
	public void setCodigoSisbbAnalistaResponsavel(String codigoSisbbAnalistaResponsavel) {
		this.codigoSisbbAnalistaResponsavel = codigoSisbbAnalistaResponsavel;
	}

	
	public String getDescricao() {
		return descricao;
	}

	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	
	public SadcAcesso getSadcAcessoPai() {
		return sadcAcessoPai;
	}

	
	public void setSadcAcessoPai(SadcAcesso sadcAcessoPai) {
		this.sadcAcessoPai = sadcAcessoPai;
	}

	
	public SadcTipoAcesso getSadcTipoAcesso() {
		return sadcTipoAcesso;
	}

	
	public void setSadcTipoAcesso(SadcTipoAcesso sadcTipoAcesso) {
		this.sadcTipoAcesso = sadcTipoAcesso;
	}

	
	public SadcStatusAcesso getSadcStatusAcesso() {
		return sadcStatusAcesso;
	}

	
	public void setSadcStatusAcesso(SadcStatusAcesso sadcStatusAcesso) {
		this.sadcStatusAcesso = sadcStatusAcesso;
	}

	
	public SadcTipoAcessoExclusivo getSadcTipoAcessoExclusivo() {
		return sadcTipoAcessoExclusivo;
	}

	
	public void setSadcTipoAcessoExclusivo(SadcTipoAcessoExclusivo sadcTipoAcessoExclusivo) {
		this.sadcTipoAcessoExclusivo = sadcTipoAcessoExclusivo;
	}
	
	
	public List<SadcUsuarioAcesso> getListaSadcUsuariosAcessos() {
		return listaSadcUsuariosAcessos;
	}

	
	public void setListaSadcUsuariosAcessos(List<SadcUsuarioAcesso> listaSadcUsuariosAcessos) {
		this.listaSadcUsuariosAcessos = listaSadcUsuariosAcessos;
	}

	
	public List<SadcAcesso> getListaSadcAcessoFilhos() {
		return listaSadcAcessoFilhos;
	}

	
	public void setListaSadcAcessoFilhos(List<SadcAcesso> listaSadcAcessoFilhos) {
		this.listaSadcAcessoFilhos = listaSadcAcessoFilhos;
	}
	
	
	public List<SadcSalaAcesso> getListaSadcSalasAcessos() {
		return listaSadcSalasAcessos;
	}

	
	public void setListaSadcSalasAcessos(List<SadcSalaAcesso> listaSadcSalasAcessos) {
		this.listaSadcSalasAcessos = listaSadcSalasAcessos;
	}

	
	public List<SadcArquivoAcesso> getListaSadcArquivosAcessos() {
		return listaSadcArquivosAcessos;
	}

	
	public void setListaSadcArquivosAcessos(List<SadcArquivoAcesso> listaSadcArquivosAcessos) {
		this.listaSadcArquivosAcessos = listaSadcArquivosAcessos;
	}
	
	
	public List<SadcAtualizacaoAcesso> getListaSadcAtualizacaoAcessos() {		
		return listaSadcAtualizacaoAcessos;
	}
	
	
	public void setListaSadcAtualizacaoAcessos(List<SadcAtualizacaoAcesso> listaSadcAtualizacaoAcessos) {
		this.listaSadcAtualizacaoAcessos = listaSadcAtualizacaoAcessos;
	}

	
	public SadcVerdadeiroFalsoEnum getIndicadorExecucaoRotinaSistema() {
		return indicadorExecucaoRotinaSistema;
	}

	
	public void setIndicadorExecucaoRotinaSistema(SadcVerdadeiroFalsoEnum indicadorExecucaoRotinaSistema) {
		this.indicadorExecucaoRotinaSistema = indicadorExecucaoRotinaSistema;
	}
	
	
	
	public Date getDataInicioAcesso() {
		return dataInicioAcesso;
	}

	
	public void setDataInicioAcesso(Date dataInicioAcesso) {
		this.dataInicioAcesso = dataInicioAcesso;
	}

	
	public Date getDataFimAcesso() {
		return dataFimAcesso;
	}

	
	public void setDataFimAcesso(Date dataFimAcesso) {
		this.dataFimAcesso = dataFimAcesso;
	}

	
	public Date getDataCadastroAcesso() {
		return dataCadastroAcesso;
	}

	
	public void setDataCadastroAcesso(Date dataCadastroAcesso) {
		this.dataCadastroAcesso = dataCadastroAcesso;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SadcAcesso other = (SadcAcesso) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}




	 
}
