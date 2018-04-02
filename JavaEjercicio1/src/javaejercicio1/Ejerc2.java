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
import java.util.ArrayList;

public class Ejerc2 {
    
    public ArrayList lista1 = new ArrayList();
    public ArrayList lista2 = new ArrayList();
    
    public Ejerc2(){}
    
    public Ejerc2(ArrayList lista1, ArrayList lista2){
        this.lista1=lista1;
        this.lista2=lista2;
    }

    public ArrayList getLista1() {
        return lista1;
    }

    public void setLista1(ArrayList lista1) {
        this.lista1 = lista1;
    }

    public ArrayList getLista2() {
        return lista2;
    }

    public void setLista2(ArrayList lista2) {
        this.lista2 = lista2;
    }
    
    public void comparar(){
       ArrayList a = this.lista1;
       ArrayList b= this.lista2;
    int aciertos = 0;
    for(int n=0; n<a.size();n++){
        for(int i=0; i<b.size();i++){
          Object num = a.get(n);   
          if(num == b.get(i)){
              aciertos++;
              
          }
        }
    }
    System.out.println(aciertos);
    }
  public void comparacion2(){
     if(this.lista1.equals(this.lista2)){
         System.out.println("Son iguales");
     }else{
         System.out.println("no lo son");
     }
      
      //for(Object arr: this.lista1){}
  }   
}
