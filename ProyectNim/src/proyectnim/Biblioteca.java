/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectnim;

/**
 *
 * @author Insuco
 */
public class Biblioteca {
    
    private String titulo, nombre_autor, edicion;
    private int  ejemplares, prestamos;
    
    public Biblioteca(String titulo, String nombre_autor){
        this.titulo = titulo;
        this.nombre_autor = nombre_autor;
    }
    
    public Biblioteca(String titulo, String nombre_autor, String edicion, int ejemplares, int prestamos)
    {   this.titulo = titulo;
        this.nombre_autor = nombre_autor;
        this.edicion = edicion;
        this.ejemplares = ejemplares;
        this.prestamos = prestamos;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getNombre_autor(){
        return this.nombre_autor;
    }
    
    public String getEdicion(){
        return this.edicion;
    }
    
    public int getEjemplares(){
        return this.ejemplares;
    }
    
    public int getPrestamos(){
        return this.prestamos;
    }
    
    //set
    
    public void setTitulo(String titular){
        this.titulo = titular;
    }
    
    public void setNombre_autor(String nombre_autor){
            this.nombre_autor = nombre_autor;}
    
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
    
    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;  
    }
    
    public void setPrestamos(int prestamos){
        this.prestamos = prestamos;
    }
     
    
    //funcion
    public void disponibilidad_libros (){
        System.out.println(this.titulo+" "+this.nombre_autor);
        System.out.println("\nEdición: "+this.edicion);
        int disponibles=this.ejemplares;
        if(disponibles<=(this.ejemplares-this.prestamos)){
            System.out.println("Libro no disponible");
        }else{
            System.out.println("Libro disponible");
        }
        
        System.out.println("Quedan "+disponibles+" libros para prestar");}
        
        
        }
        
            
   
    

    
            
     /*public void Mostrar_libro(){
       System.out.println("el libro es: "+getTitulo()+getNombre_autor());
      }*/

        
    
            

