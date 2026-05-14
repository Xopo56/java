public class Producto {
    String nombre;
    double precio;
    int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarInfo(){
        System.out.println(nombre + " - " + precio + "€ (stock: " + stock + ")");
    }
}
