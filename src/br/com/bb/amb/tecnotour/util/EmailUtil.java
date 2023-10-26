package br.com.bb.amb.tecnotour.util;

import java.util.List;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import br.com.bb.amb.tecnotour.constantes.Constantes;

public class EmailUtil {

	
	private static Session configurarEmail() throws Exception {
		
		 Properties props = new Properties();
		 /*
		 final String smtp_connection = "SSL";  // Use 'TLS' or 'SSL' connection
		 
		 props.put("mail.smtp.auth", "true");
		 props.put("mail.smtp.host", "smtp-pulse.com");
		 
		 if (smtp_connection.equals("TLS")) {
	            props.put("mail.smtp.starttls.enable", "true");
	            props.put("mail.smtp.port", "587");
	    } else{
	            props.put("mail.smtp.socketFactory.port", "465");
	            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
	            props.put("mail.smtp.port", "465");
	    }
		 */
		 
         /** Parametros de conexao com servidor Gmail */
         
		 props.put("mail.smtp.host", "smtp.gmail.com");
		 //props.put("mail.smtp.port", "465");
		 //props.put("mail.smtp.socketFactory.port", "587");
		 //props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		 props.put("mail.smtp.auth", "true");
		 props.put("mail.smtp.starttls.enable","true"); 
		
		 //props.put("mail.smtp.ssl.enable", "true");

	
		 
		 //props.put("mail.smtp.port", "587");	
         
         //System.setProperty("java.net.preferIPv4Stack", "true");
         
         Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
                 protected PasswordAuthentication getPasswordAuthentication() {
                      return new PasswordAuthentication(Constantes.EMAIL_ENDERECO_REMENTENTE, Constantes.EMAIL_SENHA_REMENTENTE);
                 }
          });

         /** Ativa Debug para sessao */
         session.setDebug(true);
         
         return session;
		
	}
	
	public static Address[] montarEmails(List <String> emails) throws Exception {
		
		try {
			
			StringBuilder builder = new StringBuilder();
			
			String virgula = ",";
			for(int i = 0; i < emails.size(); i++){
				if(i == emails.size() - 1){
					virgula = "";
				}
				builder.append(emails.get(i) + virgula);
				
			}
						
			Address[] toUser = InternetAddress //Destinatario(s)
					.parse(builder.toString()); 
			
			return toUser;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		
	}
	/**
	 * 
	 * @param emails lista de enderecos dos emails
	 * @param assuntoEmail para ser enviado ao remetente
	 * @param corpoMensagem o texto do email em si
	 * @throws Exception
	 */
	public static void enviaEmail(List <String> emails, String assuntoEmail, String corpoMensagem) throws Exception {
		try {

			Message message = new MimeMessage(configurarEmail());
			message.setFrom(new InternetAddress(Constantes.EMAIL_ENDERECO_REMENTENTE)); //Remetente

			
			Address[] toUser = montarEmails(emails);
			 

			message.setRecipients(Message.RecipientType.TO, toUser);
			message.setSubject("E mail das");//Assunto
			message.setText("Enviei este email utilizando JavaMail");
			/**Metodo para enviar a mensagem criada*/
			Transport.send(message);

			System.out.println("Feito!!!");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
	

	
	
}
