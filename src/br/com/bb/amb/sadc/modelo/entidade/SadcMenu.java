package br.com.bb.amb.sadc.modelo.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
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
import br.com.bb.amb.constantes.SadcIndicadorVizualizacaoEnum;


 
/**
 * Classe com os menus do sistema SADC
 * <p>
 * tabela: menu
 * <p>
 * relacionamentos OneToMany : listaSadcMenuFilhos, listaSadcFormulariosMenus
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "menu" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcMenu extends SadcEntidade  {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_menu")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_MENU_GEN", sequenceName = "SEQ_MENU")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_MENU_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_menu_pai" , referencedColumnName = "nr_menu")
	private SadcMenu sadcMenuPai;
	
	@Column(name = "tx_dcr_menu" , length = 50, columnDefinition = "character(50)")
	private String descricao;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "in_menu_grl", length = 1, columnDefinition = "character")
	private SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum;
	
	
	@Column(name = "tx_url_im_menu" , length = 50 ,columnDefinition = "character(50)")
	private String nomeIcone;
	
	@OneToMany(fetch =  FetchType.LAZY , mappedBy = "sadcMenuPai")
	
	private List <SadcMenu> listaSadcMenuFilhos;
	
	@OneToMany(mappedBy = "sadcMenuFormularioMenu")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcFormularioMenu> listaSadcFormulariosMenus;
	
	@OneToMany(mappedBy = "sadcMenuGrupoAcessoMenu")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcGrupoAcessoMenu> listaSadcGrupoAcessoMenus;
	
	@Column(name = "nr_ord_menu" , length = 2, nullable=false)
	private Integer numeroOrdemMenu;

	public Long getId() {
		return id;
	}

	public SadcMenu getSadcMenuPai() {
		return sadcMenuPai;
	}

	public String getDescricao() {
		return descricao;
	}

	public SadcIndicadorVizualizacaoEnum getSadcIndicadorVizualizacaoEnum() {
		return sadcIndicadorVizualizacaoEnum;
	}

	public String getNomeIcone() {
		return nomeIcone;
	}

	public List<SadcMenu> getListaSadcMenuFilhos() {
		return listaSadcMenuFilhos;
	}

	public List<SadcFormularioMenu> getListaSadcFormulariosMenus() {
		return listaSadcFormulariosMenus;
	}

	public List<SadcGrupoAcessoMenu> getListaSadcGrupoAcessoMenus() {
		return listaSadcGrupoAcessoMenus;
	}

	public Integer getNumeroOrdemMenu() {
		return numeroOrdemMenu;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcMenuPai(SadcMenu sadcMenuPai) {
		this.sadcMenuPai = sadcMenuPai;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setSadcIndicadorVizualizacaoEnum(SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum) {
		this.sadcIndicadorVizualizacaoEnum = sadcIndicadorVizualizacaoEnum;
	}

	public void setNomeIcone(String nomeIcone) {
		this.nomeIcone = nomeIcone;
	}

	public void setListaSadcMenuFilhos(List<SadcMenu> listaSadcMenuFilhos) {
		this.listaSadcMenuFilhos = listaSadcMenuFilhos;
	}

	public void setListaSadcFormulariosMenus(List<SadcFormularioMenu> listaSadcFormulariosMenus) {
		this.listaSadcFormulariosMenus = listaSadcFormulariosMenus;
	}

	public void setListaSadcGrupoAcessoMenus(List<SadcGrupoAcessoMenu> listaSadcGrupoAcessoMenus) {
		this.listaSadcGrupoAcessoMenus = listaSadcGrupoAcessoMenus;
	}

	public void setNumeroOrdemMenu(Integer numeroOrdemMenu) {
		this.numeroOrdemMenu = numeroOrdemMenu;
	}

	
	
	 
}
