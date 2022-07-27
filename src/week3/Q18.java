package week3;

import java.util.Arrays;

public class Q18 {

    /*
    18. Write a Java program to sum values of an array.


    */

    public static void sum()
    {
        int[] array ={12,14,16,18,20};
        int sum=0;

        System.out.println("Input of array numbers= " + Arrays.toString(array));
        for(int i=0;i<array.length;i++)
        {
            sum= sum+array[i];
        }
        System.out.println("Sum value of array = "+ sum);

    }

    public static void main(String[] args) {
        sum(); // Static method in to the main method
    }
}
