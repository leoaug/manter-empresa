package br.com.bb.amb.constantes;

/**
 * Classe Enum que define os tipos de usuário acesso do sistema
 * tabela: usu_acss
 * coluna: in_tip_usu_acss
 * classe: SadcUsuarioAcesso
 * @author c1277736  
 */
public enum SadcTipoUsuarioAcessoEnum { 
	REGULAR('0',"Regular"),
	VISITANTE('1', "Visitante"),
	A_CADASTRAR('2', "A Cadastrar");
	
	private char valor;
	private String tipoUsuarioAcesso;
	
	SadcTipoUsuarioAcessoEnum (char valor, String tipoUsuarioAcesso){
		this.valor = valor;
		this.tipoUsuarioAcesso = tipoUsuarioAcesso;
	}

	public char getValor() {
		return valor;
	}

	public String getTipoUsuarioAcesso() {
		return tipoUsuarioAcesso;
	}


	
}

