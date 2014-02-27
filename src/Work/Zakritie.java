package Work;
/*
 * 
 * В ЭТОМ КЛАСЕ РИСУЕТСЯ ОКНО ПОДТВЕРЖДЕНИЯ ЗАКРЫТИЯ
 * 
*/

import java.awt.Dimension; 
import java.awt.Toolkit;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; 
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class Zakritie extends JFrame {
    
    private Toolkit toolkit;
   
    public Zakritie() {
        setTitle("Подтверждение");   
        setSize(250, 100);
        setResizable(false); 
        
        toolkit = getToolkit(); 
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height - getHeight())/2);   //РАЗМЕЩЕНИЕ ПО ЦЕНТРУ ЕКРАНА
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        JPanel panel = new JPanel(); 
        getContentPane().add(panel);
        panel.setLayout(null);
        
        JButton beep = new JButton("No");
        beep.setBounds(125, 25, 80, 30);
        beep.addActionListener(new ActionListener() {   
            public void actionPerformed(ActionEvent event) {  
               setVisible(false);                }        });     
     
        JButton close = new JButton("Yes"); 
        close.setBounds(25, 25, 80, 30); 
        close.setToolTipText("Exit apllication");
        close.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent event) {
            System.exit(0);   
            }       });
        
        panel.add(beep); 
        panel.add(close);
    }
    public static void main(String[] args) {
        Zakritie buttons = new Zakritie();      
        buttons.setVisible(true);
    }
}