import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero: ");
        int a = s.nextInt();
        
        System.out.print("Ingresa otro número entero: ");
        int b = s.nextInt();
        
        if (a >= 18) {
            if (b >= 80) {
                System.out.println("Resultado: STATUS_A");
            } else {
                System.out.println("Resultado: STATUS_B");
            }
        } else {
            System.out.println("Resultado: STATUS_C");
        }
        
        s.close();
    }
}
