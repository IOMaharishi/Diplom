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
import static Work.Workspace.toolkit;
import static example.Draw.x1;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Илья
 */
class Panet extends JPanel {

    /*
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
   
     }*/
    BufferedImage font,comp,swit4,hub;
    Panet() {
   setLayout(null);
        try {
            font =ImageIO.read(new File("General_image/Fon.jpg")); //BackGround image
            comp = ImageIO.read(new File("General_image/Comp_slow.png")); //Computer model
            swit4=ImageIO.read(new File("General_image/switch.png"));//Switch model
            hub = ImageIO.read(new File("General_image/hub.png"));//Hub model
         
        } catch (IOException ex) {
            Logger.getLogger(Panet.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
    //============================================================
    public static   int x1 = 100, x2 = 120, y1 = 100, y2 = 100;
  
public  void paint1(Graphics g){
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



} 
 

}
    
/**
 * Drawig static model(computer,switch,hub and lines)
 *  
 */
    
    
    public void paint(Graphics g) {
        //Graphics2D g2D = (Graphics2D) g;
        //BasicStroke pen1 = new BasicStroke(5);
       //g2D.setStroke(pen1);
 //  g.drawImage(font, 0, 0, getWidth(), getHeight(), null);// set BorderIcon

   g.drawImage(swit4,340,50,this);//1
   g.drawImage(swit4, 510, 125, this);//2
   g.drawImage(swit4,120, 375,this);//3
   
   g.drawImage(hub,150, 125,70,70,this);//1
   g.drawImage(hub, 375, 300,70,70,this);//2
   g.drawImage(hub,675, 300,70,70,this);//3
   g.drawImage(hub,525, 430,70,70,this);//4
   g.drawImage(hub,800,430,70,70,this);//5
   
   g.drawImage(comp,355, 140,this);//1
   g.drawImage(comp,526, 250,this);//2
   g.drawImage(comp,375, 475,this);//3
   g.drawImage(comp,675, 475,this);//4
   g.drawImage(comp,550, 600,this);//5
   g.drawImage(comp,800, 600,this);//6
   g.drawImage(comp,260, 260,this);//7
   g.drawImage(comp,50,  500,this);//8
   g.drawImage(comp,210, 500,this);//9
   
   g.drawLine(380,70,380,140); // sw4(1)-comp(1)
   g.drawLine(360,65,185,135);//sw4(1)-hub(1)
   g.drawLine(390,65,525,125);//sw4(1)-sw4(2)
   g.drawLine(550,145,550,250);//sw4(2)-comp(2)
   g.drawLine(510,150,410,310);//sw4(2)-hub(2)
   g.drawLine(600,150,690,305);//sw4(2)-hub(3)
   g.drawLine(410,355,410,475);//hub(2)-comp(3)
   g.drawLine(690,340,560,440);//hub(3)-hub(4)
   g.drawLine(700,350,700,475);//hub(3)-comp(4)
   g.drawLine(710,355,810,440);//hub(3)-hub(5)
   g.drawLine(830,480,830,600);//hub(5)-comp(6)
   g.drawLine(560,488,575,600);//hub(4)-comp(5)
   g.drawLine(185,175,270,260);//hub(1)-comp(7)
   g.drawLine(175,175,175,375);//hub(1)-sw4(3)
   g.drawLine(150,400,75,500);//sw4(3)--comp(8)
   g.drawLine(200,400,250,500);//sw4(3)--comp(9)
   
    }

}

public class Boss_test extends JFrame {


    public static Toolkit toolkit;

   

    public Boss_test() {
Panet panel = new Panet();
        setTitle("Start page");
       
        setSize(1000, 800);
        add(panel);
        this.setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);
 
        boolean flag = true;
        panel.paint(panel.getGraphics()); 
       
        //dynamics drawing line
 
 /*        while(true){
            panel.paint1(panel.getGraphics());
            }*/
        
    }
     public static void main(String[] args) {

     

       new Boss_test().setVisible(true);
    }
    
}
