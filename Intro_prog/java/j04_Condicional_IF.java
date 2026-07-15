
/*
Condicional if else

if (condicion) {
    // codigo si la condicion es verdadera
} else {
    // codigo si la condicion es falsa
}

La condición va entre paréntesis ( ) y siempre 
debe dar como resultado un boolean (true o false).

Las llaves { } encierran el bloque de código que se ejecuta.

El else es opcional (puedes usar solo el if).

*/


public class j04_Condicional_IF {

    public static void main(String[] args) {

        System.out.println("_____________________________ \n");
        // --------------------- ------------
        // --------------------- Ejemplo 1
        // --------------------- ------------

        double precioAuto = 40000;
        double conimpuesto = precioAuto * (1.10);

        if (precioAuto > 500000) {
            System.out.println("Este auto es de lujo. Aplicar impuesto extra.");
            System.out.println("Precio con impuesto: $" + conimpuesto);
            System.out.println("El impuesto es del 10%");
        } else {
            System.out.println("Este auto no es de lujo.");
            System.out.println("No tiene impuesto");
        }

        /* Se lee de la siguiente manera:
        
        Si (el precio del auto es mayor a 500000) entonces
            se imprimirá el mensaje "Este auto es de lujo. Aplicar impuesto extra."    
        
        */

        System.out.println("Precio base: $" + precioAuto);
        System.out.println("_____________________________ \n");

        // --------------------- ------------
        // --------------------- Ejemplo 2
        // --------------------- ------------

        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad. Puedes votar.");

        } else {

            System.out.println("Eres menor de edad. No puedes votar.");

        }
          System.out.println("Tu edad es: " + edad);
        /* Se lee de la siguiente manera:
        
        Si (la edad es mayor o igual a 18) entonces
            se imprimirá el mensaje "Eres mayor de edad. Puedes votar."
        De lo contrario (else) 
            se imprimirá el mensaje "Eres menor de edad. No puedes votar."
        
        */

        System.out.println("_____________________________ \n");

        // --------------------- ------------
        // --------------------- Ejemplo 3
        // --------------------- ------------

        double presupuesto = 350000;
        double precioAuto1 = 320000;
        boolean esNuevo = false;

        if ((precioAuto1 <= presupuesto) && esNuevo) {
            System.out.println("¡Puedes comprar el auto nuevo!");
        } else {
            System.out.println("No alcanza o no es nuevo.");
        }

        /* Se lee de la siguiente manera:
        
        Si (el precio del auto1 <= al presupuesto  Y  es nuevo) entonces
            se imprimirá el mensaje "¡Puedes comprar el auto nuevo!"
        De lo contrario (else) 
            se imprimirá el mensaje "No alcanza o no es nuevo."
        
        */

        System.out.println("_____________________________ \n");

    }
}
