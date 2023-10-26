package br.com.bb.amb.sadc.modelo.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.bb.amb.constantes.SadcConstantes;
 
 
/**
 * Classe das Categorias dos materiais do sistema SADC
 * <p>
 * tabela: ctgr
 * 
 * @author c1277736 
 */
@Entity
@Table(name = "ctgr" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcCategoria extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_ctgr")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_CTGR_GEN", sequenceName = "SEQ_CTGR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_CTGR_GEN")
	private Long idCategoria;
	
	@Column(name = "tx_dcr_ctgr", length = 30, columnDefinition = "character(30)")
	private String descricaoCategoria;
	
	@Column(name = "in_ctgr_atv", length = 1 ,columnDefinition = "character")
	private String indicadorCategoria;
	

	@Transient
	private List <SadcServico> transientListaSadcServicos;


	public Long getIdCategoria() {
		return idCategoria;
	}


	public String getDescricaoCategoria() {
		return descricaoCategoria;
	}


	public String getIndicadorCategoria() {
		return indicadorCategoria;
	}


	public List<SadcServico> getTransientListaSadcServicos() {
		return transientListaSadcServicos;
	}


	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}


	public void setDescricaoCategoria(String descricaoCategoria) {
		this.descricaoCategoria = descricaoCategoria;
	}


	public void setIndicadorCategoria(String indicadorCategoria) {
		this.indicadorCategoria = indicadorCategoria;
	}


	public void setTransientListaSadcServicos(List<SadcServico> transientListaSadcServicos) {
		this.transientListaSadcServicos = transientListaSadcServicos;
	}
	
	
	
	
	
}
