package br.com.onsys.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.onsys.model.Usuario;
import br.com.onsys.service.UsuarioService;

@Named
@RequestScoped
public class UsuarioController {

	private Usuario usuario;
	
	@Inject
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void onInit()  {
		try {	
			setUsuario(new Usuario());		
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	@Transactional
	public void salvar() throws Exception {
		
		usuarioService.salvar(getUsuario());
		
		onInit();
		
		FacesContext.getCurrentInstance().
			addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuário cadastrado.", ""));
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
