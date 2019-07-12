package com.stackroute.pe1;
//check wheather the char is capital or small

import java.util.Scanner;

public class Capitalletter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");

        char c = sc.next().charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println("Character is a capital letter");
        } else if(c >= 97 && c <= 122){
            System.out.println("Character is a Small letter");
        }

    }}
