import java.util.ArrayList;

public class Carrito {
    ArrayList<Producto> productos;

    public Carrito() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (p.stock > 0) {
            productos.add(p);
            p.stock--;
            System.out.println(p.nombre + " añadido al carrito.");
        } else {
            System.out.println("No hay stock de " + p.nombre);
        }
    }

    public void mostrarCarrito() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el carrito");
            return;
        }
        double total = 0;
        for (Producto p : productos) {
            System.out.println("- " + p.nombre + ": " + p.precio + "€");
            total = total + p.precio;
        }
        System.out.println("Total: " + total + "€");
    }
}
