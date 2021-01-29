/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        int num;
        System.out.println("ingrese un numero del 1 al 10");
        num=leer.nextInt();
        switch(num){
            case 1:
                System.out.println("En numero romano es I");
                break;
            case 2:
                System.out.println("En numero romano es II");
                break;
            case 3:
                System.out.println("En numero romano es III");
                break;
            case 4:
                System.out.println("En numero romano es IV");
                break;
            case 5:
                System.out.println("En numero romano es V");
                break;
            case 6:
                System.out.println("En numero romano es VI");
                break;
            case 7:
                System.out.println("En numero romano es VII");
                break;
            case 8:
                System.out.println("En numero romano es VIII");
                break;
            case 9:
                System.out.println("En numero romano es IX");
                break;
            case 10:
                System.out.println("En numero romano es X");
                break;
            default: System.out.println("Fuera de rango");
    }
  }
}

