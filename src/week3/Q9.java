package week3;

import java.util.Scanner;

/*Same as above program-8 using switch statement.
*/
public class Q9 {
    public static void Alfaa() {
        char ch;
        Scanner a = new Scanner(System.in);
        System.out.println("input any alphabet = ");
        ch = a.next().charAt(0);

        switch (ch) { // Switch condiion
            case 'A':
                System.out.println("Anand\nAaroda\nAhanga\n");
                break;
            case 'B':
                System.out.println("Baroda\nBagdad\nBolton");
                break;
            case 'C':
                System.out.println("Changa\nChand\nChester");
                break;
            case 'D':
                System.out.println("Dabhan\nDorking\nDevon");
                break;
            case 'E':
                System.out.println("Eng\n Evon\nElon");
                break;
            case 'F':
                System.out.println("Frankfurt\nFlorida\nFlora");
                break;


            default:
                System.out.println("Invalid Output");
        }
    }

    public static void main(String[] args) {
        Alfaa(); // called Static method in to the main method
    }

}