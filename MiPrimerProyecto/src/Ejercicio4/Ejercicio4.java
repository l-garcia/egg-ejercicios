/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double horas,valor;         
        System.out.println("ingrese el valor de las horas");
        valor= leer.nextDouble();
        System.out.println("ingrese la cantidad de horas trabajadas");
        horas=leer.nextDouble();
        double total = valor * horas;
        System.out.println("la paga total es $" + total);
        
        
        
        
        
        
    }
    
}
