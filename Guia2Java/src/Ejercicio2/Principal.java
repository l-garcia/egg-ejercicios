package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        Circunferencia radio = new Circunferencia();
        System.out.println("ingrese el Radio de la Circunferencia");
        radio.setRadio(sc.nextDouble());
        System.out.println("el area es: "+radio.area());
        System.out.println("el radio es: " + radio.perimetro());

    }

}
