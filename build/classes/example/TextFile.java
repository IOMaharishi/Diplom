package example;


import static example.TextFile.read;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import org.omg.CORBA.Environment;
import java.util.Properties;


public class TextFile  {
public static File file = new File(System.getProperty("user.home"));
    
    //Чтение файла как одной строки
    public static String read(String fileName) {
        
        StringBuilder sb = new StringBuilder();
        
        try {
            BufferedReader in = new BufferedReader(new FileReader( new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally 
                    {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
	
    //Запись файла за один вызов метода
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
	
    public static void checkfile(){
        
       if(file.exists()){System.out.println("Yes");}
       else {System.out.println("No");}
        System.out.println("User Home Path: "+System.getProperty("user.home"));
    }
    
    
    
	
    //Простая проверка
    public static void main(String[] args) {
        
        
        
        checkfile();
        
        //TextFile text = new TextFile("F:\\config.txt");
        //text.write("F:\\config.txt");
        //Разбиение на уникальный отсортированный список слов
        //TreeSet<String> words = new TreeSet<String>(
        //    new TextFile("TextFile.java", "\\W+"));
        //Вывод слов, начинающихся с прописной буквы
       // System.out.println(words.headSet("a"));
    }
}