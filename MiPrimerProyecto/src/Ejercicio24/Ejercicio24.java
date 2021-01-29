package Ejercicio24;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int num1, num2, adivina,resultado;
        num1 = (int) Math.floor(Math.random() * (1 - (10 + 1)) + (10));
        num2 = (int) Math.floor(Math.random() * (1 - (10 + 1)) + (10));
        resultado=num1*num2;
        System.out.println(num1+"*"+num2+"=");
        
        do {
            System.out.println("ingrese el resultado");
            adivina=sc.nextInt();
            
        } while (adivina!=resultado);
        
        
    }

}
