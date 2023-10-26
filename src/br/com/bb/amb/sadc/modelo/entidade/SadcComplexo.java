package br.com.bb.amb.sadc.modelo.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import br.com.bb.amb.constantes.SadcConstantes;

 
/**
 * Classe com os Complexos do sistema SADC
 * <p>
 * tabela: cpxo
 * <p>
 * relacionamentos OneToMany: listaSadcSalas
 * @author c1277736 
 */
@Entity
@Table(name = "cpxo" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcComplexo extends SadcEntidade {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_cpxo")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_CPXO_GEN", sequenceName = "SEQ_CPXO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_CPXO_GEN")
	private Long idComplexo;
	
	@Column(name = "nm_cpxo" , length = 50 ,  columnDefinition = "character(50)")
	private String nomeComplexo;
	
	@Column(name = "in_cpxo_ati", length = 1 ,columnDefinition = "character")
	private String indicadorComplexo;
	
	@Column(name =  "nr_ord_cpxo", length = 2)
	
	private Integer ordenacao;

	
	@OneToMany(mappedBy = "sadcComplexo")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	private List <SadcSala> listaSadcSalas;

	@Column(name = "ativo", columnDefinition = "BOOLEAN DEFAULT true")
	private Boolean ativoComplexo;

	public List<SadcSala> getListaSadcSalas() {
		return listaSadcSalas;
	}	
	
	public void setListaSadcSalas(List<SadcSala> listaSadcSalas) {
		this.listaSadcSalas = listaSadcSalas;
	}
	
	public Integer getOrdenacao() {
		return ordenacao;
	}

	public void setOrdenacao(Integer ordenacao) {
		this.ordenacao = ordenacao;
	}

	public Long getIdComplexo() {
		return idComplexo;
	}

	public void setIdComplexo(Long idComplexo) {
		this.idComplexo = idComplexo;
	}

	public String getNomeComplexo() {
		return nomeComplexo;
	}

	public void setNomeComplexo(String nomeComplexo) {
		this.nomeComplexo = nomeComplexo;
	}

	public String getIndicadorComplexo() {
		return indicadorComplexo;
	}

	public void setIndicadorComplexo(String indicadorComplexo) {
		this.indicadorComplexo = indicadorComplexo;
	}

	public Boolean getAtivoComplexo() {
		return ativoComplexo;
	}

	public void setAtivoComplexo(Boolean ativoComplexo) {
		this.ativoComplexo = ativoComplexo;
	}

	
	
}
