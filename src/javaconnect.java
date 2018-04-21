 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhishek
 */
public class javaconnect {
    
    public static Connection createConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3306/LibraryNew?autoReconnect=true&useSSL=false";
         
                Connection conn = (Connection) DriverManager.getConnection(connectionUrl,"root","");
                System.out.println("Database Connected Successfully");
                return conn;
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }catch (SQLException ex) {
                Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
               
            }
         return null;
    }
    
}
