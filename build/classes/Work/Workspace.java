/*
 * В ЭТОМ КЛАСЕ РИСУЕТСЯ РАБОЧАЯ СРЕДА 
 */
package Work;

/**
 *
 * @author Оржеховский
 */
import example.TextFile;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Set;
import javax.swing.*;
import java.util.*;

 class Panel1 extends JPanel{

    public Panel1(){
        this.setSize(Workspace.JF.getHeight(),Workspace.JF.getWidth());
        this.setBackground(Color.red);
        JLabel text = new JLabel();
        text.setText("Hello world this is programm my diplom");
        this.add(text);
        this.setVisible(true);
    }   
}
class Panel extends JPanel{
	public static int x1;
	public static int x2;
	public static int y1;
	public static int y2;
	
	public static  void setCoord(int c1, int c2, int c3, int c4){
		x1 = c1;
		x2 = c2;
		y1 = c3;
		y2 = c4;
	}
	
	public Panel(){
			setLayout(null);
	}
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawLine(x1,x2,y1,y2);
                
	}
}






public class Workspace extends JFrame {

    public static JFrame JF = new JFrame();
    public static Panel pane = new Panel();

    public static Toolkit toolkit;
    public static JMenuBar Jbar = new JMenuBar(); // ПАНЕЛЬ В КОТОРОЙ БУДЕТ ХРАНИТЬСЯ КНОПКИ

    public static JMenu file = new JMenu("File");
    public static JMenu options = new JMenu("Параметры");
    public static JMenu topology = new JMenu("Топология");

    public static JCheckBox sbar = new JCheckBox("Show Startpage");

    public static JPanel jpaboutprogramm = new JPanel();

    public static ImageIcon iconClose = new ImageIcon("C:\\Users\\Оржеховский\\Documents\\NetBeansProjects\\interfeis\\src\\Subimages/exit.png");

    /* 
     public static ImageIcon iconNew = new ImageIcon("new.png");
     public static ImageIcon iconOpen = new ImageIcon("C:\\Users\\Оржеховский\\Documents\\NetBeansProjects\\interfeis\\src\\Subimages/open.png");
     public static ImageIcon iconSave = new ImageIcon("C:\\Users\\Оржеховский\\Documents\\NetBeansProjects\\interfeis\\src\\Subimages/save.png");
     public static ImageIcon iconStart = new ImageIcon("start.png");
     public static JMenuItem save = new JMenuItem("Save",  iconSave);
     public static JMenuItem open = new JMenuItem("Open", iconOpen);
     public static JMenuItem start = new JMenuItem("Start", iconStart); */
    //Подпункты меню для File
    public static JMenuItem close = new JMenuItem("Close", iconClose);
    public static JMenuItem spravka1 = new JMenuItem("About programm");

    //Подпункты меню для Tapalogy
    public static JMenu circle = new JMenu("Кольцо");
    public static JMenu star = new JMenu("Звезда");
    public static JMenu tire = new JMenu("Шина");

    //Подпункты меню для Circle
    public static JMenuItem democircle = new JMenuItem("Демонстрация");
    public static JMenuItem teorcircle = new JMenuItem("Теория");
    public static JMenuItem traincircle = new JMenuItem("Тренажер");
    //Подпункты меню для Star
    public static JMenuItem demostar = new JMenuItem("Демонстрация");
    public static JMenuItem teorstar = new JMenuItem("Теория");
    public static JMenuItem trainstar = new JMenuItem("Тренажер");
    //Подпункты меню для Tire
    public static JMenuItem demotire = new JMenuItem("Демонстрация");
    public static JMenuItem teortire = new JMenuItem("Теория");
    public static JMenuItem traintire = new JMenuItem("Тренажер");
    
  public static Panel1 panel = new Panel1();
  
  
  
    public Workspace() {

        //ПРИ НАЖАТИИ НА ОПРЕДЕЛЕНЫЕ КЛАВЫШИ БУДЕТ ПРОИСХОДИТЬ ОПРЕДЕЛЕННОЕ ДЕЙСТВИЕ(НАПРИМЕР ПРИ НАЖАТИИ НА КЛАВИШУ CTR+W ПРОГРАММА ЗАКРОЕТСЯ)
        file.setMnemonic(KeyEvent.VK_F);
        /* start.setMnemonic(KeyEvent.VK_S);
         start.setToolTipText("Start training");*/
        spravka1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F1, ActionEvent.CTRL_MASK));
        close.setToolTipText("Exit application");
        close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, ActionEvent.CTRL_MASK));

        //Заголовок окна и его размер
        setTitle("Start page");
        setSize(600, 400);
        // УКАЗЫВАЕТСЯ ГДЕ ИМЕННО БУДЕТ РАСПОЛОГАТСЯ ОКНО ПРОГРАММЫ ПОСЛЕ ЗАПУСКА
        toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation((size.width - getWidth()) / 2, (size.height - getHeight()) / 2);// ПРИ ОТКРЫТИИ ОКНА ОНО БУДЕТ РАСПОЛОЖЕНО ПО ЦЕНТРУ ЭКРАНА

       //ДОБАВЛЕНИЕ ПОДМЕНЮ ДЛЯ ПУНКТА МЕНЮ ФАЙЛ
       /* file.add(start);
         file.add(open);
         file.add(save);*/
        file.add(spravka1);
        file.addSeparator();
        file.add(close);
        //ДОБАВЛЕНИЕ ПОДМЕНЮ ДЛЯ ПУНКТА МЕНЮ ТОПОЛОГИЯ

        star.add(demostar);
        star.add(teorstar);
        star.add(trainstar);

        topology.add(circle);
        tire.add(demotire);
        tire.add(teortire);
        tire.add(traintire);

        topology.add(tire);
        circle.add(democircle);
        circle.add(teorcircle);
        circle.add(traincircle);
        topology.add(star);

        options.add(sbar);

        //ДОБАВЛЕНИЕ НА ПАНЕЛЬ 
        Jbar.add(file);
        Jbar.add(options);
        Jbar.add(topology);

        JF.add(Jbar);

        setJMenuBar(Jbar);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

     
        spravka1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                pane.setVisible(false);
                add(panel);
                panel.setVisible(true);
                
               
               setVisible(true); // ОЧЕНЬ ВАЖНО ПОЗВОЛЯЕТ МОМЕНТАЛЬНО ОТОБРОЖАТЬ ТЕСТОВОЕ ПОЛЕ

            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setResizable(false);

        addWindowListener(new WindowListener() {

            public void windowClosing(WindowEvent event) {
                Object[] options = {"Да", "Нет!"};
                int n = JOptionPane
                        .showOptionDialog(event.getWindow(), "Закрыть окно?",
                                "Подтверждение", JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE, null, options,
                                options[0]);
                if (n == 0) {
                    event.getWindow().setVisible(false);
                    System.exit(0);
                }
            }

            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }

        });
        
        demostar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                   panel.setVisible(false);
             add(pane);
             pane.setVisible(true);
           
               pane.setCoord(5, 5, 400, 400);
           
            }

        });
    }

    public static void REACTIONS() {

        // ПРИ НАЖАТИИ НА КНОПКУ ЗАКРЫТЬ ПРОГРАММА БУДЕТ ЗАКРЫВАТСЯ
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                toolkit.beep();   //ИЗДАЕТ ЗВУК ПРИ НАЖАТИИ
                Zakritie buttons = new Zakritie();
                buttons.setVisible(true);

            }
        });

        sbar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                if (sbar.isVisible()) {
                    TextFile.write("config.txt", "Show=1");
                } else {
                    TextFile.write("config.txt", "Show=0");
                }

            }

        });

        

    }

    public static void main(String[] args) {
        // TODO code application logic here

        new Workspace();
        REACTIONS();
    }
}
