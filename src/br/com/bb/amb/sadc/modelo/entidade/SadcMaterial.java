package br.com.bb.amb.sadc.modelo.entidade;
 
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe que registra os materiais que transitam no ambiente de datacenter
 * <p>
 * tabela: mtrl
 * <p>
 * relacionamentos ManyToOne: sadcCategoria, sadcProprietario
 * relacionamentos OneToMany: listaSadcMateriais
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "mtrl" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcMaterial extends SadcEntidade {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_mtrl")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_MTRL_GEN", sequenceName = "SEQ_MTRL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_MTRL_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_mtrl_ref" , referencedColumnName = "nr_mtrl")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcMaterial.class)
	private SadcMaterial sadcMaterialReferencia;
	
	@Column(name = "tx_hpdo_nm_mtrl" , length = 20 ,  columnDefinition = "character(20)")
	private String hostName;
	
	@Column(name = "cd_nr_bem_mtrl" , length = 15 ,  columnDefinition = "character(15)")
	private String codigoNumeroBem;
	
	@Column(name = "cd_nr_sre_mtrl" , length = 20 ,  columnDefinition = "character(20)")
	private String codigoNumeroSerie;	
	
	@Column(name = "tx_nm_prdr"  , length = 50 ,  columnDefinition = "character(50)")
	private String nomeFabricante;
	
	@Column(name = "nr_idfc_admc_srvc", length = 8)
	private Integer numeroIdentificacaoGestaoServicos;	

	@Column(name = "tx_mod_mtrl", length = 100 ,  columnDefinition = "varchar(100)")
	private String modelo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_cad_mtrl")
	private Date dataHoraCadastro;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_ult_alt")
	private Date dataHoraUltimaAtualizacao;
	
	@ManyToOne
	@JoinColumn(name = "nr_ctgr" , referencedColumnName = "nr_ctgr", nullable = true)
	private SadcCategoria sadcCategoria;
	
	@ManyToOne
	@JoinColumn(name = "nr_prt" , referencedColumnName = "nr_prt", nullable = true)
	private SadcProprietario sadcProprietario;
	
	
	@Column(name = "fl_said_ped",columnDefinition="BOOLEAN DEFAULT false") 	
	private boolean saidaPredio; 
	
	@Column(name = "capt_img" , columnDefinition="boolean default false")
	private boolean capturaImagemMaterial;
	
	@Column(name = "entr_mat" , columnDefinition="boolean default false")
	private boolean entradaMaterial;
	
	@Column(name = "said_mat" , columnDefinition="boolean default false")
	private boolean saidaMaterial;
	
	@Column(name= "dcr_dst_mtrl",columnDefinition = "varchar (500)")
	private String destinoMaterial;
		
	@OneToMany(mappedBy = "sadcMaterialReferencia")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	private List <SadcMaterial> listaSadcMateriais;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public SadcMaterial getSadcMaterialReferencia() {
		return sadcMaterialReferencia;
	}

	public void setSadcMaterialReferencia(SadcMaterial sadcMaterialReferencia) {
		this.sadcMaterialReferencia = sadcMaterialReferencia;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getCodigoNumeroBem() {
		if(codigoNumeroBem != null) {
			return codigoNumeroBem.trim();
		}
		return codigoNumeroBem;
	}

	public void setCodigoNumeroBem(String codigoNumeroBem) {
		this.codigoNumeroBem = codigoNumeroBem;
	}

	public boolean isSaidaPredio() {
		return saidaPredio;
	}

	public void setSaidaPredio(boolean saidaPredio) {
		this.saidaPredio = saidaPredio;
	}
	

	public String getDestinoMaterial() {
		return destinoMaterial;
	}

	public void setDestinoMaterial(String destinoMaterial) {
		this.destinoMaterial = destinoMaterial;
	}

	public String getCodigoNumeroSerie() {
		return codigoNumeroSerie;
	}

	public void setCodigoNumeroSerie(String codigoNumeroSerie) {
		this.codigoNumeroSerie = codigoNumeroSerie;
	}

	public String getNomeFabricante() {
		return nomeFabricante;
	}

	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}

	public Integer getNumeroIdentificacaoGestaoServicos() {
		return numeroIdentificacaoGestaoServicos;
	}

	public void setNumeroIdentificacaoGestaoServicos(Integer numeroIdentificacaoGestaoServicos) {
		this.numeroIdentificacaoGestaoServicos = numeroIdentificacaoGestaoServicos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Date getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Date dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public Date getDataHoraUltimaAtualizacao() {
		return dataHoraUltimaAtualizacao;
	}

	public void setDataHoraUltimaAtualizacao(Date dataHoraUltimaAtualizacao) {
		this.dataHoraUltimaAtualizacao = dataHoraUltimaAtualizacao;
	}

	public SadcCategoria getSadcCategoria() {
		return sadcCategoria;
	}

	public void setSadcCategoria(SadcCategoria sadcCategoria) {
		this.sadcCategoria = sadcCategoria;
	}

	public SadcProprietario getSadcProprietario() {
		return sadcProprietario;
	}

	public void setSadcProprietario(SadcProprietario sadcProprietario) {
		this.sadcProprietario = sadcProprietario;
	}

	public List<SadcMaterial> getListaSadcMateriais() {
		return listaSadcMateriais;
	}

	public void setListaSadcMateriais(List<SadcMaterial> listaSadcMateriais) {
		this.listaSadcMateriais = listaSadcMateriais;
	}

	public boolean isCapturaImagemMaterial() {
		return capturaImagemMaterial;
	}

	public boolean isEntradaMaterial() {
		return entradaMaterial;
	}
	
	public void setEntradaMaterial(boolean entradaMaterial) {
		this.entradaMaterial = entradaMaterial;
	}

	public boolean isSaidaMaterial() {
		return saidaMaterial;
	}
	public void setSaidaMaterial(boolean saidaMaterial) {
		this.saidaMaterial = saidaMaterial;
	}

	public void setCapturaImagemMaterial(boolean capturaImagemMaterial) {
		this.capturaImagemMaterial = capturaImagemMaterial;
	}

	
	
}
