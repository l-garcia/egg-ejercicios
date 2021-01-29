/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Lucas Garcia
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
       double minutos, total=0,totalfin;
       String dia , turno;
        System.out.println("ingrese el tiempo de duracion de la llamada en minutos");
        minutos=leer.nextDouble();
        
        if(minutos<=5){
            total=(minutos*1);          
        }
        else if(minutos>5 && minutos<=8){
            total = 5 + (minutos-5)*0.8;
        }
        else if(minutos>8 && minutos<=10){
            total = 5 + 2.4 + (minutos-8)*0.7;
        }
        else if(minutos>10){
            total=5+2.4+1.4+(minutos-10)*0.5;
        }
        
        System.out.println("ingrese el dia de la llamada");
        dia=leer.next();
        dia=dia.toLowerCase();
        
        switch(dia){
            case "domingo":
                 totalfin=total*1.03;
                 System.out.println("su total es "+total + " + 3% de impuesto: "+
                         totalfin);
                 break;
            default:
                System.out.println("ingrese si es turno matutino o vespertino");
                turno=leer.next();
                turno=turno.toLowerCase();
                switch (turno){
                    case "matutino":
                        totalfin=total*1.15;
                        System.out.println("su total es "+total + " + 15% de impuesto: "+
                         totalfin);
                        break;
                    case "vespertino":
                        totalfin=total*1.10;
                        System.out.println("su total es "+total + " + 10% de impuesto: "+
                         totalfin);
                        break;
                    default:
                        System.out.println("revisa tu ortografía");
                        break;
                              
                }
            
                
        }
        
                
    
    
    
    }
    
}
