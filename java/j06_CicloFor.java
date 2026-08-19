/*

El ciclo for es una estructura de control que repite un bloque de 
código un número definido de veces. 

-> Es ideal cuando sabes cuántas iteraciones necesitas.

for (inicialización; condición; actualización) {
    
    Aquí va el código que se repite

}

*/
public class j06_CicloFor {

    public static void main(String[] args) {

        System.out.println("----------------------");

        // La condición del ciclo for es verdadera mientras 
        // i sea menor o igual a 5

        // int i = 1; i es un entero e inicia en 1
        // i<=5; i es menor o igual a 5, es decir a lo más es 5
        // i++; i se incrementa en 1
        for (int i = 1; i <= 5; i++) {
        
            System.out.println("Número: " + i);
        
        }


        System.out.println("Ciclo terminado.");

        System.out.println("----------------------");

       }
}
