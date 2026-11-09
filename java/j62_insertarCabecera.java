// Definimos la clase NodoCabecera: para la lista enlazada
class NodoCabecera {
    String dato;
    NodoCabecera siguiente;

    public NodoCabecera(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class j62_insertarCabecera {
    // variable de tipo NodoCabecera
    NodoCabecera cabeza;

    public j62_insertarCabecera() {
        this.cabeza = null;
    }

    public void insertarEnCabecera(String dato) {
        NodoCabecera nuevoNodo = new NodoCabecera(dato);

        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // cambia a donde a punta la variable cabeza
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
        }
    }

    public void mostrarLista() {
        NodoCabecera actual = cabeza;
        System.out.print("Lista actual: [ ");
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null ]\n");
    }

    public static void main(String[] args) {
        j62_insertarCabecera miLista = new j62_insertarCabecera();

        System.out.println("--- INSERTANDO ELEMENTOS EN LA CABECERA ---");

        miLista.insertarEnCabecera("Manzana");
        miLista.mostrarLista();

        miLista.insertarEnCabecera("Pera");
        miLista.mostrarLista();

        miLista.insertarEnCabecera("Uva");
        miLista.mostrarLista();
    }
}