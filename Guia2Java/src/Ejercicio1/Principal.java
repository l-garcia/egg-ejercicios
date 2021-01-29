package Ejercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        Libro libro = new Libro();

        libro.setAutor("Pepe");
        System.out.println("ingrese el ISBN");
        libro.setIsbn(sc.nextInt());
        libro.setNumeroDePaginas(99);
        libro.setTitulo("El Pepe");
        libro.escribirIsbn();

    }

}
