package org.geekster;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class MIMailHandler {
    void sendMail() {
        Properties sysProperties = System.getProperties(); //this gives me a hash-map/ hash-table

        System.out.println(sysProperties);

        sysProperties.put("mail.smtp.host",MIMetaData.HostServer);
        sysProperties.put("mail.smtp.port",MIMetaData.port);
        sysProperties.put(MIMetaData.sslProperty,"true");
        sysProperties.put(MIMetaData.authPerm,"true");


        //create a session using sender-email and password
        Authenticator mailAuthenticator = new MICustomizedAuthentication();
        Session mailSession = Session.getInstance(sysProperties,mailAuthenticator);

        //mime message build

        MimeMessage mailMessage = new MimeMessage(mailSession);

        try {
            mailMessage.setFrom(MIMetaData.myUserMail);
            mailMessage.setSubject("This is my java code testing in WeeklyTest on Sunday");
            mailMessage.setText("Hey this is me who is trying to send mail using java in the weekly test for the testing purpose");
            //set the receiver

            Address receiverEmail = new InternetAddress(MIMetaData.receiverMail);
            mailMessage.setRecipient(Message.RecipientType.TO, receiverEmail);

            Transport.send(mailMessage);
        }
        catch(Exception mailException) {
            System.out.println(mailException.toString());
        }

    }
}
