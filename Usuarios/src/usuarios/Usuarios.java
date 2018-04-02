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
public class Usuarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario cliente = new Usuario("Felipe", "Catalan", "152223884-0", "hola@mundo.cl", "25-11-66", 'M');
    
        cliente.mostrar_dia_de_nac();
        
        /* String dia;
        dia=cliente.extraer_dia_de_nac();
        System.out.println(dia);
        
        cliente.extraer_dia_de_nacimiento_dos();*/
        
        cliente.setNotas();
        //cliente.mostrarNotas();
        //cliente.ordenamiento_burbuja();
        cliente.ordenar_notas_facil();
        cliente.mostrarNotas();
        cliente.calcular_promedio();
    }
    
}
