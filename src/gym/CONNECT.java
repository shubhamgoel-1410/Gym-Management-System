/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gym;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author SHADOW
 */
public class CONNECT {
     Connection conn=null;
 public static Connection ConnectDB()
 {
     try
     {
         Class.forName("com.mysql.jdbc.Driver");
         
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/gym","root","shubham");
       // JOptionPane.showMessageDialog(null,"connect to database");
        return conn;
     } catch (Exception e) {
         JOptionPane.showMessageDialog(null,e);
         return null;
     }
    
}
}
