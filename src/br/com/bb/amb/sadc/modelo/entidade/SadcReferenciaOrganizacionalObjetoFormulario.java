package br.com.bb.amb.sadc.modelo.entidade;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe de relacionamento entre objeto formul rio e refer ncia organizacional do SADC
 * <p>
 * tabela: obj_fml_ref_orgc  
 * <p>
 * relacionamentos ManyToOne: sadcReferenciaOrganizacional, sadcObjetoFormulario
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "obj_fml_ref_orgc" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcReferenciaOrganizacionalObjetoFormulario extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NR_OBJ_FML_REF_ORGC")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_OBJ_FML_REF_ORGC_GEN", sequenceName = "SEQ_OBJ_FML_REF_ORGC")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_OBJ_FML_REF_ORGC_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_ref_orgc" , referencedColumnName = "nr_ref_orgc")
	private SadcReferenciaOrganizacional sadcReferenciaOrganizacional;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nr_obj_fml" , referencedColumnName = "nr_obj_fml")
	@NotFound(action = NotFoundAction.IGNORE)
	private SadcObjetoFormulario sadcObjetoFormulario;

	public Long getId() {
		return id;
	}

	public SadcReferenciaOrganizacional getSadcReferenciaOrganizacional() {
		return sadcReferenciaOrganizacional;
	}

	public SadcObjetoFormulario getSadcObjetoFormulario() {
		return sadcObjetoFormulario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcReferenciaOrganizacional(SadcReferenciaOrganizacional sadcReferenciaOrganizacional) {
		this.sadcReferenciaOrganizacional = sadcReferenciaOrganizacional;
	}

	public void setSadcObjetoFormulario(SadcObjetoFormulario sadcObjetoFormulario) {
		this.sadcObjetoFormulario = sadcObjetoFormulario;
	}

	
	
}
