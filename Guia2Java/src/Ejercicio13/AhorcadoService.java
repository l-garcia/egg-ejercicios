package Ejercicio13;

import java.util.Locale;
import java.util.Scanner;

public class AhorcadoService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    Ahorcado ahorcado = new Ahorcado();
    
    public void elegirPalabra(){
        System.out.println("Ingrese la palabra a encontrar");
        ahorcado.setPalabra(sc.next());
        ahorcado.setIntentos(ahorcado.getPalabra().length());
    }
    public void intentos(){
        System.out.println("Tienen "+(ahorcado.getIntentos()+3)+" intentos");
    }
    public void longitud (){
        System.out.println("la palabra tiene "+ahorcado.getPalabra().length()+" caracteres");
    }
    private void vector(){
        String[] matriz;
        matriz = new String[ahorcado.getPalabra().length()];
        for (int i = 0; i < ahorcado.getPalabra().length(); i++) {
            matriz[i]=ahorcado.getPalabra().substring(i, i+1);
        }
    }
    public void aciertos(){
        String digito;
        String [] matriz2;
        matriz2=new  String[ahorcado.getPalabra().length()];
        for (int i = 0; i < ahorcado.getPalabra().length(); i++) {
            System.out.println("ingrese letra");
            digito=sc.next();
            
        }
    }

}
