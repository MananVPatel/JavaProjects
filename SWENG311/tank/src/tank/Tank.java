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
public class Tank {

    
    private static String purpose;
    private static double tankCapacity = 1500;
    
    public double Check()
    {
        return tankCapacity;
    }
    
    public double Retrieve(double amount, String purpose)
    {
        if((purpose.equals("F") || purpose.equals("f")) && (amount <= tankCapacity*.30))
        {
            tankCapacity = tankCapacity-amount;
        }
        else if((purpose.equals("D") || purpose.equals("d")) && (amount <= tankCapacity*.15))
        {
            tankCapacity = tankCapacity-amount;
        }
        else if((purpose.equals("S") || purpose.equals("s")) && (amount <= tankCapacity*.55))
        {
            tankCapacity = tankCapacity-amount;
        }
        else 
        {
            System.out.println("Exceeded the allowable Percentage Limit for this use!");
        }
        return tankCapacity;
    }  
}

    