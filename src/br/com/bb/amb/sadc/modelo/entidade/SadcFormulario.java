package br.com.bb.amb.sadc.modelo.entidade;

 
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * Classe dos formul rios do sistema SADC, com url, nome, indicador de visualiza  o com ou sem condi  es
 * <p>
 * tabela: fml
 * <p>
 * relacionamentos OneToMany: listaSadcFormulariosMenus
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "fml" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcFormulario extends SadcEntidade  {


	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_fml")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_FML_GEN", sequenceName = "SEQ_FML")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_FML_GEN")
	private Long id;
	
	@Column(name = "tx_url_fml")
	private String url;

	@Column(name = "nm_fml" , length = 60 ,columnDefinition = "character(60)")
	private String nome;
	
	/**
	 * definido na @see SadcConstantes
	 * 0 - @see SadcConstantes.TIPO_FORMULARIO_PAGINA = 0;
	 * 1 - @see SadcConstantes.TIPO_FORMULARIO_LINK = 1;
	 * 
	 */
	@Column(name = "nr_tip_fml")
	private Integer tipo;
	
	@Column(name = "in_fml_grl" , length = 1 ,columnDefinition = "character")
	@Enumerated(EnumType.ORDINAL)
	private SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum;
	
	@OneToMany(mappedBy = "sadcFormularioFormularioMenu")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcFormularioMenu> listaSadcFormulariosMenus;

	public Long getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}

	public String getNome() {
		return nome;
	}

	public Integer getTipo() {
		return tipo;
	}

	public SadcIndicadorVizualizacaoEnum getSadcIndicadorVizualizacaoEnum() {
		return sadcIndicadorVizualizacaoEnum;
	}

	public List<SadcFormularioMenu> getListaSadcFormulariosMenus() {
		return listaSadcFormulariosMenus;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public void setSadcIndicadorVizualizacaoEnum(SadcIndicadorVizualizacaoEnum sadcIndicadorVizualizacaoEnum) {
		this.sadcIndicadorVizualizacaoEnum = sadcIndicadorVizualizacaoEnum;
	}

	public void setListaSadcFormulariosMenus(List<SadcFormularioMenu> listaSadcFormulariosMenus) {
		this.listaSadcFormulariosMenus = listaSadcFormulariosMenus;
	}

	
	
}
