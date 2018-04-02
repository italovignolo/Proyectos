
package ejercicio4ahorcado;

import javax.swing.*;
public class ViewAhorcado {
    
    public ViewAhorcado(){}
    
    public void iniciar(){
        JFrame marco = new JFrame("El ahorcado");
        
        marco.setSize(700, 500);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mi_panel = new JPanel();
        marco.add(mi_panel);
        marco.setVisible(true);
        elementosPanel(mi_panel);
        
    }
    
    public void elementosPanel(JPanel panel){
        
        
    }
    
    
    
}
