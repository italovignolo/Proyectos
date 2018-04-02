/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author italo
 */
public class Alumno extends Persona{
    protected ArrayList<Double>  notas; 
    protected ArrayList<Double> asignaturas;
    protected double promedio_asignatura;
    
    public Alumno(String nombre, String apellido, int rut){
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.rut=rut;
    }
    public Alumno(String nombre, String apellido, int rut, double promedio_asig){
        this.Nombre=nombre;
        this.Apellido=apellido;
        this.rut=rut;
        this.promedio_asignatura=promedio_asig;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public ArrayList<Double> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Double> asignaturas) {
        this.asignaturas = asignaturas;
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

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public double getPromedio_asignatura() {
        return promedio_asignatura;
    }

    public void setPromedio_asignatura(double promedio_asignatura) {
        this.promedio_asignatura = promedio_asignatura;
    }
    
    
    
    @Override
    public void calcular_promedio(){
        double suma = 0;
        double prom;
        for(Double objeto: this.notas){
            suma=suma+objeto;
        }
        prom=suma/this.notas.size();
        System.out.println("el promedio de la asignatura "+" de "+this.Nombre+" "+this.Apellido+" es "+prom);
        }
     @Override
public void aprobar_curso(){
        if(this.promedio_asignatura>5.5){
            System.out.println("Alumno Aprobado con excelencia con promedio "+this.promedio_asignatura);
        }else if(this.promedio_asignatura>=4.0 && this.promedio_asignatura <=5.5){
            System.out.println("Alumno Aprobado de manera relugar con cromedio "+this.promedio_asignatura);
        }else{System.err.println("Alumno reprobado con promedio "+this.promedio_asignatura);
}}

public void borrar_asignatura(){
    for(Persona asignatura: ArrayList.asignaturas.){
        
    }
}


}
