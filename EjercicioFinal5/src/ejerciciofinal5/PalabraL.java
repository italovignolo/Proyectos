/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciofinal5;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author italo
 */
public class PalabraL {
    String palabraMasGrande = "";
    int palabraMasGrandeSize = 0;
    String frase="";
    
    public PalabraL(){}

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPalabraMasGrande() {
        return palabraMasGrande;
    }

    public void setPalabraMasGrande(String palabraMasGrande) {
        this.palabraMasGrande = palabraMasGrande;
    }

    public int getPalabraMasGrandeSize() {
        return palabraMasGrandeSize;
    }

    public void setPalabraMasGrandeSize(int palabraMasGrandeSize) {
        this.palabraMasGrandeSize = palabraMasGrandeSize;
    }
    
    public void palabra(){
        Scanner sc = new Scanner(System.in);
       String pl = sc.nextLine();
       this.frase = pl;
    StringTokenizer stTexto = new StringTokenizer(frase);
    
    int palabras = stTexto.countTokens();
     for (int x=0;x<palabras;x++){
	String sCadena = stTexto.nextToken();
                if (sCadena.length() > palabraMasGrandeSize){
    		palabraMasGrande = sCadena;
    		palabraMasGrandeSize = sCadena.length();
                  	}

     }System.out.println(palabraMasGrande+" "+palabraMasGrandeSize);
}

    
    }



