package com.stackroute.pe1;

//sum of numbers input number
import java.util.Scanner;

public class Addnumbers {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

         int sum=0,num;
       do
        {   System.out.println("Enter Number ");
            num = sc.nextInt();
            sum+=num;
        }while (num!=0);
       System.out.println(sum);

    }

}
