import java.util.Scanner;
    void main() {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("¿Que quieres hacer?");
            System.out.println("1 - Agregar un libro");
            System.out.println("2 - Mostrar todos los libros");
            System.out.println("3 - Buscar un libro");
            System.out.println("4 - Eliminar un libro");
            System.out.println("5 - Salir");
            System.out.print("Opcion ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Paginas: ");
                    int paginas = sc.nextInt();
                    biblioteca.agregarLibro(new Libro(titulo, autor, paginas));
                    break;
                case 2:
                    biblioteca.mostrarTodos();
                    break;
                case 3:
                    System.out.print("Titulo a buscar: ");
                    biblioteca.buscarPorTitulo(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Titulo a eliminar: ");
                    biblioteca.eliminarPorTitulo(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Hasta pronto");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
