import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;


/*
 * ============================================================
 *      j25_EstructuraDatos
 * ============================================================
 *
 * Este programa muestra diferentes estructuras de datos
 * disponibles en Java.
 *
 * Veremos:
 *
 * 1. Array
 * 2. ArrayList
 * 3. HashSet
 * 4. HashMap
 * 5. Queue
 * 6. Deque
 * 7. Deque como Pila (Stack)
 * 8. ArrayList de objetos
 * 9. HashMap de objetos
 *
 * ============================================================
 */

public class j25_EstructuraDatos {

    public static void main(String[] args) {

        /*
         * ========================================================
         * 1. ARRAY
         * ========================================================
         *
         * Un Array permite almacenar varios elementos del mismo
         * tipo.
         * Su tamaño es FIJO.
         *En este caso tenemos un Array de 5 números enteros.
         */

        System.out.println("-------------------------------------");
        System.out.println("\n===== 1. ARRAY =====");

        int[] numeros = {10, 20, 30, 40, 50};

        /*
         * Los elementos se encuentran en posiciones llamadas
         * índices.
         * IMPORTANTE:
         * Java comienza a contar los índices desde 0.
         *
         *        índice:   0   1   2   3   4
         *                  -------------------
         *        valor:   10  20  30  40  50
         */

        System.out.println("Primer elemento: " + numeros[0]);
        System.out.println("Tercer elemento: " + numeros[2]);


        /*
         * Podemos recorrer todo el Array utilizando un for.
         */

        System.out.println("\nTodos los números:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);

        }


        /*
         * ========================================================
         * 2. ARRAY CON TAMAÑO DEFINIDO
         * ========================================================
         *
         * También podemos crear un Array indicando su tamaño.
         * Aquí estamos creando espacio para 5 calificaciones.
         */
        System.out.println("-------------------------------------");
        System.out.println("\n===== 2. ARRAY DE CALIFICACIONES =====");

        double[] calificaciones = new double[5];

        /*
         * Podemos colocar valores posteriormente.
         */
        
        calificaciones[0] = 8.5;
        calificaciones[1] = 9.0;
        calificaciones[2] = 7.5;
        calificaciones[3] = 10.0;
        calificaciones[4] = 8.0;
        /*
         * Recorremos el Array.
         */
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println(
                    "Calificación " + i + ": " + calificaciones[i]
            );
        }
        /*
         * ========================================================
         * 3. ARRAYLIST
         *
         * ArrayList es parecido a un Array, pero tiene una
         * diferencia importante:
         * El ArrayList puede CRECER o REDUCIRSE.
         * Por eso se utiliza mucho cuando no sabemos de antemano
         * cuántos elementos vamos a almacenar.
         */
        System.out.println("-------------------------------------");
        System.out.println("\n===== 3. ARRAYLIST =====");

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        /*
         * add() agrega elementos al ArrayList.
         */

        listaNumeros.add(10);
        listaNumeros.add(20);
        listaNumeros.add(30);
        listaNumeros.add(40);
        /*
         * Podemos agregar más elementos posteriormente.
         */
        listaNumeros.add(50);
        /*
         * Mostrar el ArrayList completo.
         */
        System.out.println("Lista: " + listaNumeros);

        System.out.println("-------------------------------------");
        /*
         * ========================================================
         * 4. ACCEDER A ELEMENTOS DE ARRAYLIST
         * ========================================================
         *
         * Podemos utilizar get() para obtener un elemento.
         *
         * Igual que los Arrays, los índices comienzan en 0.
         */

        System.out.println("\n===== 4. ACCEDER A ELEMENTOS =====");

        System.out.println(
                "Primer elemento: " + listaNumeros.get(0)
        );

        System.out.println(
                "Tercer elemento: " + listaNumeros.get(2)
        );


        /*
         * ========================================================
         * 5. MODIFICAR Y ELIMINAR ELEMENTOS
         * ========================================================
         */
        System.out.println("-------------------------------------");    
        System.out.println("\n===== 5. MODIFICAR Y ELIMINAR =====");

        /*
         * set() modifica un elemento.
         *
         * Cambiamos el elemento que está en la posición 0.
         */

        listaNumeros.set(0, 100);

        System.out.println(
                "Después de modificar: " + listaNumeros
        );
        /*
         * remove() elimina un elemento.
         *
         * Aquí eliminamos el elemento que está en la posición 1.
         */
        listaNumeros.remove(1);
        System.out.println(
                "Después de eliminar: " + listaNumeros
        );
        System.out.println("-------------------------------------");
        /*
         * ========================================================
         * 6. RECORRER UN ARRAYLIST
         * ========================================================
         */

        System.out.println("\n===== 6. RECORRER ARRAYLIST =====");

        /*
         * Podemos utilizar un for-each.
         *
         * Se lee:
         *
         * "Para cada número dentro de listaNumeros..."
         */
        for (Integer numero : listaNumeros) {
            System.out.println(numero);
        }

        System.out.println("-------------------------------------");        /*
         * ========================================================
         * 7. HASHSET
         * ========================================================
         *
         * HashSet almacena elementos SIN duplicados.
         *
         * Si intentamos agregar dos veces el mismo elemento,
         * solamente se conservará uno.
         */

        System.out.println("\n===== 7. HASHSET =====");

        HashSet<String> municipios = new HashSet<>();


        municipios.add("Cuernavaca");
        municipios.add("Cuautla");
        municipios.add("Jiutepec");
        /*
         * Intentamos agregar Cuernavaca nuevamente.
         */
        municipios.add("Cuernavaca");
        /*
         * Solamente aparecerá una vez.
         */
        System.out.println("Municipios: " + municipios);
        /*
         * También podemos preguntar si contiene un elemento.
         */
        System.out.println(
                "¿Está Cuernavaca? "
                + municipios.contains("Cuernavaca")
        );

        System.out.println("-------------------------------------");
        /*
         * ========================================================
         * 8. HASHMAP
         * ========================================================
         *
         * HashMap almacena información en forma de:
         *
         *       CLAVE -> VALOR
         * Por ejemplo:
         *       "nombre" -> "Arturo"
         *       "edad"   -> 25
         * Cada clave identifica un valor.
         */

        System.out.println("\n===== 8. HASHMAP =====");
        HashMap<String, String> persona = new HashMap<>();


        /*
         * put() agrega una pareja clave-valor.
         */

        persona.put("nombre", "Arturo");
        persona.put("ciudad", "Cuernavaca");
        persona.put("profesion", "Profesor");


        /*
         * Podemos obtener un valor utilizando su clave.
         */

        System.out.println(
                "Nombre: " + persona.get("nombre")
        );

        System.out.println(
                "Ciudad: " + persona.get("ciudad")
        );


        /*
         * ========================================================
         * 9. HASHMAP CON NÚMEROS
         * ========================================================
         *
         * También podemos utilizar números como valores.
         */

        System.out.println("\n===== 9. HASHMAP CON ESTADÍSTICAS =====");

        HashMap<String, Double> estadisticas = new HashMap<>();


        estadisticas.put("promedio", 8.7);
        estadisticas.put("mediana", 8.5);
        estadisticas.put("desviacion", 1.2);


        System.out.println(
                "Promedio: " + estadisticas.get("promedio")
        );

        System.out.println(
                "Mediana: " + estadisticas.get("mediana")
        );


        /*
         * ========================================================
         * 10. RECORRER UN HASHMAP
         * ========================================================
         *
         * entrySet() permite obtener cada pareja:
         *
         *       clave + valor
         */

        System.out.println("\n===== 10. RECORRER HASHMAP =====");

        for (Map.Entry<String, Double> entrada
                : estadisticas.entrySet()) {

            System.out.println(
                    entrada.getKey()
                    + " = "
                    + entrada.getValue()
            );

        }


        /*
         * ========================================================
         * 11. QUEUE
         * ========================================================
         *
         * Queue representa una COLA.
         *
         * Funciona normalmente con la lógica:
         *
         *       FIFO
         *
         * First In, First Out
         *
         * El primero que entra es el primero que sale.
         *
         * Ejemplo:
         *
         *       Ana -> Luis -> Pedro
         *
         * Ana llegó primero, por lo tanto sale primero.
         */

        System.out.println("\n===== 11. QUEUE =====");

        Queue<String> cola = new ArrayDeque<>();


        /*
         * Agregamos personas a la cola.
         */

        cola.add("Ana");
        cola.add("Luis");
        cola.add("Pedro");


        System.out.println("Cola: " + cola);


        /*
         * peek() permite observar quién está primero
         * sin eliminarlo.
         */

        System.out.println(
                "Primero de la cola: " + cola.peek()
        );


        /*
         * poll() obtiene y ELIMINA el primer elemento.
         */

        System.out.println(
                "Sale de la cola: " + cola.poll()
        );

        System.out.println(
                "Cola después de poll(): " + cola
        );


        /*
         * ========================================================
         * 12. DEQUE
         * ========================================================
         *
         * Deque significa:
         *
         * Double Ended Queue
         *
         * Es una estructura que permite agregar y eliminar
         * elementos desde ambos extremos.
         */

        System.out.println("\n===== 12. DEQUE =====");

        Deque<String> deque = new ArrayDeque<>();


        /*
         * Agregar al final.
         */

        deque.addLast("A");
        deque.addLast("B");
        deque.addLast("C");


        System.out.println(
                "Deque: " + deque
        );


        /*
         * Agregar al principio.
         */

        deque.addFirst("Inicio");


        System.out.println(
                "Después de addFirst(): " + deque
        );


        /*
         * Eliminar del principio.
         */

        deque.removeFirst();


        System.out.println(
                "Después de removeFirst(): " + deque
        );


        /*
         * Eliminar del final.
         */

        deque.removeLast();


        System.out.println(
                "Después de removeLast(): " + deque
        );


        /*
         * ========================================================
         * 13. DEQUE COMO PILA
         * ========================================================
         *
         * Podemos utilizar Deque para implementar una PILA.
         *
         * Una pila funciona con:
         *
         *       LIFO
         *
         * Last In, First Out
         *
         * El último elemento que entra es el primero que sale.
         *
         * Ejemplo:
         *
         *       1
         *       2
         *       3  <- último en entrar
         *
         * Sale primero el 3.
         */

        System.out.println("\n===== 13. PILA CON DEQUE =====");

        Deque<String> pila = new ArrayDeque<>();


        /*
         * push() coloca elementos en la parte superior.
         */

        pila.push("Libro 1");
        pila.push("Libro 2");
        pila.push("Libro 3");


        System.out.println(
                "Pila: " + pila
        );


        /*
         * pop() elimina y devuelve el elemento superior.
         */

        System.out.println(
                "Sale de la pila: " + pila.pop()
        );

        System.out.println(
                "Pila después de pop(): " + pila
        );
        
        // Eugenio
        //-------------------------------------------------------
        // Ramiro

        /*
         * ========================================================
         * 14. ARRAYLIST DE OBJETOS
         * ========================================================
         *
         * Una estructura de datos no tiene que almacenar
         * solamente números o Strings.
         *
         * También podemos almacenar OBJETOS.
         *
         * Aquí vamos a crear una lista de objetos Estudiante.
         */

        System.out.println("\n===== 14. ARRAYLIST DE OBJETOS =====");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();


        /*
         * Creamos objetos Estudiante y los agregamos
         * directamente al ArrayList.
         */

        estudiantes.add(
                new Estudiante("Arturo", 25)
        );

        estudiantes.add(
                new Estudiante("Ana", 22)
        );

        estudiantes.add(
                new Estudiante("Luis", 24)
        );


        /*
         * Recorremos la lista.
         */

        for (Estudiante estudiante : estudiantes) {

            estudiante.mostrarInformacion();

        }


        /*
         * ========================================================
         * 15. HASHMAP DE OBJETOS
         * ========================================================
         *
         * También podemos almacenar objetos dentro de un HashMap.
         *
         * Por ejemplo:
         *
         *       matrícula -> estudiante
         *
         *       1001 -> Arturo
         *       1002 -> Ana
         *       1003 -> Luis
         */

        System.out.println("\n===== 15. HASHMAP DE OBJETOS =====");

        HashMap<Integer, Estudiante> registro = new HashMap<>();


        /*
         * Agregamos estudiantes utilizando una matrícula
         * como clave.
         */

        registro.put(
                1001,
                estudiantes.get(0)
        );

        registro.put(
                1002,
                estudiantes.get(1)
        );

        registro.put(
                1003,
                estudiantes.get(2)
        );


        /*
         * Buscamos un estudiante utilizando su matrícula.
         */

        Estudiante estudiante = registro.get(1002);


        System.out.println(
                "Estudiante con matrícula 1002:"
        );

        estudiante.mostrarInformacion();


        /*
         * ========================================================
         * FIN DEL PROGRAMA
         * ========================================================
         */

        System.out.println("\n===== FIN DEL PROGRAMA =====");

    }


    /*
     * ============================================================
     * CLASE ESTUDIANTE
     * ============================================================
     *
     * Esta es una clase creada por nosotros.
     *
     * Cada objeto Estudiante tendrá:
     *
     *       - nombre
     *       - edad
     *
     * Y podrá realizar acciones mediante sus métodos.
     */

    static class Estudiante {

        /*
         * --------------------------------------------------------
         * ATRIBUTOS
         * --------------------------------------------------------
         *
         * Los atributos representan el ESTADO del objeto.
         */

        private String nombre;
        private int edad;


        /*
         * --------------------------------------------------------
         * CONSTRUCTOR
         * --------------------------------------------------------
         *
         * El constructor se ejecuta cuando utilizamos:
         *
         *       new Estudiante(...)
         *
         * Sirve para inicializar el objeto.
         */

        public Estudiante(String nombre, int edad) {

            this.nombre = nombre;
            this.edad = edad;

        }


        /*
         * --------------------------------------------------------
         * MÉTODO GETTER
         * --------------------------------------------------------
         *
         * Permite obtener el nombre del estudiante.
         */

        public String getNombre() {

            return nombre;

        }


        /*
         * Permite obtener la edad.
         */

        public int getEdad() {

            return edad;

        }


        /*
         * --------------------------------------------------------
         * MÉTODO mostrarInformacion()
         * --------------------------------------------------------
         *
         * Es un comportamiento que tiene el objeto Estudiante.
         */

        public void mostrarInformacion() {

            System.out.println(
                    "Nombre: "
                    + nombre
                    + ", Edad: "
                    + edad
            );

        }

    }

}