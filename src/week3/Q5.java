package week3;

import java.sql.SQLOutput;
import java.util.Scanner;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
-----------------------------
| Salary Slip               |
|---------------------------|
| Employee Id : 2564        |
| Employee Name : Jay       |
|---------------------------|
| Basic Salary : 25000.0    |
| HRA 10% : 2500.0          |
| TA 8% : 2250.0            |
| DA 9% : 2000.0            |
| PF - 20& : 5000.0         |
|---------------------------|
| Gross Salary : 26750.0    |
|===========================|  */
public class Q5 {

    public static void salary() {
       int id,hra,bs,da,ta,pf,gs; // interger datatype used multiple variable
       String name; // data type is string and name is variable.
        Scanner i = new Scanner(System.in);
        System.out.println("Employee id = "); //Input emp id
        id = i.nextInt();
        System.out.println("Emplyee Name=");//input name
        name = i.next();
        System.out.println("Basic Salary="); // salary
        bs= i.nextInt();
        hra=(bs*10/100);
        da=(bs*8/100);
        ta=(bs*9/100);
        pf=(bs*20/100);
        gs=(bs+hra+ta+da-pf);


        System.out.println("-----------------------------");
        System.out.println("| Salary Slip               |");
        System.out.println("|---------------------------|");
        System.out.println("| Employee Id       :"+id+"   |");
        System.out.println("| Employee Name    :"+name+"|");
        System.out.println("|---------------------------|");
        System.out.println("| Basic Salary      :"+bs+" |");
        System.out.println("| HRA 10%           : "+hra+"  |");
        System.out.println("| TA 8%             : "+ta+"  |");
        System.out.println("| DA 9%             : "+da+"  |");
        System.out.println("| PF - 20&          : "+pf+"  |");
        System.out.println("|---------------------------|");
        System.out.println("| Gross Salary      : "+gs+" |");
        System.out.println("|===========================|");




    }

 public static void main(String[] args) {

     salary();//calling static method in to main method
 }
}