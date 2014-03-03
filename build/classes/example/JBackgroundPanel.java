package example;


import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class JBackgroundPanel extends JPanel {
  private BufferedImage img;
 
  public JBackgroundPanel() {
    // load the background image
    try {
      img = ImageIO.read(new File("back.jpg"));
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
 
  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    // paint the background image and scale it to fill the entire space
    g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
  }
  
  
  
  public static void main(String[] args){
  // create the panel with the background image
JBackgroundPanel bgPanel = new JBackgroundPanel();
 
// add some elements...
bgPanel.add(new JLabel("Applications don't have to look boring!"));
//bgPanel.add(new JComboBox(new String[] {"Background 1", "Background 2"}));
//bgPanel.add(new JButton("True"));
 
// create a window
JFrame f = new JFrame("JPanel with background image");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500, 250);
f.setLocationRelativeTo(null);
 
// add the panel with the background image
f.add(bgPanel);
 
// show the window
f.setVisible(true);
  }
}