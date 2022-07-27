package week3;

/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class Q8 {

public static void Alfa() // Static method
    {
        char ch; // Datatype is character and ch is variable
        Scanner a = new Scanner(System.in);
        System.out.println("input any alphabet = " ); // input any alphabet
         ch = a.next().charAt(0);

        if(ch=='A'|| ch=='a') {  // If else if condition
            System.out.println("Anand\nAaroda\nAhanga\n");

        }

        else if(ch=='B'|| ch=='b') {
            System.out.println("Baroda\nBagdad\nBolton");

        }
        else if(ch=='C'|| ch=='c')
        {
            System.out.println("Changa\nChand\nChester");
        }
        else if(ch=='D'||ch=='d')
        {
            System.out.println("Dabhan\nDorking\nDevon");
        }
        else if(ch=='E'||ch=='e')
        {
            System.out.println("Eng\n Evon\nElon");
        }
        else if(ch=='F'|| ch=='f')
        {
            System.out.println("Frankfurt\nFlorida\nFlora");
        }
        else {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) { // main method
        Alfa();// called Static method in to the main method
    }

}
