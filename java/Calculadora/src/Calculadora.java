import java.util.Scanner;

public class Calculadora {
    

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

        System.out.print("introduce el primer numero   ");
        double a = sc.nextDouble();

        System.out.print("introduce el segundo numero  ");
        double b = sc.nextDouble();

        System.out.println("Suma:           " + sumar(a, b));
        System.out.println("Resta:          " + restar(a, b));
        System.out.println("Multiplicación: " + multiplicar(a, b));
        System.out.println("División:       " + dividir(a, b));

    sc.close();
    }

}