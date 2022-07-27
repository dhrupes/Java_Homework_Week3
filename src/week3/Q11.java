package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q11 {
    /*
    11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.*/


    public static void num() // Static method
    {

        System.out.println("\nNumber Divided by 3\n");
        for(int i = 1;i<=100; i++) // for loop
        {
            if(i%3==0)
            System.out.print(i+ ",");
        }}
        public static void num1(){  // used static  method
            System.out.println("");
        System.out.println("\nNumber divided by 5\n");
        for(int i = 1;i<=100; i++)  // for loop
        {
            if(i%5==0)
                System.out.print(i+ ",");
        }
            }


    public static void main(String[] args) {  // Main method
        num(); // Static method in to the main method
        num1();// Static method in to the main method
    }
    }



