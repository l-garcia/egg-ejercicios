
package Ejercicio20;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio20 {

 
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    double correcta=0,incorr=0,contador=-1;
    String lectura;
    
        do {
            System.out.println("ingrese una lectura");
            lectura=leer.next();
            contador++;
            if (lectura.equalsIgnoreCase("&&&&&")) {
                break;
            }
            if (lectura.length()==5&&
                    lectura.substring(0, 1).equalsIgnoreCase("x")&& 
                    lectura.substring(4,5).equals("0")) {
                System.out.println("secuencia correcta"); 
                correcta++;
            } else{
                System.out.println("la secuencia es incorrecta");
                incorr++;
            }
            
        } while (!lectura.equals("&&&&&"));
        
        System.out.println("el porcentaje de correctas es "+(correcta*100)/contador) ;
        System.out.println("el porcentaje de incorrectas es "+(incorr*100)/contador) ;
    }

}
