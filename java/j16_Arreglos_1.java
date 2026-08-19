public class j16_Arreglos_1 {

    public static void main(String[] args) {
        // 1. Crear un arreglo de enteros con espacio para 3 elementos
        int[] puntuaciones = new int[3];

        // 2. Asignar valores usando sus índices (0, 1, 2)
        puntuaciones[0] = 85;
        puntuaciones[1] = 92;
        puntuaciones[2] = 78;

        // 3. Modificar un valor existente
        puntuaciones[0] = 90;

        // 4. Imprimir la longitud del arreglo y un valor concreto
        System.out.println("Tamaño del arreglo: " + puntuaciones.length);
        System.out.println("Puntuación en la posición 0: " + puntuaciones[0]);
        System.out.println("Puntuación en la posición 1: " + puntuaciones[1]);
    }
}

