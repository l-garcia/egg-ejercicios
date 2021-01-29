package Ejercicio27;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
       
        String dig1,dig2,dig3,dig4,dig5;
        for (int i = 0; i < 10; i++) {
            dig1= Integer.toString(i);
            for (int j = 0; j < 10; j++) {
                dig2= Integer.toString(j);
                for (int k = 0; k < 10; k++) {
                    dig3= Integer.toString(k);
                    for (int l = 0; l < 10; l++) {
                        dig4= Integer.toString(l);
                        for (int m = 0; m < 10; m++) {          
                            dig5= Integer.toString(m);
                            String cadena=(dig1 + "-" + dig2 + "-" + dig3 + "-" + dig4 + "-" + dig5);
                            cadena = cadena.replaceAll("3", "E");
                            System.out.println(cadena);

                           
                            

                        }

                    }

                }

            }

        }

    }

}
