package week3;

import java.util.Arrays;

public class Q17 {
/*
17. Write a Java program to sort a numeric array and a string array.
*/

 public static void sort()
 {
  int[] array1 = {5,10,15,100,98,35,40,56,67,23,28,18}; //  integer with array
  String[] array2={"hello","kilo","metre","inch","centimetre","pound"}; // string with array

  System.out.println("Input numeric array:-" + Arrays.toString(array1));
  Arrays.sort(array1);
  System.out.println("sorted output:-" +Arrays.toString(array1));

  System.out.println("Input string array:-" + Arrays.toString(array2));
  Arrays.sort(array2);
  System.out.println("sorted output:-" +Arrays.toString(array2));

 }


 public static void main(String[] args) {
  sort(); //// Static method in to the main method
 }

}
