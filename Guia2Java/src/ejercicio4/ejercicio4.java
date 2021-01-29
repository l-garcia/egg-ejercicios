package ejercicio4;

import java.util.Locale;
import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

        Punto distancia = new Punto();
        System.out.println("ingrese el primer punto, primero x luego y");
        distancia.setX1(sc.nextInt());
        distancia.setZ1(sc.nextInt());
        System.out.println("ingrese el segundo punto, primero x luego y");
        distancia.setX2(sc.nextInt());
        distancia.setZ2(sc.nextInt());
        System.out.println("la distancia es: "+distancia.distancia());
    
    
    
    
    }

}
