package br.com.bb.amb.sadc.modelo.entidade;
 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.com.bb.amb.constantes.SadcConstantes;
 

/**
 * Classe com os transitos de materiais do sistema
 * <p>
 * tabela: tst_mtrl
 * <p>
 * relacionamentos ManyToOne : sadcMaterial, sadcServicoCategoriaProprietario, sadcSalaAcesso
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "tst_mtrl", schema = SadcConstantes.SADC_SCHEMA)

public class SadcTransitoMaterial extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_tst_mtrl")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_TST_MTRL_GEN", sequenceName = "SEQ_TST_MTRL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_TST_MTRL_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_sala_acss", referencedColumnName = "nr_sala_acss")
	
	@NotFound(action = NotFoundAction.IGNORE)
	private SadcSalaAcesso sadcSalaAcesso;
	
	@ManyToOne
	@JoinColumn(name = "nr_mtrl", referencedColumnName = "nr_mtrl")
	private SadcMaterial sadcMaterial;	    
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nr_srvc_ctgr_prt", referencedColumnName = "nr_srvc_ctgr_prt", nullable = true)
	private SadcServicoCategoriaProprietario sadcServicoCategoriaProprietario;

	public Long getId() {
		return id;
	}

	public SadcSalaAcesso getSadcSalaAcesso() {
		return sadcSalaAcesso;
	}

	public SadcMaterial getSadcMaterial() {
		return sadcMaterial;
	}

	public SadcServicoCategoriaProprietario getSadcServicoCategoriaProprietario() {
		return sadcServicoCategoriaProprietario;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setSadcSalaAcesso(SadcSalaAcesso sadcSalaAcesso) {
		this.sadcSalaAcesso = sadcSalaAcesso;
	}

	public void setSadcMaterial(SadcMaterial sadcMaterial) {
		this.sadcMaterial = sadcMaterial;
	}

	public void setSadcServicoCategoriaProprietario(SadcServicoCategoriaProprietario sadcServicoCategoriaProprietario) {
		this.sadcServicoCategoriaProprietario = sadcServicoCategoriaProprietario;
	}
	
	
	
}
