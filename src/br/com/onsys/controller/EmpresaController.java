package br.com.onsys.controller;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.onsys.model.Empresa;
import br.com.onsys.service.EmpresaService;

@Controller(value = "empresaController")
@Scope("view")
public class EmpresaController {

	private Empresa empresa;
	
	@Autowired
	private EmpresaService empresaService;
	
	@PostConstruct
	public void onInit()  {
		try {	
			setEmpresa(new Empresa());		
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	public void salvar() throws Exception {
		
		empresaService.salvar(getEmpresa());
		
		onInit();
		
		FacesContext.getCurrentInstance().
  			addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Empresa cadastrada.", ""));
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	
	
	
}
