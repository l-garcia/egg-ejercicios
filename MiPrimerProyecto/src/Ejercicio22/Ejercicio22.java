package Ejercicio22;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num, pares = 0, impares = 0, suma = 0, contador = 0;

        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            contador++;
            if (num > 0) {
                suma = suma + num;
            }
            if (num % 5 == 0) {
                System.out.println("se encontro un multiplo de 5 y no cuenta");
                break;
            }
            if (num % 2 == 0) {
                pares++;
            }
            if (num % 2 != 0) {
                impares++;
            }

        } while (num % 5 != 0);

        System.out.println("se ingresaron " + contador + " numeros");
        System.out.println("se ingresaron " + pares + " numeros pares");
        System.out.println("se ingresaron " + impares + " numeros impares");
        System.out.println("la suma total es: " + suma);
    }

}
