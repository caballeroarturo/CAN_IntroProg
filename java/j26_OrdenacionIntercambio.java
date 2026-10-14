// Método de la Burbuja (Bubble Sort). 
// La idea es que los valores más grandes "floten" 
// hacia el final de la lista en cada pasada.

import java.util.Arrays;

public class j26_OrdenacionIntercambio {
    // Aquí está el método de ordenación
    public static void burbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            // si van a reusar borrar el siguiente renglón
            System.out.println("--- i = " + i);
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // si van a reusar borrar el siguiente renglón
                    //System.out.println("--- j =" + j);
                    // Intercambio
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                    // si van a reusar borrar el siguiente renglón
                    System.out.println(Arrays.toString(arreglo));
                }
            }
        }
    }

    // El método main es el que arranca el programa
    public static void main(String[] args) {
        // 1. Creamos un arreglo desordenado
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        System.out.println(Arrays.toString(datos));
        System.out.println();

        // 2. Llamamos al método de ordenación
        burbuja(datos);

        // 3. Imprimimos el resultado
        System.out.println("Arreglo ordenado por Intercambio (Burbuja):");
        System.out.println(Arrays.toString(datos));
    }
}
