package Ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int dia = 0, mes = 0, año = 0;

        System.out.println("ingrese el dia");
        dia = leer.nextInt();
        System.out.println("ingrese el mes 1 al 12");
        mes = leer.nextInt();
        System.out.println("ingrese el año");
        año = leer.nextInt();

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                if (dia > 31) {
                    System.out.println("la fecha no es correcta");
                } else {
                    System.out.println("la fechas es " + dia + "/" + mes + "/" + año);
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (dia > 30) {
                    System.out.println("la fecha no es correcta");
                } else {
                    System.out.println("la fechas es " + dia + "/" + mes + "/" + año);
                }
                break;
            case 2:
                if (dia > 28) {
                    System.out.println("la fecha no es correcta");
                } else {
                    System.out.println("la fechas es " + dia + "/" + mes + "/" + año);
                }
                break;
        }
    }

}
