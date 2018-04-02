/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioprueba3;

/**
 *
 * @author italo
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro(){}
    
    public Libro(String titulo, String autor, int ejemplares, int prestados){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }
    public String getTitulo(){
        return titulo;
        }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String autor){
        this.autor=autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean prestado = true;
        if(prestados<ejemplares){
            prestados++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    
    public boolean devolucion(){
        boolean devuelto = true;
        if(prestados==0){
            devuelto = false;
        }else{
            prestados--;
        }
        return devuelto;
    }

    @Override
    public String toString() {
        return "Libro " + "\ntitulo=" + titulo + " \nautor= " + autor + " \nejemplares= " + ejemplares + " \nprestados= " + prestados;
    }

    
}
