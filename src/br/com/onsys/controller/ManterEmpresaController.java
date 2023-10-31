package br.com.onsys.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.com.onsys.dto.SessaoDTO;

@Named
@RequestScoped
public class ManterEmpresaController {

	private LoginControlador loginControlador;
	
	public SessaoDTO getSessaoDTO() {	
		loginControlador = (LoginControlador) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("loginControlador");
		if(loginControlador != null && loginControlador.getSessaoDTO() != null) {
			return 	loginControlador.getSessaoDTO();
		}
		return null;		
	}
}
