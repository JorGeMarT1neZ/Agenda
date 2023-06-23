

package modelo;
import java.sql.*;
/**
 *
 * @author jorge
 */
public class ConnectionBBDD {
    
    private Connection conexion ; 
    private String  url; 
    
    public ConnectionBBDD() {
        try{
            this.conexion = DriverManager.getConnection(this.url,"root","");
        }catch(Exception ex){
            
        }
        this.url = "jdbc:mysql://localhost/infopeople";
    }
}
