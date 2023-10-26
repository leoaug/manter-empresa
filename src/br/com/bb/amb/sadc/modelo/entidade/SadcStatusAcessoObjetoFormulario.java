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
 * Classe de relacionamento entre Status e Objeto Formul rio
 * <p>
 * tabela: est_obj_fml
 * <p>
 * relacionamento ManyToOne: sadcStatusAcesso, sadcObjetoFormulario
 * @author c1277736
 *
 */
@Entity
@Table(name = "est_obj_fml", schema = SadcConstantes.SADC_SCHEMA)

public class SadcStatusAcessoObjetoFormulario extends SadcEntidade {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "NR_EST_OBJ_FML")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_EST_OBJ_FML_GEN", sequenceName = "SEQ_EST_OBJ_FML")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_EST_OBJ_FML_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_est_acss", referencedColumnName = "nr_est_acss")
	private SadcStatusAcesso sadcStatusAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_obj_fml" , referencedColumnName = "nr_obj_fml")
	@NotFound(action = NotFoundAction.IGNORE)
	private SadcObjetoFormulario sadcObjetoFormulario;

	public Long getId() {
		return id;
	}

	public SadcStatusAcesso getSadcStatusAcesso() {
		return sadcStatusAcesso;
	}

	public SadcObjetoFormulario getSadcObjetoFormulario() {
		return sadcObjetoFormulario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcStatusAcesso(SadcStatusAcesso sadcStatusAcesso) {
		this.sadcStatusAcesso = sadcStatusAcesso;
	}

	public void setSadcObjetoFormulario(SadcObjetoFormulario sadcObjetoFormulario) {
		this.sadcObjetoFormulario = sadcObjetoFormulario;
	}

	
	

}
