package com.stackroute.pe1;
//check wheather the char is capital or small

import java.util.Scanner;

public class Capitalletter {
    public String letterChecker(char inputCharacter){
        String letterType = "";
        if (Character.isAlphabetic(inputCharacter)) {
            if (Character.isUpperCase(inputCharacter)) {
                letterType = "Capital letter";
            } else if (Character.isLowerCase(inputCharacter)) {
                letterType = "Lowercase letter";
            }
        }
        else if (Character.isDigit(inputCharacter)){
            letterType = "Digit";
        }
        else {
            letterType = "Special symbol";
        }

        return letterType;
    }

}
