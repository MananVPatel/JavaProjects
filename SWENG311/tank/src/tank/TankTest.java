/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tank;

/**
 *
 * @author mvp5542
 */
import java.util.Scanner;
public class TankTest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Tank John = new Tank();
        Tank Mary = new Tank();
       
       
        System.out.printf("Enter Purpose(F = flowering, D = drinking, S = showering): ");
       String choice = input.nextLine();
        while(!(choice.equals("F") || choice.equals("S") || choice.equals("D") || choice.equals("d") || choice.equals("s") || choice.equals("f")))
        {
            System.out.printf("ReEnter Purpose(F = flowering, D = drinking, S = showering): ");
            choice = input.nextLine();
        }
        
        System.out.printf("Enter amount of Water Needed: ");
        double amount = input.nextDouble();
        John.Retrieve(amount, choice);
        
        System.out.printf("Tank Balance: %.2f ",John.Check());
        System.out.println();
        
        
        System.out.printf("Enter Purpose(F = flowering, D = drinking, S = showering): ");
        choice = input.next();
        
       while(!(choice.equals("F") || choice.equals("S") || choice.equals("D") || choice.equals("d") || choice.equals("s") || choice.equals("f")))
        {
            System.out.printf("ReEnter Purpose(F = flowering, D = drinking, S = showering): ");
            choice = input.nextLine();
        }
        
        System.out.printf("Enter amount of Water Needed: ");
        amount = input.nextDouble();
        Mary.Retrieve(amount, choice);
        
        System.out.printf("Tank Balance: %.2f ", Mary.Check());
        System.out.println();
        
        
        System.out.printf("Enter Purpose(F = flowering, D = drinking, S = showering): ");
        choice = input.next();
        
        while(!(choice.equals("F") || choice.equals("S") || choice.equals("D") || choice.equals("d") || choice.equals("s") || choice.equals("f")))
        {
            System.out.printf("ReEnter Purpose(F = flowering, D = drinking, S = showering): ");
            choice = input.nextLine();
        }
        
        System.out.printf("Enter amount of Water Needed: ");
        amount = input.nextDouble();
        John.Retrieve(amount, choice);
        
        System.out.printf("Tank Balance: %.2f ",John.Check());
        System.out.println();
        
       
        
       
    }    
}
