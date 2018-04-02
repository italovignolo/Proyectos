/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incades;

/**
 *
 * @author italo
 */
public class Incades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      String nombre = "italo";
      String apellido = "mansilla";
      String nombre_apellido;
      int cantidad_de_caracteres;
      int menu = 1;
      int contador = 0;        
              
      nombre_apellido  = nombre +" "+ apellido;
      System.out.println(nombre_apellido);
      cantidad_de_caracteres = nombre.length();
      
      System.out.println(cantidad_de_caracteres);
      
      switch (2){
          case 1:
              System.out.println("Menu Administrativo");
              break;
          case 2:
              System.out.println("menu academico");
              break;
      }
      
      
      while(menu < 2){
          System.out.println("mensaje infinito");
          menu++;
      }       
      while(contador < 15){
          
         if(contador==0){
          System.out.println("mensaje infinitix");
      } 
       contador++;//menu=menu+1  
      }
      
      
    }
    
    }
    
