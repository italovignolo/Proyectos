
package pruebamodulo5;

import java.sql.*;
public class ModelPrueba {
    private static final String usuario = "root";
    private static final String contrasena = "";
    private static final String enlace= "jdbc:mysql://localhost:3306/prueba";
    private Connection conexion;
    private Statement smt = null;
    
    public ModelPrueba(){
        try{
            this.conexion=DriverManager.getConnection(enlace, usuario, contrasena);
            System.out.println("Conexión Exitosa");
            this.smt=(Statement)this.conexion.createStatement();
        }catch(SQLException e){
            System.err.println("ERROR!!!");
        }
    }
    
    
}
