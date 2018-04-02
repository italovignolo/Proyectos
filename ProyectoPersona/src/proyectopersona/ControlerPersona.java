
package proyectopersona;

import java.util.AbstractList;
import java.util.ArrayList;
public class ControlerPersona {
    private int Id_persona;
    private String Nombre;
    private String Apellido;
    private int Edad;
    
    public ControlerPersona(){}
    
    public ControlerPersona(int Id_persona, String Nombre, String Apellido, int Edad){
        this.Id_persona = Id_persona;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
    
    }
    
    public ArrayList<ControlerPersona> mostrarPersonas(){
        ArrayList<ControlerPersona> personas = new ArrayList<ControlerPersona>();
    /*Pedir al modelo Arraylist
        de personas para devolverlo a la vista*/
        ModeloPersona modelo_personas = new ModeloPersona();
        personas = modelo_personas.getPersonas();
        //Recibimos los datos y luego los enviamos a la vista
        return personas;
    }

    public int getId_persona() {
        return Id_persona;
    }

    public void setId_persona(int Id_persona) {
        this.Id_persona = Id_persona;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    public boolean Insertar_persona(String Nombre, String Apellido, String Edad){
        try{
            int Edad_trans = Integer.parseInt(Edad);
            //Enviamos los datos al modelo y recibimos true or false.
            boolean resultado;
            ModeloPersona nueva_persona = new ModeloPersona();
            nueva_persona.guardarPersona(Nombre, Apellido, Edad_trans);
            return true;
        }catch(Exception e){
            System.out.println("Error en la validación");
            return false;
        }
    }
    
    public boolean Eliminar_persona(String Id_persona_input){
        try{
            int Id_persona = Integer.parseInt(Id_persona_input);
            //enviar ID al modelo para eliminar persona.
            ModeloPersona modelo = new ModeloPersona();
           return modelo.eliminarPersona(Id_persona);
            
        }catch(Exception e){
            return false;
        }
    }

    public boolean Editar_persona(String Id_persona_input){
        try{
            //Integer Id_persona = Integer.valueOf(Id_persona_input);
            int Id_persona = Integer.parseInt(Id_persona_input);
            //Enviamos Id de la persona al modelo para ver
            //si existe
            ModeloPersona modelo = new ModeloPersona();
            ControlerPersona persona = modelo.getPersona(Id_persona);
            System.out.println(persona.getNombre());
            //Instanciar vista editar
            ViewEditar ventana_editar = new ViewEditar(persona);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
  public boolean actualizar_persona(int Id_persona, String Nombre, String Apellido, String Edad){
      try{
          int Edad_t = Integer.parseInt(Edad);
          ModeloPersona modelo = new ModeloPersona();
          boolean resultado = modelo.updatePersona(Id_persona, Nombre, Apellido, Edad_t);
          return resultado;
      }catch(Exception e){
          return false;
      }
      
  }
}
  

    