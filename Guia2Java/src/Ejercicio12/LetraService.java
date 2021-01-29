

package Ejercicio12;

import java.util.Locale;
import java.util.Scanner;



public class LetraService {
Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
Letra letra = new Letra();
int n1;
String dig="TRWAGMYFPDXBNJZSQVHLCKE";
String[] matriz= new String[23];
public void dni(){
    System.out.println("ingrese el DNI");
    letra.setDni(sc.nextInt());
}
private void nif(){
    n1=letra.getDni()%23;
}
private void digito(){
    for (int i = 0; i < dig.length(); i++) {
        matriz[i]=dig.substring(i, i+1);
    }   
}
private void letraControl (){
    for (int i = 0; i < dig.length(); i++) {
        if (i==n1) {
            letra.setLetra(matriz[i]);
        }
 
    }
}
public void dnis(){
    nif();
    digito();
    letraControl();
    System.out.println(letra.getDni()+"-"+letra.getLetra());
}

}
