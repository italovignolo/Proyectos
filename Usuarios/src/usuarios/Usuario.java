/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Insuco
 */
import java.util.Arrays;
import java.util.Scanner;
public class Usuario {
    
    private String nombre, apellido, rut, correo_electronico, fecha_nacimiento; 
    private char sexo;
    private int[] notas = new int[10];//Instanciar un arreglo. se mantiene el control de las 10 notas
    
    public Usuario(String nombre, String apellido, String rut, String Email, String nac, char sexo){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setRut(rut);
        this.setCorreo_electronico(Email);
        this.setFecha_nacimiento(nac);//dia-mes-año
        this.setSexo(sexo);
    }
    
    private void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    private void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    private void setRut(String rut){
        this.rut = rut;
    }
    
    private void setCorreo_electronico(String correo_electronico){
        this.correo_electronico = correo_electronico;
    }
    
    private void setFecha_nacimiento(String fecha_nacimiento){
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
    private void setSexo(char sexo){
        this.sexo = sexo;
    }
    //proceso siempre es void
    public void mostrar_dia_de_nac(){
        String[]partes = this.fecha_nacimiento.split("-");//esta funcion separa una cadena de texto por guiones
        System.out.println(partes[0]);
    }
    public String extraer_dia_de_nac(){
        String[]partes = this.fecha_nacimiento.split("-");
        return partes[2];
    }
    public String[] formatear_fecha(){//dia-mes-año [0]=día[1]=mes[2]=año
        String[] fecha_formateada = this.fecha_nacimiento.split("-");
        return fecha_formateada;
    }
    
    public void extraer_dia_de_nacimiento_dos(){
        System.out.println(this.fecha_nacimiento.substring(0,7));//esto genera una subcadena desde el elemento 0, hasta el elemento 2,pero no toma el elemento 2
    }
    
    public void mostrarNotas(){
        for(int posicion=0;posicion<this.notas.length; posicion++){//ciclo para
            System.out.println("notas: "+this.notas[posicion]);
        }
    }
    public void setNotas(){
        int numero;
        Scanner ingresar = new Scanner(System.in);
        for(int posicion=0; posicion<this.notas.length;posicion++){
            System.out.println("Ingresa un valor en la posicion ["+posicion+"] :");
            numero = ingresar.nextInt();//numero se le asigna el valor que ingrese por teclado
            this.notas[posicion] = numero;
        }
    }
    public void ordenamiento_burbuja(){//[0] => 10 y [1] =>15
        int aux;
        for(int contador = 1;contador<this.notas.length;contador++){
            for(int posicion = 0;posicion<this.notas.length - contador;posicion++){
                if(this.notas[posicion]>this.notas[posicion + 1]){
                    aux = this.notas[posicion];
                    this.notas[posicion] = this.notas[posicion + 1];
                    this.notas[posicion + 1] = aux;
                    
                }
            }
        }
    }
    
    public void ordenar_notas_facil(){// estilo java
        Arrays.sort(this.notas);
    }
    
    public void calcular_promedio(){
        int total = 0;
        float promedio;        
        for(int posicion = 0; posicion < this.notas.length; posicion++){
            total = total+this.notas[posicion];
        }
        promedio = total/this.notas.length;
        System.out.println("El promedio del usuario es: "+promedio);
    }
}

