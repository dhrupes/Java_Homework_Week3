package week3;

import java.util.Scanner;

public class Q12 {
/*  12. Write a program that tells us input value is number or an alphabet or symbol.*/

 public static void  keyword()
    {
        char chr; //Data type is character and chr is variable
        Scanner d = new Scanner(System.in);
        System.out.println("Input Value = "); // input value
         chr = d.next().charAt(0);

          if(chr>='a' && chr<='z' || chr>='A' && chr<= 'Z') {  // if else if condition
              System.out.println("Alphabets");
          }
          else if (chr>='0' && chr <='9') {
        System.out.println("Numbers");

    }
          else{
              System.out.println("All other characters are Symbol");

          }
    }

    public static void main(String[] args) {

     keyword(); // Static method in to the main method
    }

}
