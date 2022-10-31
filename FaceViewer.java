/**
 *
 * @author MERYEM OZGE UZUN
 * @version 1.0
 */
import javax.swing.JFrame;
public class FaceViewer
{
    /**
     * Default Constructor for objects of class FaceViewer
     */
      public FaceViewer()
      {
          
      }
    /**
     * This function creates a new Frame
     * Constructor for objects of class FaceViewer
     */
      public void q3()
    {
        
        JFrame frame = new JFrame ();
        frame.setSize(150, 250);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FaceComponent component = new FaceComponent();
        frame.add(component);
        frame.setVisible(true);
                
    }
}
