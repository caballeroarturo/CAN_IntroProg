/*
Múltiples catch o bloques separados: Puedes proteger 
diferentes fragmentos de código con sus propios bloques 
try-catch para atrapar problemas específicos según la 
naturaleza del error.
 */

public class j33_MultiplesExcepciones {

    public static void main(String[] args) {
        System.out.println("----MÚLTIPLES EXCEPCIONES ----\n");

        // --- EJEMPLO 1: ArithmeticException (División entre cero) ---

        System.out.println("---- EJEMPLO 1: ArithmeticException");
        try {
            System.out.println("\nIntentando realizar una división prohibida...");
            int resultado = 10 / 0; // ¡Esto lanza una ArithmeticException!
            System.out.println("Resultado: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir un número entre cero.\n");
        }

        // Si el primer error (la división entre cero) hubiera crasheado 
        // el programa, jamás se habría ejecutado el segundo bloque. 
        // Gracias a que la primera excepción fue atrapada limpiamente, 
        // el sistema continuó su curso y pudo evaluar el siguiente caso.


        // --- EJEMPLO 2: NullPointerException (Uso de un objeto nulo) ---
        System.out.println("---- EJEMPLO 2: NullPointerException ");
        try {
            System.out.println("\nIntentando usar un objeto que no ha sido inicializado...");
            String texto = null; // El objeto está vacío (null)
            
            // Intentar medir la longitud de un texto nulo provoca un choque
            int longitud = texto.length(); 
            System.out.println("La longitud es: " + longitud);
            
        } catch (NullPointerException e) {
            System.out.println("¡Error de puntero nulo!");
            System.out.println(" Intentaste usar un objeto que está vacío o no existe.");
        }


        // --- MENSAJE FINAL ---
        System.out.println("\n=== FIN DEL PROGRAMA ===");
        System.out.println("Gracias a los bloques try-catch, el programa manejó ambos errores y llegó al final con éxito.");
    }
}
