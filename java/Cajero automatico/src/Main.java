import java.util.Scanner;

public class Main {
     static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Antonio", 500.00);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("¿Qie quieres hacer?");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Ingresar saldo");
            System.out.println("3 - Retirar saldo");
            System.out.println("4 - Salir");
            System.out.print("Opcion ");
            int opcion = sc.nextInt();


            switch (opcion) {
                case 1:
                    cuenta.verSaldo();
                    break;
                case 2:
                    System.out.println("Cuanto deseas ingresar ");
                    cuenta.ingresarSaldo(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Cuanto deseas retirar ");
                    cuenta.retirarSaldo(sc.nextDouble());
                    break;
                case 4:
                    System.out.println("Hasta promto");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}