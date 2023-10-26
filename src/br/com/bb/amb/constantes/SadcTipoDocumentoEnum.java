package br.com.bb.amb.constantes;

/**
 * Classe Enum para parametrizar os tipos de documento do usuário do sistema
 * tabela: usu
 * coluna: in_tip_doc_usu
 * classe: SadcUsuario
 * @author c1277736 
 * 
 */
public enum SadcTipoDocumentoEnum { 
	CHAVE ('0',"Chave Sisbb", 8),
	CPF('1', "CPF", 14),  
	PASSAPORTE('3',"Passaporte", 9);
	
	private char valor;
	private String tipoDocumento;
	private Integer tamanho;
	
	SadcTipoDocumentoEnum (char valor, String tipoDocumento,Integer tamanho){
		this.valor = valor ;
		this.tipoDocumento = tipoDocumento;
		this.tamanho = tamanho;
	}

	public char getValor() {
		return valor;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	
}
