package Ejercicio7;

public class Rectangulo {

    private double largo, alto;

    public Rectangulo() {
    }

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double Superficie() {
        return largo * alto;
    }

    public double Perimetro() {
        return (alto + largo) * 2;
    }

    public void Dibujo() {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == largo - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }

    public void Desplazar(int desplazamiento) {
        double largo2 = desplazamiento + largo;
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < largo2; j++) {
                if (j<desplazamiento&&(i!=0||i!=alto-1)) {
                    System.out.print(" ");
                }
                if ((i == 0&&j>=desplazamiento) || (i == alto - 1&&j>=desplazamiento)||j == desplazamiento || j == largo2 - 1) {
                    System.out.print(" *");
                }
                
                 else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }
    }
}
