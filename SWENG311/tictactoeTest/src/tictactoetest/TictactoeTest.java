/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoetest;

/**
 *
 * @author mvp5542
 */
public class TictactoeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("TIC-TAC-TOE!");
      tictactoe t3 = new tictactoe(); // object of class tictactoe
    
      //while game is not over execute body
      while(!t3.gameOver())
      {
           if(t3.isItPlayerTurn())
          {
            while(!t3.correctPlacement(t3.playTurn())){}
	    t3.whichSymbol();
            t3.insertChip();
          }
           else
          {
            while(!t3.correctPlacement(t3.compTurn())){}
	    t3.whichSymbol();
	    t3.insertChip();
          }
         t3.printMatrix();
      }
    }

 }