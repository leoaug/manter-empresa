package br.com.onsys.service;

import javax.enterprise.context.RequestScoped;

import br.com.onsys.model.Empresa;
import br.com.onsys.persistence.repository.ManterEmpresaRepository;

@RequestScoped
public class EmpresaService extends ManterEmpresaRepository <Empresa> {

	private static final long serialVersionUID = 1L;

}
