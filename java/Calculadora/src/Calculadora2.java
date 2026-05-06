import java.util.Scanner;

public class Calculadora2 {
    

        public static double sumar(double a, double b) {
            return a + b;
        }

        public static double restar(double a, double b) {
            return a - b;
        }

        public static double multiplicar(double a, double b) {
            return a * b;
        }

        public static double dividir(double a, double b) {
            return a / b;
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Que operacion quiere realizar");
        System.out.println("1 sumar");
        System.out.println("2 restar");
        System.out.println("3 multiplicar");
        System.out.println("4 dividir");
        System.out.println("elige una opcion");
        int opcion = sc.nextInt();

        System.out.print("introduce el primer numero   ");
        double a = sc.nextDouble();

        System.out.print("introduce el segundo numero  ");
        double b = sc.nextDouble();
        switch (opcion) {
            case 1:
                System.out.print("El resultado es  " + sumar(a, b));
                break;
            case 2:
                System.out.print("El resultado es  " + restar(a, b));
                break;
            case 3:
                System.out.print("El resultado es  " + multiplicar(a, b));
                break;
            case 4:
                System.out.print("El resultado es  " + dividir(a, b));
                break;
            default:
                System.out.print("Opcion no valida");
        }

        sc.close();
    }
}        