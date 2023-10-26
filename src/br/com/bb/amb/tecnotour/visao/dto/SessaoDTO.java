package br.com.bb.amb.tecnotour.visao.dto;

import java.io.Serializable;
import java.util.List;

import br.com.bb.amb.ldap.modelo.entidade.SadcLdapGrupo;
import br.com.bb.amb.ldap.modelo.entidade.SadcLdapUsuario;

public class SessaoDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private SadcLdapUsuario sadcLdapUsuarioLogado;
	private List <SadcLdapGrupo> listaGruposComUsuarios;	
	private String mensagemErro;
	private String titulo;
	private String urlContext;
	private boolean renderComponente;
	private String styleTemplateContent;
	
	public SadcLdapUsuario getSadcLdapUsuarioLogado() {
		return sadcLdapUsuarioLogado;
	}

	public void setSadcLdapUsuarioLogado(SadcLdapUsuario sadcLdapUsuarioLogado) {
		this.sadcLdapUsuarioLogado = sadcLdapUsuarioLogado;
	}

	public String getMensagemErro() {
		return mensagemErro;
	}

	public void setMensagemErro(String mensagemErro) {
		this.mensagemErro = mensagemErro;
	}

	public List<SadcLdapGrupo> getListaGruposComUsuarios() {
		return listaGruposComUsuarios;
	}

	public void setListaGruposComUsuarios(List<SadcLdapGrupo> listaGruposComUsuarios) {
		this.listaGruposComUsuarios = listaGruposComUsuarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public boolean isRenderComponente() {
		return renderComponente;
	}

	public void setRenderComponente(boolean renderComponente) {
		this.renderComponente = renderComponente;
	}

	public String getStyleTemplateContent() {
		return styleTemplateContent;
	}

	public void setStyleTemplateContent(String styleTemplateContent) {
		this.styleTemplateContent = styleTemplateContent;
	}

	public String getUrlContext() {
		return urlContext;
	}

	public void setUrlContext(String urlContext) {
		this.urlContext = urlContext;
	}
	
	
	
	
}
