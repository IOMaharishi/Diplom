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

class Draw extends JPanel {

public void Drawing() throws InterruptedException {
//Thread.sleep(-1);
setLayout(null);
}

public static   int x1 = 100, x2 = 120, y1 = 100, y2 = 100;

public void paintComponents(Graphics g) {
  
//super.paint(g);
    repaint();
Graphics2D g2D = (Graphics2D) g;
BasicStroke pen1 = new BasicStroke(5);
g2D.setStroke(pen1);

g.setColor(Color.BLUE); 
try {
while (x1 != 400) {
     System.out.println("x1:" + x1 + " x2:" + x2);
g.drawLine(x1, y1, x2, y2);
x1 += 30;
x2 += 30;
Thread.sleep(150);

}
x1 = 100;
x2 = 120;
} catch (InterruptedException ex) {

Logger.getLogger(Draw_line.class.getName()).log(Level.SEVERE, null, ex);

}
}

}

public class Draw_line extends JFrame {



public Draw_line() {


Draw panel = new Draw();

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(500, 500); 
this.add(panel);

this.setVisible(true);
while(true){
panel.paintComponents(panel.getGraphics());
}




}

public static void main(String[] args) {



new Draw_line().setVisible(true);


}
}