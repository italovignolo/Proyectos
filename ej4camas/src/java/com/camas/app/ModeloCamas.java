/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.camas.app;

/**
 *
 * @author felipeacj
 */
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCamas {
    private static final String usuario = "root";//Usuario x defecto Xampp
    private static final String contrasena = "";
    private static final String enlace = "jdbc:mysql://localhost:3306/ej4camas";
    private Connection conexion;
    private Statement smt = null;
    
    public ModeloCamas(){
        try{
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
           this.conexion = DriverManager.getConnection(enlace, usuario, contrasena);
           System.out.println("Conexión Exitosa");
           this.smt = (Statement) this.conexion.createStatement();
        }catch(SQLException e){
            System.err.println(e);
        }
    }
    
    public ResultSet getCamas(){
        ResultSet resultado = null;
        try{
            String consulta = "SELECT *FROM camas;";
            resultado = this.smt.executeQuery(consulta);            
        }catch(SQLException e){
            System.err.println(e);
        }
        return resultado;
    }
    
    public void cerrar_conexion(){
        try{
            this.smt.close();
        }catch(SQLException e){
            System.out.println(e);
        }
        
    }
    
    
    /*public Persona getPersona(int Id_persona){
        try{
            String consulta = "SELECT *FROM persona WHERE Id_persona="+Id_persona;
            ResultSet resultado = this.smt.executeQuery(consulta);
            if(resultado.first()){
                String Nombre = resultado.getString("Nombre");
                String Apellido = resultado.getString("Apellido");
                int Edad = resultado.getInt("Edad");
                Persona  persona = new Persona(Id_persona, Nombre, Apellido, Edad);
                this.smt.close();
                return persona;
            }
        }catch(SQLException e){
            return null;
        }
        return null;
    }*/
    
}
