/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author italo
 */
public class Cuenta {
    
    private String titular;
    private double cuenta; 
    
    public Cuenta(String titular_input){
        this.titular=titular_input;
              
   }
   public Cuenta(String titular_input, double cuenta_input){
       this.titular=titular_input;
       this.cuenta=cuenta_input;
   }
   
   public double getCuenta(){
       return this.cuenta;
   }
  public void Mostrar_datos_cuenta(){
        System.out.println("los datos del cliente son: "+this.titular+" y adeuda "+this.cuenta);
   }
   
}
