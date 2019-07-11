package com.stackroute;
import java.util.Scanner;

public class Pallindrome {

    public static void main(String[] args) {
        int remain;
        int reverse = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
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
                System.out.println("The Number is Palindrome and the sum is less than 25");
            } else System.out.println("The Number is Palindrome and the sum is more than 25");
        } else System.out.println("The Number is not a palindrome");
    }}