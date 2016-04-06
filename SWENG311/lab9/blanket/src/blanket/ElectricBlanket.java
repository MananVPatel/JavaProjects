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
public class ElectricBlanket extends Blanket{
    
    private int settings;
    private boolean AutoShutOff;
  
    //default constructor with no arguments
    public ElectricBlanket()
    {
        super();
        settings = 1;
        AutoShutOff = false;
    }
    
    //constructor 
    public ElectricBlanket(int settings, boolean AutoShutOff)
    {
        super();
        
        if (settings < 1 || settings > 5)
        {
           this.settings = 1;
        }
        else
        {
            this.settings = settings;
        }
        
        if(AutoShutOff == true)
        {
            setPrice(5.75); //add $5.75 to price if automatic shut off is available 
        }
        
        this.AutoShutOff = AutoShutOff;
    }
    
    //set and get methods for each of the instance variables
    public void setSettings(int settings)
    {
       this.settings = settings;
    }
    
    public void setAutoShutOff(boolean AutoShutOff)
    {
        this.AutoShutOff = AutoShutOff;
    }
    
    public boolean getAutoShutOff()
    {
        return this.AutoShutOff;
    }
    
    public int getSettings()
    {
        return this.settings;
    }
    
    //print info about blanket
    @Override
  public String toString()
  {
      return String.format("%s:%n %s: %s%n %s: %s%n %s: %s%n %s: $%.2f%n %s: %d%n %s %s%n", "Description of Electric Blanket", "Size of Blanket",
                             getSize(), "Color of Blanket", getColor(), "Material of Blanket", getMaterial(), "Price of Blanket", getPrice(),
                             "Which Setting for the Blanket", getSettings(), "Automatic Shut Off?", getAutoShutOff());

  }
}
