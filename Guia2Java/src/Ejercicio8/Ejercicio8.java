
package Ejercicio8;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    Cuenta cuenta=new Cuenta(123556, 36591962, 650, 65);
    CuentaService cuentaservice=new CuentaService();
    cuentaservice.consultarDatos(cuenta);
    cuentaservice.retirar(cuenta);
    cuentaservice.consultarDatos(cuenta);
    }

    
    
    
    
}
