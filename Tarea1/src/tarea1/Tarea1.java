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
public class Tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cuenta pers = new Cuenta("Mr. Deudor ",111155);
    System.out.println("El titular de la cuenta es: "+pers.getTitular()+pers.getCantidad());
    Cuenta pers2 = new Cuenta("jose ");
    pers2.ingresar(20000);
    pers.setTitular("cosmefulanito");
    pers.setCantidad(666666);
    pers.ingresar(60000);
    
    
    pers2.retirar(50000);
    
    //pers.Mostrar_titular_cuenta();
    //pers2.Mostrar_titular_cuenta();
    }
    
}
