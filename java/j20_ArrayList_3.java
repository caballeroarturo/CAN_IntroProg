import java.util.ArrayList;
public class j20_ArrayList_3 {
    public static void main(String[] args) {
        
        // 1. CREAR el ArrayList
        // Usamos Integer (Objeto) porque ArrayList solo guarda objetos.
        ArrayList<String> tareas = new ArrayList<>();

        System.out.println("=== 1. MÉTODO .add() ===");
        // .add(objeto) agrega el objeto al final de la lista.
        tareas.add("Lavar trastes");   // Posición 0
        tareas.add("Estudiar Java");   // Posición 1
        tareas.add("Ir al gimnasio");  // Posición 2

        // También puedes usar .add(índice, objeto) para INSERTAR en una posición específica:
        tareas.add(1, "Comprar leche"); // Inserta en posición 1 y empuja el resto hacia abajo

        System.out.println("Lista actual: " + tareas);
        // Resultado: [Lavar trastes, Comprar leche, Estudiar Java, Ir al gimnasio]


        System.out.println("\n=== 2. MÉTODO .get() ===");
        // .get(índice) OBTIENE y lee el objeto en esa posición sin modificar la lista.
        String primeraTarea = tareas.get(0);
        String segundaTarea = tareas.get(1);

        System.out.println("Objeto en la posición 0: " + primeraTarea);
        System.out.println("Objeto en la posición 1: " + segundaTarea);


        System.out.println("\n=== 3. MÉTODO .set() ===");
        // .set(índice, nuevoObjeto) REEMPLAZA el objeto que estaba en esa posición por uno nuevo.
        // Vamos a cambiar "Comprar leche" (índice 1) por "Comprar fruta":
        tareas.set(1, "Comprar fruta");

        System.out.println("Lista tras modificar la posición 1: " + tareas);
        // Resultado: [Lavar trastes, Comprar fruta, Estudiar Java, Ir al gimnasio]


        System.out.println("\n=== 4. MÉTODO .remove() ===");
        // Tiene dos variantes principales para ELIMINAR objetos:

        // Opción A: Eliminar por ÍNDICE (.remove(int))
        // Eliminamos "Lavar trastes" (posición 0). 
        // Los objetos restantes se reacomodan (se "recorren" a la izquierda).
        tareas.remove(0); 
        System.out.println("Después de eliminar la posición 0: " + tareas);

        // Opción B: Eliminar por el OBJETO directamente (.remove(Object))
        // Busca el objeto exacto en la lista y lo borra.
        tareas.remove("Ir al gimnasio");
        System.out.println("Después de eliminar 'Ir al gimnasio': " + tareas);


        System.out.println("\n=== ESTADO FINAL ===");
        System.out.println("Total de objetos restantes (.size()): " + tareas.size());
        System.out.println("Contenido final: " + tareas);
    }
}
