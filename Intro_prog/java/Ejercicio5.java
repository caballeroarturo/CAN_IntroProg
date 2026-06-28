import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int claveSecreta = 7; 
        int intento;
        
        System.out.println("¡Bienvenido al sistema de verificación!");
        
        do {
            System.out.print("Introduce el código numérico de acceso (del 1 al 10): ");
            intento = s.nextInt();
            
            if (intento != claveSecreta) {
                System.out.println("Acceso denegado. Intenta de nuevo.");
            }
            
        } while (intento != claveSecreta);
        
        System.out.println("¡Acceso concedido! Código correcto.");
        s.close();
    }
}