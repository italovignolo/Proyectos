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
public class Nuevo_proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo objeto_rodrigo = new Ejemplo("Rodrigo ", 33);
        
        objeto_rodrigo.Mostrar_objeto();
        
        Ejemplo clon_objeto_rodrigo = new Ejemplo(objeto_rodrigo);
        
        clon_objeto_rodrigo.setNombre("kakaroto");
        clon_objeto_rodrigo.Mostrar_objeto();
        
        Ejemplo objeto_vacio = new Ejemplo("luis",33);
               
        clon_objeto_rodrigo.edad_objeto(clon_objeto_rodrigo);
    }
    
}
