
package ejercicio3lotería;

import java.util.ArrayList;
import java.util.Random;
public class ControllerLoteria {
    
protected int cantidad_aciertos = 0;
public ArrayList<Integer> loteria = new ArrayList<Integer>();    
protected ArrayList<Integer> aciertos = new ArrayList<Integer>();

public void ControllerLoteria(){}

public Integer jugar(ArrayList<Integer> elegidos){
int i = 0;
Random ran = new Random();

while(i<=6){
    int a = ran.nextInt(40);
    this.loteria.add(a);
    i++;
}
for(int posic=0;posic<elegidos.size();posic++){
    for(int direc=0;direc<loteria.size();direc++){
        int num = elegidos.get(posic);
        if(num==loteria.get(direc)){
            this.cantidad_aciertos++;
        }
        
    }
    
}
return this.cantidad_aciertos;
}


}
