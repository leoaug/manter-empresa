package br.com.bb.amb.tecnotour.util;



import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: Marcio Ballem
 * Date: 15/02/2011
 * Time: 10:32:17
 * To change this template use File | Settings | File Templates.
 */
public class EmailUtil2 {

    //cria as propriedades necessarias para o envio de email
    public static void senderMail(final MailJava mail) throws UnsupportedEncodingException, MessagingException  {

        Properties props = new Properties();
        props.setProperty("mail.transport.protocol", "smtp");
        props.setProperty("mail.host", mail.getSmtpHostMail());
        props.setProperty("mail.smtp.auth", mail.getSmtpAuth());
        props.setProperty("mail.smtp.starttls.enable", mail.getSmtpStarttls());
        props.setProperty("mail.smtp.port", mail.getSmtpPortMail());
        props.setProperty("mail.mime.charset", mail.getCharsetMail());

        //System.setProperty("java.net.preferIPv4Stack", "true");
        
        //nao usar props.setProperty("mail.smtp.ssl.enable", "true"); // rola a exception:
        //trying to connect to host "smtp.gmail.com", port 587, isSSL true
        //javax.mail.MessagingException: Could not connect to SMTP host: smtp.gmail.com, port: 587;
        //nested exception is: javax.net.ssl.SSLException: Unrecognized SSL message, plaintext connection?


        // classe anonima que realiza a autenticacao do usuario no servidor de email.
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(mail.getUserMail(), mail.getPassMail());
            }
        };

        // Cria a sessao passando as propriedades e a autenticacao
        Session session = Session.getDefaultInstance(props, auth);
        // Gera um log no console referente ao processo de envio
        session.setDebug(true);

        //cria a mensagem setando o remetente e seus destinatarios
        Message msg = new MimeMessage(session);

        try {
            //aqui seta o remetente
            msg.setFrom(new InternetAddress(mail.getUserMail(), mail.getFromNameMail()));
            boolean first = true;
            for (Map.Entry<String, String> map : mail.getToMailsUsers().entrySet()) {
                if (first) {
                    //setamos o 1 destinatario
                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress(map.getKey(), map.getValue()));
                    first = false;
                } else {
                    //setamos os demais destinatarios
                    msg.addRecipient(Message.RecipientType.CC, new InternetAddress(map.getKey(), map.getValue()));
                }
            }
            // Adiciona um Assunto a Mensagem
            msg.setSubject(mail.getSubjectMail());

            // Cria o objeto que recebe o texto do corpo do email
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setContent(mail.getBodyMail(), mail.getTypeTextMail());

            // Monta a mensagem SMTP  inserindo o conteudo, texto e anexos
            if(mail.getFileMails() != null){
            	Multipart mps = new MimeMultipart();
            	for (int index = 0; index < mail.getFileMails().size(); index++) {

            		// Abre e anexa o arquivo
            		MimeBodyPart attachFilePart = new MimeBodyPart();
            		FileDataSource fds = new FileDataSource(mail.getFileMails().get(index));
            		attachFilePart.setDataHandler(new DataHandler(fds));
            		attachFilePart.setFileName(fds.getName());

            		//adiciona os anexos da mensagem
            		mps.addBodyPart(attachFilePart, index);

            	}

            	//adiciona o corpo texto da mensagem
            	mps.addBodyPart(textPart);

            	//adiciona a mensagem o conteudo texto e anexo
            	msg.setContent(mps);
            }
            // Envia a Mensagem
            Transport.send(msg);

        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

}

