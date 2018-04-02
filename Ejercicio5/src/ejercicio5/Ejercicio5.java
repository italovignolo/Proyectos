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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno1 = new Alumno("juan", "llallai", 45854);
        ArrayList<Double> notas_mate = new ArrayList<Double>();
    
    notas_mate.add(5.5);
    notas_mate.add(5.3);
    notas_mate.add(6.3);
    
     ArrayList<Double> notas_lenguaje = new ArrayList<Double>();
     
     notas_lenguaje.add(5.2);
     notas_lenguaje.add(6.5);
     notas_lenguaje.add(2.0);
     
     ArrayList<Double> notas_biologia=new ArrayList<Double>();
    notas_biologia.add(4.1);
    notas_biologia.add(7.0);
    notas_biologia.add(6.1);
    
    alumno1.setNotas(notas_biologia);
    alumno1.calcular_promedio();
   
   ArrayList asignaturas = new ArrayList<>();
   
   asignaturas.add(notas_mate);
   asignaturas.add(notas_lenguaje);
   asignaturas.add(notas_biologia);
   
    
    alumno1.setAsignaturas(asignaturas);
    //System.out.println(asignaturas);
    
    alumno1.setPromedio_asignatura(6.8);
    alumno1.aprobar_curso();
    
   
      }

    }
    
}
