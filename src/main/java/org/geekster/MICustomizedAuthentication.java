package org.geekster;

import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MICustomizedAuthentication extends Authenticator {
    protected PasswordAuthentication getPasswordAuthentication()
    {
        return new PasswordAuthentication(MIMetaData.myUserMail,MIMetaData.password);
    }
}
