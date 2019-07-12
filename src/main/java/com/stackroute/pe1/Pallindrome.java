package com.stackroute.pe1;


public class Pallindrome {

    public String pallindromesum(int x) {
        int remain;
        int reverse = 0;
        int sum = 0;

        String s = "";


        int temp = x;
        while (temp != 0) {
            remain = temp % 10;
            reverse = (reverse * 10) + remain;
            if (remain % 2 == 0) {
                sum += remain;
            }
            temp /= 10;
        }
        if (reverse == x) {
            if (sum < 25) {
                s = "Input is pallindrome & lesser than 25";

            } else s = "Input is pallindrome & More than 25";
        } else s = "The Number is not a palindrome";
        return s;
    }
}