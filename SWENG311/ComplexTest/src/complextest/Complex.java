/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complextest;

/**
 *
 * @author mvp5542
 */

public class Complex {
   
// declare private instance variable
    private float real;
    private float imaginary;

    //no-argument constructor
    public Complex()
    {
        real = 0;
        imaginary = 0;
    }
    //class constructor
    public Complex(float real, float imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    
    //set the real values 
    public void setReal(float real)
    {
        this.real = real;
    }
    
    //get the real values
    public float getReal()
    {
        return this.real;
    }
    
    //set the imaginary values
    public void setImaginary(float imaginary)
    {
        this.imaginary = imaginary;
    }
    
    //get the imaginary values
    public float getImaginary()
    {
        return this.imaginary;
    }
    
    // add A and B and return the return 
    public Complex addComp(Complex nums)
    {
        float r = real + nums.real;
        float i = imaginary + nums.imaginary;
        real = r;
        imaginary = i;
        return this; 
    }
    
    //subtract A and B and return the result
     public Complex subComp(Complex nums)
    {
        float r = real - nums.real;
        float i = imaginary - nums.imaginary;
        real = r;
        imaginary = i;
        return this;
       
    }
     
     //multiply A and B and return the result
     public Complex multComp(Complex nums)
    {
        float r = real*nums.real - imaginary*nums.imaginary;
        float i = real*nums.imaginary + imaginary*nums.real;
        real = r;
        imaginary = i;
        return this;
       
    }
     
    public void printMethod()
    {
        System.out.printf("(%.1f,",real);
        System.out.printf(" %.1f)",imaginary);
    }
    
    
    
    
}
