import java.util.Scanner;

public class AdivinaNum2 {
    
     public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        int intento = 0;

        while (true) {
            int secreto = (int)(Math.random() *10) + 1;

            System.out.print("Adivina el numero(1-10): ");
            intento = sc.nextInt();
            
            if (intento != secreto) {
                System.out.println("fallaste el numero era " + secreto);
            
            }   else if (intento == secreto) {
                System.out.println("Correcto");
            }
            break;
        }
    sc.close();
}
}