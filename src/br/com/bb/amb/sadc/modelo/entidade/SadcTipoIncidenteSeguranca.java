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
 * Classe com os tipos de incidente de seguran a
 * <p>
 * tabela: tip_acd_sgca
 * @author c1277736
 *
 */
@Entity
@Table(name = "tip_acd_sgca", schema = SadcConstantes.SADC_SCHEMA)

public class SadcTipoIncidenteSeguranca extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_tip_acd_sgca")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_TIP_ACD_SGCA_GEN", sequenceName = "SEQ_TIP_ACD_SGCA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_TIP_ACD_SGCA_GEN")
	private Long id;
	
	
	@Column(name = "tx_dcr_tip_acd_sgca" , length = 100 , columnDefinition = "varchar(100)")
	private String descricao;


	public Long getId() {
		return id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	
	 
}
