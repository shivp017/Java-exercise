package com.stackroute;
//evenorodd
import java.util.Scanner;

public class Evenodd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num>20 && num<30){
        if (num % 2 == 0) {
            System.out.println("tom");

        } else {
            System.out.println("jerry");
        }

    }else
            System.out.println("number is not between 20 and 30");
}}