package br.com.onsys.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.onsys.model.Usuario;
import br.com.onsys.service.UsuarioService;

@Controller(value = "usuarioController")
@Scope("view")
public class UsuarioController {

	private Usuario usuario;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void onInit()  {
		try {	
			setUsuario(new Usuario());		
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	public void salvar() throws Exception {
		
		usuarioService.salvar(getUsuario());
		
		onInit();
		
		FacesContext.getCurrentInstance().
      		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso", "Usuario cadastrado."));
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
}
