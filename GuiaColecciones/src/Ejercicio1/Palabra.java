

package Ejercicio1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.Collections;

public class Palabra {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
ArrayList<String> palabra;

    public Palabra() {
        this.palabra = new ArrayList<>();
    }

    public Palabra(ArrayList<String> palabra) {
        this.palabra = palabra;
    }

    public ArrayList<String> getPalabra() {
        return palabra;
    }

    public void setPalabra(ArrayList<String> palabra) {
        this.palabra = palabra;
    }
public void nuevaPalabra(){
    palabra.add(sc.next());
}
public void mostrarPalabras(){
    System.out.println(palabra);
}
public void longitudLista(){
    System.out.println("La longitud es: "+palabra.size());
}
public void ordenarAlfabeticamente(){
Collections.sort(palabra);
System.out.println(palabra);
}
}
