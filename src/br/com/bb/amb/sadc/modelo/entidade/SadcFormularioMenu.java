package br.com.bb.amb.sadc.modelo.entidade;
 

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe com os registros entre formul rio e menu do sistema
 * <p>
 * tabela: fml_menu
 * <p>
 * relacionamentos OneToMany: listaSadcObjetosFormularios
 * @author c1277736
 *
 */
@Entity
@Table(name = "fml_menu" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcFormularioMenu extends SadcEntidade  {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_fml_menu")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_FML_MENU_GEN", sequenceName = "SEQ_FML_MENU")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_FML_MENU_GEN")
	private Long idFormularioMenu;
	
	@ManyToOne
	@JoinColumn(name = "nr_menu" , referencedColumnName = "nr_menu" )
	private SadcMenu sadcMenuFormularioMenu;

	@ManyToOne
	@JoinColumn(name = "nr_fml" , referencedColumnName = "nr_fml" )
	private SadcFormulario sadcFormularioFormularioMenu;

	@OneToMany(mappedBy = "sadcFormularioMenu")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcObjetoFormulario> listaSadcObjetosFormularios;

	public Long getIdFormularioMenu() {
		return idFormularioMenu;
	}

	public SadcMenu getSadcMenuFormularioMenu() {
		return sadcMenuFormularioMenu;
	}

	public SadcFormulario getSadcFormularioFormularioMenu() {
		return sadcFormularioFormularioMenu;
	}

	public List<SadcObjetoFormulario> getListaSadcObjetosFormularios() {
		return listaSadcObjetosFormularios;
	}

	public void setIdFormularioMenu(Long idFormularioMenu) {
		this.idFormularioMenu = idFormularioMenu;
	}

	public void setSadcMenuFormularioMenu(SadcMenu sadcMenuFormularioMenu) {
		this.sadcMenuFormularioMenu = sadcMenuFormularioMenu;
	}

	public void setSadcFormularioFormularioMenu(SadcFormulario sadcFormularioFormularioMenu) {
		this.sadcFormularioFormularioMenu = sadcFormularioFormularioMenu;
	}

	public void setListaSadcObjetosFormularios(List<SadcObjetoFormulario> listaSadcObjetosFormularios) {
		this.listaSadcObjetosFormularios = listaSadcObjetosFormularios;
	}
	
	
	
	
}
