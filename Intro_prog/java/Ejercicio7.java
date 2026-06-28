import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un año cualquiera (ej. 2024): ");
        int n = scanner.nextInt();
        
        boolean bandera = false;
        
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            bandera = true;
        }
        
        if (bandera) {
            System.out.println("El año " + n + " tiene la propiedad: TIPO_A");
        } else {
            System.out.println("El año " + n + " tiene la propiedad: TIPO_B");
        }
        
        scanner.close();
    }
}
