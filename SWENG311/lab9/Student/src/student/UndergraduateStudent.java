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
public class UndergraduateStudent extends Student{

    //instance variable
    private double ugTuition;
    
    //constructor with super constructor call
    public UndergraduateStudent(int studentID, String last) {
        super(studentID, last); 
    }
    
    //override settuition function for undergraduate class, , set tuition = 4000
    @Override
    public double setTuition()
    {
        return ugTuition = 4000;

    }
    //print info for undergraduatestudent class
    @Override
    public String toString()
    {
        return String.format("%s:%n %s: %s%n %s: %d%n %s: %.2f%n", "Undergraduate Student Information", "Last Name of Student",
                                getLast(), "ID Number of Student", getStudentID(), "Annual Tuition: ", setTuition());

    }

    
}
