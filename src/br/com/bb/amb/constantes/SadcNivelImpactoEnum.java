package br.com.bb.amb.constantes;

/**
 * Classe enum que define os níveis de impacto do incidente de segurança
 * tabela: acd_sgca
 * coluna: in_nvl_iflc
 * classe: SadcIncidenteSeguranca
 * @author c1277736   
 */
public enum SadcNivelImpactoEnum { 
	BAIXO ('0',"Baixo"),
	MEDIO('1', "Médio"),  
	ALTO('2',"Alto");
	
	private char valor;
	private String descricao;
	
	SadcNivelImpactoEnum (char valor, String descricao){
		this.valor = valor ;
		this.descricao = descricao;
	}

	public char getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
