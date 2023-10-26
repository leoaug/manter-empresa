package br.com.bb.amb.tecnotour.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "cpxo", schema = "TECNOTOUR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Complexo extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_cpxo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "nm_cpxo" ,  columnDefinition = "char(30)" , nullable = false)
	private String nome;
	
	@Column(name = "in_cpxo_ati", columnDefinition = "char(1)" , nullable = false)
	private String indicador;

	@JsonIgnore
	@Column(name = "CD_COR_CPXO", columnDefinition = "CHAR(50)" , nullable = true)
	private String codigoCorComplexo; 
	
	@Column(name = "TX_END_CPXO", columnDefinition = "VARCHAR(255)" , nullable = true)
	private String textoEnderecoComplexo;
	
	@JsonIgnore
	@Column(name = "NM_CLS_COR_CPXO", columnDefinition = "CHAR(50)" , nullable = true)
	private String nomeClasseCorComplexo;
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndicador() {
		return indicador;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public String getCodigoCorComplexo() {
		return codigoCorComplexo;
	}

	public void setCodigoCorComplexo(String codigoCorComplexo) {
		this.codigoCorComplexo = codigoCorComplexo;
	}

	public String getTextoEnderecoComplexo() {
		return textoEnderecoComplexo;
	}

	public void setTextoEnderecoComplexo(String textoEnderecoComplexo) {
		this.textoEnderecoComplexo = textoEnderecoComplexo;
	}

	public String getNomeClasseCorComplexo() {
		return nomeClasseCorComplexo;
	}

	public void setNomeClasseCorComplexo(String nomeClasseCorComplexo) {
		this.nomeClasseCorComplexo = nomeClasseCorComplexo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Complexo other = (Complexo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	
	
}
