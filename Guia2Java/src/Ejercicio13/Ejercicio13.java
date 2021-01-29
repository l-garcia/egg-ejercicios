
package Ejercicio13;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio13 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    AhorcadoService ahorcado=new AhorcadoService();
    ahorcado.elegirPalabra();
    ahorcado.intentos();
    ahorcado.longitud();
    
    }

}
