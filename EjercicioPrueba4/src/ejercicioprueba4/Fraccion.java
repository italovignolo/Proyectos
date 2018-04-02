/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba4;

/**
 *
 * @author italo
 */
public class Fraccion {
    
    private int num;
    private int den;

      
    public Fraccion(){
        this.num=0;
        this.den=1;
    }
    
    public Fraccion(int num, int den) {
        this.num = num;
        if(den ==0){
            den=1;
        }
        this.den=den;
        
        
    }
    
    public Fraccion(int num){
        this.num=num;
        this.den= 1;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public void suma(){
        int suma;
        
    }
    
    public Fraccion sumar(Fraccion f){
        Fraccion aux= new Fraccion();
        aux.num = this.num*f.den+this.den*f.num;
        aux.den = this.den*f.den;
        aux.simplificar();
        return aux;
    }
    
    private int mcd() {
    int u = Math.abs(num); //valor absoluto del numerador 
    int v = Math.abs(den); //valor absoluto del denominador
    if (v == 0) {
    return u; }
    int r;
    while (v != 0) {
    r = u % v;
    u = v;
    v = r;
    }
    return u; }
    
    private void simplificar() {
    int n = mcd(); //se calcula el mcd de la fracción 
    num = num / n;
    den = den / n;
}

    
    
}
