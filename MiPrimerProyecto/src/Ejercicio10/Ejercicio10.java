/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio10;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("ingresa un numero del 0 al 9999");
        num=leer.nextInt();
        if (num>0 & num<9999){
            if(num % 3 ==0){
                System.out.println("el numero es multiplo de 3");  
            }
            if(num %2==0 ){
                System.out.println("el numero es multiplo de 2");
            }
            if(num % 5 ==0){
                System.out.println("el numero es multiplo de 5");
            }
            else System.out.println("no es multiplo de ninguno");
        }
        
        
        
    }
    
}
