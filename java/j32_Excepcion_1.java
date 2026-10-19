/*
Las excepciones en programación son eventos anómalos o errores 
que ocurren durante la ejecución del programa (en runtime) y que 
interrumpen el flujo normal de las instrucciones.

En Java, las excepciones no son simples mensajes de texto; 
son clases y objetos reales que heredan de una clase raíz llamada 
Throwable. 

Esto significa que tienen propiedades y métodos propios para saber 
qué pasó y en qué línea del código ocurrió.

*/
public class j32_Excepcion_1 {

    public static void main(String[] args) {
        System.out.println("-- INICIO DEL PROGRAMA --");

        // Simulamos que el usuario escribió una palabra en 
        // lugar de un número
        String textoIngresado = "HolaMundo";

        try {
            System.out.println("Intentando convertir el texto a número...");
            
            // Esta línea va a fallar porque "HolaMundo" no se puede 
            // convertir a entero
            int numero = Integer.parseInt(textoIngresado);
            
            System.out.println("El número es: " + numero); 
            // Esta línea nunca se ejecuta si hay error

        } catch (NumberFormatException e) {
            // El bloque 'catch' atrapa el error y evita que el 
            // programa se cierre de golpe
            System.out.println("Ocurrió un error: No puedes convertir texto con letras a un número.");
            
            // (Opcional) Puedes ver el mensaje técnico del error:
            // System.out.println("Detalle técnico: " + e.getMessage());
        }

        // Gracias al try-catch, el programa continúa ejecutándose 
        // con normalidad
        System.out.println("=== FIN DEL PROGRAMA ===");
        System.out.println("El sistema sobrevivió y sigue operando");
    }
}