/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author italo
 */
public class DT extends Seleccion_de_futbol{
    
    public DT(String nombre, String apellido){
        this.Nombre=nombre;
        this.Apellido=apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    @Override
    public void viajar(){}
    
   @Override
    public void disfrutar(){}
    
    @Override
    public void trabajar(){}
}
