
// Scanner nos permite leer texto que el usuario escribe por teclado
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        // "new Scanner(System.in)" crea un nuevo lector que escucha el teclado
        // System.in = entrada estándar (el teclado)
        // "sc" es el nombre de la variable (podría ser "scanner" o cualquier otro)
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe una palabra o texto corto: ");
        
        // Esta línea captura lo que el usuario escribe y lo almacena en la variable "texto"
        String texto = sc.nextLine();
        
        // String resultado = ""; crea una cadena vacía (sin ningún carácter)
        // Aquí iremos construyendo el texto invertido carácter por carácter
        // Es como tener una caja vacía donde vamos guardando letras
        String resultado = "";
        
        //   - int i; esto dice que i es un entero
        //   - texto.length() devuelve la cantidad de caracteres (ej: "hola" = 4)
        //   - Los índices en Java empiezan en 0, así que el último índice es longitud - 1
        //   - Ejemplo: "hola" → índices: 0='h', 1='o', 2='l', 3='a' → length=4, último=3
        //   - Disminuye i en 1 en cada vuelta del bucle:  i-- 
        for (int i = texto.length() - 1; i >= 0; i--) {
            /*
            Valor inicial	        texto.length() - 1	Desde dónde empieza i
            Condición	            i >= 0	            Hasta dónde llega (qué valores son válidos)
            Incremento/Decremento	i--	                Cómo cambia i (en este caso, disminuye de 1 en 1) */

            // texto.charAt(i) = obtiene el carácter en la posición i del String "texto"
            resultado += texto.charAt(i);

            // Cuando i llega a -1, la condición i >= 0 es falsa y el bucle termina
        // En ese punto, "resultado" contiene el texto original pero invertido
        }
        
        System.out.println("Texto transformado: " + resultado);
        sc.close();
    }
}