package br.com.onsys.controller;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.model.DualListModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.onsys.model.Empresa;
import br.com.onsys.model.Usuario;
import br.com.onsys.model.UsuarioEmpresa;
import br.com.onsys.service.EmpresaService;
import br.com.onsys.service.UsuarioEmpresaService;
import br.com.onsys.service.UsuarioService;

@Controller(value = "usuarioEmpresaController")
@Scope("view")
public class UsuarioEmpresaController {

	private UsuarioEmpresa usuarioEmpresa;
	
	private List <Usuario> usuarios;
		
	private DualListModel<Empresa> empresas;
	
	private List <Empresa> empresasSelecionadas;
	
	@Autowired
	private UsuarioEmpresaService usuarioEmpresaService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private EmpresaService empresaService;
	
	@PostConstruct
	public void onInit()  {
		try {	
			setUsuarioEmpresa(new UsuarioEmpresa());	
			getUsuarioEmpresa().setUsuario(new Usuario());
			getUsuarioEmpresa().setEmpresa(new Empresa());
			setUsuarios(usuarioService.getEntidades());			
			setEmpresas(new DualListModel<>(empresaService.getEntidades(), Collections.emptyList()));		
			setEmpresasSelecionadas(Collections.emptyList());
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	public void salvar() throws Exception {
		
			
		usuarioEmpresaService.salvarUsuarioEmpresas(getUsuarioEmpresa().getUsuario(),getEmpresas().getTarget());
		
		onInit();
		
		FacesContext.getCurrentInstance().
      		addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Empresa(s) cadastrada(s).", ""));
	}

	public UsuarioEmpresa getUsuarioEmpresa() {
		return usuarioEmpresa;
	}

	public void setUsuarioEmpresa(UsuarioEmpresa usuarioEmpresa) {
		this.usuarioEmpresa = usuarioEmpresa;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}	

	public DualListModel<Empresa> getEmpresas() {
		return empresas;
	}

	public void setEmpresas(DualListModel<Empresa> empresas) {
		this.empresas = empresas;
	}

	public List<Empresa> getEmpresasSelecionadas() {
		return empresasSelecionadas;
	}

	public void setEmpresasSelecionadas(List<Empresa> empresasSelecionadas) {
		this.empresasSelecionadas = empresasSelecionadas;
	}

	
}
