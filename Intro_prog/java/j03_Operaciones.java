// Este programa realiza operaciones aritméticas básicas en Java

public class j03_Operaciones {
public static void main(String[] args) {
    // Declaración de variables
        int a = 10;
        int b = 3;
        
        // int year = 2001;
        //String title = "Shrek";
        // char genre = 'C';
        // double runtime = 1.58;
        // boolean isPG = true;
        
    // Operaciones aritméticas
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        
    // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Resto (módulo): " + modulo);

        // Imprimir instrucciones para compilar y ejecutar el programa
        System.out.println("En la consola ejecuta javac j03_Operaciones.java para compilar");
        System.out.println(" el código y luego java j03_Operaciones para ejecutar el programa.");
    }
}


