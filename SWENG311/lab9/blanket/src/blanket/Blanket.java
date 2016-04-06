/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blanket;

/**
 *
 * @author mvp5542
 */
public class Blanket extends Object {

    //instance variables
    private String size; 
    private String color;
    private String material;
    private double price;
   
    //default constructor with no arguments
    public Blanket()
    {
        size = "twin";
        color = "White";
        material = "Cotton";   
        price = 30.00;
    }
    
    //constructor 
    public Blanket(String size, String color, String material){
        this.size = size;
        this.color = color;
        this.material = material;
        price = 30.00;
        setMaterial(material); //call set material by passing in the material that was originally passed in from DemoBlankets
        setSize(size); //call set size by passing in the size that was originally passed in from DemoBlankets
    } 
    
    //depending on the size of the blanket add money to price
    public void setSize(String size)
    {
        switch (size) {
            case "double":
                price += 10.00;
                break;
            case "queen":
                price += 25.00;
                break;
            case "king":
                price += 40.00;
                break;
            default: 
                price = 30.00;
                break;
        }
       
        this.size = size;
        
    }
    //set and get methods for all instance variables
    public void setColor(String color)
    {
        this.color = color;
    }
    
    public void setPrice(double price)
    {
        this.price += price;
    }
    
    //depending on type of material, add money to price
    public void setMaterial(String material)
    {
        switch (material) {
            case "wool":
                price += 20.00;
                break;
            case "cashmere":
                price += 45.00;
                break;
            default: 
                price = 30.00;
                break;
        }
       
        this.material = material;
    }
    
     public String getSize()
    {
        return this.size;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public String getMaterial()
    {
        return this.material;
    }
    
    public double getPrice()
    {
        return this.price;
    }
    
    //print info about blanket
  @Override
  public String toString()
  {
      return String.format("%s:%n %s: %s%n %s: %s%n %s: %s%n %s: $%.2f%n", "Description of Blanket", "Size of Blanket",
                             getSize(), "Color of Blanket", getColor(), "Material of Blanket", getMaterial(), "Price of Blanket", getPrice());

  }
}
