// Clase que representa cada eslabón (nodo)
class MiNodo {
    String texto;
    MiNodo siguiente; // El puntero que apunta al siguiente elemento

    public MiNodo(String texto) {
        this.texto = texto;
        this.siguiente = null;
    }
}

public class j61_cabecera_extremos {
    

    public static void main(String[] args) {
        // 1. Creamos tres nodos independientes en la memoria
        MiNodo nodo1 = new MiNodo("Perro");
        MiNodo nodo2 = new MiNodo("Gato");
        MiNodo nodo3 = new MiNodo("Conejo");

        // 2. La CABECERA es el punto de partida fijo (el primer eslabón)
        MiNodo cabeza = nodo1;

        // 3. Enlazamos los nodos formando la cadena
        nodo1.siguiente = nodo2; // "Perro" apunta a "Gato"
        nodo2.siguiente = nodo3; // "Gato" apunta a "Conejo"

        // 4. La COLA es el último nodo de la lista
        MiNodo cola = nodo3;

        // 5. Accedemos directamente a los extremos sin necesidad de buscar
        System.out.println("=== ACCEDIENDO A LOS EXTREMOS DE LA LISTA ===");
        System.out.println("Cabecera (Inicio): " + cabeza.texto);
        System.out.println("Cola (Final): " + cola.texto);

        // Verificamos que la cola sea realmente el final
        System.out.println("¿El siguiente de la cola es null? " + (cola.siguiente == null));
    }
}
