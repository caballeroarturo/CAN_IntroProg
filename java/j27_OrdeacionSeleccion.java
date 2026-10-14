// Este algoritmo busca el elemento más pequeño (o más grande) 
// de la parte no ordenada de la lista y lo coloca en la 
// posición correcta.
// La lógica es:
// 1. Buscar el mínimo en el sub-arreglo no ordenado.
// 2. Intercambiarlo con el primer elemento no ordenado.

import java.util.Arrays;

public class j27_OrdeacionSeleccion {

    // Aquí está el método de ordenación
    public static void seleccion(int[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
                // si van a reutilizarlo, borrar el siguiente renglón
             System.out.println("--- " + i );
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[min_idx]) {
                    min_idx = j;
                    // si van a reutilizarlo, borrar el siguiente renglón
                    System.out.println(Arrays.toString(arreglo));
                   }
            }

            // Intercambio
            int temp = arreglo[min_idx];
            arreglo[min_idx] = arreglo[i];
            arreglo[i] = temp;
            // si van a reutilizarlo, borrar el siguiente renglón
            System.out.println(Arrays.toString(arreglo));
        }
    }

    // El método main es el que arranca el programa
    public static void main(String[] args) {
        // 1. Creamos un arreglo desordenado
        int[] datos = {64, 25, 12, 22, 11};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));
        System.out.println();

        // 2. Llamamos al método de ordenación
        seleccion(datos);

        // 3. Imprimimos el resultado
        System.out.println("Arreglo ordenado por Selección:");
        System.out.println(Arrays.toString(datos));
    }
}
