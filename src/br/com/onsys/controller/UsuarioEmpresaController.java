package br.com.onsys.controller;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import org.primefaces.model.DualListModel;

import br.com.onsys.model.Empresa;
import br.com.onsys.model.Usuario;
import br.com.onsys.model.UsuarioEmpresa;
import br.com.onsys.service.EmpresaService;
import br.com.onsys.service.UsuarioEmpresaService;
import br.com.onsys.service.UsuarioService;

@Named
@ViewScoped
public class UsuarioEmpresaController implements Serializable {

	private static final long serialVersionUID = 1L;

	private UsuarioEmpresa usuarioEmpresa;
	
	private List <Usuario> usuarios;
		
	private DualListModel<Empresa> empresas;
		
	@Inject
	private UsuarioEmpresaService usuarioEmpresaService;
	
	@Inject
	private UsuarioService usuarioService;
	
	@Inject
	private EmpresaService empresaService;
	 
	@PostConstruct
	public void onInit()  {
		try {	
			setUsuarioEmpresa(new UsuarioEmpresa());	
			HttpServletRequest requestObj = (HttpServletRequest)         
					FacesContext.getCurrentInstance().getExternalContext().getRequest();
			Usuario usuarioLogado = (Usuario) requestObj.getSession().getAttribute("usuarioLogado");
			 
			getUsuarioEmpresa().setUsuario(usuarioLogado);
			getUsuarioEmpresa().setEmpresa(new Empresa());
			setUsuarios(usuarioService.getEntidades());	
			
			List <UsuarioEmpresa> listaUsuarioEmpresaLogado = usuarioEmpresaService.
					consultarUsuarioEmpresaPorUsuarioLogado(usuarioLogado);
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
	
	@Transactional
	public void salvar() throws Exception {
		
		usuarioEmpresaService.excluirEntidades(usuarioService.getEntidade(getUsuarioEmpresa().getUsuario().getId()).getUsuariosEmpresas());	
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
