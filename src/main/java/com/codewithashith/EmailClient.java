package com.codewithashith;

class EmailClient {
    private SpellChecker spellChecker;

//    public EmailClient(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    void sendEmail(String emailMessage) {
        spellChecker.checkSpelling(emailMessage);
        //send email
    }
}