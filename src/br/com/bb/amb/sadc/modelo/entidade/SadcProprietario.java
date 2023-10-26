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
 * Classe com os propriet rios poss veos dos materiais do sistema sadc
 * <p>
 * tabela: prt
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "prt" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcProprietario extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_prt")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_PRT_GEN", sequenceName = "SEQ_PRT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PRT_GEN")
	private Long id;
	
	@Column(name= "tx_dcr_prt",  columnDefinition = "character(50)")
	private String descricao;
	
	@Column(name = "in_prt_ati", length = 1 ,columnDefinition = "character")
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
