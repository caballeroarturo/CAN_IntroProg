import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa una cantidad grande de segundos (ej. 5000): ");
        int total = input.nextInt();
        
        int r1 = total / 3600;
        int residuo = total % 3600;
        int r2 = residuo / 60;
        int r3 = residuo % 60;
        
        System.out.println("Conversión final: " + r1 + "h : " + r2 + "m : " + r3 + "s");
        
        input.close();
    }
}