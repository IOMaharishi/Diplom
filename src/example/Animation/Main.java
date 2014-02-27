package example.Animation;





import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Илья
 */
public class Main  {

  
   
    public static void main(String[] args) {
    JFrame frame = new JFrame();
        Panel panel = new Panel();
        frame.add(panel);
        frame.setBackground(Color.white);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,400);
    
    }
   
}
