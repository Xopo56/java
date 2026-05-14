import java.util.ArrayList;

public class Tienda {
    ArrayList<Producto> catalogo;

    public Tienda() {
        this.catalogo = new ArrayList<>();
        catalogo.add(new Producto("Libreta",3.0,20));
        catalogo.add(new Producto("Lapiz",0.50,30));
        catalogo.add(new Producto("Boligrafo", 0.70, 30));
        catalogo.add(new Producto("Tipex", 1, 10));
    }

    public void mostrarCatalogo() {
        System.out.println("---Catalogo---");
        for(int i = 0; i < catalogo.size(); i++) {
            System.out.println(i + "-");
            catalogo.get(i).mostrarInfo();
        }
    }

    public Producto getProducto(int indice){
        return catalogo.get(indice);
    }
}
