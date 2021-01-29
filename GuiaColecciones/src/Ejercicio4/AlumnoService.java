package Ejercicio4;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AlumnoService {

    
    Scanner sc = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    HashSet<Alumnos> listaAlumnos = new HashSet<>();

    public void cargarAlumno(String nombre, String apellido, String numLegajo, String sexo, String condicion, String nota) {
        Alumnos alumno = new Alumnos();
        int numeroLegajo = Integer.parseInt(numLegajo);
        double notareal = Double.parseDouble(nota);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);
        alumno.setNumLegajo(numeroLegajo);
        alumno.setSexo(sexo);
        alumno.setCondicion(condicion);
        alumno.setNota(notareal);
        guardarAlumno(alumno);
    }

    private void guardarAlumno(Alumnos alumno) {
        listaAlumnos.add(alumno);
    }

    public void opciones() {
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("ingrese la opcion\n"
                    + "1) Cargar Alumno\n"
                    + "2) Salir");
            if (opcion.equalsIgnoreCase("1")) {

                cargarAlumno(JOptionPane.showInputDialog("Introducir nombre"),
                        JOptionPane.showInputDialog("Introducir apellido"),
                        JOptionPane.showInputDialog("Introducir N° de Legajo "),
                        JOptionPane.showInputDialog("Introducir sexo"),
                        JOptionPane.showInputDialog("Introducir condicion (Regular//Condicional)"),
                        JOptionPane.showInputDialog("Introducir Nota"));
            }

        } while (!opcion.equalsIgnoreCase("2"));
    }
    public void mostrarAlumos(){
        for (Alumnos l: listaAlumnos) {
            System.out.println(l);
        }
    }
    public void condicionales(){
    int cond=0;
        for (Alumnos l : listaAlumnos) {
            if (l.getCondicion().equalsIgnoreCase("condicional")) {
                System.out.println("ALUMNO CONDICIONAL");
                System.out.println(l);
                cond++;
            }
        }
        System.out.println("Hay un total de "+cond+" condicionales");
}
}
