/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Work;

import com.jgoodies.looks.plastic.PlasticXPLookAndFeel;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import static Work.Workspace.REACTIONS;

/**
 *ГЛАВНЫЙ КЛАС
 * @author Оржеховский
 */
public class Boss extends JFrame {


    public static void Check1() throws IOException, ClassNotFoundException {
        try {
           /* UIManager.setLookAndFeel(
                    UIManager.getCrossPlatformLookAndFeelClassName());*/
      //      UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
       // UIManager.setLookAndFeel("com.incors.plaf.kunststoff.KunststoffLookAndFeel");  
            UIManager.setLookAndFeel(new PlasticXPLookAndFeel());  
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Boss.class.getName()).log(Level.SEVERE, null, ex);
        }
      File file = new File("config.txt");
        FileReader myfile = new FileReader(file);
      
     char buf[] =new char[80];
        
            myfile.read(buf);
        
        if(buf[5]=='0'){new Workspace();
      REACTIONS();
        }
        else{
           
new Startpage();}
        
   
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       //4 getSystemLookAndFeel();
  Check1();
    
    }
}