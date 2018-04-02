
package trabajomodulo5;

import java.sql.*;

public class ModelMapeo {
    private static final String Usuario = "root";
    private static final String Contraseña ="root";
    private static final String Enlace = "jdbc:mysql://localhost:8889/mapeo";
    private Connection conexion;
    private Statement smt = null;
    
    public ModelMapeo(){
        try{
            this.conexion = DriverManager.getConnection(Enlace, Usuario, Contraseña);
            System.out.println("Conexión exitosa");
            this.smt = (Statement) this.conexion.createStatement();
            
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    
}
