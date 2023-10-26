package br.com.bb.amb.constantes;

/**
 * Enum para selecão de tipo de visualização de acesso para menu, formulário, objeto formulário 
 * classe: SadcMenu, SadcFormulario, SadcObjetoFormulario
 * @author c1260311  
 */
public enum SadcIndicadorVizualizacaoEnum { 

	VISUALIZACAO_BASICA("B\u00E1sico"),
	VISUALIZACAO_COM_CONDICOES("Com Condi\u00E7\u00F5es");
	
	private String descricao;
	
	SadcIndicadorVizualizacaoEnum (String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
