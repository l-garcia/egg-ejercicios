package Ejercicio17;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio17b {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int n , i = 0, num , nummenor = 999999999, nummayor = 0, suma = 0;
        double promedio;
        System.out.println("ingrese la cantidad de numeros");
        n = leer.nextInt();
        do {
            System.out.println("ingrese un numero");
            num = leer.nextInt();
            suma = suma + num;
            i++;

            if (num > nummayor) {
                nummayor = num;

            }
            if (num < nummenor) {
                nummenor = num;

            }
        } while (i < n);

        promedio = suma / n;
        System.out.println("el numero menor es " + nummenor);
        System.out.println("el numero mayor es " + nummayor);
        System.out.println("el promedio es " + promedio);
    }
}
