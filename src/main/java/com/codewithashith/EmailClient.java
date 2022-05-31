package com.codewithashith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
class EmailClient {
//    @Autowired
//    @Qualifier("basicSpellChecker")
//    private SpellChecker spellChecker;
    private SpellChecker spellChecker;

    public EmailClient(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
    }
}