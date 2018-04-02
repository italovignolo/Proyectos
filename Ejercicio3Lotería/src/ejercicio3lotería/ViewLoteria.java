    
package ejercicio3lotería;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
public class ViewLoteria {
    public ViewLoteria(){
    }
    private JLabel resultado = new JLabel();
public void iniciar(){
    
    JFrame marco = new JFrame("Super Lotería La Suerte Es La Suerte");
    marco.setSize(500, 300);
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel mi_panel = new JPanel();
    marco.add(mi_panel);
    marco.setVisible(true);
    posicElementos(mi_panel);
}

public void posicElementos(JPanel panel){
    panel.setLayout(null);
    
    JLabel texto1 = new JLabel("Ingresa los números ganadores");
    
    JTextField campo1 = new JTextField();
    JTextField campo2 = new JTextField();
    JTextField campo3 = new JTextField();
    JTextField campo4 = new JTextField();
    JTextField campo5 = new JTextField();
    JTextField campo6 = new JTextField();
    
    JButton boton_jugar = new JButton("JUGAR!!!");

    texto1.setBounds(150, 10, 250, 20);
    campo1.setBounds(10, 50 , 50, 20);
    campo2.setBounds(10, 70, 50, 20);
    campo3.setBounds(10, 90, 50, 20);
    campo4.setBounds(10, 110, 50, 20);
    campo5.setBounds(10, 130, 50, 20);
    campo6.setBounds(10, 150, 50, 20);
    boton_jugar.setBounds(100, 50, 50, 50);
    resultado.setBounds(10, 180, 50, 20);
    
    panel.add(campo6);
    panel.add(texto1);
    panel.add(campo5);
    panel.add(campo4);
    panel.add(campo3);
    panel.add(campo2);
    panel.add(campo1);
    panel.add(boton_jugar);
    panel.add(resultado);
    
    ArrayList<Integer> elegidos = new ArrayList<Integer>();
    int num1 = Integer.parseInt(campo1.getText());
    elegidos.add(num1);
    int num2 = Integer.parseInt(campo2.getText());
    elegidos.add(num2);
    int num3 = Integer.parseInt(campo3.getText());
    elegidos.add(num3);
    int num4 = Integer.parseInt(campo4.getText());
    elegidos.add(num4);
    int num5 = Integer.parseInt(campo5.getText());
    elegidos.add(num5);
    int num6 = Integer.parseInt(campo6.getText());
    elegidos.add(num6);
    
 
    boton_jugar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
           
            ControllerLoteria boton = new ControllerLoteria();
            Integer result = boton.jugar(elegidos);
            
           mostrarmensaje(result);
        }
        
        
    });
    
    
    
}

private void mostrarmensaje(int resultado){
    this.resultado.setText("tus números son ");
}

}
