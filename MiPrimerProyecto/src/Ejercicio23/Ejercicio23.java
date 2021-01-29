
package Ejercicio23;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio23 {

 
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    int n1,n2,resto =0, cociente=0;
    
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese el segundo numero numero");
        n2=leer.nextInt();
        while(n1>n2){
            cociente++;
            n1=n1-n2;
        }
        resto=n1;
        System.out.println("el cociente es: "+ cociente);
        System.out.println("el resto es: "+ resto);
        
    
    
    
    
    
    }

}
