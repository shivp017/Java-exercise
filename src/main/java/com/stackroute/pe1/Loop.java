package com.stackroute.pe1;
//1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6....nth iteration
import java.util.Scanner;
public class Loop {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }

                   }
         }

    }
