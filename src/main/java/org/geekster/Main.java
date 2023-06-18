package org.geekster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);

        System.out.println("Starting to Mail using Java");
        MIMailHandler mailHandler = new MIMailHandler();
        mailHandler.sendMail();

    }
}