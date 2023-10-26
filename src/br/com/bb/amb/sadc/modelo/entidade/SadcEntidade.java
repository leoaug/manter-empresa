package br.com.bb.amb.sadc.modelo.entidade;
 
import java.io.Serializable;
import java.util.List;

import javax.persistence.Transient;

import org.primefaces.model.TreeNode;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class SadcEntidade implements Serializable  {
	


	private static final long serialVersionUID = 1L;
	
	@Transient
	@JsonIgnore
	private String transientRenderComponente;
	
	@Transient
	@JsonIgnore
	private byte[] transientContentArquivo;
	
	@Transient
	@JsonIgnore
	private boolean transientSelecionado;
	
	@Transient
	@JsonIgnore
	private String transientLabel;
	
	@Transient
	@JsonIgnore
	private String transientValue;
	
	@Transient
	@JsonIgnore
	private boolean transientUltimo;
	
	@Transient
	@JsonIgnore
	
	private transient List <TreeNode> transientListaTreeNode;
	
	@Transient
	@JsonIgnore
	private int transientContador;
	
	
	@Transient
	@JsonIgnore
	private String transientContentType;

	@Transient
	@JsonIgnore
	private List <String> transientListaCartao;

	public String getTransientRenderComponente() {
		return transientRenderComponente;
	}

	public void setTransientRenderComponente(String transientRenderComponente) {
		this.transientRenderComponente = transientRenderComponente;
	}

	public byte[] getTransientContentArquivo() {
		return transientContentArquivo;
	}

	public void setTransientContentArquivo(byte[] transientContentArquivo) {
		this.transientContentArquivo = transientContentArquivo;
	}

	public boolean isTransientSelecionado() {
		return transientSelecionado;
	}

	public void setTransientSelecionado(boolean transientSelecionado) {
		this.transientSelecionado = transientSelecionado;
	}

	public String getTransientLabel() {
		return transientLabel;
	}

	public void setTransientLabel(String transientLabel) {
		this.transientLabel = transientLabel;
	}

	public boolean isTransientUltimo() {
		return transientUltimo;
	}

	public void setTransientUltimo(boolean transientUltimo) {
		this.transientUltimo = transientUltimo;
	}

	public String getTransientValue() {
		return transientValue;
	}

	public void setTransientValue(String transientValue) {
		this.transientValue = transientValue;
	}

	public List<TreeNode> getTransientListaTreeNode() {
		return transientListaTreeNode;
	}

	public void setTransientListaTreeNode(List<TreeNode> transientListaTreeNode) {
		this.transientListaTreeNode = transientListaTreeNode;
	}
		

	public int getTransientContador() {
		return transientContador;
	}

	public void setTransientContador(int transientContador) {
		this.transientContador = transientContador;
	}

	public String getTransientContentType() {
		return transientContentType;
	}

	public void setTransientContentType(String transientContentType) {
		this.transientContentType = transientContentType;
	}

	public List<String> getTransientListaCartao() {
		return transientListaCartao;
	}

	public void setTransientListaCartao(List<String> transientListaCartao) {
		this.transientListaCartao = transientListaCartao;
	}



}
