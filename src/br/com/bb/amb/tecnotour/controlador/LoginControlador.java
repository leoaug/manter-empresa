package br.com.bb.amb.tecnotour.controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.bb.amb.sadc.util.SadcFacesUtil;
import br.com.bb.amb.tecnotour.visao.dto.SessaoDTO;


@Controller(value = "loginControlador")
@Scope("session")
public class LoginControlador  implements Serializable {

	
	
	private static final long serialVersionUID = 1L;
	
	private SessaoDTO sessaoDTO;

	@Value("${spring.urlContexto}")
	private String urlContexto;

	@PostConstruct
	public void init(){
		//this.inicializaLogin();
		
	}
	
	public void inicializaLogin() {

		try {
			
			setSessaoDTO(new SessaoDTO());
			
			login();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void loginAdminSemLDAP() {
		getSessaoDTO().getSadcLdapUsuarioLogado().setNome("admin");
		getSessaoDTO().getSadcLdapUsuarioLogado().setCelular("99999-9999");
		getSessaoDTO().getSadcLdapUsuarioLogado().setChave("admin");
		getSessaoDTO().getSadcLdapUsuarioLogado().setCodigoEquipe("524713");
		getSessaoDTO().getSadcLdapUsuarioLogado().setTelefone("99999");
		getSessaoDTO().getSadcLdapUsuarioLogado().setEmail("admin@bb.com.br");
		
		getSessaoDTO().setRenderComponente(true);
		
	}

	public void limparMensagemErro() {
		getSessaoDTO().setMensagemErro("");
	}
	
	
	public String login() {
		try {


			return "/WEB-INF/template.xhtml";


		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}	
			
	}



	public void logout() throws Exception {
		try {
		

			
			
			
		}  catch (Exception e) {
			e.printStackTrace();
			SadcFacesUtil.showMessageErrorDetail("Erro logout");
			throw e;
		}
		
	}
	
	
	public void limparCampos(ActionEvent event) {	
		try {			
			getSessaoDTO().getSadcLdapUsuarioLogado().setSenha("");
			getSessaoDTO().getSadcLdapUsuarioLogado().setChave("");
		} catch(Exception e) {
			
		}
		
	}

	
	
	public SessaoDTO getSessaoDTO() {
		return sessaoDTO;
	}

	public void setSessaoDTO(SessaoDTO sessaoDTO) {
		this.sessaoDTO = sessaoDTO;
	}
	

	
}
