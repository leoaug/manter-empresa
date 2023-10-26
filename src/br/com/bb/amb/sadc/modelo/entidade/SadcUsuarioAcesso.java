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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;
import br.com.bb.amb.constantes.SadcTipoUsuarioAcessoEnum;




/**
 * Classe de relacionamento entre Usu rio(SadcUsuario) e Solicita  o de Acesso(SadcAcesso)
 * <p>
 * tabela: usu_acss
 * <p>
 * relacionamentos ManyToOne: sadcUsuario, sadcAcesso 
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "usu_acss", schema = SadcConstantes.SADC_SCHEMA)

public class SadcUsuarioAcesso extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_usu_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_USU_ACSS_GEN", sequenceName = "SEQ_USU_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_USU_ACSS_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_slct_acss" , referencedColumnName = "nr_slct_acss")
	
	private SadcAcesso sadcAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_usu" , referencedColumnName = "nr_usu")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcUsuario.class)
	private SadcUsuario sadcUsuario;
	
	@Column(name = "DT_HH_ENTD_AMB")
	@Temporal(TemporalType.DATE)
	private Date dataHoraEntradaAmbiente;
	
	@Column(name = "DT_HH_SAID_AMB")
	@Temporal(TemporalType.DATE)
	private Date dataHoraSaidaAmbiente;	
	
	@Column(name = "dt_hh_usu_acss_crmt")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraCredenciamento; 

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "in_tip_usu_acss", length = 1 , columnDefinition = "character")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcTipoUsuarioAcessoEnum.class)
	private SadcTipoUsuarioAcessoEnum sadcTipoUsuarioAcessoEnum;
	
	@Column(name = "tx_nr_crt_dspd")
	private String numeroCartaoDisponibilizado;
			
	@Column(name = "in_usu_acss_crt_dspd")
	private Integer sadcUsuarioAcessoCartaoDisponibilizado;

	public Long getId() {
		return id;
	}

	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}

	public SadcUsuario getSadcUsuario() {
		return sadcUsuario;
	}

	public Date getDataHoraEntradaAmbiente() {
		return dataHoraEntradaAmbiente;
	}

	public Date getDataHoraSaidaAmbiente() {
		return dataHoraSaidaAmbiente;
	}

	public Date getDataHoraCredenciamento() {
		return dataHoraCredenciamento;
	}

	public SadcTipoUsuarioAcessoEnum getSadcTipoUsuarioAcessoEnum() {
		return sadcTipoUsuarioAcessoEnum;
	}

	public String getNumeroCartaoDisponibilizado() {
		return numeroCartaoDisponibilizado;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}

	public void setSadcUsuario(SadcUsuario sadcUsuario) {
		this.sadcUsuario = sadcUsuario;
	}

	public void setDataHoraEntradaAmbiente(Date dataHoraEntradaAmbiente) {
		this.dataHoraEntradaAmbiente = dataHoraEntradaAmbiente;
	}

	public void setDataHoraSaidaAmbiente(Date dataHoraSaidaAmbiente) {
		this.dataHoraSaidaAmbiente = dataHoraSaidaAmbiente;
	}

	public void setDataHoraCredenciamento(Date dataHoraCredenciamento) {
		this.dataHoraCredenciamento = dataHoraCredenciamento;
	}

	public void setSadcTipoUsuarioAcessoEnum(SadcTipoUsuarioAcessoEnum sadcTipoUsuarioAcessoEnum) {
		this.sadcTipoUsuarioAcessoEnum = sadcTipoUsuarioAcessoEnum;
	}

	public void setNumeroCartaoDisponibilizado(String numeroCartaoDisponibilizado) {
		this.numeroCartaoDisponibilizado = numeroCartaoDisponibilizado;
	}

	public Integer getSadcUsuarioAcessoCartaoDisponibilizado() {
		return sadcUsuarioAcessoCartaoDisponibilizado;
	}

	public void setSadcUsuarioAcessoCartaoDisponibilizado(Integer sadcUsuarioAcessoCartaoDisponibilizado) {
		this.sadcUsuarioAcessoCartaoDisponibilizado = sadcUsuarioAcessoCartaoDisponibilizado;
	}

	

	
	
	 
}
