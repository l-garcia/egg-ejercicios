
package Ejercicio7;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Rectangulo rectangulo=new Rectangulo();
    int desplazamiento;
        System.out.println("ingrese la altura");
        rectangulo.setAlto(sc.nextDouble());
        System.out.println("ingrese el largo");
        rectangulo.setLargo(sc.nextDouble());
        rectangulo.Dibujo();
        System.out.println("El perimetro es: "+ rectangulo.Perimetro());
        System.out.println("La superficie es: "+ rectangulo.Superficie());
        System.out.println("cuantos lugares desea desplasarse");
        desplazamiento=sc.nextInt();
        rectangulo.Desplazar(desplazamiento);
    }

}
