package br.com.bb.amb.sadc.modelo.entidade;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe que cont m a monitora  o dos status (SadcStatusAcesso) com as atualiza  es do sistema com suas respectivas descri  es
 * <p>
 * tabela: est_atl_acss
 * <p>
 * relacionamento ManyToOne: sadcStatusAcesso   
 * @author c1277736
 *
 */
@Entity
@Table(name = "est_atl_acss", schema = SadcConstantes.SADC_SCHEMA)

public class SadcStatusAtualizacaoAcesso extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_est_atl_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_EST_ATL_ACSS_GEN", sequenceName = "SEQ_EST_ATL_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_EST_ATL_ACSS_GEN")
	private Long id;
	
	@Column(name = "tx_est_atl_acss" ,  length = 100 ,columnDefinition = "varchar(100)")
	private String textoStatusAtualizacaoAcesso;
	
	@Column(name = "tx_tip_est_atl_acss" ,  length = 30 ,columnDefinition = "character(30)")
	private String tipoStatusAtualizacaoAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_est_acss" , referencedColumnName = "nr_est_acss")
	private SadcStatusAcesso sadcStatusAcesso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTextoStatusAtualizacaoAcesso() {
		return textoStatusAtualizacaoAcesso;
	}

	public void setTextoStatusAtualizacaoAcesso(String textoStatusAtualizacaoAcesso) {
		this.textoStatusAtualizacaoAcesso = textoStatusAtualizacaoAcesso;
	}

	public String getTipoStatusAtualizacaoAcesso() {
		if(tipoStatusAtualizacaoAcesso != null) {
			return tipoStatusAtualizacaoAcesso.trim();
		}
		return tipoStatusAtualizacaoAcesso;
	}

	public void setTipoStatusAtualizacaoAcesso(String tipoStatusAtualizacaoAcesso) {
		this.tipoStatusAtualizacaoAcesso = tipoStatusAtualizacaoAcesso;
	}

	public SadcStatusAcesso getSadcStatusAcesso() {
		return sadcStatusAcesso;
	}

	public void setSadcStatusAcesso(SadcStatusAcesso sadcStatusAcesso) {
		this.sadcStatusAcesso = sadcStatusAcesso;
	}

	
}
