package week3;

import java.util.Scanner;

public class Q20 {


    /*
    20. Write a Java program to test if an array contains a specific value.
    */


public static void Contains() {
  int[] arr= {100,200,300,400,500,600};
   int value;
    Scanner b = new Scanner(System.in);
    System.out.println("Enter no");
    value = b.nextInt();

  for(int i:arr){
      if (i==value) {
          System.out.println("Array Contains specific value");
      }


  }

  }





    public static void main(String[] args) {
        Contains();
    }



}