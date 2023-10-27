package br.com.onsys.dto;

import java.io.Serializable;

import br.com.onsys.model.Usuario;

public class SessaoDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private Usuario usuario;
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

	
	
	
	
}
