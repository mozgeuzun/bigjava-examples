
/**
 * @author MERYEM OZGE UZUN
 * @version 1.0
 */
public class Car
{
    // instance variables
    private int purchasePrice;
    private int fuelEfficiency;
    /**
     * Default Constructor class Car
     */
    public Car()
    {       
        
    }
     /**
     * Car Constructor class Car
     * @param aPrice            Price of the car
     * @param andEfficiency     Fuel Efficiency
     */
     public Car(int aPrice, int andEfficiency)
    {
        purchasePrice = aPrice;
        fuelEfficiency = andEfficiency;
    }
    /**
     * Getter of the price
     * @return purchasePrice  Purchased price of a car
     */
     public int getPrice()
    {
        return purchasePrice;   
    }
     /**
     * Getter of the fuel Efficiency
     * @return fuelEfficiency  Fuel Efficiency of a car
     */
     public int getEfficiency()
    {    
        return fuelEfficiency;
    }
  
}
