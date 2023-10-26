package br.com.bb.amb.sadc.modelo.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.bb.amb.constantes.SadcConstantes;


 

/**
 * Classe com os grupos de acesso do sistema SADC
 * <p>
 * tabela: gr_acss
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "gr_acss" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcGrupoAcesso extends SadcEntidade  {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_gr_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_GR_ACSS_GEN", sequenceName = "SEQ_GR_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_GR_ACSS_GEN")
	private Long id;
	
	
	@Column(name = "nm_gr_acss" , length = 30 , columnDefinition = "character(30)")
	private String nome;
	
	
	@Column(name = "sg_gr_acss" , length = 20, columnDefinition = "character(20)")
	private String sigla;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sadcGrupoAcessoGrupoAcessoMenu")
	
	private List<SadcGrupoAcessoMenu> listaSadcGrupoAcessoMenu;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSigla() {
		return sigla;
	}

	public List<SadcGrupoAcessoMenu> getListaSadcGrupoAcessoMenu() {
		return listaSadcGrupoAcessoMenu;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setListaSadcGrupoAcessoMenu(List<SadcGrupoAcessoMenu> listaSadcGrupoAcessoMenu) {
		this.listaSadcGrupoAcessoMenu = listaSadcGrupoAcessoMenu;
	}

	
	
	
}
