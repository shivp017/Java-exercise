package com.stackroute;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[])
    {
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        s = sc.nextLine();

        String temp = "";

        int length = s.length();

        for (int i = length - 1; i >= 0; i--)
        {
            temp = temp + s .charAt(i);
        }

        System.out.println("String before reversing: " + s);
        System.out.println("String after reversing: " + temp);
    }
}

