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
 * Classe que registra os Arquivos das Solicita  es de Acesso
 * <p>
 * tabela: arq_acss
 * <p>
 * relacionamentos ManyToOne: sadcAcesso
 * @author c1277736 
 */
@Entity
@Table(name = "arq_acss" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcArquivoAcesso extends SadcEntidade {

	private static final long serialVersionUID = 1L;
	 
	@Id
	@Column(name = "nr_arq_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_ARQ_ACSS_GEN", sequenceName = "SEQ_ARQ_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ARQ_ACSS_GEN")
	private Long id;
	
	
	@Column(name = "nm_arq_acss" , length = 50 , columnDefinition = "character(50)")
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "nr_slct_acss" , referencedColumnName = "nr_slct_acss")
	
	private SadcAcesso sadcAcesso;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}

	
}
