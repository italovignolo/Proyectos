
package proyectopersona;
import java.util.ArrayList;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ModeloPersona {
        private static final String usuario = "root"; //Usuario por defecto Xampp
        private static final String contrasena = "";
        private static final String enlace = "jdbc:mysql://localhost:3306/milprogramadores";
        private Connection conexion;
        private Statement smt = null;
        
        public ModeloPersona(){
            try{
                this.conexion = DriverManager.getConnection(enlace, usuario, contrasena);
                System.out.println("Conexión exitosa");
                this.smt = (Statement) this.conexion.createStatement();
            }catch(SQLException e){
                System.err.println("Error");
            }
        }
        
        public void showPersona(){
            try{
                Statement smt = (Statement) this.conexion.createStatement();
                /* Objeto Statement que nos permitirá ejecutar consultas
                a nuestra base de datos MYSQL
                */
                String consulta = "SELECT *from persona";//Acá escribimos nuestra consulta a la base de datos (BD)
                String consulta2 = "Select * from persona where apellido='rambo'";
                /*
                INSERT
                SELECT
                UPDATE
                DELETE
                */
                //ResultSet resultado = smt.executeQuery(consulta);
                /*Mostrar resultado en ciclo iterativo*/    
               // System.out.println(resultado);
               // while(resultado.next()){//mientras resultado.next sea verdadero, se va a ejecutar
                        //System.out.println(resultado.getString("Nombre")+" "+resultado.getString("Apellido"));
                   // }
                   smt.close();
                }catch(SQLException e){
                System.err.println(e);
            }
        }
        
        public ArrayList<ControlerPersona> getPersonas(){
            ArrayList<ControlerPersona> personas = new ArrayList<ControlerPersona>();
            try{
                String consulta = "SELECT *FROM persona ";
                ResultSet resultado = this.smt.executeQuery(consulta);
                while(resultado.next()){
                    int Id_persona = resultado.getInt("Id_persona");
                    String Nombre = resultado.getString("Nombre");
                    String Apellido = resultado.getString("Apellido");
                    int Edad = resultado.getInt("Edad");
                    ControlerPersona persona = new ControlerPersona(Id_persona, Nombre, Apellido, Edad);
                    personas.add(persona);
                }
                this.smt.close();
            }catch(SQLException e){
                System.err.println(e);
            }
            
            return personas;
        }
        
        public boolean guardarPersona(String Nombre, String Apellido, int Edad){
            try{
                String consulta ="INSERT INTO persona (`Nombre`, `Apellido`, `Edad`) VALUES ('"+Nombre+"','"+Apellido+"',"+Edad+")";
                this.smt.executeUpdate(consulta);//ejecuto la consulta
                this.smt.close();
                return true;
            }catch(SQLException e){
                System.err.println(e);
                return false;
            }
        }
        
        public boolean eliminarPersona(int Id_persona){
            try{
                String consulta = "DELETE FROM persona WHERE Id_persona="+Id_persona;
                this.smt.executeUpdate(consulta);
                this.smt.close();
                return true;
            }catch(SQLException e){
                return false;
            }
        }
        
        public ControlerPersona getPersona(int Id_persona){
            try{
                String consulta = "SELECT *FROM persona WHERE Id_persona="+Id_persona;
                ResultSet resultado = this.smt.executeQuery(consulta);
                if(resultado.first()){
                    String Nombre = resultado.getString("Nombre");
                    String Apellido = resultado.getString("Apellido");
                    int Edad = resultado.getInt("Edad");
                    ControlerPersona persona = new ControlerPersona(Id_persona, Nombre, Apellido, Edad);
                   this.smt.close();
                    return persona;
                }
            
            }catch(SQLException e){
                return null;
            }
            return null;
        }
        
        public boolean updatePersona(int Id_persona, String Nombre, String Apellido, int Edad){
            try{
                String consulta = "UPDATE persona SET Nombre='"+Nombre+"', Apellido='"+Apellido+"', Edad="+Edad+" WHERE Id_persona=+"+Id_persona;
                this.smt.executeUpdate(consulta);
                this.smt.close();//cerrar conexión a la base de datos
                return true;
            }catch(SQLException e){
                return false;
            }
        }
}
