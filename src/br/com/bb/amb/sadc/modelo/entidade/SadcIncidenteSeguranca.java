package br.com.bb.amb.sadc.modelo.entidade;
 
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.bb.amb.constantes.SadcConstantes;
import br.com.bb.amb.constantes.SadcNivelImpactoEnum;


/**
 * Classe que registra os incidentes de seguran a do sistema
 * <p>
 * tabela: acd_sgca
 * <p>
 * relacionamentos ManyToOne: sadcAcesso, sadcTipoIncidenteSeguranca
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "acd_sgca" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcIncidenteSeguranca extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_acd_sgca")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_ACD_SGCA_GEN", sequenceName = "SEQ_ACD_SGCA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ACD_SGCA_GEN")
	
	private Long id;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name= "in_nvl_iflc", length = 1 , columnDefinition = "character")
	private SadcNivelImpactoEnum sadcNivelImpactoEnum;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_ocr_acd_sgca") 
	private Date dataHoraOcorrenciaIncidente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_hh_cad_acd_sgca") 
	private Date dataHoraCadastroIncidente;
	
	@Column(name = "tx_area_ocr_acd_sgca", columnDefinition = "varchar(256)")
	private String textoAreaOcorrenciaIncidente;
	
	@Column(name = "tx_area_atgd_acd_sgca", columnDefinition = "varchar(256)")
	private String textoAreaAtingidaIncidente;
	
	@Column(name = "tx_cmtd_acd_sgca", columnDefinition = "varchar(256)")
	private String textoEnvolvidosIncidente;
	
	@Column(name = "cd_ssbb_usu_cad_acd_sgca", columnDefinition = "character(8)")
	private String codigoSisbbUsuarioCadastroIncidente;
	
	@Column(name = "nm_usu_cad_acd_sgca", columnDefinition = "character(50)")
	private String nomeUsuarioCadastroIncidente;
	
	@ManyToOne
	@JoinColumn(name = "nr_slct_acss" , referencedColumnName = "nr_slct_acss", nullable = true)
	private SadcAcesso sadcAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_tip_acd_sgca" , referencedColumnName = "nr_tip_acd_sgca", nullable = false)
	private SadcTipoIncidenteSeguranca sadcTipoIncidenteSeguranca;

	public Long getId() {
		return id;
	}

	public SadcNivelImpactoEnum getSadcNivelImpactoEnum() {
		return sadcNivelImpactoEnum;
	}

	public Date getDataHoraOcorrenciaIncidente() {
		return dataHoraOcorrenciaIncidente;
	}

	public Date getDataHoraCadastroIncidente() {
		return dataHoraCadastroIncidente;
	}

	public String getTextoAreaOcorrenciaIncidente() {
		return textoAreaOcorrenciaIncidente;
	}

	public String getTextoAreaAtingidaIncidente() {
		return textoAreaAtingidaIncidente;
	}

	public String getTextoEnvolvidosIncidente() {
		return textoEnvolvidosIncidente;
	}

	public String getCodigoSisbbUsuarioCadastroIncidente() {
		return codigoSisbbUsuarioCadastroIncidente;
	}

	public String getNomeUsuarioCadastroIncidente() {
		return nomeUsuarioCadastroIncidente;
	}

	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}

	public SadcTipoIncidenteSeguranca getSadcTipoIncidenteSeguranca() {
		return sadcTipoIncidenteSeguranca;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcNivelImpactoEnum(SadcNivelImpactoEnum sadcNivelImpactoEnum) {
		this.sadcNivelImpactoEnum = sadcNivelImpactoEnum;
	}

	public void setDataHoraOcorrenciaIncidente(Date dataHoraOcorrenciaIncidente) {
		this.dataHoraOcorrenciaIncidente = dataHoraOcorrenciaIncidente;
	}

	public void setDataHoraCadastroIncidente(Date dataHoraCadastroIncidente) {
		this.dataHoraCadastroIncidente = dataHoraCadastroIncidente;
	}

	public void setTextoAreaOcorrenciaIncidente(String textoAreaOcorrenciaIncidente) {
		this.textoAreaOcorrenciaIncidente = textoAreaOcorrenciaIncidente;
	}

	public void setTextoAreaAtingidaIncidente(String textoAreaAtingidaIncidente) {
		this.textoAreaAtingidaIncidente = textoAreaAtingidaIncidente;
	}

	public void setTextoEnvolvidosIncidente(String textoEnvolvidosIncidente) {
		this.textoEnvolvidosIncidente = textoEnvolvidosIncidente;
	}

	public void setCodigoSisbbUsuarioCadastroIncidente(String codigoSisbbUsuarioCadastroIncidente) {
		this.codigoSisbbUsuarioCadastroIncidente = codigoSisbbUsuarioCadastroIncidente;
	}

	public void setNomeUsuarioCadastroIncidente(String nomeUsuarioCadastroIncidente) {
		this.nomeUsuarioCadastroIncidente = nomeUsuarioCadastroIncidente;
	}

	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}

	public void setSadcTipoIncidenteSeguranca(SadcTipoIncidenteSeguranca sadcTipoIncidenteSeguranca) {
		this.sadcTipoIncidenteSeguranca = sadcTipoIncidenteSeguranca;
	}

	
	
}
