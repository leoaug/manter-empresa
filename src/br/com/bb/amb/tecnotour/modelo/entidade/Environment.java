package br.com.bb.amb.tecnotour.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "env", schema = "TECNOTOUR")
public class Environment extends SadcEntidade {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_env")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String env;
	
	private String value;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
