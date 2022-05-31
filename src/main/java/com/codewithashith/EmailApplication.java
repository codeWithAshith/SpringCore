package com.codewithashith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);

        EmailClient emailClient = new EmailClient(new BasicSpellChecker());

        emailClient.sendEmail("Hey, " + "This is my first email message.");

    }
}