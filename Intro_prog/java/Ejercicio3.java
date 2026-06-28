import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe una palabra o texto corto: ");
        String texto = sc.nextLine();
        
        String resultado = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        
        System.out.println("Texto transformado: " + resultado);
        sc.close();
    }
}