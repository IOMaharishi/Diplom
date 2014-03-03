package example;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

class Paints extends JPanel /*implements Runnable */ {

    //   static Drawing frame;
  

    /* public void run() {
     frame = new Drawing();
     frame.setVisible(true);

     }*/
    public static int x1 = 100, x2 = 120, y1 = 100, y2 = 100;

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        BasicStroke pen1 = new BasicStroke(5);
        g2D.setStroke(pen1);

        g.setColor(Color.BLUE);

        try {
            while (x1 != 400) {
                g.drawLine(x1, y1, x2, y2);
                x1 += 30;
                x2 += 30;
                Thread.sleep(300);
                this.repaint();
                System.out.println("x1:" + x1 + " x2:" + x2);
            }
            x1 = 100;
            x2 = 120;
        } catch (InterruptedException ex) {

            Logger.getLogger(Draw_line.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

}
