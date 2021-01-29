
package Ejercicio29;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio29 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    double familias,cantint,edad,promedio,sumaedad=0;
        System.out.println("ingrese la cantidad de familias");
        familias=sc.nextInt();
        for (int i = 0; i < familias; i++) {
            System.out.println("ingrese la cantidad de integrantes de la familia "+(i+1));
            cantint=sc.nextDouble();
            for (int j = 0; j < cantint; j++) {
                System.out.println("ingrese la edad del integrante N° "+(j+1));
                edad=sc.nextDouble();
                sumaedad =sumaedad+edad;
                
            }
           promedio=sumaedad/cantint;
           System.out.println("el promedio de edad de la familia "+(i+1)+" es:"+promedio);
        }
    
    
    
    }

}
