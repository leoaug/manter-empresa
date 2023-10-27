package br.com.onsys.controller;

import javax.faces.context.FacesContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.onsys.dto.SessaoDTO;

@Controller(value = "manterEmpresaController")
@Scope("view")
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
