package br.com.onsys.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.bb.amb.sadc.util.SadcFacesUtil;
import br.com.onsys.dto.SessaoDTO;
import br.com.onsys.model.Usuario;
import br.com.onsys.service.UsuarioService;
import br.com.onsys.util.ArquivoUtil;


@Controller(value = "loginControlador")
@Scope("session")
public class LoginControlador  implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	private SessaoDTO sessaoDTO;
	
	private Usuario usuario;
	
	@Autowired
	private UsuarioService usuarioService;

	@PostConstruct
	public void init(){
		try {
			setUsuario(new Usuario());
			setSessaoDTO(new SessaoDTO());
			getSessaoDTO().setUsuario(new Usuario());
					
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	
	public String login() throws Exception {
		try {

			Usuario usuarioLogin = usuarioService.consultarUsuarioPorLoginESenha(getUsuario().getEmail(),getUsuario().getSenha());
			
			if(usuarioLogin != null) {
				if(!usuarioLogin.getUsuariosEmpresas().isEmpty()) {	
					byte[] arrayByteFoto = ArquivoUtil.converterURLtoByte(usuarioLogin.getUsuariosEmpresas().get(0).getEmpresa().getUrlLogo());
					
					if(arrayByteFoto != null) {
						getSessaoDTO().setFotoEmpresa(ArquivoUtil.montarArquivoBASE64(".png", arrayByteFoto));
	
					} 
				}
				getSessaoDTO().setUsuario(usuarioLogin);

				return "/WEB-INF/template.xhtml";
			} else {
		        FacesContext.getCurrentInstance().
		        	addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario ou senha inválidos"));
		        return "/login.xhtml";
			}
			
			


		} catch (Exception e) {
			e.printStackTrace();
			 FacesContext.getCurrentInstance().
	        	addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro", e.getMessage()));
			throw e;
		}	
			
	}



	public String logout() throws Exception {
		try {
		

			  return "/login.xhtml?faces-redirect=true";
			
			
			
		}  catch (Exception e) {
			e.printStackTrace();
			SadcFacesUtil.showMessageErrorDetail("Erro logout");
			throw e;
		}
		
	}
	
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public SessaoDTO getSessaoDTO() {
		return sessaoDTO;
	}

	public void setSessaoDTO(SessaoDTO sessaoDTO) {
		this.sessaoDTO = sessaoDTO;
	}
	

	
}
