/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoetest;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
/**
 *
 * @author mvp5542
 */
public class tictactoe{
    
    //instance variables
    private char[][] matrix = new char[3][3];
    private int counter = 0;
    private int compChoice, playChoice;
    private char symbol;
    private int chip;
    
    //returns true if you/computer win horizontally
    public boolean horizontalScore()
    {
        boolean flag = false;
       if((matrix[1][0]== 'O' || matrix[1][0] == 'X') && (matrix[1][1]== 'O' || matrix[1][1] == 'X')
               && matrix[1][0] == matrix[1][1] && (matrix[1][2]=='O' || matrix[1][2] == 'X') 
               && matrix[1][1] == matrix[1][2])
       {
       printScore();
       flag = true;
       }
       else if((matrix[2][0]== 'O' || matrix[2][0] == 'X') && (matrix[2][1]== 'O' || matrix[2][1] == 'X')
               && matrix[2][0] == matrix[2][1] && (matrix[2][2]=='O' || matrix[2][2] == 'X') 
               && matrix[2][1] == matrix[2][2])
       {
       printScore();
       flag = true;
       }
       else if((matrix[0][0]== 'O' || matrix[0][0] == 'X') && (matrix[0][1]== 'O' || matrix[0][1] == 'X')
               && matrix[0][0] == matrix[0][1] && (matrix[0][2]=='O' || matrix[0][2] == 'X') 
               && matrix[0][1] == matrix[0][2])
       {
       printScore();
       flag = true;
       }
     return flag;
    }

    //returns true if you/computer win vertically
    public boolean verticalScore()
    {
        boolean flag = false;
        if((matrix[0][0]== 'O' || matrix[0][0] == 'X') && (matrix[1][0]== 'O' || matrix[1][0] == 'X')
                && matrix[0][0] == matrix[1][0] && (matrix[2][0]=='X' || matrix[2][0] == 'O') 
                && matrix[1][0] == matrix[2][0])
        {
        printScore();
        flag = true;
        }
        else if((matrix[0][1]== 'O' || matrix[0][1] == 'X') && (matrix[1][1]== 'O' || matrix[1][1] == 'X') 
                && matrix[0][1] == matrix[1][1] && (matrix[2][1]=='O' || matrix[2][1] == 'X') 
                && matrix[1][1] == matrix[2][1])
        {
        printScore();
        flag = true;
        }
        else if((matrix[0][2]== 'O' || matrix[0][2] == 'X') && (matrix[1][2]== 'O' || matrix[1][2] == 'X') 
                && matrix[0][2] == matrix[1][2] && (matrix[2][2]=='O' || matrix[2][2] == 'X') 
                && matrix[1][2] == matrix[2][2])
        {
        printScore();
        flag = true;
        }
     return flag;
    }
    
    //returns true if you/computer  win diagonally 
    public boolean diagonalScore()
    {
        
        boolean flag = false;

        if((matrix[0][0]== 'O' || matrix[0][0] == 'X') && (matrix[1][1]== 'O' || matrix[1][1] == 'X')
                && matrix[0][0] == matrix[1][1] && (matrix[2][2]=='O' || matrix[2][2] == 'X') 
                && matrix[1][1] == matrix[2][2])
        {
        printScore();
        flag = true;
        }
        else if((matrix[2][0]== 'O' || matrix[2][0] == 'X') && (matrix[1][1]== 'O' || matrix[1][1] == 'X') 
                && matrix[2][0] == matrix[1][1] && (matrix[0][2]=='O' || matrix[0][2] == 'X')
                && matrix[1][1] == matrix[0][2])
        {
        printScore();
        flag = true;
        }
        return flag;
    }


    //print who wins
    public void printScore()
    {

    	if(isItPlayerTurn())
        {
             System.out.println("Computer Wins!");    
        }
        else
        {
           System.out.println("Congratulations! You Win!");
        }

    }

//check if game is over by check if someone won
    public boolean gameOver()
    {
        boolean isGameOver = false;
        if(diagonalScore())
        {
            isGameOver = true;        
        }        
         else if(verticalScore())
        {
            isGameOver = true;
        }
        else if(horizontalScore())
        {
            isGameOver = true;
        }
        else if (spotsFull()) {
            System.out.print("Game is tied.");
            isGameOver = true;
        }
        
       return isGameOver; 
    }
    
    // print the matrix of tic tac to on screen
    public void printMatrix() 
    {
        int i;
        int num = 1;
        for (i = 0; i < 3; i++)
        {
            System.out.printf("\n");
            for(int j = 0; j < 3; j++)
            {
               System.out.printf(" [ " + matrix[i][j] + " ] <--" + num);
               num++;
            }
         }
        System.out.println();
    }
    
    //determine if player turn 
    public boolean isItPlayerTurn()
    {
        counter++;
        return counter % 2 == 0;
    }    
    
    //get input from player for his/her turn
    public int playTurn()
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("\nPlayer: Please Enter choice: ");
        //input validation
        try
        {
        playChoice = input.nextInt();
        }
        catch(InputMismatchException e)
        {
          System.out.printf("Invalid Input! Please Enter number between 1-9: %s", e);
          return playTurn(); // recursive case in case they enter letter
        }
        
        if(playChoice < 1 || playChoice > 9)
        {
          System.out.printf("Invalid Input! Please Enter number between 1-9: ");
          return playTurn(); // recursive case in case they do not enter 1 - 9
        }
        return playChoice;
    }
    
    //generate random number for computer turn
    public int compTurn()
    {
        //System.out.println("Computer's Turn(Automatic)");
        Random num = new Random();
        compChoice = num.nextInt(9) + 1;
        return compChoice;       
    }
    
    //decide which symbol is used by human and computer
    public char whichSymbol()
    {
        if(isItPlayerTurn())
        {
          symbol = 'O';  
        }
        else
        {
           symbol = 'X';
        }
        return symbol;
    }
    
    //place a X or an O on the tic tac toe matrix
    public void insertChip()
    {
        if(isItPlayerTurn())
        {
            chip = playChoice;
        }
        else
        {
            chip = compChoice;
        }
        
        switch(chip)
        {
            case 1:
                matrix[0][0] = symbol;
                break;
            case 2:
                matrix[0][1] = symbol;
                break;
            case 3:
                matrix[0][2] = symbol;
                break;
            case 4:
                matrix[1][0] = symbol;
                break;
            case 5:
                matrix[1][1] = symbol;
                break;   
            case 6:
                matrix[1][2] = symbol;
                break;    
            case 7:
                matrix[2][0] = symbol;
                break;    
            case 8:
                matrix[2][1] = symbol;
                break;    
            case 9:
                matrix[2][2] = symbol;
                break;
        }
    }
    
    //check if X and O are placed in the correct location
    public boolean correctPlacement(int chip)
    {
        boolean flag = true;
     switch(chip){
        case 1:
            if(matrix[0][0] == 'X' || matrix[0][0] == 'O')
                flag = false;
                break;
        case 2:
            if(matrix[0][1] == 'X' || matrix[0][1] == 'O')
                flag = false;
                break; 
        case 3:
            if(matrix[0][2] == 'X' || matrix[0][2] == 'O')
                flag = false;
                break;
        case 4:
            if(matrix[1][0] == 'X' || matrix[1][0] == 'O')
                flag = false;
                break;
        case 5:
            if(matrix[1][1] == 'X' || matrix[1][1] == 'O')
                flag = false;
                break;
        case 6:
            if(matrix[1][2] == 'X' || matrix[1][2] == 'O')
                flag = false;
                break;
        case 7:
            if(matrix[2][0] == 'X' || matrix[2][0] == 'O')
                flag = false;
                break;
        case 8:
            if(matrix[2][1] == 'X' || matrix[2][1] == 'O')
                flag = false;
                break;
        case 9:
            if(matrix[2][2] == 'X' || matrix[2][2] == 'O')
                flag = false;
                break;    
     }
    return flag;
   }

    
//check if all the spots are full or not 
    public boolean spotsFull()
    {    
       boolean flag = false;
       int count = 0;
       for(int i=0; i<3 ; i++)
       {
          for (int j=0; j<3 ; j++)
           {
                if(matrix[i][j] == 'X' || matrix[i][j] == 'O')
                    count++;
           }
        }
       //if full  set flag to false
        if(count == 9)
        {
            flag = true;
        }
        
        return flag;
    }
    
  
    
}




    
