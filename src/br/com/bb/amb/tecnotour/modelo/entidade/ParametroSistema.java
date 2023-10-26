package br.com.bb.amb.tecnotour.modelo.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "prm_sis", schema = "TECNOTOUR")
public class ParametroSistema extends SadcEntidade {

	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "NR_PRM_SIS")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "TX_EVT_PDRO", columnDefinition = "VARCHAR(255)")
	private String 	textoEvento;
	
	@Column(name = "TX_EMAI_RMTE" , columnDefinition = "CHAR(50)")
	private String 	textoEmailRemetente;	
	
	@Column(name = "TX_TRM_ACTE" , columnDefinition = "VARCHAR(2000)")
	private String textoTermoAceite;		
	
	@Column(name = "CD_TIP_AMB" , columnDefinition = "CHAR(1)")
	private String codigoTipoAmbiente;	
	
	@Column(name = "TX_VRS_ATU" , columnDefinition = "CHAR(5)")
	private String textoVersaoAtual;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTextoEvento() {
		return textoEvento;
	}

	public void setTextoEvento(String textoEvento) {
		this.textoEvento = textoEvento;
	}

	public String getTextoEmailRemetente() {
		return textoEmailRemetente;
	}

	public void setTextoEmailRemetente(String textoEmailRemetente) {
		this.textoEmailRemetente = textoEmailRemetente;
	}

	public String getTextoTermoAceite() {
		return textoTermoAceite;
	}

	public void setTextoTermoAceite(String textoTermoAceite) {
		this.textoTermoAceite = textoTermoAceite;
	}

	public String getCodigoTipoAmbiente() {
		return codigoTipoAmbiente;
	}

	public void setCodigoTipoAmbiente(String codigoTipoAmbiente) {
		this.codigoTipoAmbiente = codigoTipoAmbiente;
	}

	public String getTextoVersaoAtual() {
		return textoVersaoAtual;
	}

	public void setTextoVersaoAtual(String textoVersaoAtual) {
		this.textoVersaoAtual = textoVersaoAtual;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codigoTipoAmbiente == null) ? 0 : codigoTipoAmbiente.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((textoEmailRemetente == null) ? 0 : textoEmailRemetente.hashCode());
		result = prime * result + ((textoEvento == null) ? 0 : textoEvento.hashCode());
		result = prime * result + ((textoTermoAceite == null) ? 0 : textoTermoAceite.hashCode());
		result = prime * result + ((textoVersaoAtual == null) ? 0 : textoVersaoAtual.hashCode());
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
		ParametroSistema other = (ParametroSistema) obj;
		if (codigoTipoAmbiente == null) {
			if (other.codigoTipoAmbiente != null)
				return false;
		} else if (!codigoTipoAmbiente.equals(other.codigoTipoAmbiente))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (textoEmailRemetente == null) {
			if (other.textoEmailRemetente != null)
				return false;
		} else if (!textoEmailRemetente.equals(other.textoEmailRemetente))
			return false;
		if (textoEvento == null) {
			if (other.textoEvento != null)
				return false;
		} else if (!textoEvento.equals(other.textoEvento))
			return false;
		if (textoTermoAceite == null) {
			if (other.textoTermoAceite != null)
				return false;
		} else if (!textoTermoAceite.equals(other.textoTermoAceite))
			return false;
		if (textoVersaoAtual == null) {
			if (other.textoVersaoAtual != null)
				return false;
		} else if (!textoVersaoAtual.equals(other.textoVersaoAtual))
			return false;
		return true;
	}
	
	
	
}
