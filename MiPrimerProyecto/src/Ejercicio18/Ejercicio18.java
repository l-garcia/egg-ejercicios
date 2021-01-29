package Ejercicio18;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int n , cant=0;
        float estatura , promediogral , suma=0 , promedio , petiso=0 ;
        System.out.println("cantidad de alturas a ingresar");
        n = leer.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("ingrese la estatura");
            estatura = leer.nextFloat();
            suma = suma + estatura;
            if (estatura < 1.60) {
                petiso = petiso + estatura;
                cant = cant + 1;
            }

        }
        promediogral = suma / n;
        promedio = petiso / cant;
        System.out.println("el promedio general es: " + promediogral);
        System.out.println("el promedio para menores de 1.60 es: " + promedio);

    }

}


