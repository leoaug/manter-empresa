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

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe com os registros de v nculo entre menu e grupo acesso
 * <p>
 * tabela: gr_acss_menu
 * <p>
 * relacionamentos ManyToOne: sadcGrupoAcesso
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "gr_acss_menu" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcGrupoAcessoMenu extends SadcEntidade  {
	
	private static final long serialVersionUID = 1L;
	

	@Id
	@Column(name = "nr_gr_acss_menu")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_GR_ACSS_MENU_GEN", sequenceName = "SEQ_GR_ACSS_MENU")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_GR_ACSS_MENU_GEN")
	private Long idGrupoAcessoMenu;


	@ManyToOne
	@JoinColumn(name = "nr_menu" , referencedColumnName = "nr_menu" )
	private SadcMenu sadcMenuGrupoAcessoMenu;
	
	@ManyToOne
	@JoinColumn(name = "nr_gr_acss" , referencedColumnName = "nr_gr_acss")
	private SadcGrupoAcesso sadcGrupoAcessoGrupoAcessoMenu;

	public Long getIdGrupoAcessoMenu() {
		return idGrupoAcessoMenu;
	}

	public SadcMenu getSadcMenuGrupoAcessoMenu() {
		return sadcMenuGrupoAcessoMenu;
	}

	public SadcGrupoAcesso getSadcGrupoAcessoGrupoAcessoMenu() {
		return sadcGrupoAcessoGrupoAcessoMenu;
	}

	public void setIdGrupoAcessoMenu(Long idGrupoAcessoMenu) {
		this.idGrupoAcessoMenu = idGrupoAcessoMenu;
	}

	public void setSadcMenuGrupoAcessoMenu(SadcMenu sadcMenuGrupoAcessoMenu) {
		this.sadcMenuGrupoAcessoMenu = sadcMenuGrupoAcessoMenu;
	}

	public void setSadcGrupoAcessoGrupoAcessoMenu(SadcGrupoAcesso sadcGrupoAcessoGrupoAcessoMenu) {
		this.sadcGrupoAcessoGrupoAcessoMenu = sadcGrupoAcessoGrupoAcessoMenu;
	}

	
	
	
}
