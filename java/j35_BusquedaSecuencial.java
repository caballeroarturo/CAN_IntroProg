public class j35_BusquedaSecuencial {

    public static void main(String[] args) {
        System.out.println("=== EJEMPLO DE BÚSQUEDA SECUENCIAL ===");

        // Arreglo desordenado (la búsqueda secuencial no exige orden previo)
        int[] numeros = {34, 12, 25, 90, 45, 67, 10};
        
        int numeroBuscado = 45; // El valor que queremos encontrar

        // Llamamos al método de búsqueda
        int indiceEncontrado = buscarSecuencial(numeros, numeroBuscado);

        // Verificamos el resultado
        if (indiceEncontrado != -1) {
            System.out.println("¡Elemento " + numeroBuscado + " encontrado! Está en la posición (índice): " + indiceEncontrado);
        } else {
            System.out.println("El elemento " + numeroBuscado + " no se encuentra en el arreglo.");
        }
    }

    // Método que implementa la búsqueda secuencial
    public static int buscarSecuencial(int[] arreglo, int valorBuscado) {
        // Recorremos el arreglo elemento por elemento desde el inicio (índice 0) hasta el final
        for (int i = 0; i < arreglo.length; i++) {
            
            // Comparamos el elemento actual con el valor que buscamos
            if (arreglo[i] == valorBuscado) {
                return i; // Si coincide, devolvemos el índice de inmediato
            }
        }
        
        // Si el bucle termina y no encontró nada, devolvemos -1 (indicando que no existe)
        return -1;
    }
}
