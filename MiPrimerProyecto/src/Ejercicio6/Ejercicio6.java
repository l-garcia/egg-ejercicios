/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio6;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
       
       int a,b,c,d,aux;
       
       a=2;
       b=4;
       c=6;
       d=8;
       System.out.println("el valor de las variables es:");
       System.out.println("A)"+a);    
       System.out.println("B)"+b);
       System.out.println("C)"+c);
       System.out.println("D)"+d);
       aux=b;
       b=c;
       c=a;
       a=d;
       d=aux;
       System.out.println("el valor de las variables cambiadas es:");
       System.out.println("A)"+a);    
       System.out.println("B)"+b);
       System.out.println("C)"+c);
       System.out.println("D)"+d);
       
    }
    
}
