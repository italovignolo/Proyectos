/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

/**
 *
 * @author Insuco
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ViewInsert {
        public ViewInsert(){
            iniciar();
        }
        private void iniciar(){
            JFrame marco = new JFrame ("Ingresar Nueva Persona");
            marco.setSize(500, 500);
            JPanel panel = new JPanel();
            posicionarFormulario(panel);
            marco.add(panel);
            marco.setVisible(true);
        }
        
        private void posicionarFormulario(JPanel mi_panel){
            GridLayout grid = new GridLayout(4,2);
            mi_panel.setLayout(grid);
            
            JTextField nombre_input = new JTextField();
            JTextField apellido_input = new JTextField();
            JTextField edad_input = new JTextField();
            
            JLabel nombre_label = new JLabel("Ingresa tu Nombre");
            JLabel apellido_label = new JLabel("Ingresa tu Apellido"); 
            JLabel edad_label = new JLabel("Ingresa tu Edad"); 
        
            JButton boton_guardar = new JButton("Registrar Persona");
            
        boton_guardar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Enviar datos al controlador para que los guarde
                    ControlerPersona nueva_persona = new ControlerPersona();
                    boolean resultado;
                    resultado = nueva_persona.Insertar_persona(nombre_input.getText(), apellido_input.getText(), edad_input.getText());
                    if(resultado){//true
                        JOptionPane.showMessageDialog(null, "Nueva Registrada en la BD");
                    }else{
                        JOptionPane.showMessageDialog(null, "ERROR!! no logramos procesar tu silocitud.");
                    }
                }
            
        });
            
        mi_panel.add(nombre_label);
        mi_panel.add(nombre_input);
        mi_panel.add(apellido_label);
        mi_panel.add(apellido_input);
        mi_panel.add(edad_label);
        mi_panel.add(edad_input);
        mi_panel.add(boton_guardar);
        }
}
