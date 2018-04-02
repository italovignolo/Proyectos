/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopersona;

import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
public class ViewMostrar {
    
    public ViewMostrar(){
    this.iniciar();}
    
    private void iniciar(){
        JFrame marco = new JFrame("Mostrar Información");
        marco.setSize(700, 700);
        JPanel panel = new JPanel();
        posicionarInformacion(panel);
        marco.setVisible(true);
        marco.add(panel);
    }

private void posicionarInformacion(JPanel panel){
        GridLayout grid = new GridLayout(5 ,4);
        panel.setLayout(grid);
        ControlerPersona controlador = new ControlerPersona();
        ArrayList<ControlerPersona> personas = new ArrayList<ControlerPersona>();
        personas = controlador.mostrarPersonas();
        for(ControlerPersona persona: personas){
            JLabel id_persona = new JLabel("ID "+persona.getId_persona());
            JLabel nombre = new JLabel("Nombre: "+persona.getNombre());
            JLabel apellido = new JLabel("Apellido "+persona.getApellido());
             JLabel edad = new JLabel("Edad "+persona.getEdad());
            panel.add(id_persona);
            panel.add(nombre);
            panel.add(apellido);
            panel.add(edad);
        }
    }
}
