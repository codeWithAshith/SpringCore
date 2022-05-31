package com.codewithashith;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {

//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);

        emailClient.sendEmail("Hey, " + "This is my first email message.");

        AdvancedSpellChecker advancedSpellCheckerOne = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellCheckerOne);
        AdvancedSpellChecker advancedSpellCheckerTwo = applicationContext.getBean("advancedSpellChecker", AdvancedSpellChecker.class);
        System.out.println(advancedSpellCheckerTwo);

    }
}