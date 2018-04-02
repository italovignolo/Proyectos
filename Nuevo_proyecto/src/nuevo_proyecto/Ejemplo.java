/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo_proyecto;

/**
 *
 * @author Insuco
 */
public class Ejemplo {
    
    private String nombre;
    private int edad;
            
    public Ejemplo(){}//demuestra que argumento() y  puede ir vacío 
    
    public Ejemplo(String nombre_input, int edad_input){
        this.nombre = nombre_input;
        this.edad = edad_input;
       }
    
    public Ejemplo(String nombre_input){
        this.nombre = nombre_input;
        //this.edad = 0;no necesario
    }
    
    //nuevo constructor copia
    public Ejemplo(Ejemplo objeto){//ejemplo:nombre clase; objeto:nombre variable
        this.nombre = objeto.nombre;
        this.edad = objeto.edad;
    }
    
    public void Mostrar_objeto(){
        System.out.println("Nombre: "+this.nombre+"\nedad:"+this.edad);
    }
    
    public void setNombre(String nombre_input){
        this.nombre = nombre_input;
    }
    
    //Función de ejemplo para trabajar con objetos.
    public void edad_objeto(Ejemplo objeto){
        System.out.println(objeto.nombre);
        if(objeto.edad>=18){
            System.out.println("El objeto es mayor de edad");
        }else{
            System.out.println("el objeto es menor de edad");
        }
    }
    
   
        
    
    }
