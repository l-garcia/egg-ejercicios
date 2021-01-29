package Ejercicio26;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int num, longitud;
        System.out.println("ingrese la longitud de la escalera");
        longitud = sc.nextInt();

        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
