/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        double disc , a , b,c, x1=0,x2=0;
        System.out.println("ingrese el caheficiente A");
        a=leer.nextDouble();
        System.out.println("ingrese el caheficiente B");
        b=leer.nextDouble();
        System.out.println("ingrese el caheficiente C");
        c=leer.nextDouble();
        
        disc =Math.pow(b, 2)-4*a*c;
        
        if (disc>0){
          x1=(-b+Math.sqrt(disc))/(2*a);
          x2=(-b-Math.sqrt(disc))/(2*a);
        }
        if (disc==0){
            x1=x2=-b/2;
        }
        
        if (disc<0){
            System.out.println("el discriminante es menor a 0");
        }
        System.out.println("x1= "+ x1);
        System.out.println("x2 = "+ x2);
        System.out.println("Discriminante= "+disc);
        
    }
    
}
