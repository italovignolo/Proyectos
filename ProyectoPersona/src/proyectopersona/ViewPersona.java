
package proyectopersona;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.*;
public class ViewPersona {
    public ViewPersona(){
        iniciar();
    }
    public void iniciar(){
        JFrame marco = new JFrame("Admin Persona");
        marco.setSize(1024, 780);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        marco.setVisible(true);
        marco.add(panel);
        posicionarBotones(panel);
    }
    
    private void posicionarBotones(JPanel panel){
        GridLayout grid = new GridLayout(2, 2);
        //panel.setLayout(grid);
        grid.setHgap(10);
        grid.setVgap(10);
        FlowLayout flow = new FlowLayout(5);
        panel.setLayout(flow);
        flow.setHgap(50);
        
        
        JButton boton1 = new JButton("Mostrar Personas");
        JButton boton2 = new JButton("Editar Personas por ID");
        JButton boton3 = new JButton("Eliminar personas por ID");
        JButton boton4 = new JButton("Ingresar Personas");
        
        boton1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewMostrar ventana = new ViewMostrar();
            }
        
        });
        
        boton4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewInsert ventana = new ViewInsert();
            }
            
        });
        boton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               String Id_persona = JOptionPane.showInputDialog(null, "Ingresa el ID a eliminar");
               //llamar al controlador con el método para validar y eliminar
               //a la persona
               ControlerPersona controlador  = new ControlerPersona();
               boolean respuesta = controlador.Eliminar_persona(Id_persona);
               if(respuesta){
                   JOptionPane.showMessageDialog(null, "Persona Eliminada con Éxito!");
               }else{
                   JOptionPane.showMessageDialog(null, "ERROR! no fue procesada tu solicitud");
               }
            }
            
        });
        
        boton2.addActionListener(new ActionListener(){ 
            @Override
            public void actionPerformed(ActionEvent e) {
                String Id_persona = JOptionPane.showInputDialog(null, "Ingresa el Id de la persona a editar");
                ControlerPersona controlador = new ControlerPersona();
                controlador.Editar_persona(Id_persona);
                //Enviamos Id de persona al controlador para ver si existe.
                //En el caso de que exista se visualizará un JFrame para editar
            }
            
        });
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
    }
    
    
    
}

