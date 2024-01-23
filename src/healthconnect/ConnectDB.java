/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package healthconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yonas
 */
public class ConnectDB {
   
    //singleton design pattern 
    //private attribute 
    //private constructor 
    //public static method 
    
    private static Connection conn = null;
    
    //priate contstructor
    private ConnectDB() {
    }
    
    //static block to initilise values with predifined values 
    static {
        //existed DB in mysql for testing
        String url = "jdbc:mysql://127.0.0.1:3306/OOP";
        String user = "root";
        String password = "1234";
        try {
            conn = DriverManager.getConnection (url, user, password);
        }
        catch (SQLException e ) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null , "The error is: " + e.getMessage());
        }
    }
    //method to return the conn variable
    //I call this method whenever I want to get the conn variable
    public static Connection getConnection () {
        return conn;
    }
}

    

