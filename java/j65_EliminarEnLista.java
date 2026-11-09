class NodoEliminar {
    String dato;
    NodoEliminar siguiente;

    public NodoEliminar(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class j65_EliminarEnLista {
    NodoEliminar cabeza;

    public j65_EliminarEnLista() {
        this.cabeza = null;
    }

    // Método rápido para agregar elementos al final
    public void agregarAlFinal(String dato) {
        NodoEliminar nuevo = new NodoEliminar(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoEliminar actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Método para imprimir la lista
    public void mostrarLista() {
        NodoEliminar actual = cabeza;
        System.out.print("Lista: [ ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null ]");
    }

    // ==========================================
    // MÉTODO DE ELIMINACIÓN
    // ==========================================
    public void eliminar(String objetivo) {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        // CASO 1: El elemento que queremos borrar está justo en la CABECERA
        if (cabeza.dato.equals(objetivo)) {
            // Movemos la cabeza al siguiente nodo. El primer nodo queda "desconectado"
            cabeza = cabeza.siguiente;
            System.out.println("-> Eliminado de la cabecera: " + objetivo);
            return;
        }

        // CASO 2: El elemento está en medio o al final
        NodoEliminar actual = cabeza;

        // Recorremos buscando el nodo ANTERIOR al que queremos eliminar
        while (actual.siguiente != null) {
            if (actual.siguiente.dato.equals(objetivo)) {
                // --- LA MAGIA DE LA ELIMINACIÓN ---
                // Hacemos que el nodo actual se salte al objetivo y apunte 
                // directamente al siguiente
                actual.siguiente = actual.siguiente.siguiente;
                System.out.println("-> Eliminado con éxito: " + objetivo);
                return;
            }
            actual = actual.siguiente;
        }

        System.out.println("-> El elemento '" + objetivo + "' no se encontró en la lista.");
    }

    public static void main(String[] args) {
        j65_EliminarEnLista supermercado = new j65_EliminarEnLista();

        // Llenamos la lista
        supermercado.agregarAlFinal("Manzana");
        supermercado.agregarAlFinal("Pera");
        supermercado.agregarAlFinal("Uva");
        supermercado.agregarAlFinal("Sandía");

        System.out.println("--- 1. LISTA INICIAL ---");
        supermercado.mostrarLista(); // [ Manzana -> Pera -> Uva -> Sandía -> null ]

        // Probamos eliminando de la cabecera
        System.out.println("\nEliminando 'Manzana' (Cabecera)...");
        supermercado.eliminar("Manzana");
        supermercado.mostrarLista(); // [ Pera -> Uva -> Sandía -> null ]

        // Probamos eliminando de en medio
        System.out.println("\nEliminando 'Uva' (En medio)...");
        supermercado.eliminar("Uva");
        supermercado.mostrarLista(); // [ Pera -> Sandía -> null ]

        // Probamos eliminando algo que no existe
        System.out.println("\nIntentando eliminar 'Fresa' (No existe)...");
        supermercado.eliminar("Fresa");
        supermercado.mostrarLista();
    }

    /*
    Si borramos la Cabecera (Manzana):
    Es muy fácil. Como la variable cabeza es la que marca el inicio, 
    simplemente le decimos: cabeza = cabeza.siguiente. De este modo, 
    la cabeza ahora apunta a la Pera, y la Manzana queda flotando sin 
    referencias, por lo que el recolector de basura de Java la borra 
    automáticamente de la memoria.

    Si borramos en medio (Uva):
    Aquí usamos un enfoque preventivo: nos detenemos en el nodo anterior 
    al que queremos borrar (en este caso, la Pera).
    Luego aplicamos el cambio de 
    puntero:actual.siguiente = actual.siguiente.siguiente;
    
 */
}
