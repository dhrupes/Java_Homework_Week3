package week3;

import java.util.Scanner;

public class Q13 {
    /*13. Write a Java program which input any number between 1 to 7 and it print The Days
name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
NOTE: if number is out of selection Print message “Week contains 1 to 7 days” */

    public static void main(String[] args) {


        int day =  4; // int is data type day is variable
        Scanner b = new Scanner(System.in); // INput
        System.out.println("Input Number = ");
        day= b.nextInt();

        switch(day){ // switch condition
            case 1:

                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Input");

        }
    }






}
