package br.com.bb.amb.sadc.modelo.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;

 
/**
 * Classe das Atualiza  es das Solicita  es de Acesso do sistema SADC
 * <p>
 * Registra todas as altera  es da solicita  o de acesso, altera  es de status, anota  es, etc.
 * <p>
 * tabela: alt_acss
 * <p>
 * relacionamentos ManyToOne: sadcAcesso, sadcStatusAtualizacaoAcesso, sadcExecucaoRotinaSistema
 * 
 * @author c1277736 
 */
@Entity
@Table(name = "atl_acss" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcAtualizacaoAcesso extends SadcEntidade {
 
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_atl_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_ATL_ACSS_GEN", sequenceName = "SEQ_ATL_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ATL_ACSS_GEN")
	
	private Long id;	
	
	@Column(name = "CD_SSBB_USU_ATL_ACSS" , length = 8, columnDefinition = "character(8)")
	private String codSisbbUsuario;
	
	@Column(name = "NM_USU_ATL_ACSS" , length = 100 , columnDefinition = "varchar(100)")
	private String nomeUsuario; 
		
	@Column(name = "DT_HH_CAD_ATL_ACSS")
	@Temporal(TemporalType.TIMESTAMP)
	
	private Date dataHoraCadastro; 
	
	@Column(name = "TX_ATL_ACSS", length = 2000)
	private String textoAtualizacao;
	
	@ManyToOne
	@JoinColumn(name = "nr_slct_acss" , referencedColumnName = "nr_slct_acss")
	
	
	private SadcAcesso sadcAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_est_atl_acss" , referencedColumnName = "nr_est_atl_acss")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcStatusAtualizacaoAcesso.class)
	private SadcStatusAtualizacaoAcesso sadcStatusAtualizacaoAcesso;
	
	@ManyToOne
	@JoinColumn(name = "NR_EXEA_RTIN_SIS" , referencedColumnName = "NR_EXEA_RTIN_SIS")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcExecucaoRotinaSistema.class)
	
	private SadcExecucaoRotinaSistema sadcExecucaoRotinaSistema;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodSisbbUsuario() {
		if(codSisbbUsuario != null) {
			return codSisbbUsuario.trim();
		}
		return codSisbbUsuario;
	}

	public void setCodSisbbUsuario(String codSisbbUsuario) {
		this.codSisbbUsuario = codSisbbUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Date getDataHoraCadastro() {
		return dataHoraCadastro;
	}

	public void setDataHoraCadastro(Date dataHoraCadastro) {
		this.dataHoraCadastro = dataHoraCadastro;
	}

	public String getTextoAtualizacao() {
		return textoAtualizacao;
	}

	public void setTextoAtualizacao(String textoAtualizacao) {
		this.textoAtualizacao = textoAtualizacao;
	}

	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}

	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}

	public SadcStatusAtualizacaoAcesso getSadcStatusAtualizacaoAcesso() {
		return sadcStatusAtualizacaoAcesso;
	}

	public void setSadcStatusAtualizacaoAcesso(SadcStatusAtualizacaoAcesso sadcStatusAtualizacaoAcesso) {
		this.sadcStatusAtualizacaoAcesso = sadcStatusAtualizacaoAcesso;
	}

	public SadcExecucaoRotinaSistema getSadcExecucaoRotinaSistema() {
		return sadcExecucaoRotinaSistema;
	}

	public void setSadcExecucaoRotinaSistema(SadcExecucaoRotinaSistema sadcExecucaoRotinaSistema) {
		this.sadcExecucaoRotinaSistema = sadcExecucaoRotinaSistema;
	}

	
	
}
