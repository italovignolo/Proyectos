/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author italo
 */
public class Profesor extends Persona{
    protected String asignatura;
    protected ArrayList<Double> notas;
    
    public Profesor(String nombre, String apellido, int rut){
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.rut=rut;
      
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
    
    @Override
    public void calcular_promedio(){};

@Override
public void aprobar_curso(){}
}
