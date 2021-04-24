package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebas Villanueva
 */
public class PostgreConnection {
    Connection connection; 
    String url = "jdbc:postgresql://localhost:5432/SistemaDeSubastas";
    String user = "postgres";
    String password  = "kungfutai";
    
    public Connection dbConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgreConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("picha picha");
        }
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conectado papi");
            //System.out.println("Conectado pa");
        } catch (SQLException ex) {
            Logger.getLogger(PostgreConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("picha");
        }
        
        return connection;
    };
    
    public static void main(String[] args){
        PostgreConnection db = new  PostgreConnection();
        
        db.dbConnection();
    }
}
