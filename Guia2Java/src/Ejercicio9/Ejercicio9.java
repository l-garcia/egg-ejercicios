
package Ejercicio9;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Raices raices = new Raices(1, 2, 1);
    RaicesService raiz=new RaicesService();
    System.out.println(raiz.getDiscrimiante(raices));
    System.out.println(raiz.tieneRaices());
    System.out.println(raiz.tieneRaiz());
    raiz.obtenerRaices(raices);
    raiz.obtenerRaiz(raices);
    raiz.calcular(raices);
    }

}
