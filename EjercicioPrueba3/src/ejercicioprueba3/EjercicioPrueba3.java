/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba3;

import java.util.Scanner;

/**
 *
 * @author italo
 */
public class EjercicioPrueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;
        
        Libro libro1 = new Libro("El Quijote", "Cervantes", 1, 0);
        Libro libro2 = new Libro();
        
        System.out.println("Introduce título: ");
        titulo = sc.nextLine();
        System.out.println("Introduce autor: ");
        autor=sc.nextLine();
        System.out.println("Número de ejemplares: ");
        ejemplares=sc.nextInt();
        
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        
        System.out.println("--------------");
        System.out.println("Libro 1: \nTítulo: "+libro1.getTitulo()+"\nAutor: "+libro1.getAutor()+"\nEjemplares: "+libro1.getEjemplares()+"\nPrestados: "+libro1.getPrestados());
        System.out.println("-------------");
    
        if(libro1.prestamo()){
            System.out.println("Se ha prestado el libro "+libro1.getTitulo());
        }else{
            System.out.println("No hay ejemplares del libro "+libro1.getTitulo()+" para prestar");
        }
        
        if(libro1.devolucion()){
            System.out.println("Se ha devuelto el libro: "+libro1.getTitulo());
        }else{
            System.out.println("No se ha prestado el libro "+libro1.getTitulo());
        }
        
        if(libro1.prestamo()){
            System.out.println("Se ha prestado el libro "+libro1.getTitulo());
        }else{
            System.out.println("No hay ejemplares del libro "+libro1.getTitulo()+" para prestar");
        }
        
        System.out.println(libro2.toString());
    }
    
}
