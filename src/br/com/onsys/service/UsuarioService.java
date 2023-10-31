package br.com.onsys.service;

import javax.enterprise.context.RequestScoped;

import br.com.bb.amb.jpa.constantes.Constantes;
import br.com.bb.amb.jpa.persistencia.BBTSQuery;
import br.com.onsys.model.Usuario;
import br.com.onsys.persistence.repository.ManterEmpresaRepository;

@RequestScoped
public class UsuarioService extends ManterEmpresaRepository<Usuario>{
	private static final long serialVersionUID = 1L;

	public Usuario consultarUsuarioPorLoginESenha(String email, String senha) throws Exception {
		BBTSQuery <Usuario> query = super.inicializaBbtsQuery();
		query.adicionarFiltro("email", email, Constantes.OPERACAO_IGUAL);
		query.adicionarFiltro("senha", senha, Constantes.OPERACAO_IGUAL);
		return super.consultarPorParametrosAND(query);
	}


}
  