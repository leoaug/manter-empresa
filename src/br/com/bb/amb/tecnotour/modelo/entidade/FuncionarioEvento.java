package br.com.bb.amb.tecnotour.modelo.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.sadc.modelo.entidade.SadcEntidade;

@Entity
@Table(name = "fun_evt", schema = "TECNOTOUR")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FuncionarioEvento extends SadcEntidade {

	public FuncionarioEvento(Funcionario funcionario, Evento evento, Date dataInscricaoEvento){
		this.setEvento(evento);
		this.setFuncionario(funcionario);
		this.setDataInscricaoEvento(dataInscricaoEvento);
	}
	
	public FuncionarioEvento() {}
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_fun_evt")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonIgnore
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = Evento.class)
	@ManyToOne
	@JoinColumn(name = "nr_evt" , referencedColumnName = "nr_evt" , nullable = false)
	private Evento evento;
	
	//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = Funcionario.class)
	@ManyToOne
	@JoinColumn(name = "nr_fun" , referencedColumnName = "nr_fun" , nullable = false)
	private Funcionario funcionario;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ts_iscr_evt" , nullable = false)
	private Date dataInscricaoEvento;
	
	@Column(name = "CD_CHV_SSBB_SUPR_FUN", columnDefinition = "CHAR(8)", nullable = true)
	private String chaveSisbbSuperior;
	
	@Column(name= "NM_SUPR_FUN", columnDefinition = "CHAR(100)", nullable = true)
	private String nomeSuperior;
	
	@Column(name = "TX_EMAI_SUPR_FUN", columnDefinition = "CHAR(50)", nullable = true)
	private String emailSuperior;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Evento getEvento() {
		return evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Date getDataInscricaoEvento() {
		return dataInscricaoEvento;
	}

	public void setDataInscricaoEvento(Date dataInscricaoEvento) {
		this.dataInscricaoEvento = dataInscricaoEvento;
	}

	public String getChaveSisbbSuperior() {
		return chaveSisbbSuperior;
	}

	public void setChaveSisbbSuperior(String chaveSisbbSuperior) {
		this.chaveSisbbSuperior = chaveSisbbSuperior;
	}

	public String getNomeSuperior() {
		return nomeSuperior;
	}

	public void setNomeSuperior(String nomeSuperior) {
		this.nomeSuperior = nomeSuperior;
	}

	public String getEmailSuperior() {
		return emailSuperior;
	}

	public void setEmailSuperior(String emailSuperior) {
		this.emailSuperior = emailSuperior;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((chaveSisbbSuperior == null) ? 0 : chaveSisbbSuperior.hashCode());
		result = prime * result + ((dataInscricaoEvento == null) ? 0 : dataInscricaoEvento.hashCode());
		result = prime * result + ((emailSuperior == null) ? 0 : emailSuperior.hashCode());
		result = prime * result + ((evento == null) ? 0 : evento.hashCode());
		result = prime * result + ((funcionario == null) ? 0 : funcionario.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeSuperior == null) ? 0 : nomeSuperior.hashCode());
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
		FuncionarioEvento other = (FuncionarioEvento) obj;
		if (chaveSisbbSuperior == null) {
			if (other.chaveSisbbSuperior != null)
				return false;
		} else if (!chaveSisbbSuperior.equals(other.chaveSisbbSuperior))
			return false;
		if (dataInscricaoEvento == null) {
			if (other.dataInscricaoEvento != null)
				return false;
		} else if (!dataInscricaoEvento.equals(other.dataInscricaoEvento))
			return false;
		if (emailSuperior == null) {
			if (other.emailSuperior != null)
				return false;
		} else if (!emailSuperior.equals(other.emailSuperior))
			return false;
		if (evento == null) {
			if (other.evento != null)
				return false;
		} else if (!evento.equals(other.evento))
			return false;
		if (funcionario == null) {
			if (other.funcionario != null)
				return false;
		} else if (!funcionario.equals(other.funcionario))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeSuperior == null) {
			if (other.nomeSuperior != null)
				return false;
		} else if (!nomeSuperior.equals(other.nomeSuperior))
			return false;
		return true;
	}

	
	 
	
}
