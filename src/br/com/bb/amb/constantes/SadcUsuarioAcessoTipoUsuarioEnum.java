package br.com.bb.amb.constantes;

/**
 * Enum de sistema para fazer verificação dos tipos de usuários na tela de visitantes
 * @author c1277736 
 */
public enum SadcUsuarioAcessoTipoUsuarioEnum { 
	FUNCIONARIO(1 ,"Funcionário"),
	EXTERNO(2 , "Externo");
	
	private int valor;
	private String tipoUsuario;
	
	SadcUsuarioAcessoTipoUsuarioEnum (int valor, String tipoUsuario){
		this.valor = valor;
		this.tipoUsuario = tipoUsuario;
	}

	public int getValor() {
		return valor;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	
}
