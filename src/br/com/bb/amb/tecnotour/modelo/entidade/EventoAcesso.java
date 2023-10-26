package br.com.bb.amb.tecnotour.modelo.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.bb.amb.sadc.modelo.entidade.SadcAcesso;
import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "evt_ace", schema = "TECNOTOUR")
public class EventoAcesso extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_evt_ace")
	@SequenceGenerator(name = "evt_ace_id_evt_ace_seq_gen", sequenceName = "TECNOTOUR.evt_ace_id_evt_ace_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evt_ace_id_evt_ace_seq_gen")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_evt" , referencedColumnName = "nr_evt")
	private Evento evento;
	
	@ManyToOne
	@JoinColumn(name = "id_ace" , referencedColumnName = "nr_slct_acss")
	private SadcAcesso sadcAcesso;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_at")
	private Date dataCriacao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}

	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataCriacao == null) ? 0 : dataCriacao.hashCode());
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((sadcAcesso == null) ? 0 : sadcAcesso.hashCode());
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
		EventoAcesso other = (EventoAcesso) obj;
		if (dataCriacao == null) {
			if (other.dataCriacao != null)
				return false;
		} else if (!dataCriacao.equals(other.dataCriacao))
			return false;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (sadcAcesso == null) {
			if (other.sadcAcesso != null)
				return false;
		} else if (!sadcAcesso.equals(other.sadcAcesso))
			return false;
		return true;
	}
	
	

}
