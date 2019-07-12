package com.stackroute.pe1;
//1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6....nth iteration
import java.util.Scanner;
public class Loop {


    public int[] printer(int num){
        int size = 0;
        int index = 0;
        for (int i = 1; i <= num; i++) size += i;
        int[] resultArray = new int[size];
        for (int i = 1; i <= num; i++){
            for (int j = 0; j < i; j++) {
                resultArray[index] = i;
                index++;
            }
        }
        return resultArray;
    }
}