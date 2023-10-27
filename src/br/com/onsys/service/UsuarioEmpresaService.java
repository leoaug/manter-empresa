package br.com.onsys.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.onsys.model.Empresa;
import br.com.onsys.model.Usuario;
import br.com.onsys.model.UsuarioEmpresa;
import br.com.onsys.persistence.repository.ManterEmpresaRepository;

@Service
public class UsuarioEmpresaService extends ManterEmpresaRepository <UsuarioEmpresa> {

	private static final long serialVersionUID = 1L;

	public void salvarUsuarioEmpresas(Usuario usuario, List<Empresa> empresas) throws Exception {
		for(Empresa empresa : empresas) {
			UsuarioEmpresa usuarioEmpresa = new UsuarioEmpresa();
			usuarioEmpresa.setEmpresa(empresa);
			usuarioEmpresa.setUsuario(usuario);
			super.salvar(usuarioEmpresa);
		}
		
	}

}
