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
public class StudentAtLarge extends Student {

    //private instance variable
    private double salTuition;
    
    //constructor with super constructor call
    public StudentAtLarge(int studentID, String last) {
        super(studentID, last);
    }
    //override settuition method for studentatlarge, set tuition = 2000
    @Override
    public double setTuition()
    {
        return salTuition = 2000;
        
    }
    //print info for studentatlarge class
    @Override
    public String toString()
    {
        return String.format("%s:%n %s: %s%n %s: %d%n %s: %.2f%n", "Student at Large Information", "Last Name of Student",
                               getLast(), "ID Number of Student", getStudentID(), "Annual Tuition: ", setTuition());

    } 
    
}
