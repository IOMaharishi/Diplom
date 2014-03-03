package example;



import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.WindowConstants;


class Draw extends JPanel /*implements Runnable*/  {

     //   static Drawing frame;
   
}

public class Draw_line extends JFrame  {
   
    Draw panel;    public boolean status=true;
      public static int x1 = 100, x2 = 120, y1 = 100, y2 = 100;
 public Draw_line() {
      
 
       panel = new Draw();
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);       
      //  this.add(panel);
      
        this.setVisible(true);
       while(true){
   this.paint(this.getGraphics());}
 }
    public void paint(Graphics g) {
        
     // super.paint(g);
   //    Graphics2D g2D = (Graphics2D) g;
    //   BasicStroke pen1 = new BasicStroke(5);
    //  g2D.setStroke(pen1);
        
        g.setColor(Color.BLUE);      
       try {
           while (x2 <= 400) {   System.out.println("x1:" + x1 + " x2:" + x2);
               g.drawLine(x1, y1, x2, y2);
             
                x1 += 30;
                x2 += 30;
           Thread.sleep(400);
             //  this.repaint();
               
            }
            x1 = 100;
            x2 = 120;
             
            
        } catch (InterruptedException ex) {

            Logger.getLogger(Draw_line.class.getName()).log(Level.SEVERE, null, ex);

       }
    }
     
          

       
    

    public static void main(String[] args) throws InterruptedException {
Draw_line draw = new Draw_line();
      // while(draw.status ==true){
         //  Thread.sleep(10);
       
               draw.setVisible(true);
    
      // }
}
}
