
package Ejercicio1;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
 Palabra palabra = new Palabra();
 palabra.nuevaPalabra();
 palabra.nuevaPalabra();
 palabra.nuevaPalabra();
 palabra.mostrarPalabras();
 palabra.longitudLista();
 palabra.ordenarAlfabeticamente();
    }

}
