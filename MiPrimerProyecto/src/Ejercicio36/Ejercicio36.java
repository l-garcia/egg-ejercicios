package Ejercicio36;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int n;
        System.out.println("ingrese la longitud de los vectores");

        n = sc.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            vector1[i] = (int) (Math.random() * 10 + 1);
            vector2[i] = (int) (Math.random() * 10 + 1);
            
        }
        for (int i = 0; i < n; i++) {
            if (vector1[i]==vector2[i]) {
                System.out.println("los elementos son iguales");
                System.out.println(vector1[i]+"="+vector2[i]);
                
                break;
            }
        }
    }

}
