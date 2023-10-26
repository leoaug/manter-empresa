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
 * Classe com os tipos de acesso exclusivo(Ordin rio) do sistema 
 * <p>
 * tabela: tip_acss_excs
 * <p>
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "AREA" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcArea  extends SadcEntidade {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_area")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_AREA_GEN", sequenceName = "SEQ_AREA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_AREA_GEN")
	private Long id;
	
	@Column(name = "tx_dcr_area" , columnDefinition = "varchar(30)", nullable = false)
	private String descricao;
	
	@OneToMany(fetch = FetchType.LAZY , mappedBy = "sadcArea")
	
	private List <SadcTipoAcessoExclusivo> listaSadcTipoAcessosExclusivo;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public List<SadcTipoAcessoExclusivo> getListaSadcTipoAcessosExclusivo() {
		return listaSadcTipoAcessosExclusivo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setListaSadcTipoAcessosExclusivo(List<SadcTipoAcessoExclusivo> listaSadcTipoAcessosExclusivo) {
		this.listaSadcTipoAcessosExclusivo = listaSadcTipoAcessosExclusivo;
	}

	

}
