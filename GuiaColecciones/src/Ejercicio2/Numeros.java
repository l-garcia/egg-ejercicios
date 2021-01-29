

package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Numeros {
    
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
   private ArrayList<Integer> numero;
   int suma=0, media;
   
   
   

    public Numeros(ArrayList<Integer> numero) {
        this.numero = numero;
    }

    public Numeros() {
        this.numero = new ArrayList<>();
    }

    public ArrayList<Integer> getNumero() {
        return numero;
    }

    public void setNumero(ArrayList<Integer> numero) {
        this.numero = numero;
    }
    public ArrayList ingresarNumero(){
        int valor;
        
        do {
           valor = sc.nextInt();
            if (valor==-99) {
                break;
            }else numero.add(valor);
        } while (valor!=-99);
        
       return numero;
       
    }
    public void mostrarNumeros(){
        
        System.out.println(numero);
        
    }
    private void sumarNumeros (){
        Iterator<Integer> iterador=numero.iterator();
        
        
        for (Integer i : numero) {
            suma=suma+iterador.next();
        }
        media =suma / numero.size();
        
        
    }
    public void mostrarResultados(){
        Iterator<Integer> iterador=numero.iterator();
        sumarNumeros();
        int superiores = 0;
        System.out.println("La suma es: "+ suma);
        System.out.println("La media es: "+ media);
        for (Integer i : numero) {
            if (iterador.next()>media) {
                superiores++;
            }
        }
        System.out.println("Hay "+ superiores+" numeros a la media");
    }

}
