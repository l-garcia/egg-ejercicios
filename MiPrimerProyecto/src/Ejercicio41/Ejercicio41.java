package Ejercicio41;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int suma1 = 0, suma2 = 0, suma3 = 0, suma4 = 0;
        int[][] cuadrado = new int[3][3];
        boolean f=true;
        System.out.println("llena el cuadrado de tal manera que sus filas, columnas, y diagonales sumen 15");
        System.out.println("se llena con numeros del 1 al 9 y no se pueden repetir");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("introduce el numero de la posicion" + i + "," + j);
                cuadrado[i][j] = sc.nextInt();
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("el numero ingresado es incorrecto");
                    f = false;
                    break;
                }
            }
            if (f == false) {
                break;
            }

        }

    
    if (f  ==true) {
   

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cuadrado[i][j]);

            }
            System.out.println(" ");

        }
        int j = 2;
        for (int i = 0; i < 3; i++) {

            suma1 = suma1 + cuadrado[0][i];
            suma2 = suma2 + cuadrado[i][0];
            suma3 = suma3 + cuadrado[i][i];
            suma4 = suma4 + cuadrado[i][j];
            j--;
        }
        if (suma1 == 15 && suma2 == 15 && suma3 == 15 && suma4 == 15) {
            System.out.println("es un cuadrado magico");

        } else {
            System.out.println("no es un cuadrado magico");
        }
    }
}

}
