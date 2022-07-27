package week3;

/*
19. Write a Java program to calculate the average value of array elements.*/

import java.util.Arrays;

public class Q19 {

    public static void sum() // Static method
    {
        int[] array ={12,14,16,15,22};//Declare multiple array
        int sum=0;//Declare variable using integer
        double avg;//Declare variable using double

        System.out.println("Input of array numbers= " + Arrays.toString(array));
        for(int i=0;i<array.length;i++) //for loop

            sum= sum+array[i];// i is index number
             avg= sum/ array.length;

        System.out.println("Sum value of array = "+ avg);

    }

    public static void main(String[] args) {

        sum();// Static method in to the main method
    }
}

