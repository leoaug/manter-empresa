package br.com.bb.amb.sadc.modelo.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.bb.amb.constantes.SadcConstantes;

 
/**
 * Classe de Execu o das Rotinas do Sistema SADC
 * <p>
 * Rotinas de atualiza o de status da solicita o de acesso e verifica o de
 * entradas no ambiente de datacenter
 * <p>
 * tabela: exea_rtin_sis
 * 
 * @author c1277736
 *
 */
@Entity
@Table(name = "exea_rtin_sis", schema = SadcConstantes.SADC_SCHEMA)

public class SadcExecucaoRotinaSistema extends SadcEntidade {

	private static final long serialVersionUID = 1L;

	public SadcExecucaoRotinaSistema() {
	}

	public SadcExecucaoRotinaSistema(String textoExecucaoRotinaSistema, String indicadorExecucaoAutomatica,
			String indicadorExecucaoSucesso, Date dataExecucaoRotinaSistema) {
		this.textoExecucaoRotinaSistema = textoExecucaoRotinaSistema;
		this.indicadorExecucaoAutomatica = indicadorExecucaoAutomatica;
		this.indicadorExecucaoSucesso = indicadorExecucaoSucesso;
		this.dataExecucaoRotinaSistema = dataExecucaoRotinaSistema;
	}

	@Id
	@Column(name = "NR_EXEA_RTIN_SIS")
	@SequenceGenerator(allocationSize = 1, name = "SEQ_EXEA_RTIN_SIS_GEN", sequenceName = "SEQ_EXEA_RTIN_SIS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EXEA_RTIN_SIS_GEN")
	private Long id;

	@Column(name = "TX_EXEA_RTIN_SIS", length = 2000, columnDefinition = "varchar(2000)")
	private String textoExecucaoRotinaSistema;

	@Column(name = "IN_EXEA_AUTC", length = 1, columnDefinition = "character")
	private String indicadorExecucaoAutomatica;

	@Column(name = "IN_EXEA_SCS", length = 1, columnDefinition = "character")
	private String indicadorExecucaoSucesso;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HH_EXEA_RTIN_SIS")
	private Date dataExecucaoRotinaSistema;

	public Long getId() {
		return id;
	}

	public String getTextoExecucaoRotinaSistema() {
		return textoExecucaoRotinaSistema;
	}

	public String getIndicadorExecucaoAutomatica() {
		return indicadorExecucaoAutomatica;
	}

	public String getIndicadorExecucaoSucesso() {
		return indicadorExecucaoSucesso;
	}

	public Date getDataExecucaoRotinaSistema() {
		return dataExecucaoRotinaSistema;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTextoExecucaoRotinaSistema(String textoExecucaoRotinaSistema) {
		this.textoExecucaoRotinaSistema = textoExecucaoRotinaSistema;
	}

	public void setIndicadorExecucaoAutomatica(String indicadorExecucaoAutomatica) {
		this.indicadorExecucaoAutomatica = indicadorExecucaoAutomatica;
	}

	public void setIndicadorExecucaoSucesso(String indicadorExecucaoSucesso) {
		this.indicadorExecucaoSucesso = indicadorExecucaoSucesso;
	}

	public void setDataExecucaoRotinaSistema(Date dataExecucaoRotinaSistema) {
		this.dataExecucaoRotinaSistema = dataExecucaoRotinaSistema;
	}

}
