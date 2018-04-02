/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrays;

/**
 *
 * @author Insuco
 */
import java.util.Scanner;
import java.util.ArrayList;
public class EjemploArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<String> mi_primera_lista = new ArrayList<String>();
        
        //String[] nuevo_arreglo = new String[10];
        
        mi_primera_lista.add("Hola Mundo");
        mi_primera_lista.add("Chao Mundo");
        
        
        mi_primera_lista.size();//devuelve el tamaño del arraylist
        
        System.out.println(mi_primera_lista.get(1));
        
        for(int posicion= 0; posicion<mi_primera_lista.size();posicion++){
            System.out.println(mi_primera_lista.get(posicion));  
    }
        
        mi_primera_lista.remove(1);//para eliminar un dato
        
        //recorrer aRRAYLIST con ciclo for-each
        
        mi_primera_lista.add("quepasa");
        mi_primera_lista.add("kgasdi");
        mi_primera_lista.add("mrpollo");
        mi_primera_lista.add("mil programadores");
        mi_primera_lista.add("lospolloshermano");
        mi_primera_lista.add("quepasa");
        mi_primera_lista.add("tetraspasa");
        
        System.out.println("----------------");
        for(String objeto: mi_primera_lista){
            System.out.println(objeto);
        }    
            
           boolean lo_encontro = mi_primera_lista.contains("mil programadores");
           System.out.println(lo_encontro);
       
        ArrayList nueva_lista = new ArrayList<>();   
        
        nueva_lista.add(1);
        nueva_lista.add("pajarones");
        nueva_lista.add(4564);
        nueva_lista.add(nueva_lista);
        
        
        ArrayList conjunto = new ArrayList<>();
        conjunto.add(1234);
        conjunto.add("joveneeess");
        conjunto.add(true);
        conjunto.add(2.65);
        conjunto.add(mi_primera_lista);
        
        System.out.println("---------------------");
        /*for(Object objeto: conjunto){
            System.out.println(objeto);
        }*/
            
        ArrayList<Double> puntajes = new ArrayList<Double>();
        puntajes.add(99.0);
        puntajes.add(85.0);
        puntajes.add(95.0);
        puntajes.add(89.0);
         
       ArrayList<Persona> lista_personas = new ArrayList<Persona>();
       //creamos objeto de persona
       
       Persona persona1 =new Persona("Mr", " Mc Enroe", "17559883-9");
       Persona persona2=new Persona("Juan", " Cosmefulanito", "20556998-k" );
        
       lista_personas.add(persona1);
       lista_personas.add(persona2);
       lista_personas.add(new Persona("Dr", "Strange", "69.544.123-0"));
       
       for(Persona objeto_persona: lista_personas){
           System.out.println(objeto_persona);//objeto_persona.getNombre() para buscar un atributo
       }
       
      /* persona1.setPuntajes(puntajes);
       persona1.promedio_puntajes();*/
       
      //clase día 23
      //modificar un elemento de un ArrayList. Ciclo repetitivo
      //encontrar un elemento
      //eliminar un elemento
      
      //modificar un elemento
      
      for(Persona objeto_persona: lista_personas){
          if(objeto_persona.getRut()== "69.544.123-0"){
          objeto_persona.setNombre("Nano");
      }
      }
      System.out.println(lista_personas.get(2));
      //fin modificar elemento
      
      //encontrar un elemento y mostrarlo
      System.out.println("--------------------------------------");
      for(Persona persona: lista_personas){
          if(persona.getApellido()==" Cosmefulanito"){
              System.out.println(persona);
          }
          
      }
      //fin encontrarlo 1
      //encontrar un elemento a travez de un método
      System.out.println("-----------------------");
      Persona persona_encontrada = persona1.encontrar_por_rut(lista_personas, "20556998-k");
      System.out.println("Persona encontrada");
      System.out.println(persona_encontrada);
      
      System.out.println("---------------------------");
      //eliminar un elemento de la lista de personas en java 7 o menor
      
      for(Persona persona: lista_personas){
          if(persona.getRut()=="20556998-k"){
              lista_personas.remove(persona);
          }
      }
      
      //eliminar un elemento en una sola línea
      
      lista_personas.removeIf(obj -> obj.getRut()=="20556998-k");
      for(Persona obj: lista_personas){
          System.out.println(obj);
      }
      
      //colección genérica----> es un ArrayList que qte permite cualquiert tipo de elemento
      
     ArrayList coleccion = new ArrayList<>();
    
     //control de excepciones. Try Catch
     System.out.println("Ingresa un número entero ");
     Scanner leer = new Scanner(System.in);
     
     
     try{
         //intentar ejecutar el código,
         
         int numero =leer.nextInt();//si este falla intentar la excepción
    }catch(Exception e){
        System.err.println("Solo se permiten en cifars numericas, no palabras bitchhh");
        //Ejecutar la excepción se refiere a ejecutar las líneas de código dentro
        //de las llaves de "catch" -> Capturar
    }
    
    
}

}


//HAY CLASES EXTERNAS Y CLASES INTERNAS (O ANIDADAS
class Ejemplo{
        
        public Ejemplo(){
            
        }
        
        class b{//clase interna o anidada
            
        }
    }
