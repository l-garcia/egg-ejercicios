/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        String letra;
        
        System.out.println("Ingrese una letra");
        letra=leer.next();
        letra=letra.toLowerCase();
        if(letra.contentEquals("a")||letra.contentEquals("e")||
           letra.contentEquals("i")||letra.contentEquals("o")||letra.contentEquals("u")){
           System.out.println("es una vocal"); 
        }
        else System.out.println("no es una vocal");
            
         
                            
        
                
        
        
        
        
    }
    
}
