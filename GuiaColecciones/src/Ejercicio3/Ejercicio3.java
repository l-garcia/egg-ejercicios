
package Ejercicio3;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    Test cantante = new Test();
        cantante.CrearCantante("Arjona", "pinguino");
        cantante.CrearCantante("Challane", "torero");
        cantante.CrearCantante("Mana", "muelle san blas");
        cantante.CrearCantante("Metallica", "Vertigo");
        cantante.CrearCantante("SOAD", "Toxicity");
        cantante.mostrarLista();
        cantante.nuevoCantante();
        cantante.mostrarLista();
        cantante.cambiarLista();
        cantante.mostrarLista();
      
        
    }
    
    }


