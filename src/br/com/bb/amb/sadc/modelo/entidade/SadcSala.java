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

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import br.com.bb.amb.constantes.SadcConstantes;


/**
 * Classe com as salas do sistema SADC
 * <p>
 * tabela: sala
 * <p>
 * relacionamentos ManyToOne: sadcComplexo
 * @author c1277736
 *
 */
@Entity
@Table(name = "sala" , schema = SadcConstantes.SADC_SCHEMA)

public class SadcSala extends SadcEntidade {


	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "nr_sala")
	@SequenceGenerator(allocationSize = 1,name = "SEQ_SALA_GEN", sequenceName = "SEQ_SALA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_SALA_GEN")
	private Long id;
	
	@Column(name = "nm_sala" , length = 50 , columnDefinition = "character(50)")
	private String nome;
	
	
	@Column(name = "in_sala_atv", length = 1 ,columnDefinition = "character")
	private String indicador;

	@Column(name = "in_sala_tur", length = 1 ,columnDefinition = "character")
	private String indicadorTecnotour;
	
	@Column(name = "cd_sis_admc" , length = 20 ,columnDefinition = "character(20)")
	private String codigoSistemaGestaoDataCenter;
	
	@ManyToOne
	@JoinColumn(name = "nr_cpxo" , referencedColumnName = "nr_cpxo")
	@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property="id", scope = SadcComplexo.class)
	private SadcComplexo sadcComplexo;
	
	@Column(name = "ativo", columnDefinition = "BOOLEAN DEFAULT true")
	private Boolean ativoSala;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getIndicador() {
		return indicador;
	}

	public String getIndicadorTecnotour() {
		return indicadorTecnotour;
	}

	public String getCodigoSistemaGestaoDataCenter() {
		return codigoSistemaGestaoDataCenter;
	}

	public SadcComplexo getSadcComplexo() {
		return sadcComplexo;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}

	public void setIndicadorTecnotour(String indicadorTecnotour) {
		this.indicadorTecnotour = indicadorTecnotour;
	}

	public void setCodigoSistemaGestaoDataCenter(String codigoSistemaGestaoDataCenter) {
		this.codigoSistemaGestaoDataCenter = codigoSistemaGestaoDataCenter;
	}

	public void setSadcComplexo(SadcComplexo sadcComplexo) {
		this.sadcComplexo = sadcComplexo;
	}

	public Boolean getAtivoSala() {
		return ativoSala;
	}

	public void setAtivoSala(Boolean ativoSala) {
		this.ativoSala = ativoSala;
	}

	
	
	
}
