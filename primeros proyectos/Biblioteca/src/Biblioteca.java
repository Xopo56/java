import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Se ha añadido " + libro.titulo);
    }

    public void mostrarTodos() {
        if ( libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
        } else {
            for (Libro l: libros) {
                l.mostrarInfo();
            }
        }
    }

    public void buscarPorTitulo(String titulo) {
        for (Libro l: libros) {
            if (l.titulo.equals(titulo)) {
                l.mostrarInfo();
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese título.");
    }

    public void eliminarPorTitulo(String titulo) {
        for (Libro l: libros) {
            if (l.titulo.equals(titulo)) {
                libros.remove(l);
                System.out.println("Libro eliminado: " + titulo);
                return;
            }
        }
        System.out.println("No se encontró ningún libro con ese título.");
    }
}