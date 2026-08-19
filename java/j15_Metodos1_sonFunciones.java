public class j15_Metodos1_sonFunciones {
    // Esta función no recibe parámetros
    // y tampoco devuelve ningún valor.
    // Solo imprime un saludo.
    public static void saludar() {
        // Es la función saludar()
        System.out.println("----------------------");
        System.out.println("¡Hola!");
        System.out.println("Bienvenido al curso de Java.");
    }

    // Esta función tampoco recibe parámetros
    // y únicamente imprime un mensaje.
    public static void despedirse() {
        // es la función despedirse()
        System.out.println("----------------------");
        System.out.println("Hasta luego.");
        System.out.println("Gracias por utilizar el programa.");
    }

    // Método principal
    // Aquí comienza la ejecución del programa.
    public static void main(String[] args) {
        System.out.println("----------------------");
        System.out.println("Inicio del programa.");
        // Llamamos a la función saludar()
        saludar();

        System.out.println("----------------------");
        // Llamamos a la función despedirse()
        despedirse();

        System.out.println("Fin del programa.");
    }

    /*
    Un método (función), es un bloque de código que realiza una tarea específica.
    - En Java, la ejecución del programa comienza en el método main().
    - Una función se ejecuta cuando es llamada por su nombre, por ejemplo: saludar();.
    - Las funciones permiten reutilizar código, evitando escribir las mismas 
        instrucciones varias veces.
    - En este primer ejemplo se utilizaron funciones de tipo void, es decir, 
        funciones que realizan una acción pero no devuelven ningún valor.
 */
}
