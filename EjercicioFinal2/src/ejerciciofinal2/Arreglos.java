/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal2;

import java.util.Arrays;

/**
 *
 * @author Insuco
 */
public class Arreglos {
    private int[] arreglo = {5,5,5,2,1,69,78,1,65,1,5};

    public Arreglos() {
    }
    public void repetidos(){
    Arrays.sort(arreglo);
    
    for(int i=1; i<arreglo.length;i++){
        if(arreglo[i-1]==arreglo[i]){
            System.out.println(arreglo[i]);
        }
    }        
    }
    }
    

