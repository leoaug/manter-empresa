package br.com.onsys.service;

import org.springframework.stereotype.Service;

import br.com.onsys.model.Empresa;
import br.com.onsys.persistence.repository.ManterEmpresaRepository;

@Service
public class EmpresaService extends ManterEmpresaRepository <Empresa> {

	private static final long serialVersionUID = 1L;

}
