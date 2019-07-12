package com.stackroute.pe1;

import java.util.Random;
import java.util.Scanner;

public class Numberguess {


    public static void main(String[] args) {
       Random rand =new Random();
       int y=1;
       int x=rand.nextInt(100);

        Scanner sc = new Scanner(System.in);


        do{
            System.out.println("guess th no");
            y=sc.nextInt();

        if (y<x) System.out.println("Number guessed is less than original number");
        else if(y>x)System.out.println("Number guessed is more  than original number");
         else System.out.println("Number guessed is matched than original number");
        }
        while ( y != 0);


}}


