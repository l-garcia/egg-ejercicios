package Ejercicio25;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num1, resultado=0,digitos=0;
        System.out.println("ingrese un numero");
        num1 = sc.nextInt();
        resultado=num1;
        while(resultado!=0){
            resultado=resultado/10;
            digitos++;
        }
        System.out.println("la cantidad de digitos es: "+digitos);
        
    }

}
