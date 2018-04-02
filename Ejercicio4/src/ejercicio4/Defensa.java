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
public class Defensa extends Seleccion_de_futbol {
    
    public Defensa(String nombre, String apellido, String color_vest){
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Color_vestimenta=color_vest;
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

    public String getColor_vestimenta() {
        return Color_vestimenta;
    }

    public void setColor_vestimenta(String Color_vestimenta) {
        this.Color_vestimenta = Color_vestimenta;
    }
    @Override
    public void viajar(){}
    
   @Override
    public void disfrutar(){}
    
    @Override
    public void trabajar(){}

        public void defender(){}
    
}
