/**
 *
 * @author MERYEM OZGE UZUN
 * @version 1.0
 *
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CarChooser
{
    private int annualMilesDriven;
    private int pricePerGalon;
    /**
     * Default Constructor for objects of class CarChooser
     */
    public CarChooser()
    {    
        annualMilesDriven = 15000;
        pricePerGalon = 4;   
    }
    /**
     * Constructor for objects of class CarChooser
     * @param anAnnualMiles   total Miles in a year
     * @param aPricePerGalon  Price of a gallon
     */
     public CarChooser(int anAnnualMiles, int aPricePerGalon)
    {
        annualMilesDriven = anAnnualMiles;
        pricePerGalon = aPricePerGalon; 
    }
    
    /**
     * Getter of annual miles
     * @return annualMilesDriven  total Miles in a year
     */
     public int getAnnualMilesDriven()
    {
        return annualMilesDriven;
    }
    /**
     * Getter of price of a gallon
     * @return pricePerGalon   Price of a gallon
     */
     public int getPricePerGalon()
    {
        return pricePerGalon;   
    }
    /**
     * This function shows which car you should choose.
     * @param car0   Represents the first input car
     * @param car1   Represents the second input car
     * @return       True
     * 
     */
     public int choose(Car car0, Car car1)
    {   
       
       if (calcTotalCost(car0) < calcTotalCost(car1))
           {
               String s1 = "Choose CAR1.";
               JOptionPane.showMessageDialog(null, s1);
               
           }
        else if (calcTotalCost(car0) > calcTotalCost(car1)){
                String s2 = "Choose CAR2.";
               JOptionPane.showMessageDialog(null, s2);        }
        else {
                String s3 = "You can choose any car you wish.!!";
               JOptionPane.showMessageDialog(null, s3);
        }
        return 1;
    }
    /**
     * This function takes input from user
     * 
     * 
     */
     public void q1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Requesting car details..");
        int c0 = Integer.parseInt(JOptionPane.showInputDialog("Please enter price of the first car:"));
        int c0galon = Integer.parseInt(JOptionPane.showInputDialog("Please enter miles/galon of the first car:"));

        //creating objects and method call
        Car car0 = new Car(c0,c0galon);
 
        int c1 = Integer.parseInt(JOptionPane.showInputDialog("Please enter price of the second car:"));
        int c1galon = Integer.parseInt(JOptionPane.showInputDialog("Please enter miles/galon of the second car:"));
        //creating objects and method call
        Car car1 = new Car(c1,c1galon);
        
        choose(car0,car1);
    }
    /**
     * This function calculates total Cost of a car
     * @param aCar   Represents the car object
     * @return       Returns Total Cost of a car
     * 
     */
    private float calcTotalCost(Car aCar){
        float x=0,annualFuelcon,annualFuelCost;
        
        annualFuelcon = annualMilesDriven / aCar.getEfficiency();
        annualFuelCost = pricePerGalon * annualFuelcon;
        x = 10 * annualFuelCost + aCar.getPrice();   
        return x;
    }
    
    
}
