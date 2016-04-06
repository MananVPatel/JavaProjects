/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

/**
 *
 * @author hea113
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        
        System.out.print("Welcome to Tic Tac Toe, my Good Sir!! Yes:) \n");
        game.printBoard();
        while(!game.gameOver()){
        	
            if(game.isPlayer1Turn()){
            	while(!game.isValidMove(game.player1Turn())){
            		// Will not continue until the user moves in a valid position
            	}
	            	game.whatPiece();
	                game.placeMarker();
            }else{
            	
               while(!game.isValidMove(game.computerTurn())){
            	// Will not continue until the user moves in a valid position
               }
	               game.whatPiece();
	               game.placeMarker();
            }
            game.printBoard();
        }
     
     
    }
    
}
