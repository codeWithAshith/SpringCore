package com.codewithashith;

public class AdvancedSpellChecker implements SpellChecker {

    public void checkSpelling(String emailMessage) {
        if (emailMessage != null) {
            System.out.println("Checking Spelling using Advanced Spell Checker..");
            System.out.println("Spell Checking Completed!!");
        } else {
            throw new RuntimeException("An exception occurred while checking Spelling");
        }
    }
}
