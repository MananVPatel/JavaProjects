/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author mvp5542
 */
import java.util.Scanner;

public class WorkerTest {
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);   
   
     
     System.out.printf("Worker 1: ");
     String fname = input.nextLine();
    
     
     System.out.print("");
     String lname = input.nextLine();
     
     
     System.out.println("Yearly Salary: ");
     double monthlySalary = input.nextDouble();
     
     System.out.println("");
     
     System.out.printf("Worker 2: ");
     String fname2 = input.next();
    
     
     System.out.print("");
     String lname2 = input.next();
     
     
     System.out.println("Yearly Salary: ");
     double monthlySalary2 = input.nextDouble();
     
     
     Worker worker1 = new Worker(fname, lname, monthlySalary);
     Worker worker2 = new Worker(fname2, lname2, monthlySalary2);
     
     worker1.setFName(fname);
     worker1.setLName(lname);
     worker1.setMonthlySalary(monthlySalary);
    
    
     worker2.setFName(fname2);
     worker2.setLName(lname2);
     worker2.setMonthlySalary(monthlySalary2);
     
     System.out.println("Increasing Worker Salaries by 10%");
     
     monthlySalary = monthlySalary + (monthlySalary*0.10);
     monthlySalary2 = monthlySalary2 +(monthlySalary2*0.10);
     
     System.out.printf("Worker 1: %s%n", worker1.getFName());
     System.out.printf("%s%n%n", worker1.getLName());
     System.out.printf("Yearly Salary: %.2f%n", monthlySalary);
     
     System.out.println("");
     
     System.out.printf("Worker 1: %s%n", worker2.getFName());
     System.out.printf("%s%n%n", worker2.getLName());
     System.out.printf("Yearly Salary: %.2f%n", monthlySalary2);
     
     
    }
    
}

/*
run:
Worker 1: Bob
Jones
Yearly Salary: 
55000

Worker 2: Susan 
Barker
Yearly Salary: 
37809.00
Increasing Worker Salaries by 10%
Worker 1: Bob
Jones

Yearly Salary: 60500.00

Worker 1: Susan
Barker

Yearly Salary: 41589.90

*/
