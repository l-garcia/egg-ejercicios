package Ejercicio40;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        int[][] matriz = new int[3][3];
        int[][] simetrica = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                
                System.out.print(matriz[i][j]);

            }
            System.out.println(" ");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                simetrica[i][j] = matriz[j][i]*-1;
                System.out.print(simetrica[i][j]);
            }
            System.out.println(" ");

        }
         {
            
            
        }
    }

}
