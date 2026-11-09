class NodoMedio {
    String dato;
    NodoMedio siguiente;

    public NodoMedio(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class j63_insertarEnMedio {
    public static void main(String[] args) {
        // 1. Creamos dos nodos iniciales usando NodoMedio
        NodoMedio nodo1 = new NodoMedio("Manzana");
        NodoMedio nodo3 = new NodoMedio("Uva");

        // Los enlazamos: Manzana apunta directamente a Uva
        nodo1.siguiente = nodo3;

        // La cabeza apunta al inicio de nuestra lista
        NodoMedio cabeza = nodo1;

        System.out.println("--- 1. ANTES DE INSERTAR ---");
        imprimirLista(cabeza);

        // -----
        // 2. QUEREMOS INSERTAR "Pera" EN MEDIO (justo entre Manzana y Uva)
        // -----
        
        NodoMedio nuevoNodo = new NodoMedio("Pera");

        // --- LA MAGIA DE LA INSERCIÓN EN DOS PASOS ---
        // PASO 1: El nuevo nodo abraza al futuro (apunta a donde apuntaba la Manzana)
        nuevoNodo.siguiente = nodo1.siguiente; 

        // PASO 2: El nodo anterior se conecta al nuevo nodo
        nodo1.siguiente = nuevoNodo; 

        System.out.println("\n--- 2. DESPUÉS DE INSERTAR 'Pera' EN MEDIO ---");
        imprimirLista(cabeza);
    }

    // Método auxiliar para recorrer y mostrar la lista
    public static void imprimirLista(NodoMedio inicio) {
        NodoMedio actual = inicio;
        System.out.print("Lista: [ ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null ]");
    }

    /*
    En un arreglo común (String[]): Los elementos están guardados 
        en casillas contiguas, uno al lado del otro. Java los 
        conoce todos de golpe, por eso cuando haces 
        System.out.println(arreglo), Java sabe leerlos todos de 
        un tirón.
    En una lista enlazada: Los nodos son cajitas completamente 
        independientes y regadas por la memoria. La única forma de 
        saber dónde está la siguiente cajita es abrir la actual y 
        leer la dirección que tiene guardada en su variable siguiente. 
        Como Java no es adivino, necesita que le des la orden paso a 
        paso de seguir las flechas. 
    ¡Por eso el ciclo while es obligatorio!
 */
}