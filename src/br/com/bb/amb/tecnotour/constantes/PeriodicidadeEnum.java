package br.com.bb.amb.tecnotour.constantes;

public enum PeriodicidadeEnum {
	
	SEM_PERIODICIDADE(0,"Selecione"),
	DIARIO(1 , "Diário"),
	SEMANAL(Constantes.TOTAL_SEMANAL , "Semanal"),
	QUINZENAL(Constantes.TOTAL_QUINZENAL , "Quinzenal"),
	MENSAL(Constantes.TOTAL_MENSAL , "Mensal"),
	TRIMESTRAL(3 , "Trimestral"),
	ANUAL(1 , "Anual");

	
	private int value;
	private String label;
	
	
	PeriodicidadeEnum(int value,String label){
		this.label = label;
		this.value = value;
	}


	public int getValue() {
		return value;
	}


	public String getLabel() {
		return label;
	}

	
	
}
