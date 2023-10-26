package br.com.bb.amb.tecnotour.util;

import java.util.ArrayList;
import java.util.List;

public class TesteEnvio {

	public static void main(String[] args) {
		
		
		try {
			
			List <String> emails = new ArrayList<String>();
			emails.add("leoaug1981@hotmail.com");
			
			EmailUtil.enviaEmail(emails, "Email das ", "mensagem do corpo do email");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
