/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese la cantidad de grados centigrados");
        double grados;
        grados = leer.nextDouble();
        double f = 32 + (9*grados/5);
        System.out.println("la cantidad de grados Fahrenheit es "+ f);
     
     
     
     
    }
    
}
