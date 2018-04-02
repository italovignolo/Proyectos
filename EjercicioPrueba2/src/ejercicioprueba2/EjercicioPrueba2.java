/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba2;
import java.util.Scanner;
/**
 *
 * @author italo
 */
public class EjercicioPrueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        Contador cont1 = new Contador();
        int n;
        System.out.println("Ingrese valor para inicializar contador: ");
        n = sc.nextInt();
        
        cont1.setCont(n);
        cont1.incrementar();
        System.out.println(cont1.getCont());
        
        cont1.incrementar();
        cont1.decrementar();
        System.out.println(cont1.getCont());
        
        cont1.decrementar();
        System.out.println(cont1.getCont());
        
        System.out.println("------------------");
        Contador cont2 = new Contador(10);
        cont2.incrementar();
        System.out.println(cont2.getCont());
        cont2.decrementar();
        System.out.println(cont2.getCont());
        
        Contador cont3 = new Contador(cont2);
        
        System.out.println(cont3.getCont());
        
    }
    
}
