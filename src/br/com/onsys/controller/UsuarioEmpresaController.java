package br.com.onsys.controller;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
public class UsuarioEmpresaController extends ManterEmpresaController{

	private UsuarioEmpresa usuarioEmpresa;
	
	private List <Usuario> usuarios;
		
	private DualListModel<Empresa> empresas;
		
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
			getUsuarioEmpresa().setUsuario(getSessaoDTO().getUsuario());
			getUsuarioEmpresa().setEmpresa(new Empresa());
			setUsuarios(usuarioService.getEntidades());	
			
			List <UsuarioEmpresa> listaUsuarioEmpresaLogado = usuarioEmpresaService.
					consultarUsuarioEmpresaPorUsuarioLogado(getSessaoDTO().getUsuario());
			List <Empresa> listaTotal = empresaService.getEntidades();
			
			if(listaUsuarioEmpresaLogado.isEmpty()) {
				setEmpresas(new DualListModel<>(listaTotal, Collections.emptyList()));
			} else {
				List <Empresa> listaEmpresasUsuarioLogado = listaUsuarioEmpresaLogado.stream().
						map(usuarioEmpresa -> usuarioEmpresa.getEmpresa()).collect(Collectors.toList());	
				listaTotal.removeAll(listaEmpresasUsuarioLogado);				
				setEmpresas(new DualListModel<>(listaTotal, listaEmpresasUsuarioLogado));
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();	
		}	
	}
	
	public void salvar() throws Exception {
		
		usuarioEmpresaService.excluirEntidades(getUsuarioEmpresa().getUsuario().getUsuariosEmpresas());	
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

	
	
}
