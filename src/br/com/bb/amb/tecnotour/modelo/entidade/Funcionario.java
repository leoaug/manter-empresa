package br.com.bb.amb.tecnotour.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "fun", schema = "TECNOTOUR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Funcionario extends SadcEntidade {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_fun")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "CD_CHV_SSBB_FUN", columnDefinition = "CHAR(8)", nullable = false)
	private String chaveSisbb;	
	
	@Column(name = "TX_NM_FUN", columnDefinition = "CHAR(100)", nullable = false)
	private String nome;
	
	@Column(name = "TX_CELR_FUN", columnDefinition = "CHAR(17)", nullable = true)
	private String celular;
	
	@Column(name = "TX_EMAI_FUN", columnDefinition = "CHAR(50)", nullable = false)
	private String email;
	
	@Column(name = "TX_RMAL_FUN", columnDefinition = "CHAR(17)", nullable = true)
	private String telefoneRamal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChaveSisbb() {
		return chaveSisbb;
	}

	public void setChaveSisbb(String chaveSisbb) {
		this.chaveSisbb = chaveSisbb;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefoneRamal() {
		return telefoneRamal;
	}

	public void setTelefoneRamal(String telefoneRamal) {
		this.telefoneRamal = telefoneRamal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((chaveSisbb == null) ? 0 : chaveSisbb.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((telefoneRamal == null) ? 0 : telefoneRamal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (chaveSisbb == null) {
			if (other.chaveSisbb != null)
				return false;
		} else if (!chaveSisbb.equals(other.chaveSisbb))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
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
		if (telefoneRamal == null) {
			if (other.telefoneRamal != null)
				return false;
		} else if (!telefoneRamal.equals(other.telefoneRamal))
			return false;
		return true;
	}	
 
	
}
