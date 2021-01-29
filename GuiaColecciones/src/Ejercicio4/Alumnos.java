

package Ejercicio4;


public class Alumnos {

private String Nombre;
    private String Apellido;
    private String sexo;
    private int numLegajo;
    ///regular (true); condicional (false)///
    private String condicion;
    private double nota;

    public Alumnos() {
    }

    /**
     *
     * @param Nombre
     * @param Apellido
     * @param sexo
     * @param numLegajo
     * @param condicion
     * @param nota
     */
    public Alumnos(String Nombre, String Apellido, String sexo, int numLegajo, String condicion, double nota) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.sexo = sexo;
        this.numLegajo = numLegajo;
        this.condicion = condicion;
        this.nota = nota;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumLegajo() {
        return numLegajo;
    }

    public void setNumLegajo(int numLegajo) {
        this.numLegajo = numLegajo;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "***********"+"\nNombre= " + Nombre + "\nApellido= " + Apellido + "\nsexo= " + sexo + "\nNumero de Legajo=" + numLegajo + "\ncondicion=" + condicion + "\nnota=" + nota ;
                
    }

    
    
    
    
}