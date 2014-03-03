package Work;
/*

В ЭТОМ КЛАЕ РИСУЕТСЯ ОКНО ПРИВЕТСТВИЯ,А ТАКЖЕ МЕТОДЫ ПРИ КОТОРЫХ В ФАЙЛ КОНФИГУРАЦИИ ЗАНОСЯТСЯ ОПРЕДЕЛЕНЫЕ ЗНАЧЕНИЯ

*/

import example.TextFile;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import javax.swing.*;

public class Startpage extends JDialog {
    

 
    
    
    
//РИСОВАНИЯ СТАРТОВОГО ОКНА ПРИВЕТСТВИЯ
    public Startpage() {
        setTitle("Tip of the Day");
        JPanel basic = new JPanel(); 
        basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
        add(basic);
        
        JPanel topPanel = new JPanel(new BorderLayout(0, 0));
        topPanel.setMaximumSize(new Dimension(450, 0));
        
        JLabel hint = new JLabel("JDeveloper Productivity Hints"); 
        hint.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));

        topPanel.add(hint);
        ImageIcon icon = new ImageIcon("jdev.png");
        JLabel label = new JLabel(icon);
        label.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        topPanel.add(label, BorderLayout.EAST);
        
        JSeparator separator = new JSeparator();
        separator.setForeground(Color.gray);
        topPanel.add(separator, BorderLayout.SOUTH);
        basic.add(topPanel);
        
        JPanel textPanel = new JPanel(new BorderLayout()); 
        textPanel.setBorder(BorderFactory.createEmptyBorder(15, 25, 15, 25));
        
        JTextPane pane = new JTextPane();
        pane.setContentType("text/html"); 
        String text = "<p><b><u>Программа для изучения компьютерных сетей </b></p></u>" + 
                "<p>Clicking with the mouse wheel on an editor tab closes the window. " + 
                "This method works also with dockable windows or Log window tabs.</p>";    
        pane.setText(text);
        pane.setEditable(false);
        textPanel.add(pane);
        basic.add(textPanel);
        
        JPanel boxPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 0));
        final JCheckBox box = new JCheckBox("Больше не показывать это окно");
      
        
        
        box.addActionListener(new ActionListener() {   
            public void actionPerformed(ActionEvent event) {               
               
                if (box.isVisible()) //если поставлена галочка,тогда заносим в файл строку
                {TextFile.write("config.txt","Show=0");}
                else {TextFile.write("config.txt","Show=1");}
           
             
                    
                   
                    
                    
                    
                    
                    
                    
                    
                    
                      
                   }
        });
        
        box.setMnemonic(KeyEvent.VK_S);
        boxPanel.add(box);
        basic.add(boxPanel);
        
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        
       
        
        JButton ntip = new JButton("Next Tip");
         ntip.addActionListener(new ActionListener() {  
            @Override
            public void actionPerformed(ActionEvent event) { 
                
           Workspace page =  new Workspace();
            page.REACTIONS();
            setVisible(false); 
            
            
            }        });
        
        
        
        ntip.setMnemonic(KeyEvent.VK_N);
        
        JButton close = new JButton("Close");
        close.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
             
            System.exit(0);
            }
            });
        
        close.setMnemonic(KeyEvent.VK_C);
        
        bottom.add(ntip);
        bottom.add(close);
        basic.add(bottom);
        
        bottom.setMaximumSize(new Dimension(450, 0));
        setSize(new Dimension(450, 350));
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); 
        setLocationRelativeTo(null);
        setVisible(true);   
    }
    
 
    
    //МЕТОД ДЛЯ ПРОВЕРКИ СУЩЕСТВОВАНИЯ ФАЙЛА И ВЫВОД ЕГО СОДЕРЖИМОГО
   /*  public static  void Check() throws IOException {
              
           
            if(fl.exists()){  System.out.println("Файл существует");
            System.out.println(fl.getAbsolutePath()); 
            System.out.println("Размер файла:" + fl.length() + " Bytes"); 
            if(fl.length()==0){System.out.println("Файл пуст");}
            else{System.out.println("Содержимое - ");}
                        example.TextFile text = new example.TextFile("F:\\config.txt");
            text.write("F:\\config.txt");
            
            }
            else{ System.out.println("Файл не существует");}
            
    }*/
   //МЕТОД ЗАНЕСЕНИЯ В ФАЙЛ ЗНАЧЕНИЯ
   /* public void write(String fileName, String text){
        
     try {

            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
           
        
            
            try {

                out.print(text);
                out.close();

            } finally {

                out.close();

            }

        } catch(IOException e) {

            throw new RuntimeException(e);

        }    
        
    }*/
    
   
    
    public static void main(String[] args) {   
      
       new Startpage(); 
    }    }
