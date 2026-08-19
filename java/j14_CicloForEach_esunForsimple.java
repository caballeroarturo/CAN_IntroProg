public class j14_CicloForEach_esunForsimple {
     public static void main(String[] args) {

        // Declaramos un arreglo de nombres
        String[] nombres = {"Ana", "Luis", "Carlos", "María", "Sofía"};

        System.out.println("Con For Each");
        System.out.println("----------------------------");
        // El ciclo for-each recorre automáticamente
        // cada elemento del arreglo.
        for (String nombre : nombres) { // para cada nombre en la lista nombres
            // En cada iteración, la variable "nombre"
            // almacena uno de los elementos del arreglo.
            System.out.println("Hola " + nombre);
        }


        System.out.println("----------------------------");
        System.out.println("Con For tradicional");

        // Recorremos el arreglo utilizando índices
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Hola " + nombres[i]); // imprime el nombre en la posición i
        }

        System.out.println("----------------------------");
        // Este mensaje se imprime cuando el ciclo termina
        System.out.println("Fin del programa.");
        System.out.println("----------------------------");

    }
}
