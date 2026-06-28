import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Piensa en un número límite máximo: ");
        int limite = s.nextInt();
        
        System.out.println("Generando 5 números especiales bajo el límite...");
        for (int i = 0; i < 5; i++) {
            int resultado = (int) (Math.random() * limite) + 1;
            System.out.println("Número [" + (i + 1) + "]: " + resultado);
        }
        
        s.close();
    }
}
