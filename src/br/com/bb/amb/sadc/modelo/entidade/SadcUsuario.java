package br.com.bb.amb.sadc.modelo.entidade;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.bb.amb.constantes.SadcConstantes;
import br.com.bb.amb.constantes.SadcTipoDocumentoEnum;


/**
 * Classe dos usu rios do sistema SADC
 * <p>
 * tabela: usu
 * <p>
 * relacionamentos ManyToOne: sadcPais, sadcTipoDocumentoEnum
 * @author c1277736
 *
 */
@Entity
@Table(name = "usu", schema = SadcConstantes.SADC_SCHEMA)

public class SadcUsuario extends SadcEntidade {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_usu")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_USU_GEN", sequenceName = "SEQ_USU")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_USU_GEN")
	
	private Long id;
	
	@Column(name = "nm_usu" , length = 100 , columnDefinition = "character(100)")
	
	private String nome;
	
	@Column(name = "nm_cia_usu" , length = 100 , columnDefinition = "character(100)")
	
	private String empresa;
		
	@Column(name = "cd_org_doc_usu" , length = 20 , columnDefinition = "character(20)")
	
	private String orgDocumento;
	
	@Column(name = "cd_nr_doc_usu" , length = 20 , columnDefinition = "character(20)")
	private String numeroDocumento;			 
	
	@Column(name = "nr_lim_acss_urgt", length = 2 )
	
	private Integer limiteAcessoEmergencial;
	
	@ManyToOne
	@JoinColumn(name = "nr_pais" , referencedColumnName = "nr_pais" )
	
	private SadcPais sadcPais;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name= "in_tip_doc_usu", length = 1 , columnDefinition = "character")	
	private SadcTipoDocumentoEnum sadcTipoDocumentoEnum;
	
	@Transient
	
	private Integer tipoNumeroEmpresaNome;
	
	@Transient
	
	private String transientNomesUsuarios;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		if(nome != null) {
			return nome.trim();
		}
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa() {
		if(empresa != null) {
			return empresa.trim();
		}
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getOrgDocumento() {
		return orgDocumento;
	}

	public void setOrgDocumento(String orgDocumento) {
		this.orgDocumento = orgDocumento;
	}

	public String getNumeroDocumento() {
		if(numeroDocumento != null) {
			return numeroDocumento.trim();
		}
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public Integer getLimiteAcessoEmergencial() {
		return limiteAcessoEmergencial;
	}

	public void setLimiteAcessoEmergencial(Integer limiteAcessoEmergencial) {
		this.limiteAcessoEmergencial = limiteAcessoEmergencial;
	}

	public SadcPais getSadcPais() {
		return sadcPais;
	}

	public void setSadcPais(SadcPais sadcPais) {
		this.sadcPais = sadcPais;
	}

	public SadcTipoDocumentoEnum getSadcTipoDocumentoEnum() {
		return sadcTipoDocumentoEnum;
	}

	public void setSadcTipoDocumentoEnum(SadcTipoDocumentoEnum sadcTipoDocumentoEnum) {
		this.sadcTipoDocumentoEnum = sadcTipoDocumentoEnum;
	}

	public String getTransientNomesUsuarios() {
		return transientNomesUsuarios;
	}

	public void setTransientNomesUsuarios(String transientNomesUsuarios) {
		this.transientNomesUsuarios = transientNomesUsuarios;
	}



}
