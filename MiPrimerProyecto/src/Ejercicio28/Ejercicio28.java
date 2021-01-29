package Ejercicio28;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int num, longitud;
        System.out.println("ingrese el tamaño del cuadrado");
        longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                System.out.print(" * ");
            }
            System.out.println("");

        }

    }
}
