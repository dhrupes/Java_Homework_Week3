package week3;

import sun.security.util.Length;

import java.util.Scanner;

public class Q3 {
    /* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
*/
  public static void sheet() {
  // Programme is not runnig as per request.
      int no,maths, science, english, total; // Integer datatype with multiple Variable
      String name; // String datatype with variable name.
      double percentage; // double datatype with variable percentage
      String p="pass",fail; // datatype with string and p is vaiable
      System.out.println("Student Name: "); //Input name
      Scanner b = new Scanner(System.in);
       name = b.next();
      System.out.println("Roll no: "); // Input roll no
       no =b.nextInt();
      System.out.println("maths: "); // Input maths marks
      maths = b.nextInt();
      System.out.println("Science: "); // Input science marks
      science= b.nextInt();
      System.out.println("English: "); //input english marks
      english = b.nextInt();

      if(maths>=0 && maths<=100 && science>=0 && science<=100 && english>=0 && english<=100){

          System.out.println("Total: " +(maths+science+english));
          total=maths+science+english;
          percentage=(total/300.0d)*100;
          System.out.println("Percentage = " +percentage +"%");
          if(percentage>=35){
              System.out.println("Result = " +p);
              if(percentage>=80){
                  System.out.println("Grade= A+");}

                  else if(percentage>=60){
                      System.out.println("Grade = A");}

                      else if(percentage>=50){
                      System.out.println("Grade = B");}
                       else if (percentage>=35){
                  System.out.println("Grade = C");
              }



          }
           else {
              System.out.println("Result = fail");


          }
          System.out.println("-------------------------------");
          System.out.println("|                             |");
          System.out.println("|        Marksheet            |");
          System.out.println("|                             |");
          System.out.println("-------------------------------");
          System.out.println("|  Name:              "+ name+"   |");
          System.out.println("|  Roll number:         "+no+"     |");
          System.out.println("-------------------------------");
          System.out.println("| Subject              Marks   |");
          System.out.println("|                              |");
          System.out.println("-------------------------------");
          System.out.println("|  Maths:             "+maths+"       |");
          System.out.println("|  Science:           "+science+"        |");
          System.out.println("|  English:           "+english+"       |");
          System.out.println("|                             |");
          System.out.println("-------------------------------");
          System.out.println("|  Total:           "+total+"     |");
          System.out.println("|                             |");
          System.out.println("-------------------------------");
          System.out.println("| Percentage:        "+percentage+"% |");
          System.out.println("| Result:            "+p+"|");
          System.out.println("| Grade:                            |");
          System.out.println("|                             |");
          System.out.println("-------------------------------");

      }
      else if(maths>100 || science>100 || english>100)
      {
          System.out.println("Invalid number");
      }
      else{      }

  }

    public static void main(String[] args) {
        sheet();
    }
}
