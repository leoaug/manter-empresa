package br.com.bb.amb.tecnotour.constantes;

public enum StatusEventoEnum {

	ABERTO(1,"Aberto"),
	CONFIRMADO(2,"Confirmado"), 
	CANCELADO(3,"Cancelado"), 
    REALIZADO(4,"Realizado"),
	NAO_REALIZADO(5, "Não Realizado"),
	FECHADO(6,"Fechado");
	
	private int value;
	private String label;
	
	
	StatusEventoEnum(Integer value,String label){
		this.value = value;
		this.label = label;
	}
	
	
	public Integer getValue() {
		return value;
	}
	public String getLabel() {
		return label;
	}
	
	
}
