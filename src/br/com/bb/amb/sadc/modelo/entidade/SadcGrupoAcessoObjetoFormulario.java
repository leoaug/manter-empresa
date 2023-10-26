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

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe com os relacionamentos entre grupos de acesso e objeto formul rio.
 * <p>
 * Cada objeto ou bot o do sistema deve ser cadastrado aqui, com os relativos grupos de acesso que podem ter acesso a eles.
 * <p>
 * tabela: gr_acss_obj_fml
 * <p>
 * relacionamentos ManyToOne : sadcGrupoAcesso, sadcObjetoFormulario
 * @author c1277736
 *
 */
@Entity
@Table(name = "gr_acss_obj_fml" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcGrupoAcessoObjetoFormulario extends SadcEntidade {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NR_GR_ACSS_OBJ_FML")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_GR_ACSS_OBJ_FML_GEN", sequenceName = "SEQ_GR_ACSS_OBJ_FML")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_GR_ACSS_OBJ_FML_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_gr_acss" , referencedColumnName = "nr_gr_acss")
	private SadcGrupoAcesso sadcGrupoAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_obj_fml" , referencedColumnName = "nr_obj_fml")
	@NotFound(action = NotFoundAction.IGNORE)
	private SadcObjetoFormulario sadcObjetoFormulario;

	public Long getId() {
		return id;
	}

	public SadcGrupoAcesso getSadcGrupoAcesso() {
		return sadcGrupoAcesso;
	}

	public SadcObjetoFormulario getSadcObjetoFormulario() {
		return sadcObjetoFormulario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcGrupoAcesso(SadcGrupoAcesso sadcGrupoAcesso) {
		this.sadcGrupoAcesso = sadcGrupoAcesso;
	}

	public void setSadcObjetoFormulario(SadcObjetoFormulario sadcObjetoFormulario) {
		this.sadcObjetoFormulario = sadcObjetoFormulario;
	}

	

}
