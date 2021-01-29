package Ejercicio10;

import java.util.Locale;
import java.util.Scanner;

public class FechaService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Fecha fecha = new Fecha();

    public void fechaUsuario() {
        fecha.setDia(sc.nextInt());
        
    }

    public void mostrarFecha() {
        System.out.println(fecha.getDia());
    }
}
