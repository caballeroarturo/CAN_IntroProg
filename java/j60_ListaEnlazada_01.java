class Nodo {
    int dato;
    Nodo siguiente; // Aquí está el "enlace" que apunta al próximo nodo

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class j60_ListaEnlazada_01 {
    public static void main(String[] args) {
        // 1. Creamos 3 nodos sueltos con sus valores
        Nodo nodo1 = new Nodo(10);
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(30);

        // 2. Los enlazamos manualmente (formamos la cadena)
        nodo1.siguiente = nodo2; // El 10 apunta al 20
        nodo2.siguiente = nodo3; // El 20 apunta al 30
        // nodo3.siguiente se queda en null (fin de la lista)

        // 3. Recorremos la lista desde el principio
        //   El objeto nodo1 ya fue creado antes con new. 
        // Lo único que estamos haciendo en esta línea es crear 
        // una nueva variable llamada actual y decirle: 
        // "Apunta exactamente a la misma cajita (al mismo objeto) 
        // a la que ya está apuntando nodo1".
        Nodo actual = nodo1; // Empezamos en el primer nodo
        /* Si actual entra a la casa y pinta la pared de otro color, 
        cuando mires a través de nodo1, vas a ver la pared pintada, 
        porque es la misma casa. */
        
        System.out.println("--- RECORRIENDO LA LISTA ---");
        while (actual != null) {
            System.out.println("Elemento actual: " + actual.dato);
            actual = actual.siguiente; // Saltamos al siguiente nodo
        }
    }
}