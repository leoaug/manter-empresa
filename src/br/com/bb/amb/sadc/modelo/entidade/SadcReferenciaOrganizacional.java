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
 * Classe com as refer ncias organizacional do sistema sadc
 * <p>
 * tabela: ref_orgc
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "ref_orgc" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcReferenciaOrganizacional extends SadcEntidade{

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NR_REF_ORGC")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_REF_ORGC_GEN", sequenceName = "SEQ_REF_ORGC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_REF_ORGC_GEN")
	private Long id;

	
	@Column(name = "tx_ref_orgc" , columnDefinition = "character(6)")
	private String texto;


	public Long getId() {
		return id;
	}


	public String getTexto() {
		return texto;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	
}
