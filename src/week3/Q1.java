package week3;
/* 1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :) */
public class Q1 {

    public static void main(String[] args) {

        int num = 5; //instance vairable
        String Evenodd = (num % 2 == 0) ? "even" : "odd";//declare String vriable is even odd used tenary operator

        System.out.println("Number = " +num + " is " + Evenodd);
    }
}
