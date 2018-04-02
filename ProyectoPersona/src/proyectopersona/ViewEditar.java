
package proyectopersona;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ViewEditar {
    private ControlerPersona persona;
    
    public ViewEditar(ControlerPersona persona_input){
        this.persona = persona_input;
        iniciar();
    }
    
    private void iniciar(){
        JFrame marco = new JFrame("Editar Persona");
        JPanel panel = new JPanel ();
        psicionarFormulario(panel);
        marco.setSize(500,500);
        marco.setVisible(true);
        marco.add(panel);
    }
    
    private void psicionarFormulario(JPanel mi_panel){
        GridLayout  grid = new GridLayout(4, 2);
        mi_panel.setLayout(grid);
        
        JLabel nombre_label = new JLabel("Ingresar Nombre");
         JLabel apellido_label = new JLabel("Ingresar Apellido");
          JLabel edad_label = new JLabel("Ingresar Edad");
    
    JTextField nombre_input = new JTextField(this.persona.getNombre());
      JTextField apellido_input = new JTextField(this.persona.getApellido());
        JTextField edad_input = new JTextField(""+this.persona.getEdad());
        
        JButton boton_actualizar  = new JButton("Actualizar Datos");
        
        int Id_persona = this.persona.getId_persona();
        
        boton_actualizar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ControlerPersona controlador = new ControlerPersona();
                boolean respuesta = controlador.actualizar_persona(Id_persona, nombre_input.getText(), apellido_input.getText(), edad_input.getText());
                if(respuesta){//respuesta==true
                    JOptionPane.showMessageDialog(null, "Persona Actualizada");
                }else{
                    JOptionPane.showConfirmDialog(null, "ERROR! no hemos podido procesar tu solicitud");
                }
            }
            
        });
        
        mi_panel.add(nombre_label);
        mi_panel.add(nombre_input);
        mi_panel.add(apellido_label);
        mi_panel.add(apellido_input);
        mi_panel.add(edad_label);
        mi_panel.add(edad_input);
        mi_panel.add(boton_actualizar);
    }
}
