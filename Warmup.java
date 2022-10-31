/**
 * CENG-344 HOMEWORK1
 *
 * @author Meryem Özge Üzün
 * @version 1.0
 * 31.10.2022
 */
// importing packages
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Warmup
{
    /**
    * This is the main function that shows the menu 
    */
    public static void main(String [] args) {
        String s1 = "My name is MERYEM OZGE UZUN \n"
        + "My ID : c1911067\n"
        + "My Department :Computer Engineering\n";
        JOptionPane.showMessageDialog(null, s1);
        Scanner keyboard = new Scanner(System.in);
        //question menu
        System.out.println("Please select a question (0 to exit) ");
        System.out.println("1. Car Choosing");
        System.out.println("2. Bathroom Tiling:"); 
        System.out.println("3. Graphics");
      
        //question class objects
        CarChooser CarChooser = new CarChooser();
        TileTester TileTester = new TileTester();
        FaceViewer FaceViewer = new FaceViewer();
      
        //check the input 
        while(true) {
            char ch = keyboard.next().charAt(0);
            if(ch == '1')
                CarChooser.q1();
            else if (ch == '2')
                TileTester.q2();
            else if (ch == '3')
                FaceViewer.q3();
            else if (ch == '0')
                break;
        }

}
}
