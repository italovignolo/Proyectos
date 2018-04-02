/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresas.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class modeloConsulta {
    
       
         private static final String usuario ="root";   
         private static final String contraseña ="root";
         private static final String enlace = "jdbc:mysql://localhost:8889/italo_db";
         private Connection conexion;
         private Statement smt = null;
         
         public modeloConsulta(){
             try{
                 try{Class.forName("com.mysql.jdbc.Driver");
                 }catch(ClassNotFoundException e){
                     System.err.println(e);
                 }
                 this.conexion = DriverManager.getConnection(enlace, usuario, contraseña);
                 System.out.println("Connexión Exitosa");
                 this.smt = (Statement) this.conexion.createStatement();
             }catch(SQLException e){
                 System.err.println(e);
                 
             }
         }
   
         public double getPromedio(int x){
            double promedio = 0;
            
             // String consulta = "SELECT *FROM persona WHERE Id_persona="+ID;
               try{
 String consulta = "select AVG(`"+x+"`) as Promedio_gasto from tabla_con_estructura_de_archivo_csv;";
 ResultSet resultado = this.smt.executeQuery(consulta);
     
                if(resultado.first()){
                    promedio = resultado.getDouble("Promedio_gasto");
                   
                }
             
            }catch(SQLException e){
                System.err.println(e);
            }
          return promedio;
         } 
         
         public ResultSet getDatos(){
             ResultSet resultado = null;
             try{
                 String consulta = "SELECT *FROM tabla_con_estructura_de_archivo_csv";
                 resultado = this.smt.executeQuery(consulta);
             }catch(SQLException e){
                 System.out.println(e);
             }
             return resultado;
         }
        
         public void cerrar_conexion(){
            try{
                this.smt.close();
            }catch(SQLException e){
                System.err.println(e);
            }
          
        }
         
         public ArrayList tablaTotal(){
        ArrayList<ControlerTabla> Empresas = new ArrayList<ControlerTabla>();
        try{
            String consulta = "SELECT *FROM tabla_con_estructura_de_archivo_csv";
            ResultSet resultado = this.smt.executeQuery(consulta);
            while(resultado.next()){
                int N = resultado.getInt("N");
                String Nombre = resultado.getString("Nombre");
                int a2005 = resultado.getInt("a2005");
                int a2006 = resultado.getInt("a2006");
                int a2007 = resultado.getInt("a2007");
                int a2008 = resultado.getInt("a2008");
                int a2009 = resultado.getInt("a2009");
                int a2010 = resultado.getInt("a2010");
                int a2011 = resultado.getInt("a2011");
                int a2012 = resultado.getInt("a2012");
                int a2013 = resultado.getInt("a2013");
                int a2014 = resultado.getInt("a2014");
                int a2015 = resultado.getInt("a2015");
                ControlerTabla Tabla = new ControlerTabla(N, Nombre, a2005, a2006, a2007, a2008, a2009, a2010, a2011, a2012, a2013, a2014, a2015);
                Empresas.add(Tabla);
            }
            return Empresas;
        }catch(SQLException e){
            System.err.println(e);
        }
        return null;
    }
}
