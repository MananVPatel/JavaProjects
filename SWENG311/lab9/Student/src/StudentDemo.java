/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import student.GraduateStudent;
import student.StudentAtLarge;
import student.UndergraduateStudent;
import student.Student;
/**
 *
 * @author mvp5542
 */
public class StudentDemo{
    
public static void main(String[] args) {

//create an array with six elements
Student[] studentInfo = new Student[6];

//assign each object to each element of the array
studentInfo[0] = new GraduateStudent(1234, "Patel");
studentInfo[1] = new GraduateStudent(3456, "Cheng");
studentInfo[2] = new StudentAtLarge(7534, "Smith");
studentInfo[3] = new StudentAtLarge(6725, "Johnson");
studentInfo[4] = new UndergraduateStudent(4568, "Goldsmith");
studentInfo[5] = new UndergraduateStudent(9152, "Ellis");

//print info
for(int i =0; i < 6; i++)
{
    studentInfo[i].setTuition();//set tuition for each element
    System.out.print(studentInfo[i].toString());//call tostring method for each class and element
    System.out.println();
}

}    
}
