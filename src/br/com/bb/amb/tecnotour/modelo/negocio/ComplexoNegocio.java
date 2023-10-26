package br.com.bb.amb.tecnotour.modelo.negocio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bb.amb.tecnotour.constantes.Constantes;
import br.com.bb.amb.tecnotour.modelo.entidade.Complexo;
import br.com.bb.amb.tecnotour.modelo.persistencia.dao.DAO;
import br.com.bb.amb.tecnotour.util.ComponenteUtil;
import br.com.bb.amb.tecnotour.visao.dto.DTO;

@Service
public class ComplexoNegocio extends DAO <Complexo> {
	private static final long serialVersionUID = 1L;

	public DTO<Complexo> inicializaComplexoDTO() {
		DTO <Complexo> dto = new DTO <Complexo> ();
		dto.setEntidade(new Complexo());
		dto.setEntidades(new ArrayList <Complexo> ());
		
		return dto;
	}
	
	
	public void criarCoresComplexosCSS(List <Complexo> complexos){
		
		for(Complexo complexo: complexos){
			ComponenteUtil.criarCSSClass( "."+complexo.getNomeClasseCorComplexo() + Constantes.CSS_CLASS_SCHEDULE, complexo.getCodigoCorComplexo());
		}

	}
}
