package br.com.bb.amb.tecnotour.util;

public class ConversaoUtil {
	
	public static String converterParaJavascriptArray(String[] arr){
	    StringBuffer sb = new StringBuffer();
	    //sb.append("[");
	    for(int i=0; i<arr.length; i++){
	        sb.append("\"").append(arr[i]).append("\"");
	        if(i+1 < arr.length){
	            sb.append(",");
	        }
	    }
	    //sb.append("]");
	    return sb.toString();
	}
}
