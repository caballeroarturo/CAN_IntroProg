import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa la longitud del lado A: ");
        double a = sc.nextDouble();
        
        System.out.print("Ingresa la longitud del lado B: ");
        double b = sc.nextDouble();
        
        System.out.print("Ingresa la longitud del lado C: ");
        double c = sc.nextDouble();
        
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Resultado del análisis: ESTRUCTURA_VÁLIDA");
        } else {
            System.out.println("Resultado del análisis: ESTRUCTURA_INVÁLIDA");
        }
        
        sc.close();
    }
}