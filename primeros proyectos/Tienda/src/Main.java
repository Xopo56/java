import java.util.Scanner;

void main() {
    Tienda tienda = new Tienda();
    Carrito carrito = new Carrito();
    Scanner sc = new Scanner(System.in);

    while(true){
        System.out.println("¿Que quieres hacer?");
        System.out.println("1 - Mostrar catalogo");
        System.out.println("2 - Añadir al carrito");
        System.out.println("3 - Ver el carrito");
        System.out.println("4 - Salir");
        System.out.print("Opcion ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion){
            case 1:
                tienda.mostrarCatalogo();
                break;
            case 2:
                //llama a la funcion de mostrar catalogo y te pide el numero de producto
                tienda.mostrarCatalogo();
                System.out.println("Numero de producto");
                int num = sc.nextInt();
                //llama a agregar producto que, a su vez, llama a obtener producto y usa el numero añadido para elegir el producto
                carrito.agregarProducto(tienda.getProducto(num));
                break;
            case 3:
                carrito.mostrarCarrito();
                break;
            case 4:
                System.out.println("Hasta pronto");
                return;
            default:
                System.out.println("Opcion no valida");
        }
    }
}