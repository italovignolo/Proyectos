/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author italo
 */
public class Ejerc {
    
    public int[] n1={1,2,3,1};
    public int[] n2={2,3,1,6};
    
    
    public Ejerc(){};
    public Ejerc(int[] n1, int[] n2){
        this.n1=n1;
        this.n2=n2;
        };

    
    
    public void comparar(){
    int cont=0;
    int total=0;
    int n;
    for(n=0;n<n1.length;n++){
        total++;
        for(int i=0;i<n2.length;i++){
            if(n1[n]==n2[i]){
            cont++;
            System.out.println(cont);
        }
        
        }
        
    }
           double aciertos=cont*100/total;
        System.out.println("porcentaje es de: "+aciertos+" y aciertos son: "+cont);
    }
    
    public void comparar1(){
boolean b;
b=Arrays.equals(n1, n2);
    if(b==true){
    
    }
    }
    
    public void comparar2(){
        
    int aciertos=0;
        for(int posic=0;posic<n1.length;posic++){
    for(int direc=0;direc<n2.length;direc++){
        int num = n1[posic];
        if(num==n2[direc]){
          aciertos++;
        }
    }
    
        }
    System.out.println(aciertos);}

}
