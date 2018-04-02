/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;
import java.util.ArrayList;
/**
 *
 * @author Insuco
 */
public class Persona {
    private String Nombre, Apellido, Fecha_nac;
    private String Rut;
    private ArrayList<Double> puntajes;
    
    public Persona(String nombre, String apellido, String rut){
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.Rut=rut;
        
        
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

    public String getFecha_nac() {
        return Fecha_nac;
    }

    public void setFecha_nac(String Fecha_nac) {
        this.Fecha_nac = Fecha_nac;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public ArrayList getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(ArrayList puntajes) {
        this.puntajes = puntajes;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre= " + Nombre + ", Apellido= " + Apellido + ", Fecha_nac= " + Fecha_nac + ", Rut= " + Rut + ", puntajes= " + puntajes + '}';
    }
    
    
    public void promedio_puntajes(){
        double suma=0;
        double promedio;
        for(Double objeto: this.puntajes){//Integer
        suma = suma+objeto;
        }
        promedio=suma/this.puntajes.size();
        System.out.println("el promedio es "+promedio);
        }

    public Persona encontrar_por_rut(ArrayList<Persona> lista_personas, String Rut_a_encontrar ){
        for(Persona objeto_persona: lista_personas){
            if(objeto_persona.getRut()==Rut_a_encontrar){
                return objeto_persona;
            }
        }
    return null;
}
}
    
    

