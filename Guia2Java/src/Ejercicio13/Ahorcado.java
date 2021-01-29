

package Ejercicio13;


public class Ahorcado {
private String palabra;
private int intentos;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

}
