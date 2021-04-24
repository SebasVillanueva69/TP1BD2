/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Sebas Villanueva
 */
public class OracleConnection {
    Connection connection; 
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String user = "c##sebas";
    String password  = "tiger";
    
    public Connection dbConnection(){
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OracleConnection.class.getName()).log(Level.SEVERE, null, ex);
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
        OracleConnection db = new  OracleConnection();
        
        db.dbConnection();
    }
}
