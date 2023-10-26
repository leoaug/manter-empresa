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
 * Classe com os Status da Solicita  o de Acesso 
 * <p>
 * tabela: est_acss
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "est_acss", schema = SadcConstantes.SADC_SCHEMA)

public class SadcStatusAcesso extends SadcEntidade {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_est_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_EST_ACSS_GEN", sequenceName = "SEQ_EST_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_EST_ACSS_GEN")
	private Long id;
		
	@Column(name = "TX_DCR_EST_ACSS" ,  length = 30 ,columnDefinition = "character(30)")
	private String descricao;
	
	@Column(name = "IN_EST_ACSS_ATI" ,  length = 1,columnDefinition = "character(1)")
	private String indicador;

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

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	
	
	
}
