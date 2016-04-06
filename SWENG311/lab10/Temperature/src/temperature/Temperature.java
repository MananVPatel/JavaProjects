/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperature;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

/**
 *
 * @author mvp5542
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //set condition for execution purposes
        int condition = 0;
        
        while(condition == 0)
        {
            //input Validation and fault tolerance
        try
        {
            //input strings
            String inputUnit = JOptionPane.showInputDialog("Enter the Unit");
            
            String temperature = JOptionPane.showInputDialog("Enter the Temperature");
             
            //convert string to double
            double temp = Double.parseDouble(temperature);
            
            //determine what needs to be calculated depending on inputUnit
            switch (inputUnit) {
            case "C":
                double celsius = (5/9.0) * ((temp - 32));
                JOptionPane.showMessageDialog(null, "The Temperature is " + celsius + " C", "Temperature Converted to Celsius", JOptionPane.PLAIN_MESSAGE);
                condition = 1;
                break;
            case "F":
                double fahrenheit = 32 + ((9*temp)/5);
                JOptionPane.showMessageDialog(null, "The Temperature is " + fahrenheit + " F", "Temperature Converted to Fahrenhiet", JOptionPane.PLAIN_MESSAGE);
                condition = 1;
                break;
            default:
                JOptionPane.showMessageDialog(null, "The Temperature Unit entered is invalid!" , "Temperature Converted to Fahrenhiet", JOptionPane.PLAIN_MESSAGE);
                break;
        }
        }
        //catch the error and ask again to enter the correct info
        catch(NumberFormatException e)
        {
          JOptionPane.showMessageDialog(null, "Invalid Input! Please Enter Numbers for Temperature! ", "Invalid Input",JOptionPane.ERROR_MESSAGE);
        }
        }
       
        }

    }
    

