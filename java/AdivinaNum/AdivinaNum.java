import java.util.Scanner;

public class AdivinaNum {
    
     public static void main(String[] args) {
    int secreto = (int)(Math.random() *10) + 1;
    
    Scanner sc = new Scanner(System.in);
        int intento = 0;

        while (intento != secreto) {
            System.out.print("Adivina el numero(1-10): ");
            intento = sc.nextInt();
            
            if (intento != secreto) {
                System.out.print("fallaste");
            
            }   else if (intento == secreto) {
                System.out.print("Correcto");
            }

        
        }
        sc.close();
}
}