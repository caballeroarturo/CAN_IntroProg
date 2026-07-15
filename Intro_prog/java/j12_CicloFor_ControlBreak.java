public class j12_CicloFor_ControlBreak {

    public static void main(String[] args) {

        // Recorremos los números del 1 al 10
        for (int i = 1; i <= 10; i++) {

            // Mostramos el número actual
            System.out.println("Número: " + i);

            // Si el número es 5, detenemos el ciclo
            if (i == 5) {
                System.out.println("Se encontró el número 5.");
                System.out.println("El ciclo se detendrá con break.");

                // break termina inmediatamente el ciclo
                break;
            }

        }

        // Esta instrucción se ejecuta después de terminar el ciclo
        System.out.println("Fin del programa.");
        System.out.println("----------------------");

    }

/*
¿Cuándo se utiliza break?

La instrucción break se usa cuando queremos interrumpir un 
ciclo antes de que termine de forma natural. 

Algunos casos comunes son:
- Encontrar un dato específico en una lista.
- Localizar un elemento en un arreglo.
- Detener una búsqueda cuando ya se encontró el resultado.
- Salir de un ciclo cuando ocurre una condición especial o un error.

En todos estos casos, break permite evitar iteraciones innecesarias y 
hace que el programa sea más eficiente.

*/

}

