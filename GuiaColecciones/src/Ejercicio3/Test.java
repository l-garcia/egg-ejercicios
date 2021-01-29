package Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Test {

    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    ArrayList<CantanteFamoso> listaCantantes;
    CantanteFamoso cantante = new CantanteFamoso();

    public Test() {
        this.listaCantantes = new ArrayList<>();
    }

    public void CrearCantante(String nombre, String disco) {
        CantanteFamoso cantante = new CantanteFamoso();
        cantante.setNombre(nombre);
        cantante.setDiscoConMasVentas(disco);
        guardarCantante(cantante);
    }

    private void guardarCantante(CantanteFamoso cantante) {
        listaCantantes.add(cantante);
    }

    public void mostrarLista() {
        int i = 1;
        for (CantanteFamoso l : listaCantantes) {
            System.out.println(i + ")" + l);
            i++;
        }
    }

    public void longitudLista() {
        System.out.println(listaCantantes.size());
    }

    public void cambiarLista() {
        System.out.println("OPCIONES");
        System.out.println("1) volver a introducir los datos de otro cantante");
        System.out.println("2) editar un cantante");
        System.out.println("3) eliminar un cantante");
        System.out.println("4) Salir");
        int opcion;
        
        do {
            System.out.println("ingrese la opcion deseada");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    nuevoCantante();
                    break;
                    
                case 2:
                    modificarCantante();
                    break;
                case 3:
                    eliminarCantante();
                    break;
                case 4:
                    break;

            }
        } while (opcion!=4);

    }

    public void nuevoCantante() {
        System.out.println("ingrese el cantante y el disco mas vendido");
        CrearCantante(sc.next(), sc.next());
    }

    private void modificarCantante() {
        String nombre;
        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        System.out.println("Que cantante desea modificar");
        nombre=sc.next();
        while (it.hasNext()){
            cantante=it.next();
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("ingrese el nuevo nombre");
                cantante.setNombre(sc.next());
                System.out.println("Ingrese el disco mas vendido");
                cantante.setDiscoConMasVentas(sc.next());
                
            }
        }
            
        
        
    }

    private void eliminarCantante() {
        System.out.println("Que cantante desea eliminar");
        listaCantantes.remove(sc.nextInt() + 1);

    }
}
