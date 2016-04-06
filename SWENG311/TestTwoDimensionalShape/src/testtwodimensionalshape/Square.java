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
public class Square extends TwoDimensionalShape {

    public Square(double dim1, double dim2) {
        super(dim1, dim2);
    }
     
    @Override
    public double getArea()
    {
        return getDim1()*getDim2();
    }
    
    @Override
    public String toString()
    {
                return String.format("%s: %n%s %.2f%n%s %.2f", "Square ",
                             "Dimension 1 = ", getDim1(), "Dimension 2 = ", getDim2());
    }
    
}
