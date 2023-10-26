package br.com.bb.amb.sadc.modelo.entidade;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.bb.amb.constantes.SadcConstantes;


@Entity
@Table(name = "mst_dependencia" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcMstDependencia extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "uor")
	private Long uor; 
	
	
	@Column(name = "nome_dependencia")
	private String nomeDependencia;


	public Long getUor() {
		return uor;
	}


	public String getNomeDependencia() {
		return nomeDependencia;
	}


	public void setUor(Long uor) {
		this.uor = uor;
	}


	public void setNomeDependencia(String nomeDependencia) {
		this.nomeDependencia = nomeDependencia;
	}


	

}
