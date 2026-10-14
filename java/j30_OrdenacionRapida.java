import java.util.Arrays;

public class j30_OrdenacionRapida {

    // Método principal que el usuario llama
    public static void quickSort(int[] arreglo, int inicio, int fin) {
        if (inicio < fin) {
            // 1. Encontramos la posición final del pivote
            int indicePivote = particion(arreglo, inicio, fin);

            // 2. Ordenamos recursivamente la mitad izquierda
            quickSort(arreglo, inicio, indicePivote - 1);
            System.out.println(Arrays.toString(arreglo));
            // 3. Ordenamos recursivamente la mitad derecha
            quickSort(arreglo, indicePivote + 1, fin);
            System.out.println(Arrays.toString(arreglo));
        }
    }

    // Método que hace la magia: coloca el pivote en su lugar y reorganiza
    public static int particion(int[] arreglo, int inicio, int fin) {
        // Elegimos el último elemento como pivote
        int pivote = arreglo[fin];
        
        // "i" marca la frontera de los elementos menores al pivote
        int i = inicio - 1;

        // Recorremos desde "inicio" hasta antes del pivote
        for (int j = inicio; j < fin; j++) {
            // Si el elemento actual es menor o igual al pivote...
            if (arreglo[j] <= pivote) {
                i++; // Ampliamos la zona de "menores"
                // Intercambiamos arreglo[i] con arreglo[j]
                int temp = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = temp;
            }
        }

        // Al final, colocamos el pivote justo después de la zona de "menores"
        int temp = arreglo[i + 1];
        arreglo[i + 1] = arreglo[fin];
        arreglo[fin] = temp;

        // Devolvemos el índice donde quedó el pivote
        return i + 1;
        // System.out.println(Arrays.toString(arreglo));
    }

    public static void main(String[] args) {
        int[] datos = {10, 7, 8, 9, 1, 5};

        System.out.println("Arreglo original:");
        for (int num : datos) System.out.print(num + " ");
        System.out.println();

        quickSort(datos, 0, datos.length - 1);

        System.out.println("Arreglo ordenado por Quicksort:");
        for (int num : datos) System.out.print(num + " ");
    }
}
