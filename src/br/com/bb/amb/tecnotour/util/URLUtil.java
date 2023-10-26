package br.com.bb.amb.tecnotour.util;

import java.net.HttpURLConnection;
import java.net.URL;

public class URLUtil {
 
	
	public static boolean existeConexao(String stringUrl) { 
		
		try { 
			URL url = new URL(stringUrl);
	        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
	        urlConn.setConnectTimeout(3000);
	        urlConn.connect();
	        if(urlConn.getResponseCode() == HttpURLConnection.HTTP_OK || urlConn.getResponseCode() == HttpURLConnection.HTTP_BAD_METHOD) {
	        	 urlConn.disconnect();
	        	return true;
	        } else {
	        	 urlConn.disconnect();
	        	return false;
	        }
	       
		} catch (Exception e) { 
			return false; 
		} 
	} 
}
