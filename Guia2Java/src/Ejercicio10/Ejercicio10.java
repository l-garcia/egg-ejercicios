package Ejercicio10;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
        FechaService service = new FechaService();
        service.mostrarFecha();
        service.fechaUsuario();
        service.mostrarFecha();

    }

}
