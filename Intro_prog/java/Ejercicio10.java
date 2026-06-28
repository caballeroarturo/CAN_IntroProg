import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un valor numérico de temperatura: ");
        double temp = sc.nextDouble();
        
        System.out.println("Selecciona una opción (1 o 2):");
        System.out.println("1. Transformación Tipo X");
        System.out.println("2. Transformación Tipo Y");
        int opcion = sc.nextInt();
        
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = (temp * 9 / 5) + 32;
                System.out.println("Resultado de la transformación: " + resultado + " Unidades_F");
                break;
            case 2:
                resultado = (temp - 32) * 5 / 9;
                System.out.println("Resultado de la transformación: " + resultado + " Unidades_C");
                break;
            default:
                System.out.println("Error: Opción no registrada en el sistema.");
        }
        
        sc.close();
    }
}