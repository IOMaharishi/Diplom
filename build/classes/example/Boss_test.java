/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import static java.nio.file.Files.size;
import java.text.AttributedCharacterIterator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static startpage.Workspace.toolkit;

/**
 *
 * @author Илья
 */
class Panet extends JPanel {
    /*  public void draw_computer(Graphics g){
     g.drawRect(40, 60, 50,40);//квадрат
     g.drawLine(50,50,100,50);//  -
     g.drawLine(50, 50,40,60);// /
     g.drawLine(100, 50,90,60);// /
     g.drawLine(100, 50,100,90);// |
     g.drawLine(100, 90,90,100);// /
        
        
        
     }*/

    public static int z, q;

    public void set_cord(int a, int b) {
        z = a;
        q = b;

    }

    public void draw_rect(Graphics g) {
      g.setColor(Color.blue);
        int x1 = z - 15;
        int x2 = x1 + 10;
        int x3 = x2 + 30;
        int x4 = x1 + 30;

        int y1 = q - 15;
        int y3 = y1 - 10;
        int y2 = y1 + 30;
        int y4 = y3 + 30;

        //draw computer    
        g.drawRect(x1, y1, 30, 30);//квадрат
        g.drawLine(x2, y3, x3, y3);//  -
        g.drawLine(x2, y3, x1, y1);// /
        g.drawLine(x3, y3, x4, y1);// /
        g.drawLine(x3, y3, x3, y4);// |
        g.drawLine(x3, y4, x4, y2);// /
    }

    public void draw_switch(Graphics g) {
       
g.setColor(Color.black);
        int x = z - 15;
        int y = q - 35;
        g.drawRect(x, y, 70, 30);

    }

    public void draw_line(int a, int b, int a2, int b2, Graphics g) {
        int x1 = a;
        int y1 = b;
        int x2 = a2;
        int y2 = b2;
        g.drawLine(x1, y1, x2, y2);

    }

    public void paintComponent(Graphics g) {

 Graphics2D g2D = (Graphics2D)g;
        BasicStroke pen1 = new BasicStroke(2);
g2D.setStroke(pen1);//Задает толщину линий
        

        super.paintComponent(g);

        setBackground(Color.yellow);
        
        g.drawLine(340, 45, 210, 85);
        g.drawLine(210,115,262,150);
        g.drawLine(210,115,170,205);
        g.drawLine(170, 235, 155, 280);
        g.drawLine(170, 235, 260, 280); 
        g.drawLine(340, 45, 340,80);
        g.drawLine(340, 45, 460, 65);
        g.drawLine(460, 95, 460, 145);
        g.drawLine(460, 95, 390, 205);
        g.drawLine(460, 95, 530, 205);
        g.drawLine(390, 235,345,280);
        g.drawLine(520, 235, 525, 280);
        g.drawLine(520, 235, 450, 275);
        g.drawLine(520, 235, 620, 275);
        g.drawLine(620, 305, 605, 360);
        g.drawLine(450, 305, 435, 360);
        
        
        set_cord(320, 50);
        draw_switch(g);//Switch №1
        set_cord(200, 120);
        draw_switch(g);//Hub №1
        set_cord(440, 100);
        draw_switch(g);//Switch №2
        set_cord(335, 100);
        draw_rect(g);//Computer №1
        set_cord(455, 165);
        draw_rect(g);//Computer №2
        set_cord(370, 240);
        draw_switch(g);//Hub №2 
        set_cord(340, 300);
        draw_rect(g);//Computer №3
        set_cord(500, 240);
        draw_switch(g);//Hub №3
        set_cord(430, 310);
        draw_switch(g);//Hub  №4
        set_cord(520, 300);
        draw_rect(g);//Computer №4
        set_cord(600, 310);
        draw_switch(g);//Hub №5
        set_cord(430, 380);
        draw_rect(g);//Computer №5
        set_cord(600, 380);
        draw_rect(g);//Computer №6
        set_cord(260, 170);
        draw_rect(g);//Compuer №7
        set_cord(150, 240);
        draw_switch(g);//Switch №3
        set_cord(260, 300);
        draw_rect(g);//Computer №9
        set_cord(150, 300);
        draw_rect(g);//Computer №8
        
        
    
   
        
      
        
  // g.drawString("dfdsfsdf", 200, 200);
   
    }

}

public class Boss_test extends JFrame {

    static Panet pa = new Panet();
    public static Toolkit toolkit;

    public static void main(String[] args) {

        Boss_test frame = new Boss_test();

        frame.setVisible(true);
    }

    public Boss_test() {

        setTitle("Start page");

        setSize(700, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
        //Graphics g = null;
        boolean flag = true;

        add(new Panet());
         //pa.draw_universal(100,100);

      //pa.draw_universal(100,300);
    }
}
