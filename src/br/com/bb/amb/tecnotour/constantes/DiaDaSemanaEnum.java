package br.com.bb.amb.tecnotour.constantes;

public enum DiaDaSemanaEnum {

	DOMINGO(1 , "Domingo"),
	SEGUNDA(2 , "Segunda"),
	TERCA(3 , "Terça"),
	QUARTA(4 , "Quarta"),
	QUINTA(5 , "Quinta"),
	SEXTA(6 , "Sexta"),
	SABADO(7 , "Sábado");
	
	public int value;
	public String label;
	
	
	DiaDaSemanaEnum(int value,String label){
		this.label = label;
		this.value = value;
	}


	
}
