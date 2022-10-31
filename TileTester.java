
/**
 * 
 *
 * @author MERYEM OZGE UZUN
 * @version 1.0
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class TileTester
{
     /**
     * This function takes input from the user lenght and width 
     * And creates new object of TileSolver class.
     *
     */
      public void q2()
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        int length = Integer.parseInt(JOptionPane.showInputDialog("Please enter bathroom length:"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Please enter bathroom width:"));
        TileSolver obj = new TileSolver(length,width);
        
        obj.solve();
        
    }
}
