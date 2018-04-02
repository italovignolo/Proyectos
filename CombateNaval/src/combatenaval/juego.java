/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combatenaval;

/**
 *
 * @author Insuco
 */
import java.util.Scanner;
public class juego {
    
    private String nombre_jugador;
    private int[][] tablero = new int[4][4];
    private int cantidad_de_barcos_maximo = 4;
    
    public juego(String nombre_jugador){
        this.nombre_jugador = nombre_jugador;
        this.setTablero();
        this.posicionar_barcos();
    }
        
    private void setTablero(){
        for(int fila=0; fila<4;fila++){
            for(int columna=0; columna<4; columna++){
                this.tablero[fila][columna]=0;
                
            }
        }
    }
    
   private void ingresar_barco(){
       int fila, columna;
       Scanner ingresar = new Scanner(System.in);
       System.out.println("Ingresa la fila: ");
       fila = ingresar.nextInt();
       System.out.println("Ingrsar la columna: ");
       columna = ingresar.nextInt();
       this.tablero[fila][columna] = 1;//agrego barco
       System.out.println("Barco ingresado en la pos "+fila+","+columna);
   } 
   
   public void posicionar_barcos(){
       int contador = 1;
       while(contador <= this.cantidad_de_barcos_maximo){
           this.ingresar_barco();
           contador++;
       }
   }
   
   private void atacar_jugador(juego oponente, int fila, int columna){
       if(oponente.tablero[fila][columna]==1){
           System.out.println("ATAQUE EFECTIVO!");       
           oponente.tablero[fila][columna] = 0;
   }else{
           System.out.println("ATAQUE FALLIDO BITCH!");
       }
}
}
