public class Libro {
    String autor;
    String titulo;
    int paginas;

    public Libro (String autor, String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    public void mostrarInfo() {
        System.out.println("El autor es "+ autor);
        System.out.println("El titulo es "+ titulo);
        System.out.println("Tiene "+ paginas + " paginas");
        System.out.println("---");
    }
}