import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una frase o un enunciado completo:");
        String entrada = sc.nextLine().trim();
        
        if (entrada.isEmpty()) {
            System.out.println("Resultado numérico: 0");
        } else {
            String[] bloques = entrada.split("\\s+");
            System.out.println("Resultado numérico: " + bloques.length);
        }
        
        sc.close();
    }
}