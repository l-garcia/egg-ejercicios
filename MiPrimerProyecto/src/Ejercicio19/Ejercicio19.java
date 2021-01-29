package Ejercicio19;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        double num1, num2, suma, resta, multi, dividir, opcion;
        String salir;
        System.out.println("ingrese el primer numero");
        num1 = leer.nextDouble();
        System.out.println("ingrese el segundo numero");
        num2 = leer.nextDouble();

        do {
            System.out.println("MENU\n1. Sumar \n2. Restar\n3. Multiplicar"
                    + " \n4. Dividir \n5. Salir \nElija opcion:");

            opcion = leer.nextDouble();
            if (opcion == 1) {
                suma = num1 + num2;
                System.out.println("La suma es " + suma);
            }
            if (opcion == 2) {
                resta = num1 - num2;
                System.out.println("La suma es " + resta);
            }
            if (opcion == 3) {
                multi = num1 * num2;
                System.out.println("La suma es " + multi);
            }
            if (opcion == 4) {
                dividir = num1 / num2;
                System.out.println("La suma es " + dividir);
            }
            if (opcion == 5) {
                System.out.println("Realmente desea salir(S/N)");
                salir = leer.next();
                salir = salir.toLowerCase();
                if (salir.equals("s")) {
                   break; 
                }
                if (salir.equals("n")) {
                    opcion=6;   
                }
            }
        } while (opcion != 5);

    }

}


