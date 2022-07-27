package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q7 {
/*
    Write a java program input sales id, seller's name, sales amount, and salary basic and
    then find this sales Commission
    Sales amount >= 50,000 35%
    Sales amount >= 30,000 20%
            >= 20,000 10%
            >= 10,000 5%
            < 10,000 2%  */


     public static void Sales() // static method
     {

          int  ID , amount,basic; String name;
          Scanner d = new Scanner(System.in);
          System.out.println("Sales ID = ");
          ID = d.nextInt();
          System.out.println("Saller's name= ");
          name = d.next();
          System.out.println("sales amount= ");
          amount = d.nextInt();
          System.out.println("salary basic = ");
          basic = d.nextInt();

        if(amount>=50000) {
             System.out.println( "35% Sales Commission= " + (amount*35/100));
        }
        else if(amount >= 30000){
             System.out.println("20% Sales commission= " +(amount*20/100));
        }
        else if(amount >= 20000){
             System.out.println("10% Sales commission= " +(amount/10));
        }
        else if(amount >= 10000){
            System.out.println("5% Sales commission= " +(amount/5));
        }

        else if (amount < 10000){
            System.out.println("2% Sales commission= " +(amount/2));
        }
        else {

        }




     }

     public static void main(String[] args) { //main method

          Sales(); // called Static method in to the main method
     }


}
