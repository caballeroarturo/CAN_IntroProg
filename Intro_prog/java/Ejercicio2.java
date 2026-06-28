import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número entero positivo: ");
        int x = scanner.nextInt();
        
        int y = 0;
        
        while (x > 0) {
            y += x;
            x--;
        }
        
        System.out.println("El valor final calculado es: " + y);
        scanner.close();
    }
}