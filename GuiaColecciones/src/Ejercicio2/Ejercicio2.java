package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Numeros numeros = new Numeros();
        numeros.ingresarNumero();
        numeros.mostrarNumeros();
        numeros.mostrarResultados();

    }

}
