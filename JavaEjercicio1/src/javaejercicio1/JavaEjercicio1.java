/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;

/**
 *
 * @author italo
 */
import java.util.*;
public class JavaEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Ejerc ejercicio = new Ejerc();
        
        //ejercicio.comparar2();
        
        Ejerc2 ejerci = new Ejerc2();
        int a[][] = new int[2][2];
        a[0][0]=7; 
        a[0][1]=3; 
        a[1][0]=8; 
        a[1][1]=5;
        
        ArrayList lista1 = new ArrayList();
        lista1.add(a);
       
       ejerci.setLista1(lista1); 
        
   //System.out.println(lista1);
     
   int b[][] = new int[2][2];
   b[0][0]= 7; b[0][1]=3; b[1][0]=8; b[1][0]=5;
   
   ArrayList lista2 = new ArrayList();
   lista2.add(b);
   
   ejerci.comparacion2();

   
    }
    
}
