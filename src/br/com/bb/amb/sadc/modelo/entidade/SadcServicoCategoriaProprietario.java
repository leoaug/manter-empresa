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
 * Classe de relacionamento entre servi o, categoria e propriet rio
 * <p>
 * tabela: srvc_ctgr_prt
 * <p>
 * relacionamento ManyToOne: sadcServico , sadcCategoria, sadcProprietario
 * 
 * @author c1277736
 * 
 *
 */
@Entity
@Table(name = "srvc_ctgr_prt", schema = SadcConstantes.SADC_SCHEMA)

public class SadcServicoCategoriaProprietario extends SadcEntidade{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_srvc_ctgr_prt")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_SRVC_CTGR_PRT_GEN", sequenceName = "SEQ_SRVC_CTGR_PRT")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SRVC_CTGR_PRT_GEN")
	private Long id;
	
	@Column(name = "tx_rota_cpnt", length = 255)
	private String caminhoComponente;
	
	@Column(name = "tx_nm_cpnt", length = 255)
	private String nomeComponente;
	
	@ManyToOne
	@JoinColumn(name = "nr_srvc", referencedColumnName = "nr_srvc")
	private SadcServico sadcServico;
	
	@ManyToOne
	@JoinColumn(name = "nr_ctgr", referencedColumnName = "nr_ctgr")
	private SadcCategoria sadcCategoria;
	
	@ManyToOne
	@JoinColumn(name = "nr_prt", referencedColumnName = "nr_prt")
	private SadcProprietario sadcProprietario;

	public Long getId() {
		return id;
	}

	public String getCaminhoComponente() {
		return caminhoComponente;
	}

	public String getNomeComponente() {
		return nomeComponente;
	}

	public SadcServico getSadcServico() {
		return sadcServico;
	}

	public SadcCategoria getSadcCategoria() {
		return sadcCategoria;
	}

	public SadcProprietario getSadcProprietario() {
		return sadcProprietario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCaminhoComponente(String caminhoComponente) {
		this.caminhoComponente = caminhoComponente;
	}

	public void setNomeComponente(String nomeComponente) {
		this.nomeComponente = nomeComponente;
	}

	public void setSadcServico(SadcServico sadcServico) {
		this.sadcServico = sadcServico;
	}

	public void setSadcCategoria(SadcCategoria sadcCategoria) {
		this.sadcCategoria = sadcCategoria;
	}

	public void setSadcProprietario(SadcProprietario sadcProprietario) {
		this.sadcProprietario = sadcProprietario;
	}

	
	
	
}
