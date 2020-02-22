/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */

import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    
    Connection cone;
    
    
    public static Connection ConnecrDb(){
       try{
          Class.forName("org.sqlite.JDBC");
          Connection cone = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\bides\\OneDrive\\Desktop\\Library Management System\\LManagement.sqlite");
          return cone;
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
       } 
    }
}
