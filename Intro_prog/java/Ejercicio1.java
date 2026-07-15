import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("------------------------");
        // Entrada del usuario
        Scanner s = new Scanner(System.in);
        
         // Esto es lo que yo le imprimo al usuario
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
        
        System.out.println("------------------------");
        s.close();
    }
}
