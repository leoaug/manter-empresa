package br.com.bb.amb.sadc.modelo.entidade;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe que cont m os par metros do sistema SADC
 * <p>
 * tabela: prm_sis
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "prm_sis" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcParametroSistema extends SadcEntidade {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_prm_sis")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_PRM_SIS_GEN", sequenceName = "SEQ_PRM_SIS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PRM_SIS_GEN")
	private Long id;
	
	@Column(name = "tx_pag_inc" , length = 4000)
	private String textoInicial;
		
	@Column(name = "tx_rota_arq_svdr" , length = 255, columnDefinition = "varchar(255)")
	private String textoRota;	
		
	@Column(name = "tx_vrs_atu" , length = 10, columnDefinition = "character(10)")
	private String textoNumeroVersao;	
			
	@Column(name = "cd_tip_amb" , length = 1 , columnDefinition = "character")
	private String tipoAmbiente;	
				
	@Column(name = "tx_rota_svdr_xml" , length = 255, columnDefinition = "varchar(255)")
	private String textoCaminhoServidorXml;
	
	@Column(name = "TX_USU_SVDR_XML" , columnDefinition = "character(30)")
	private String autenticacaoLoginServidorXml;
	
	@Column(name = "TX_SNH_SVDR_XML" ,  columnDefinition = "character(20)")
	private String autenticacaoSenhaServidorXml;
	
	@Column(name = "NR_MNTO_CARE_SLCT_ACSS", length = 3)
	private Integer minutoCarenciaAcesso; 
	
	@Column(name = "tx_url_ldap" , columnDefinition = "varchar(255)" )
	private String urlLdap;
	
	@Column(name = "tx_usu_ldap" , columnDefinition = "varchar(255)" )
	private String usuarioLdap;
	
	
	@Column(name = "tx_snh_ldap" , columnDefinition = "varchar(20)" )
	private String senhaLdap;
	
	
	@Column(name = "nr_hh_exbr_anx_atl")
	private Integer totalHorasExibirBotao;
	
	@Column(name = "nr_reg_acss_acd_ptrr")
	private Integer totalRegistrosAcessosPosterior;
	
	@Column(name = "tx_prm_exea_rtin" , columnDefinition = "varchar(255)" )
	private String parametroExecucaoRotina;

	public Long getId() {
		return id;
	}

	public String getTextoInicial() {
		return textoInicial;
	}

	public String getTextoRota() {
		return textoRota;
	}

	public String getTextoNumeroVersao() {
		return textoNumeroVersao;
	}

	public String getTipoAmbiente() {
		return tipoAmbiente;
	}

	public String getTextoCaminhoServidorXml() {
		return textoCaminhoServidorXml;
	}

	public String getAutenticacaoLoginServidorXml() {
		return autenticacaoLoginServidorXml;
	}

	public String getAutenticacaoSenhaServidorXml() {
		return autenticacaoSenhaServidorXml;
	}

	public Integer getMinutoCarenciaAcesso() {
		return minutoCarenciaAcesso;
	}

	public String getUrlLdap() {
		return urlLdap;
	}

	public String getUsuarioLdap() {
		return usuarioLdap;
	}

	public String getSenhaLdap() {
		return senhaLdap;
	}

	public Integer getTotalHorasExibirBotao() {
		return totalHorasExibirBotao;
	}

	public Integer getTotalRegistrosAcessosPosterior() {
		return totalRegistrosAcessosPosterior;
	}

	public String getParametroExecucaoRotina() {
		return parametroExecucaoRotina;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTextoInicial(String textoInicial) {
		this.textoInicial = textoInicial;
	}

	public void setTextoRota(String textoRota) {
		this.textoRota = textoRota;
	}

	public void setTextoNumeroVersao(String textoNumeroVersao) {
		this.textoNumeroVersao = textoNumeroVersao;
	}

	public void setTipoAmbiente(String tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public void setTextoCaminhoServidorXml(String textoCaminhoServidorXml) {
		this.textoCaminhoServidorXml = textoCaminhoServidorXml;
	}

	public void setAutenticacaoLoginServidorXml(String autenticacaoLoginServidorXml) {
		this.autenticacaoLoginServidorXml = autenticacaoLoginServidorXml;
	}

	public void setAutenticacaoSenhaServidorXml(String autenticacaoSenhaServidorXml) {
		this.autenticacaoSenhaServidorXml = autenticacaoSenhaServidorXml;
	}

	public void setMinutoCarenciaAcesso(Integer minutoCarenciaAcesso) {
		this.minutoCarenciaAcesso = minutoCarenciaAcesso;
	}

	public void setUrlLdap(String urlLdap) {
		this.urlLdap = urlLdap;
	}

	public void setUsuarioLdap(String usuarioLdap) {
		this.usuarioLdap = usuarioLdap;
	}

	public void setSenhaLdap(String senhaLdap) {
		this.senhaLdap = senhaLdap;
	}

	public void setTotalHorasExibirBotao(Integer totalHorasExibirBotao) {
		this.totalHorasExibirBotao = totalHorasExibirBotao;
	}

	public void setTotalRegistrosAcessosPosterior(Integer totalRegistrosAcessosPosterior) {
		this.totalRegistrosAcessosPosterior = totalRegistrosAcessosPosterior;
	}

	public void setParametroExecucaoRotina(String parametroExecucaoRotina) {
		this.parametroExecucaoRotina = parametroExecucaoRotina;
	}

	

	
}
