import java.util.Arrays;

public class j28_OrdenacionInsercion {

    public static void insercion(int[] arreglo) {
        int n = arreglo.length;

        // Empezamos desde el índice 1, porque el índice 0 ya se considera "ordenado"
        for (int i = 1; i < n; i++) {
            
            // Guardamos el valor actual que vamos a insertar
            int clave = arreglo[i];
            int j = i - 1;

            // Movemos los elementos mayores que "clave" una posición a la derecha
            while (j >= 0 && arreglo[j] > clave) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }

            // Insertamos la "clave" en su lugar correcto
            arreglo[j + 1] = clave;
            System.out.println(Arrays.toString(arreglo));
        }
    }

    public static void main(String[] args) {
        int[] datos = {12, 11, 13, 5, 6};

        System.out.println("Arreglo original:");
        for (int num : datos) System.out.print(num + " ");
        System.out.println();

        insercion(datos);

        System.out.println("Arreglo ordenado por Inserción:");
        for (int num : datos) System.out.print(num + " ");
    }
}