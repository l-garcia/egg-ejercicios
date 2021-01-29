package Ejercicio21;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int num, suma = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° numero");
            num = leer.nextInt();
            if (num == 0) {
                System.out.println("se capturo el 0");
                break;
            }
            if (num > 0) {
                suma = suma + num;

            }

        }
        System.out.println("la suma es: " + suma);

    }

}
