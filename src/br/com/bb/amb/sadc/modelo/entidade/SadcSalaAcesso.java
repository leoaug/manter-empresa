package br.com.bb.amb.sadc.modelo.entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;

 
/**
 * Classe com os relacionamentos entre Sala e Solicita  o de Acesso
 * <p>
 * tabela: sala_acss
 * <p>
 * relacionamentos ManyToOne: sadcSala, sadcAcesso
 * relacionamentos OneToMany: listaSadcTransitoMateriais
 * @author c1277736
 *
 */
@Entity
@Table(name = "sala_acss" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcSalaAcesso extends SadcEntidade {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nr_sala_acss")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_SALA_ACSS_GEN", sequenceName = "SEQ_SALA_ACSS")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SALA_ACSS_GEN")
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "nr_sala" , referencedColumnName = "nr_sala" )
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcSala.class)
	
	private SadcSala sadcSala;
	
	@ManyToOne
	@JoinColumn(name = "nr_slct_acss" , referencedColumnName = "nr_slct_acss", nullable = true)
	
	private SadcAcesso sadcAcesso;
	

	@OneToMany(mappedBy = "sadcSalaAcesso")
	@LazyCollection(LazyCollectionOption.FALSE)
	
	@NotFound(action = NotFoundAction.IGNORE)
	private List <SadcTransitoMaterial> listaSadcTransitoMateriais;


	public Long getId() {
		return id;
	}


	public SadcSala getSadcSala() {
		return sadcSala;
	}


	public SadcAcesso getSadcAcesso() {
		return sadcAcesso;
	}


	public List<SadcTransitoMaterial> getListaSadcTransitoMateriais() {
		return listaSadcTransitoMateriais;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public void setSadcSala(SadcSala sadcSala) {
		this.sadcSala = sadcSala;
	}


	public void setSadcAcesso(SadcAcesso sadcAcesso) {
		this.sadcAcesso = sadcAcesso;
	}


	public void setListaSadcTransitoMateriais(List<SadcTransitoMaterial> listaSadcTransitoMateriais) {
		this.listaSadcTransitoMateriais = listaSadcTransitoMateriais;
	}
	
	

}
