/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author mvp5542
 */
public abstract class Student {

    //instance Variables
    private int studentID;
    private String last;
    
    //constructor
    public Student(int studentID, String last)
    {
        this.studentID = studentID;
        this.last = last;
    }
    
    //set and get methods for instance variables
    public void setStudentID(int studentID)
    {
        this.studentID = studentID;
    }
    
    public int getStudentID()
    {
        return this.studentID;
    }
    
    public void setLast(String last)
    {
        this.last = last;
    }
    
    public String getLast()
    {
        return this.last;
    }
    
    //abstract class which is overridden in child classes
    public abstract double setTuition();
    

    
}
