/*

El ciclo do-while es muy similar al while, pero con una diferencia clave:

while 
evalúa la condición antes de ejecutar el bloque. 
Si es falsa, el bloque no se ejecuta ni una vez.

do-while 
Primero ejecuta el bloque, y luego
evalúa la condición después de ejecutar el bloque. 
Esto garantiza que el bloque se ejecute al menos una vez, aunque la 
condición sea falsa.

do {
    // código que se repite (se ejecuta al menos una vez)
} while (condición);


*/

public class j07_CicloDoWhile {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Imprimirá el contador mientras sea menor o igual a 5.");        
        System.out.println("----------------------");

        int contador = 1;
        
        do {
            System.out.println("Número: " + contador);
            contador++;
        } while (contador <= 5);


        System.out.println("Ciclo terminado.");
        System.out.println("----------------------");
    }

}
