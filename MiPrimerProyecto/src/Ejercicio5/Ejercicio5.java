/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        
        int mins,horas = 0 , dias = 0;
        System.out.println("ingrese la cantidad de minutos");
        mins= leer.nextInt();
        
        while (mins>=60){
            mins=mins-60;
            horas=horas+1;
            
        }
        while (horas>=24){
           horas = horas-24;
           dias= dias+1;
            
        }
        
        System.out.println(dias + " dias, "+horas+" horas, "+mins + " minutos");    
                    
                    
        
                    
        
        
        
        
        
    }
    
}
