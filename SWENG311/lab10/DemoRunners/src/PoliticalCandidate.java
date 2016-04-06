/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mvp5542
 */
public class PoliticalCandidate implements Runner {
private final String def;

 //constructor, intialize with definition
public PoliticalCandidate()
{
    this.def = "A political Candidate is running when he/she seeking a position in public office and is within the applying and hiring process";
}

//override the abstract method in Runner
@Override
public String run()
{
     System.out.println("Political Candidate Definition: ");
    return def;
}

 
}
