package com.stackroute.pe1;



public class ReverseString {
    String revstr = "";

    public String reverseString(String str) {
        int length = str.length();

        for (int i = length - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }
        return revstr;
    }


    public String same(String str) {
        return str;

    }
}

