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
public class TestTwoDimensionalShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create two objects for each class
       Circle cir1 = new Circle(1.3, 4.2);
       Circle cir2 = new Circle(6.7, 7.8);
       
       Triangle tri1 = new Triangle(1.3, 4.2);
       Triangle tri2 = new Triangle(6.7, 7.8);
       
       Square sq1 = new Square(1.3, 4.2);
       Square sq2 = new Square(6.7, 7.8);
       
       //create an array to pass the objects created above
       TwoDimensionalShape[] array;
       array = new TwoDimensionalShape[6];
       
       //assign each object to each element of the array
       array[0]= cir1;
       array[1]= cir2;
       array[2]= tri1;
       array[3]= tri2;
       array[4]= sq1;
       array[5]= sq2;
       
       System.out.printf("AREA & DIMENSIONS: %n%n");
       
       //create a for loop to cycle through and print area and dimensions for each shape
       for(int i = 0; i < 6; i++)
       {
          System.out.println(array[i].toString());  
          System.out.printf("Area = %.2f%n%n", array[i].getArea());
       }
       
       
       
    }
    
}


/*
run:
AREA & DIMENSIONS: 

Circle : 
Dimension 1 =  1.30
Dimension 2 =  4.20
Area = 17.15

Circle : 
Dimension 1 =  6.70
Dimension 2 =  7.80
Area = 164.18

Triangle : 
Dimension 1 =  1.30
Dimension 2 =  4.20
Area = 2.73

Triangle : 
Dimension 1 =  6.70
Dimension 2 =  7.80
Area = 26.13

Square : 
Dimension 1 =  1.30
Dimension 2 =  4.20
Area = 5.46

Square : 
Dimension 1 =  6.70
Dimension 2 =  7.80
Area = 52.26

BUILD SUCCESSFUL (total time: 0 seconds)

*/