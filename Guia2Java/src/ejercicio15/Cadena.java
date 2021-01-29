

package ejercicio15;

import java.util.Locale;
import java.util.Scanner;


public class Cadena {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    private String frase;
    private int longitud;

    public Cadena() {
        frase= sc.next();
        longitud=frase.length();
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
  

}
