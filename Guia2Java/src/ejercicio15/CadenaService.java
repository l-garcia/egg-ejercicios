

package ejercicio15;

import java.util.Locale;
import java.util.Scanner;


public class CadenaService {
    Cadena cadena=new  Cadena();
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    
    
    public  void mostrarVocales(){
        int cantVocales=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase("a")||
                cadena.getFrase().substring(i,i+1).equalsIgnoreCase("e")||
                cadena.getFrase().substring(i,i+1).equalsIgnoreCase("i")||
                cadena.getFrase().substring(i,i+1).equalsIgnoreCase("o")||
                cadena.getFrase().substring(i,i+1).equalsIgnoreCase("u")) {
               cantVocales++; 
               
            }
        }
        System.out.println(cantVocales);
    
    }
    public void invertirFrase(){
        StringBuilder stringBuilder;
        stringBuilder = new StringBuilder(cadena.getFrase());
        String invertida;
        invertida=stringBuilder.reverse().toString();
        System.out.println(invertida);
        }
    public void vecesRepetido(){
        System.out.println("Ingrese el caracter a buscar");
        String caracter=sc.next();
        int contador=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (caracter.equalsIgnoreCase(cadena.getFrase().substring(i, i+1))) {
                contador++;
            }
        }
        System.out.println("el caracter se encuentra "+contador+" veces");
    }
    public void compararLongitud(){
        System.out.println("ingrese una frase para comparar longitudes");
        String frase=sc.next();
        if (frase.length()==cadena.getLongitud()) {
            System.out.println("tienen la misma longitud");
            
        }else System.out.println("tienen distinta longitud");
    }
    public void unirFrases(){
        System.out.println("ingrese una frase para agregar");
        String frase=sc.next();
        System.out.println(cadena.getFrase()+" "+frase);
    }
    public void reemplazar(){
        System.out.println("ingrese el caracter que desea reemplazar");
        String caracter=sc.next();
        cadena.setFrase(cadena.getFrase().replace(caracter, "$"));
        System.out.println(cadena.getFrase());
    }
    
    }


