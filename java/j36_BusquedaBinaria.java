public class j36_BusquedaBinaria {

    public static void main(String[] args) {
        System.out.println("=== EJEMPLO DE BÚSQUEDA BINARIA ===");

        // REQUISITO: El arreglo DEBE estar ordenado de menor a mayor
        int[] numerosOrdenados = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        int numeroBuscado = 60; // El valor que queremos encontrar

        // Llamamos al método de búsqueda binaria
        int indiceEncontrado = buscarBinaria(numerosOrdenados, numeroBuscado);

        // Verificamos el resultado
        if (indiceEncontrado != -1) {
            System.out.println("¡Elemento " + numeroBuscado + " encontrado! Está en la posición (índice): " + indiceEncontrado);
        } else {
            System.out.println("El elemento " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    // Método que implementa la búsqueda binaria
    public static int buscarBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        // Repetiremos el proceso mientras el rango de búsqueda sea válido
        while (inicio <= fin) {
            // 1. Calculamos el índice del elemento del medio
            int medio = inicio + (fin - inicio) / 2;

            System.out.println("-> Analizando el valor central: " + arreglo[medio] + " (en el índice " + medio + ")");

            // 2. ¿Coincide con lo que buscamos?
            if (arreglo[medio] == valorBuscado) {
                return medio; // ¡Lo encontramos! Devolvemos su índice
            }

            // 3. Si el valor buscado es MENOR, descartamos toda la mitad derecha moviendo el 'fin'
            if (valorBuscado < arreglo[medio]) {
                fin = medio - 1;
            } 
            // 4. Si el valor buscado es MAYOR, descartamos toda la mitad izquierda moviendo el 'inicio'
            else {
                inicio = medio + 1;
            }
        }

        // Si el ciclo termina y no se cruzaron los límites sin encontrarlo, devolvemos -1
        return -1;
    }
}
