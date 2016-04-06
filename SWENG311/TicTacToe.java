/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hea113
 */
public class TicTacToe {
    private char [][]board = new char[3][3];
    private char piece;
    private int marker, count=0, player1Move, computerMove,boardCount;
   
    
    /* Constructor */
    /* Initalizes the board with the numbers from 1 to 9 for the user to chose going from left to right*/
 
    
    /* Methods */
    public void printBoard(){
        int entry = 1;
        for(int i=0; i<3; i++){
            System.out.println();
            for (int j=0;j<3; j++){
                System.out.print(entry + " " + board[i][j] + "  ");
                entry++;
            }
        }
        System.out.println();
    }
    
 

    public boolean gameOver(){
       if(isHorizontalWin()){
           return true;
       }
       else if(isDiagonalWin()){
           return true;
       }
       else if(isVerticalWin()){
           return true;
       }
       return false; 
    }
    
    public void printWinner(){
    	if(!isPlayer1Turn()){
    		System.out.println("Congratulations Player 1 is Victorious!!!");
    	}
    	else{
    		System.out.println("Computer is Victorious!!!");
    	}
    }
    
    public boolean isHorizontalWin(){
        if((board[0][0]== 'X' || board[0][0] == 'O') && (board[0][1]== 'X' || board[0][1] == 'O') && board[0][0] == board[0][1] && (board[0][2]=='X' || board[0][2] == 'O') && board[0][1] == board[0][2]){
            printWinner();
            return true;
        }else if((board[1][0]== 'X' || board[1][0] == 'O') && (board[1][1]== 'X' || board[1][1] == 'O') && board[1][0] == board[1][1] && (board[1][2]=='X' || board[1][2] == 'O') && board[1][1] == board[1][2]){
        	printWinner();
            return true;
        }else if((board[2][0]== 'X' || board[2][0] == 'O') && (board[2][1]== 'X' || board[2][1] == 'O') && board[2][0] == board[2][1] && (board[2][2]=='X' || board[2][2] == 'O') && board[2][1] == board[2][2]){
        	printWinner();
            return true;
        }
        return false;
    }
    public boolean isDiagonalWin(){
        if((board[0][0]== 'X' || board[0][0] == 'O') && (board[1][1]== 'X' || board[1][1] == 'O') && board[0][0] == board[1][1] && (board[2][2]=='X' || board[2][2] == 'O') && board[1][1] == board[2][2]){
        	printWinner();
            return true;
        }else if((board[2][0]== 'X' || board[2][0] == 'O') && (board[1][1]== 'X' || board[1][1] == 'O') && board[2][0] == board[1][1] && (board[0][2]=='X' || board[0][2] == 'O') && board[1][1] == board[0][2]){
        	printWinner();
            return true;
        }
        return false;
    }
    
    public boolean isVerticalWin(){
        if((board[0][0]== 'X' || board[0][0] == 'O') && (board[1][0]== 'X' || board[1][0] == 'O') && board[0][0] == board[1][0] && (board[2][0]=='X' || board[2][0] == 'O') && board[1][0] == board[2][0]){
        	printWinner();
            return true;
        }
        else if((board[0][1]== 'X' || board[0][1] == 'O') && (board[1][1]== 'X' || board[1][1] == 'O') && board[0][1] == board[1][1] && (board[2][1]=='X' || board[2][1] == 'O') && board[1][1] == board[2][1]){
        	printWinner();
            return true;
        }else if((board[0][2]== 'X' || board[0][2] == 'O') && (board[1][2]== 'X' || board[1][2] == 'O') && board[0][2] == board[1][2] && (board[2][2]=='X' || board[2][2] == 'O') && board[1][2] == board[2][2]){
        	printWinner();
            return true;
        }
        return false;
    }
    
    public boolean isPlayer1Turn(){
        count++;
        if(count % 2 == 0){
            return false; // indicates the computers turn
        }
        return true; // indicate the player 1 turn
    }
    
    public int player1Turn(){
        Scanner input = new Scanner(System.in); 
        System.out.println();
        System.out.println("Player1's Turn please enter an integer 1-9: ");
        player1Move = input.nextInt();
        if (player1Move < 1 || player1Move > 9){
            throw new IllegalArgumentException("Please Enter an integer between 1 and 9 inclusive!");
        }
        return player1Move;
    }
    
    public int computerTurn(){
        System.out.println();
        System.out.println("Computer's Turn: ");
        Random rn = new Random();
        computerMove = rn.nextInt(9) + 1;
        return computerMove;
    }
    
    public char whatPiece(){
        if(!isPlayer1Turn()){
            piece = 'X';
        }
        else{
            piece = 'O';
        }
        return piece;
    }
   

    public void placeMarker(){      
                    if (isPlayer1Turn()){
                        marker = player1Move;
                    }
                    else{
                        marker = computerMove;
                    }
                    
                    switch(marker){
                        case 1:
                            board[0][0] = piece;
                            break;
                        case 2:
                            board[0][1] = piece;
                            break; 
                        case 3:
                            board[0][2] = piece;
                            break;
                        case 4:
                            board[1][0] = piece;
                            break;
                        case 5:
                            board[1][1] = piece;
                            break;
                        case 6:
                            board[1][2] = piece;
                            break;
                        case 7:
                            board[2][0] = piece;
                            break;
                        case 8:
                            board[2][1] = piece;
                            break;
                        case 9:
                            board[2][2] = piece;
                            break;    
                    }
                }
    
    public boolean isValidMove(int marker){
                    switch(marker){
                        case 1:
                            if(board[0][0] == 'X' || board[0][0] == 'O'){
                                return false;
                            }
                            break;
                            
                        case 2:
                            if(board[0][1] == 'X' || board[0][1] == 'O'){
                                return false;
                            }
                            break; 
                        case 3:
                            if(board[0][2] == 'X' || board[0][2] == 'O'){
                                return false;
                            }
                            break;
                        case 4:
                            if(board[1][0] == 'X' || board[1][0] == 'O'){
                                return false;
                            }
                            break;
                        case 5:
                            if(board[1][1] == 'X' || board[1][1] == 'O'){
                                return false;
                            }
                            break;
                        case 6:
                            if(board[1][2] == 'X' || board[1][2] == 'O'){
                                return false;
                            }
                            break;
                        case 7:
                            if(board[2][0] == 'X' || board[2][0] == 'O'){
                                return false;
                            }
                            break;
                        case 8:
                            if(board[2][1] == 'X' || board[2][1] == 'O'){
                                return false;
                            }
                            break;
                        case 9:
                            if(board[2][2] == 'X' || board[2][2] == 'O'){
                                return false;
                            }
                            break;    
                    }
                    return true;
    }
    
    public boolean isBoardFull(){
        for(int i=0; i<3; i++){
            for (int j=0;j<3; j++){
                if(board[i][j] == 'X' || board[i][j] == 'O'){
                    boardCount++;
                }
            }
        }
        if(boardCount > 9){
            return false;
        }else if(boardCount == 9){
        	
        	return true;
        }
        return true;
    }
    
   
}
