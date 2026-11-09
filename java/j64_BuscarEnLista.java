class NodoBusqueda {
    String dato;
    NodoBusqueda siguiente;

    public NodoBusqueda(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class j64_BuscarEnLista {
    NodoBusqueda cabeza;

    public j64_BuscarEnLista() {
        // Este pedazo de código se puede quitar si quieres ahorrar unas 
        // líneas, pero dejarlo hace que el código sea más claro y 
        // explícito sobre su intención inicial. 
        this.cabeza = null;
    }

    // Método rápido para agregar elementos al final
    public void agregarAlFinal(String dato) {
        NodoBusqueda nuevo = new NodoBusqueda(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoBusqueda actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // ==========================================
    // MÉTODO DE BÚSQUEDA
    // ==========================================
    public boolean buscar(String objetivo) {
        NodoBusqueda actual = cabeza; // 1. Empezamos el recorrido en la cabeza

        // 2. Recorremos mientras 'actual' no sea nulo
        while (actual != null) {
            
            // Comparamos el texto del nodo actual con lo que buscamos
            if (actual.dato.equals(objetivo)) {
                return true; // ¡Lo encontramos!
            }

            // Avanzamos al siguiente eslabón
            actual = actual.siguiente; 
        }

        return false; // No se encontró
    }

    public static void main(String[] args) {
        j64_BuscarEnLista supermercado = new j64_BuscarEnLista();

        // Llenamos la lista
        supermercado.agregarAlFinal("Manzana");
        supermercado.agregarAlFinal("Pera");
        supermercado.agregarAlFinal("Uva");
        supermercado.agregarAlFinal("Sandía");

        // Probamos buscando un elemento que SÍ existe
        String buscado1 = "Uva";
        System.out.println("Buscando: " + buscado1);
        if (supermercado.buscar(buscado1)) {
            System.out.println("-> ¡Resultado: SÍ se encontró '" + buscado1 + "' en la lista!\n");
        } else {
            System.out.println("-> ¡Resultado: No está!\n");
        }

        // Probamos buscando un elemento que NO existe
        String buscado2 = "Fresa";
        System.out.println("Buscando: " + buscado2);
        if (supermercado.buscar(buscado2)) {
            System.out.println("-> ¡Resultado: SÍ se encontró '" + buscado2 + "'!\n");
        } else {
            System.out.println("-> ¡Resultado: El elemento '" + buscado2 + "' NO está en la lista.\n");
        }
    }
}