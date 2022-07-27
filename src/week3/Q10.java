package week3;

import java.util.Scanner;

/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)*/
public class Q10 {
    public static void find() // Static method
    {
        int a; // datatype is integer and a is varibale
        int b; char ch;
        Scanner inn = new Scanner(System.in);
        System.out.println("Enter number1=");
        a  = inn.nextInt();
        System.out.println("Enter number2=");
        b =inn.nextInt();
        System.out.println("Enter any operator (+,-,/,*) = ");
        ch =inn.next().charAt(0);

        if(ch== '+') {

            System.out.println("Addition of two number is=" + (a+b));
        }

         else if (ch=='-') {
            System.out.println("substraction of two number is=" +(a-b));
        }
        else if (ch=='*') {
            System.out.println("Multiplication of two number is=" +(a*b));
        }
        else if (ch=='/') {
            System.out.println("substraction of two number is=" +(a/b));
        }
        else{
            System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {
        find();

    }

}
