/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio9;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double x , y;
        System.out.println("ingrese el valor del eje X");
        x=leer.nextDouble();
         System.out.println("ingrese el valor del eje Y");
        y=leer.nextDouble();
        
        if (x>0 & y>0){
            System.out.println("estas en el primer cuadrante");
        }
         if (x<0 & y>0){
            System.out.println("estas en el segundo cuadrante");
        }
          if (x<0 & y<0){
            System.out.println("estas en el tercer cuadrante");
        }
           if (x>0 & y<0){
            System.out.println("estas en el cuarto cuadrante");
        }
        
         if (x==0 & y>0){
            System.out.println("estas sobre Y positivo");
        }
          if (x==0 & y<0){
            System.out.println("estas sobre Y negativo");
        }
           if (x>0 & y==0){
            System.out.println("estas sobre x positivo");
        }
            if (x<0 & y==0){
            System.out.println("estas sobre x negativo");
        }
    }
    
}
