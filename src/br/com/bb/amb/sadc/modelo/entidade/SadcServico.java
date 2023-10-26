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
 * Classe com os servi os do SADC
 * <p>
 * tabela: srvc
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "srvc", schema = SadcConstantes.SADC_SCHEMA)

public class SadcServico extends SadcEntidade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_srvc")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_SRVC_GEN", sequenceName = "SEQ_SRVC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SRVC_GEN")
	private Long id;
	
	@Column(name= "tx_dcr_srvc", length = 50 ,  columnDefinition = "character(50)")
	private String descricao;
	
	@Column(name = "in_srvc_ati", length = 1 ,columnDefinition = "character")
	private String indicador;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	
	
}
