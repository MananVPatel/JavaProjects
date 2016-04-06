/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mvp5542
 */
import java.util.Scanner;
public class GarageTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Garage info = new Garage();
      System.out.print("Enter number of hours(a negative 1 to quit): ");
      double numHours = input.nextDouble();
     do
      {
      System.out.printf("Current Charges: $%.2f", info.calculateCharges(numHours));
      System.out.printf(" Total Reciepts: $%.2f", info.getTotal());
      System.out.println();
      System.out.print("Enter number of hours(a negative 1 to quit: ");
      numHours = input.nextDouble();
      }while(numHours != -1);
      
    }
    
}


