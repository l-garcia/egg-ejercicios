
package Ejercicio6;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Cancion cancion=new Cancion("hola","mundo");
        System.out.println(cancion.getTituto());
    }

}
