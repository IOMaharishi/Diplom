/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.Animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Илья
 */
public class Panel extends JPanel implements ActionListener{
    private Timer animator;
    private ImageIcon imageArray[];
    private int delay = 100, totalFrames = 6, currentFrame=0;
    
    public Panel(){
        
        imageArray = new ImageIcon[totalFrames];
        
        for(int i = 0; i < imageArray.length; i++){
            
            imageArray[i]= new ImageIcon("frame"+i+".png");
            
        }
        
        animator = new Timer(delay,this);
        animator.start();
        
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        if(currentFrame >= imageArray.length){
            currentFrame=0;
        }
        
        imageArray[currentFrame].paintIcon(this, g,50,50);currentFrame++;
    }
    public void actionPerformed(ActionEvent e ){
       repaint(); 
    }
}
