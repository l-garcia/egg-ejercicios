
package Ejercicio4;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio4 {

 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
     
       AlumnoService alumno=new AlumnoService();
       alumno.opciones();
       alumno.mostrarAlumos();
       alumno.condicionales();
    }
    
    
}


