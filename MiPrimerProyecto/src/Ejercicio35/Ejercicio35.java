
package Ejercicio35;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio35 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    int [] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]=i+1;
        }
        for (int i = 99; i >=0; i--) {
            System.out.println(vector[i]);  
        }
    
    
    
    }

}
