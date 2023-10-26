package br.com.bb.amb.tecnotour.util;



import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.mail.MessagingException;

import br.com.bb.amb.tecnotour.constantes.Constantes;

/**
 * Created by IntelliJ IDEA.
 * User: Marcio Ballem
 * Date: 15/02/2011
 * Time: 11:20:06
 * To change this template use File | Settings | File Templates.
 */
public class MailTester {
    public static void main(String[] args) {
        MailJava mj = new MailJava();
        mj.setSmtpHostMail("smtp.gmail.com");
        mj.setSmtpPortMail("587");
        mj.setSmtpAuth("true");
        mj.setSmtpStarttls("true");
        mj.setUserMail(Constantes.EMAIL_ENDERECO_REMENTENTE);
        mj.setFromNameMail("Leonardo");
        mj.setPassMail(Constantes.EMAIL_SENHA_REMENTENTE);
        mj.setCharsetMail("ISO-8859-1");
        mj.setSubjectMail("JavaMail");
        mj.setBodyMail(htmlMessage());
        mj.setTypeTextMail(MailJava.TYPE_TEXT_HTML);

        Map<String, String> map = new HashMap<String, String>();
        map.put("leoaug1981@hotmail.com", "email hotmail");
        //map.put("destinatario2@msn.com", "email msn");
        //map.put("destinatario3@ig.com.br", "email ig");

        mj.setToMailsUsers(map);

        List<String> files = new ArrayList<String>();
        files.add("C:\\images\\ajax_loader.gif");
        files.add("C:\\images\\hover_next.png");
        files.add("C:\\images\\hover_prev.png");

        /* descomentar quando tiver arquivos para anexar
        mj.setFileMails(files);
         */
        try {
            EmailUtil2.senderMail(mj);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();  
        }
    }

    private static String textMessage() {
        return  "Leia o novo tutorial JavaMail do Programando com Java.\n" +
                "Saiba como enviar emails com anexo, em formato texto e html.\n" +
                "Envie seu email para mais de um destinatario.";
    }

    private static String htmlMessage() {
        return  "<html> \n" +
                "\t<head>\n" +
                "\t\t<title>Email no formato HTML com Javamail!</title> \n" +
                "\t</head> \n" +
                "\t<body> \n" +
                "\t\t<div style='background-color:orange; width:28%; height:100px;'>\n" +
                "\t\t\t<ul>  \n" +
                "\t\t\t\t<li>Leia o novo tutorial JavaMail do Programando com Java.</li> \n" +
                "\t\t\t\t<li>Aprenda como enviar emails com anexos.</li>\n" +
                " \t\t\t\t<li>Aprenda como enviar emails em formato texto simples ou html.</li> \n" +
                "\t\t\t\t<li>Aprenda como enviar seu email para mais de um destinatario.</li>\n" +
                "\t\t\t</ul> \n" +
                "\t\t\t<p>Visite o blog \n" +
                "\t\t\t\t<a href='http://mballem.wordpress.com/' target='new'>Programando com Java</a>\n" +
                "\t\t\t</p>\n" +
                "\t\t</div>\t\n" +
                "\t\t<div style='background-color:FFFFF; width:28%; height:50px;' align='center'>\n" +
                "\t\t\tDownload do JavaMail<br/>\n" +
                "\t\t\t<a href='http://www.oracle.com/technetwork/java/javaee/index-138643.html'>\n" +
                "\t\t\t\t<img src='http://www.oracleimg.com/admin/images/ocom/hp/oralogo_small.gif'/>\n" +
                "\t\t\t</a> \n" +
                "\t\t</div>\t\t\n" +
                "\t</body> \n" +
                "</html>";
    }
}
