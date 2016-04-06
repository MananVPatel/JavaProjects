/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author mvp5542
 */
public class DemoRunners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create 3 elements runner array
        Runner[] runnerObjects = new Runner[3];
        
        //populate array with objects that implement Runner
        runnerObjects[0] = new Machine();
        runnerObjects[1] = new Athlete();
        runnerObjects[2] = new PoliticalCandidate();
        
        for(int i = 0; i < 3; i++)
        {
         System.out.println(runnerObjects[i].run()); 
         System.out.println();
        }
        
    }
    
}
