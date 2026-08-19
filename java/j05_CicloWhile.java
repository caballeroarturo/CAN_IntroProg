/* 

El ciclo while ejecuta un bloque de código repetidamente mientras 
se cumpla una condición booleana (verdadera).

while (condición) {
    
aquí va el código que se repetirá mientras se cumpla la condición.

}

*/

public class j05_CicloWhile {

    public static void main(String[] args) {
    
        int contador = 1;          // inicializamos el contador
    
        while (contador <= 5) {    // condición: mientras sea <= 5
    
            System.out.println("Número: " + contador);
    
            contador++;            // incrementamos para avanzar
    
        }
    
        System.out.println("Ciclo terminado.");
    
    }
}