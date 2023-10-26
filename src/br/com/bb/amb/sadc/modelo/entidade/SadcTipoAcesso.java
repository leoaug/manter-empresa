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
 * Classe que comt m os tipos de acesso do sistema
 * <p>
 * tabela: tip_acss
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "tip_acss", schema = SadcConstantes.SADC_SCHEMA)

public class SadcTipoAcesso extends SadcEntidade  {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_tip_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_TIP_ACSS_GEN", sequenceName = "SEQ_TIP_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_TIP_ACSS_GEN")
	private Long id;

	@Column(name = "tx_dcr_tip_acss", length = 50 , columnDefinition = "character(50)")
	private String descricao;

	@Column(name = "tx_obs_tip_acss", length = 100 , columnDefinition = "varchar(100)")
	private String observacao;

	@Column(name = "in_tip_acss_ati", length = 1 ,columnDefinition = "character(1)")
	private String ativo; 
	
	@Column(name = "qt_hh_acss")
	private Integer quantidadeHoraAcesso;
	
	@Column(name = "nr_ord_tip_acss")
	private Integer ordenacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		if(descricao != null) {
			return descricao.trim();
		}
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	public Integer getQuantidadeHoraAcesso() {
		return quantidadeHoraAcesso;
	}

	public void setQuantidadeHoraAcesso(Integer quantidadeHoraAcesso) {
		this.quantidadeHoraAcesso = quantidadeHoraAcesso;
	}
	

	public Integer getOrdenacao() {
		return ordenacao;
	}

	public void setOrdenacao(Integer ordenacao) {
		this.ordenacao = ordenacao;
	}

	
	
}
