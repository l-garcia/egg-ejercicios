/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
       double valor;
       String tipo;
        System.out.println("ingrese el monto total de tratamiento");
        valor=leer.nextDouble();
                  
        System.out.println("ingrese el tipo de socio (A , B , C)");
        tipo= leer.next();
        tipo=tipo.toLowerCase();
        switch (tipo){
            case "a":
                System.out.println("el precio total es: "+valor*0.5);
                break;
            case "b":
                System.out.println("el precio total es: "+valor*0.65);
                break;
            case "c":
                System.out.println("el precio total es: "+valor);
                break;
            default:
                System.out.println("no ingreso una opcion correcta");
               
        }
        
    }
    
}
