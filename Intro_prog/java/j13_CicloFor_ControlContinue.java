public class j13_CicloFor_ControlContinue {

         public static void main(String[] args) {
        // Recorremos los números del 1 al 10
        for (int i = 1; i <= 10; i++) {
            // Si el número es 5, no queremos imprimirlo
            if (i == 5) {
                System.out.println("El número 5 será omitido.");
                // continue salta el resto del código de esta iteración
                // y continúa con la siguiente vuelta del ciclo.
                System.out.println("-----Es el que me salto------");
                continue;
            }
            // Este mensaje solo se imprime si no se ejecutó continue
            System.out.println("Número: " + i);
        }
        // Este mensaje se ejecuta cuando el ciclo termina
        System.out.println("Fin del programa.");
        System.out.println("------------------");
    }

    /*
    ¿Cuándo se utiliza continue?
    Continue es útil cuando deseas ignorar ciertos casos pero seguir 
    procesando el resto de los datos. 
    
    Por ejemplo:
    - Omitir números negativos en una lista.
    - Saltar registros con datos incompletos.
    - Ignorar elementos que no cumplen una condición específica.
    - Continuar procesando un archivo aunque alguna línea tenga un formato incorrecto.

    En estos casos, continue evita ejecutar el resto del código de la iteración actual 
    y permite que el ciclo siga funcionando normalmente con los siguientes elementos.
    */
}
