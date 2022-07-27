package week3;

import java.util.Scanner;

public class Q16 {
    /*
    16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”  */
    public static void num() {
        int a; // data type is integer and a is variable
        Scanner d = new Scanner(System.in);
        System.out.println("Input Value = "); //  enter value
        a = d.next().charAt(0);


        if (a >= 1) {  // if else if condtion
            System.out.println("Positive Number");

        } else if (a == '0') {
            System.out.println("Zero Number");
        }
        else if (a >0) {
          System.out.println("Negative Number");
        }
        else{
            System.out.println("invalid character");
        }
    }

    public static void main(String[] args) {
        num();  //Static method in to the main method
    }
}
