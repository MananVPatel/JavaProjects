/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvp5542
 */
public class Athlete implements Runner {

 private final String def;

 //constructor, intialize with definition
public Athlete()
{
    this.def = "An athlete is said to be running when he/she is accelerating in a certain direction during which his legs and the rest of his body are moving";
}

//override the abstract method in Runner
@Override
public String run()
{
    System.out.println("Athlete Definition: ");
    return def;
}

 
    
}
