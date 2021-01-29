
package ejercicio15;
import java.util.Locale;
import java.util.Scanner;

public class ejercicio15 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    CadenaService service = new CadenaService();
    service.mostrarVocales();
    service.invertirFrase();
    service.vecesRepetido();
    service.compararLongitud();
    service.unirFrases();
    service.reemplazar();
    }

}
