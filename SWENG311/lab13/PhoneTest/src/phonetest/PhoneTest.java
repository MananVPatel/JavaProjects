/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonetest;

/**
 *
 * @author mvp5542
 */
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneTest {

    /**
     * @param args the command line arguments
     */
    private static Formatter output;
    private static final char[][] charArray = new char[][]{{'A', 'B', 'C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'},{'J', 'K', 'L'}, {'M', 'N', 'O'}, {'P', 'R', 'S'}, { 'T', 'U', 'V'}, {'W', 'X', 'Y'}};
    
    public static void main(String[] args) {
     
        openFile();
        addRecords();
        closeFile();
   }
    
    //open file phone.txt
    public static void openFile()
    {
        try 
        {
            output = new Formatter("phone.txt"); //create/open the file
        }
        catch(SecurityException securityException)
        {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); //terminate the program
        }
        catch(FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); //terminate the program
        }
      
    }
    
    //add contents to phone.txt
    public static void addRecords()
    {
     Scanner input = new Scanner(System.in);
        
     int phoneNumber;
     int flag = 0;
     //create a while loop to check if there is mismatch input exception and if so re prompt the user
     while(flag == 0)
       {
        System.out.printf("Enter phone number(digits greater than 1 only):"); 
        try
        {
            //input phone number;
            phoneNumber = input.nextInt();
            flag = 1;
            //put the phone number in an array
            int [] numArray = new int[7];
            for(int i = 6; i > -1 ; i--)
            {
                numArray[i] = phoneNumber % 10; //get a number
                phoneNumber /= 10; // remove that number
            }
           
            //find the different combinations for the 7 digit phone number and output them to notes.txt
            for(int a = 0; a < 3; a++){
                for(int b = 0; b < 3; b++){
                    for(int c = 0; c < 3; c++){
                        for(int d = 0; d < 3; d++){
                            for(int e = 0; e < 3; e++){
                                for(int f = 0; f < 3; f++){
                                    for(int g = 0; g < 3; g++){
    // pass array index and different set of characters to charArracy in each loop to get different combinations
                                        output.format("%c", charArray[numArray[0]-2][a]);
                                        output.format("%c", charArray[numArray[1]-2][b]);
                                        output.format("%c", charArray[numArray[2]-2][c]);
                                        output.format("%c", charArray[numArray[3]-2][d]);
                                        output.format("%c", charArray[numArray[4]-2][e]);
                                        output.format("%c", charArray[numArray[5]-2][f]);
                                        output.format("%c", charArray[numArray[6]-2][g]);
                                        output.format("%n");
                                        
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(InputMismatchException e)
        {
            System.err.println("Invalid Input. Please try again!");
            input.nextLine(); //discard input so user can try again
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Input out of Bounds! Please try again!");
            flag = 0;
        }
    }
    }
    
    //close file
    public static void closeFile()
    {
        if(output != null)
            output.close();
    }
    
    
}

/*
run:
Enter phone number(digits greater than 1 only):6392277
BUILD SUCCESSFUL (total time: 19 seconds)

run:
Enter phone number(digits greater than 1 only): 2
Input out of Bounds! Please try again!
Enter phone number(digits greater than 1 only):asdfda
Invalid Input. Please try again!
Enter phone number(digits greater than 1 only):asd2332
Invalid Input. Please try again!
Enter phone number(digits greater than 1 only):1238971
Input out of Bounds! Please try again!
Enter phone number(digits greater than 1 only):6392277
BUILD SUCCESSFUL (total time: 1 minute 19 seconds)
*/
