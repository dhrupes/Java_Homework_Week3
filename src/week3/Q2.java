package week3;
/* Write a java program to input any year like (ex.2007) and find out if it is leap year or
not? */

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        int year; //variable
        System.out.println("Enter a Year = "); //Innput year
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) // If else condion
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
    }
}
