/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package example.BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Илья
 */
public class BD {
   public static String servName = "localhost";
    public static String bdname = "diplom_tests";
    public static String url = "jdbc:mysql://" + servName + "/" + bdname + "?useUnicode=true&characterEncoding=utf8";
    public static String user = "root";
    public static String pass = "";
    public static String query;

    public static Connection connection;
    public static void main(String[] args) {
       try {
            connection = DriverManager.getConnection(url, user, pass);
           // TODO code application logic here
           Statement stmt;ResultSet rs;
           stmt = connection.createStatement();
           query="Select answer.answer from answer natural join question where answer.id=id_question";
  
               rs = stmt.executeQuery(query);
               while(rs.next()){
                   System.out.println(rs.getString(1));
                   
               } } catch (SQLException ex) {
           Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
    }
    
}
