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
@Table(name = "est_evt", schema = "TECNOTOUR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StatusEvento extends SadcEntidade {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_est_evt")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(name = "TX_DCR_EST_EVT", columnDefinition = "char(30)")
	private String descricao;
	
	
	@Column(name = "IN_EST_EVT_ATI", columnDefinition = "char(1)")
	private String indicadorAtivo;


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getIndicadorAtivo() {
		return indicadorAtivo;
	}


	public void setIndicadorAtivo(String indicadorAtivo) {
		this.indicadorAtivo = indicadorAtivo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((indicadorAtivo == null) ? 0 : indicadorAtivo.hashCode());
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
		StatusEvento other = (StatusEvento) obj;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (indicadorAtivo == null) {
			if (other.indicadorAtivo != null)
				return false;
		} else if (!indicadorAtivo.equals(other.indicadorAtivo))
			return false;
		return true;
	} 

	
	
}
