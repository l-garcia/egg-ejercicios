
package Ejercicio12;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio12 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    LetraService letraService=new LetraService();
    letraService.dni();
    letraService.dnis();
    
    
    }

}
