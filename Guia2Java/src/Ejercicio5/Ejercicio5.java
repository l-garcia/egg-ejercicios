package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        Tiempo hora = new Tiempo();
        System.out.println("ingrese la hora");
        hora.setHora(sc.nextInt());
        System.out.println("ingrese la minutos");
        hora.setMinutos(sc.nextInt());
        System.out.println("ingrese la segundos");
        hora.setSegundos(sc.nextInt());
        hora.ImprimirHoraCompleta();
    }

}
