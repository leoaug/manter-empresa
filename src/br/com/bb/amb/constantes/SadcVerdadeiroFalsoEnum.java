package br.com.bb.amb.constantes;

/**
 * Enum de padronização de falso e verdadeiro no sistema
 * @author c1277736 
 */
public enum SadcVerdadeiroFalsoEnum {
	FALSO ('0', false),
	VERDADEIRO ('1', true);
	
	private char valorChar;
	private boolean valorBoolean;
	
	SadcVerdadeiroFalsoEnum (char valorChar, boolean valorBoolean){
		this.valorChar = valorChar;
		this.valorBoolean = valorBoolean;
	}

	public char getValorChar() {
		return valorChar;
	}


	public boolean isValorBoolean() {
		return valorBoolean;
	}


	
}
