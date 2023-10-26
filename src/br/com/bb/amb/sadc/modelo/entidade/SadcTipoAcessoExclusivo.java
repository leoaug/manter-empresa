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
 * Classe com os tipos de acesso exclusivo(Ordin rio) do sistema 
 * <p>
 * tabela: tip_acss_excs
 * <p>
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "TIP_ACSS_EXCS", schema = SadcConstantes.SADC_SCHEMA)

public class SadcTipoAcessoExclusivo extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_tip_acss_excs")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_TIP_ACSS_EXCS_GEN", sequenceName = "SEQ_TIP_ACSS_EXCS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_TIP_ACSS_EXCS_GEN")
	private Long id;
	
	@Column(name = "tx_dcr_tip_acss_excs" , columnDefinition = "varchar(255)", nullable = false)
	private String descricao;
	
	@Column(name = "cd_tip_acss_excs" , columnDefinition = "char(10)", nullable = false)
	private String codigoTipoAcessoExclusivo;
	
	@ManyToOne
	@JoinColumn(name = "nr_area", referencedColumnName = "nr_area" , nullable = false) 
	private SadcArea sadcArea;

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getCodigoTipoAcessoExclusivo() {
		return codigoTipoAcessoExclusivo;
	}

	public SadcArea getSadcArea() {
		return sadcArea;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setCodigoTipoAcessoExclusivo(String codigoTipoAcessoExclusivo) {
		this.codigoTipoAcessoExclusivo = codigoTipoAcessoExclusivo;
	}

	public void setSadcArea(SadcArea sadcArea) {
		this.sadcArea = sadcArea;
	}

	
}
