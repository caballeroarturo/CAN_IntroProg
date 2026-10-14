/*
ArrayList forma parte de java.util, por lo que requiere la instrucción 
import java.util.ArrayList; 
al inicio del archivo.
 */
import java.util.ArrayList;

public class j18_ArrayList_1 {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println("Lista inicial: " + frutas);
        System.out.println("------------------------------");
        /* Los elementos se añaden dinámicamente sin definir un 
        límite previo. */
        // 1. Agregar elementos (se van acumulando en orden)
        frutas.add("Manzana");
        System.out.println("Lista inicial: " + frutas);
        System.out.println("------------------------------");

        frutas.add("Plátano");
        frutas.add("Naranja");

        System.out.println("Lista inicial: " + frutas);
        System.out.println("Total de frutas (size): " + frutas.size());
        System.out.println("------------------------------");

        // 2. Eliminar un elemento por índice o por valor
        frutas.remove("Plátano"); // Remueve "Plátano"

        // 3. Consultar y verificar
        System.out.println("\nLista después de eliminar: " + frutas);
        System.out.println("------------------------------");

        System.out.println("¿Hay Manzanas?: " + frutas.contains("manzana"));
        System.out.println("------------------------------");

        System.out.println("Elemento en posición 0: " + frutas.get(0));
        System.out.println("Elemento en posición 1: " + frutas.get(1));
       
    }
}
