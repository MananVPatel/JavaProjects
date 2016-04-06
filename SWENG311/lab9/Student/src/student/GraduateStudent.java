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
public class GraduateStudent extends Student {
    
    //instance variable
    private double gTuition;
    
    //constructor with super constructor call
    public GraduateStudent(int studentID, String last) {
        super(studentID, last);
    }
    
    //over ride settuition function for graduatestudent class, set tuition = 6000
    @Override
    public double setTuition()
    {
        return gTuition = 6000;
    }
    
    //print info for graduatestudent class
    @Override
    public String toString()
    {
        return String.format("%s:%n %s: %s%n %s: %d%n %s: %.2f%n", "Graduate Student Information", "Last Name of Student",
                               getLast(), "ID Number of Student", getStudentID(), "Annual Tuition: ", setTuition());

    }
}
