/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 */
package complextest;

/**
 * People that helped me with this project: Dr. Ibrahim, Travis Rooney 
 * @author mvp5542
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class ComplexTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
    //Select an operation
      System.out.print("Desired Operation or q -> quit(m = mult, a = add, s = sub): ");
      String choice = input.next();
        Complex a = new Complex();
        Complex b = new Complex();
        
        

    // create do while so user can input when to quit the loop    
    do
    { 
      
      int state;
      int i=0;
    //verify choice is accurate
     while(!((choice.equals("a"))||(choice.equals("s"))||(choice.equals("m"))||(choice.equals("S"))||(choice.equals("M"))||(choice.equals("A"))))
        {
            
     if (i>=1)
     {
            System.out.println("Invalid Input!");
     }
            System.out.print("Please re-enter desired operation or q -> quit(m = mult, a = add, s = sub): ");
        choice = input.next();
        i++;
        }
       
       
  
        do{
         //intialize variable so value is replaced to 1 with every iteration
            state = 1;
            
        try{
            System.out.print("Enter a Real and a Imaginary Number for A: ");
            //enter values for A
            float realA = input.nextFloat();
            float imagA = input.nextFloat();
            //set values of A
            a.setReal(realA);
            a.setImaginary(imagA);
        }
        catch(InputMismatchException e)
        {
            System.out.printf("Error! Invalid Type! %n");
            input.next();
            state = 0;
        }
        }while(state == 0);
        
        
        do{
          //intialize variable so value is replaced to 1 with every iteration
            state = 1;
   
        try
        {
            System.out.print("Enter a Real and a Imaginary Number for B: ");

        // enter values for B
            float realB = input.nextFloat();
            float imagB = input.nextFloat();

        //set values
            b.setReal(realB);
            b.setImaginary(imagB);
        }
        
        catch(InputMismatchException e)
        {
            System.out.printf("Error! Invalid Type! %n");
            input.next();
            state = 0;
        }
        }while(state == 0);      
        
    
    //create a class instance to catch the returned values calculated in class Complex
        Complex result = new Complex();
      
      
    switch(choice){  
        case "a": 
        //add a & b and place the result in class instance variable result
            result = a.addComp(b);
            System.out.printf("A + B = ");
            a.printMethod();
        break; 
        
        case "s":
        //subtract a & b and place the result in class instance variable result
            result = a.subComp(b);
            System.out.printf("A - B = ");
            a.printMethod();
        break;
        
        case "m":
        //mult a & b and place the result in class instance variable result
            result = a.multComp(b);
            System.out.printf("A * B = ");    
            a.printMethod();
        break;
        } 
    
        System.out.println();
        
        //Select an operation
        System.out.print("Desired Operation or q -> quit(m = mult, a = add, s = sub): ");
        choice = input.next();
       
     
    }while(!choice.equals("q"));    
           
  }
}


