
package ejerciciofinal1;
import java.util.Scanner;
public class Grados {

private double F;
private double C;

    public Grados() {
    }

    public Grados(double F, double C) {
        this.F = F;
        this.C = C;
    }

    public double getF() {
        return F;
    }

    public void setF(double F) {
        this.F = F;
    }

    public double getC() {
        return C;
    }

    public void setC(double C) {
        this.C = C;
    }

public double Farenheit(double Fr){
   
      Scanner entradaEscaner = new Scanner (System.in);
      System.out.println("Ingrese cantidad Farenheit a transformar:");
     // Fr = entradaEscaner.nextDouble ();
      Double Resultado = (Fr-32)/1.8;
      System.out.println(Fr+" grados Farenheit equivalen a: "+Resultado+" Grados Celcius");
      return Resultado;
}

public double Celcius(double CL){
      Scanner entradaEscaner = new Scanner (System.in);
      System.out.println("Ingrese cantidad Celcius a transformar:");
      //CL = entradaEscaner.nextDouble ();
      Double Resultado = CL*1.8+32;
      System.out.println(CL+" grados Celcius equivalen a: "+Resultado+" Grados Farenheit");
      return CL;
}
}
