/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("Escriba un numero");
       num=leer.nextInt();
       double raiz = Math.sqrt(num);
        System.out.println("el doble es: " + num * 2);
        System.out.println("el triple es: "+ num * 3);
        System.out.println("la raiz cuadrada es " +raiz );
        
                
                
               
        
        
        
        
    }

    private static int leer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
