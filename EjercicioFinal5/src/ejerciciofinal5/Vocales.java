/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal5;

import java.util.Scanner;

/**
 *
 * @author italo
 */
public class Vocales {
    
    String frase ="";
    int vocales = 0;
    
    public Vocales(){}
    
    public Vocales(String frase, int vocales){
        this.frase = frase;
        this.vocales = vocales;
    }
    
    public void ContVoc(){
        Scanner sc = new Scanner(System.in);
        this.frase = sc.nextLine();
        
        for(int x=0; x<this.frase.length();x++){
            if((this.frase.charAt(x)=='a')||(this.frase.charAt(x)=='e')||(this.frase.charAt(x)=='i')||(this.frase.charAt(x)=='o')||(this.frase.charAt(x)=='u')
                ||(this.frase.charAt(x)=='á')||(this.frase.charAt(x)=='é')||(this.frase.charAt(x)=='í')||(this.frase.charAt(x)=='ó')||(this.frase.charAt(x)=='ú')){
                this.vocales++;
            }
        }
                    System.out.println("La Frase posee "+this.vocales+" vocales");
    }
    
}
