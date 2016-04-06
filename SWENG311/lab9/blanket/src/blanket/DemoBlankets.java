/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blanket;

/**
 *
 * @author mvp5542
 */
public class DemoBlankets {
    
   public static void main(String[] args) {
       
     //create a few different objects for Blanket class
     Blanket bla1 = new Blanket("double", "red", "wool");
     Blanket bla2 = new Blanket("king", "yellow", "cashmere");
     Blanket bla3 = new Blanket("queen", "orange", "wool");
     Blanket bla4 = new Blanket("twin", "white", "cotton");
     
     //create an array to print info about each object
     Blanket[] printInfo;
     printInfo = new Blanket[4];
     
     //assign objects to each array element
     printInfo[0] = bla1;
     printInfo[1] = bla2;
     printInfo[2] = bla3;
     printInfo[3] = bla4;
  
     //create a few different objects for ElectricBlanket class
     ElectricBlanket eBla1 = new ElectricBlanket(2, true);
     ElectricBlanket eBla2 = new ElectricBlanket(3, false);
     ElectricBlanket eBla3 = new ElectricBlanket(6, true);
     ElectricBlanket eBla4 = new ElectricBlanket(-1, false);
     
     //create an array to print the objects
     ElectricBlanket[] printInfoE = new ElectricBlanket[4];
     
     //assign objects to each elements of the array
     printInfoE[0] = eBla1;
     printInfoE[1] = eBla2;
     printInfoE[2] = eBla3;
     printInfoE[3] = eBla4;
  
     
     //print info
     for(int i = 0; i < 4; i ++)
     {
         System.out.println(printInfo[i].toString());
     }
     
     for(int i = 0; i < 4; i ++)
     {
         System.out.println(printInfoE[i].toString());
     }
     
             
     
       
   }

    
}
