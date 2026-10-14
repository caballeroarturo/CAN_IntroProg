import java.util.Arrays;
// también conocido como ordenación por incrementos decrecientes. 
// Es una mejora del algoritmo de Inserción: en lugar de comparar 
// solo elementos adyacentes, compara elementos separados por un 
// "salto" que se va reduciendo hasta llegar a 1.

public class j29_OrdenacionShell {

    public static void shell(int[] arreglo) {
        int n = arreglo.length;

        // Empezamos con un "salto" grande (mitad del arreglo) y lo vamos reduciendo
        for (int salto = n / 2; salto > 0; salto /= 2) {

            // Hacemos una "inserción" pero comparando elementos separados por "salto"
            for (int i = salto; i < n; i++) {
                
                int clave = arreglo[i];
                int j = i;

                // Movemos elementos mayores que "clave" hacia la derecha, pero
                // solo comparando con los que están a "salto" de distancia
                while (j >= salto && arreglo[j - salto] > clave) {
                    arreglo[j] = arreglo[j - salto];
                    j -= salto;
                }

                // Insertamos la clave en su lugar
                arreglo[j] = clave;
                
            }
            System.out.println(Arrays.toString(arreglo));
        }
    }

    public static void main(String[] args) {
        int[] datos = {12, 34, 54, 2, 3, 90, 45, 23, 11, 7};

        System.out.println("Arreglo original:");
        for (int num : datos) System.out.print(num + " ");
        System.out.println();

        shell(datos);

        System.out.println("Arreglo ordenado por Shell:");
        for (int num : datos) System.out.print(num + " ");
    }
}
