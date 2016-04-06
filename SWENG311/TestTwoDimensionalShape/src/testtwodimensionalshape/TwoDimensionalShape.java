/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtwodimensionalshape;

/**
 *
 * @author mvp5542
 */
public abstract class TwoDimensionalShape extends Object{
    private double dim1;
    private double dim2;
    
    public TwoDimensionalShape(double dim1, double dim2)
    {
       
        this.dim1 = dim1;
       
        this.dim2 = dim2;
        
    }
    
    
    public void setDim1(double dim1)
    {
        this.dim1 = dim1;
    }
    
    public void setDim2(double dim2)
    {
        this.dim2 = dim2;
    }
   
    public abstract double getArea();
    
    public double getDim1()
    {
        return this.dim1;
    }
    
    public double getDim2()
    {
        return this.dim2;
    }
   
   
}
