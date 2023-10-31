package br.com.onsys.service;

import java.util.List;

import javax.enterprise.context.RequestScoped;

import br.com.bb.amb.jpa.constantes.Constantes;
import br.com.bb.amb.jpa.persistencia.BBTSQuery;
import br.com.onsys.model.Empresa;
import br.com.onsys.model.Usuario;
import br.com.onsys.model.UsuarioEmpresa;
import br.com.onsys.persistence.repository.ManterEmpresaRepository;

@RequestScoped
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

	public List<UsuarioEmpresa> consultarUsuarioEmpresaPorUsuarioLogado(Usuario usuario) throws Exception {
		BBTSQuery<UsuarioEmpresa> query = super.inicializaBbtsQuery();
		query.adicionarFiltro("usuario.id", usuario.getId(), Constantes.OPERACAO_IGUAL);
		return super.consultarPorParametrosANDList(query);
	}

}
