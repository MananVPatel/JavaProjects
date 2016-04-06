/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worker;

/**
 *
 * @author mvp5542
 */
public class Worker {

    private String fname;
    private String lname;
    private double monthlySalary;
    public Worker(String fname, String lname, double monthlySalary)
    {
        this.fname = fname;
        this.lname = lname;
        if(monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;
    }
    
    public void setFName(String fname)
    {
        this.fname = fname;
    }
    public void setLName(String lname)
    {
        this.lname = lname;
    }
    public void setMonthlySalary(double monthlySalary)
    {
        this.monthlySalary = monthlySalary;
    }
    
    public String getFName()
    {
        return fname;
    }
    
    public String getLName()
    {
        return lname;
    }
    public double getMonthlySalary()
    {
            return monthlySalary;
    }
}
