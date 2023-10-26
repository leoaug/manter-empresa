package br.com.bb.amb.sadc.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import br.com.bb.amb.constantes.SadcConstantes;

 
/**
 * Classe de pa s do SADC, s o utilizados ao cadastrar um visitante estrangeiro que informa o pa s de origem
 * <p>
 * tabela: pais
 *  
 * @author c1277736
 *
 */
@Entity
@Table(name = "pais" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcPais extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_pais")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_PAIS_GEN", sequenceName = "SEQ_PAIS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PAIS_GEN")
	private Long id;
	
	@Column(name = "nm_pais", length = 50 , columnDefinition = "character(50)")
	private String nome;
	
	@Column(name = "cd_iso_abvd" , length = 3 , columnDefinition = "character(3)")
	private String codOrganizacaoInternacional;
	
	@Column(name="cd_nrc_pais" , length = 3)
	private Integer codNumerico;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCodOrganizacaoInternacional() {
		return codOrganizacaoInternacional;
	}

	public Integer getCodNumerico() {
		return codNumerico;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCodOrganizacaoInternacional(String codOrganizacaoInternacional) {
		this.codOrganizacaoInternacional = codOrganizacaoInternacional;
	}

	public void setCodNumerico(Integer codNumerico) {
		this.codNumerico = codNumerico;
	}

	
	 
}
