package Ejercicio1;

public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numeroDePaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void escribirIsbn() {
        System.out.println("el ISBN es: " + isbn);
        System.out.println("el Titulo es: "+titulo);
        System.out.println("el Autor es: "+autor);
    }
}
