package week3;
/*
Write a java program to input any number and find out if it’s odd or even */

import java.util.Scanner;
public class Q6 {

        public static void main(String[] args)

        {
             Oddeven(); // Static method in to the main method
        }
            static void Oddeven(){ // Static method
            int num; // Datatype is integer and num is variable
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the number you want to check:"); // Input the number
            num = s.nextInt();
            if(num % 2 == 0) // If else condition
            {
                System.out.println("The given number "+num+" is Even ");
            }
            else
            {
                System.out.println("The given number "+num+" is Odd ");
            }
        }
    }

