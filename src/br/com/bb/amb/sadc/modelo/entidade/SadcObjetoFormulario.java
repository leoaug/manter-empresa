package br.com.bb.amb.sadc.modelo.entidade;

 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.com.bb.amb.constantes.SadcConstantes;
import br.com.bb.amb.constantes.SadcIndicadorVizualizacaoEnum;


/**
 * Classe que registra o relacionamento entre objetos do sistema com os formul rios.
 * <p>
 * tabela: obj_fml
 * <p>
 * relacionamentos ManyToOne: sadcFormularioMenu
 * relacionamentos OneToMany: listaSadcGrupoAcessosObjetsoFormularios, listaSadcStatusAcessosObjetosFormularios, listaSadcReferenciaOrganizacionalObjetoFormulario
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "obj_fml" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcObjetoFormulario extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_obj_fml")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_OBJ_FML_GEN", sequenceName = "SEQ_OBJ_FML")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_OBJ_FML_GEN")
	private Long id;
	
	@Column(name = "tx_dcr_obj" , length = 50, columnDefinition = "character(50)")
	private String textoDescricao;
	
	@Column(name = "tx_url_im_obj", length = 255)
	private String urlImagem;
	
	@Column(name = "tx_url_acao_obj" , length = 255)
	private String urlAcao;
	
	@Column(name = "in_obj_fml_grl", length = 1 , columnDefinition = "character")
	@Enumerated(EnumType.ORDINAL)
	private SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum;
	
	@Column(name = "nr_ord_obj_fml" , length = 2, columnDefinition = "integer DEFAULT 0", nullable = false)
	private Integer numeroOrdemObjetoFormulario;

	@ManyToOne
	@JoinColumn(name = "nr_fml_menu" , referencedColumnName = "nr_fml_menu" )
	private SadcFormularioMenu sadcFormularioMenu;
	
	@OneToMany(mappedBy = "sadcObjetoFormulario")
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcGrupoAcessoObjetoFormulario> listaSadcGrupoAcessosObjetosFormularios;
	
	@OneToMany(mappedBy = "sadcObjetoFormulario")
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcStatusAcessoObjetoFormulario> listaSadcStatusAcessosObjetosFormularios;
	
	@OneToMany(mappedBy = "sadcObjetoFormulario")
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcReferenciaOrganizacionalObjetoFormulario> listaSadcReferenciaOrganizacionalObjetoFormulario;
	
	
	@Transient
	
	private List <SadcGrupoAcesso> transientListaGrupoAcesso;
	
	@Transient
	
	private boolean transientSelecionadoGrupoAcesso;
	
	
	@Transient
	
	private List <SadcStatusAcesso> transientListaStatusAcesso;
	
	@Transient
	
	private boolean transientSelecionadoStatusAcesso;
	
	@Transient
	
	private List <SadcReferenciaOrganizacional> transientListaReferenciaOrganizacional;
	
	@Transient
	
	private boolean transientSelecionadoReferenciaOrganizacional;
	
	@Transient
	
	private String transientUrlAcao;

	public Long getId() {
		return id;
	}

	public String getTextoDescricao() {
		return textoDescricao;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public String getUrlAcao() {
		return urlAcao;
	}

	public SadcIndicadorVizualizacaoEnum getSadcIndicadorVizualizacaoEnum() {
		return sadcIndicadorVizualizacaoEnum;
	}

	public SadcFormularioMenu getSadcFormularioMenu() {
		return sadcFormularioMenu;
	}
	
	

	public List<SadcGrupoAcessoObjetoFormulario> getListaSadcGrupoAcessosObjetosFormularios() {
		return listaSadcGrupoAcessosObjetosFormularios;
	}

	public List<SadcStatusAcessoObjetoFormulario> getListaSadcStatusAcessosObjetosFormularios() {
		return listaSadcStatusAcessosObjetosFormularios;
	}

	public List<SadcReferenciaOrganizacionalObjetoFormulario> getListaSadcReferenciaOrganizacionalObjetoFormulario() {
		return listaSadcReferenciaOrganizacionalObjetoFormulario;
	}

	public List<SadcGrupoAcesso> getTransientListaGrupoAcesso() {
		return transientListaGrupoAcesso;
	}

	public boolean isTransientSelecionadoGrupoAcesso() {
		return transientSelecionadoGrupoAcesso;
	}

	public List<SadcStatusAcesso> getTransientListaStatusAcesso() {
		return transientListaStatusAcesso;
	}

	public boolean isTransientSelecionadoStatusAcesso() {
		return transientSelecionadoStatusAcesso;
	}

	public List<SadcReferenciaOrganizacional> getTransientListaReferenciaOrganizacional() {
		return transientListaReferenciaOrganizacional;
	}

	public boolean isTransientSelecionadoReferenciaOrganizacional() {
		return transientSelecionadoReferenciaOrganizacional;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTextoDescricao(String textoDescricao) {
		this.textoDescricao = textoDescricao;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public void setUrlAcao(String urlAcao) {
		this.urlAcao = urlAcao;
	}

	public void setSadcIndicadorVizualizacaoEnum(SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum) {
		this.sadcIndicadorVizualizacaoEnum = sadcIndicadorVizualizacaoEnum;
	}

	public void setSadcFormularioMenu(SadcFormularioMenu sadcFormularioMenu) {
		this.sadcFormularioMenu = sadcFormularioMenu;
	}

	public void setListaSadcGrupoAcessosObjetosFormularios(
			List<SadcGrupoAcessoObjetoFormulario> listaSadcGrupoAcessosObjetosFormularios) {
		this.listaSadcGrupoAcessosObjetosFormularios = listaSadcGrupoAcessosObjetosFormularios;
	}

	public void setListaSadcStatusAcessosObjetosFormularios(
			List<SadcStatusAcessoObjetoFormulario> listaSadcStatusAcessosObjetosFormularios) {
		this.listaSadcStatusAcessosObjetosFormularios = listaSadcStatusAcessosObjetosFormularios;
	}

	public void setListaSadcReferenciaOrganizacionalObjetoFormulario(
			List<SadcReferenciaOrganizacionalObjetoFormulario> listaSadcReferenciaOrganizacionalObjetoFormulario) {
		this.listaSadcReferenciaOrganizacionalObjetoFormulario = listaSadcReferenciaOrganizacionalObjetoFormulario;
	}

	public void setTransientListaGrupoAcesso(List<SadcGrupoAcesso> transientListaGrupoAcesso) {
		this.transientListaGrupoAcesso = transientListaGrupoAcesso;
	}

	public void setTransientSelecionadoGrupoAcesso(boolean transientSelecionadoGrupoAcesso) {
		this.transientSelecionadoGrupoAcesso = transientSelecionadoGrupoAcesso;
	}

	public void setTransientListaStatusAcesso(List<SadcStatusAcesso> transientListaStatusAcesso) {
		this.transientListaStatusAcesso = transientListaStatusAcesso;
	}

	public void setTransientSelecionadoStatusAcesso(boolean transientSelecionadoStatusAcesso) {
		this.transientSelecionadoStatusAcesso = transientSelecionadoStatusAcesso;
	}

	public void setTransientListaReferenciaOrganizacional(
			List<SadcReferenciaOrganizacional> transientListaReferenciaOrganizacional) {
		this.transientListaReferenciaOrganizacional = transientListaReferenciaOrganizacional;
	}

	public void setTransientSelecionadoReferenciaOrganizacional(boolean transientSelecionadoReferenciaOrganizacional) {
		this.transientSelecionadoReferenciaOrganizacional = transientSelecionadoReferenciaOrganizacional;
	}

	public String getTransientUrlAcao() {
		return transientUrlAcao;
	}

	public void setTransientUrlAcao(String transientUrlAcao) {
		this.transientUrlAcao = transientUrlAcao;
	}

	public Integer getNumeroOrdemObjetoFormulario() {
		return numeroOrdemObjetoFormulario;
	}

	public void setNumeroOrdemObjetoFormulario(Integer numeroOrdemObjetoFormulario) {
		this.numeroOrdemObjetoFormulario = numeroOrdemObjetoFormulario;
	}
	
	
	
	
}
