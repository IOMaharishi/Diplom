package example;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.*;

/**
 *
 * @author Оржеховский
 * КЛАСС РАБОТАЕТ С ФАЙЛОМ ПАРАМЕТРОВ
 */
public class Prop extends Properties {
    
    public static Properties proper = new Properties();
    public  static DataOutputStream os;
    
  //МЕТОД ДЛЯ ЗАНЕСЕНИЯ В ФАЙЛ КОНФИГУРАЦИИ ЗНАЧЕНИЯ
    public static void put(String str){
        proper.put("Show",  str);
        
        try
{
  os = new DataOutputStream(
    new FileOutputStream("F:/config.txt"));
         
  proper.save(os,"");
  os.close();
}
catch(Exception ex)
{
  System.out.println(ex.toString()); 
}
    }
public static String check(){
    System.out.println( proper.getProperty("Show"));
 String str1;
       str1 = proper.getProperty("Show");
       return str1;
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        put("0");
       
        check();
      
    }
}
