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
public class ProyectNim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biblioteca nuevo_libro = new Biblioteca("El Capital ","Karl Marx", "4ta", 10, 7);
        
        //nuevo_libro.Mostrar_libro();
        
        nuevo_libro.disponibilidad_libros();
    }
    
}
