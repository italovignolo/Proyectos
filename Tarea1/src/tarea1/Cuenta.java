/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author Insuco
 */
public class Cuenta {
   //atributos de la clase
    private String Titular;
    private double Cantidad; //puede ser float en vez de double

//constructores
 public Cuenta(String Titular_input){
     this.Titular = Titular_input;
     this.Cantidad = 0;
 }
 
 public Cuenta(String Titular_input, double Cantidad_input){
     this.Titular = Titular_input;
     this.Cantidad = Cantidad_input; 
  }

 public String getTitular(){//devuelve titular
    return this.Titular;
}
 
 public double getCantidad(){//devuelve cantidad
    return this.Cantidad;
 }
 
 public void setTitular(String Titular_input){//asigna valor a titular 
     this.Titular=Titular_input;}
 
 public void setCantidad(double Cantidad_input){
     this.Cantidad=Cantidad_input;
 }
           
 public void ingresar(double Cantidad_input){
     if(Cantidad_input>=0){
     this.Cantidad = this.Cantidad + Cantidad_input;
 }else{
     System.out.println("ingresó un valor negativo");
     }   
 }
 
 public void retirar (double Cantidad_input){
     if(Cantidad_input > this.Cantidad){
     System.out.println("Se retiró "+ this.Cantidad);
         this.Cantidad = 0;
     }else{
     this.Cantidad = this.Cantidad - Cantidad_input;
     }
 }
 public void Mostrar_titular_cuenta(){
     System.out.print("\n El deudor es: "+this.Titular+" "+getCantidad());
 }
}

