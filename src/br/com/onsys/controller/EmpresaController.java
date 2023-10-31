package br.com.onsys.controller;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import br.com.onsys.model.Empresa;
import br.com.onsys.service.EmpresaService;

@Named
@RequestScoped
public class EmpresaController {

	private Empresa empresa;
	
	@Inject
	private EmpresaService empresaService;
	
	@PostConstruct
	public void onInit()  {
		try {	
			setEmpresa(new Empresa());		
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	@Transactional
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
