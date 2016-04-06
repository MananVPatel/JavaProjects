/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvp5542
 */
public class Machine implements Runner{
    
private final String def;

 //constructor, intialize with definition
public Machine()
{
    this.def = "A machine runs when it is turned on and its active as in some or all of its parts are running";
}

//override the abstract method in Runner
@Override
public String run()
{
    System.out.println("Machine Definition: ");
    return def;
}

 
    
    
}
