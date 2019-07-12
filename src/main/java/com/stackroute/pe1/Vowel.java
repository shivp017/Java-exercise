package com.stackroute.pe1;

import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character : ");

       String c;
        c = scanner.next();

        int length = c.length();

       for(int i=0;i<length;i++){
        switch(c.charAt(i))
        {
            case  'a' :
            case 'e'  :
            case 'i'   :
            case 'o'  :
            case 'u'  :
            case  'A' :
            case 'E'  :
            case 'I'   :
            case 'O'  :
            case 'U'  :System.out.print("vowel");
                break;
            default :
                System.out.print("const");


        }



    }
}}