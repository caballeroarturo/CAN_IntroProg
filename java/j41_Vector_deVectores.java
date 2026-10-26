import java.util.ArrayList;

public class j41_Vector_deVectores {
    public static void main(String[] args) {
        // -----------------------------------------
        // 1. CREACIÓN DEL VECTOR DE VECTORES
        // -----------------------------------------
        // Declaramos un ArrayList que contendrá otros ArrayList de tipo Integer.
        // Esto equivale a decir: "Quiero un vector cuyas casillas guarden otros vectores".
        ArrayList<ArrayList<Integer>> vectorDeVectores = new ArrayList<>();

        // -----------------------------------------
        // 2. CREACIÓN Y LLENADO DE LOS VECTORES INTERNOS
        // -----------------------------------------
        
        // Creamos el primer vector interno (Fila 0) con 3 elementos
        ArrayList<Integer> vector1 = new ArrayList<>();
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);

        // Creamos el segundo vector interno (Fila 1) con solo 2 elementos (¡tamaño variable!)
        ArrayList<Integer> vector2 = new ArrayList<>();
        vector2.add(40);
        vector2.add(50);

        // Creamos el tercer vector interno (Fila 2) con 4 elementos
        ArrayList<Integer> vector3 = new ArrayList<>();
        vector3.add(60);
        vector3.add(70);
        vector3.add(80);
        vector3.add(90);

        // -----------------------------------------
        // 3. AGREGAR LOS VECTORES AL VECTOR PRINCIPAL
        // -----------------------------------------
        vectorDeVectores.add(vector1); // Añade el vector1 a la posición 0
        vectorDeVectores.add(vector2); // Añade el vector2 a la posición 1
        vectorDeVectores.add(vector3); // Añade el vector3 a la posición 2

        // -----------------------------------------
        // 4. RECORRER Y MOSTRAR EL VECTOR DE VECTORES
        // -----------------------------------------
        System.out.println("=== CONTENIDO DEL VECTOR DE VECTORES ===");
        
        // Primer ciclo: recorre el vector principal (las filas)
        for (int i = 0; i < vectorDeVectores.size(); i++) {
            System.out.print("Vector interno " + i + ": ");
            
            // Obtenemos el vector interno en la posición 'i' y recorremos sus elementos (las columnas)
            ArrayList<Integer> vectorActual = vectorDeVectores.get(i);
            
            for (int j = 0; j < vectorActual.size(); j++) {
                System.out.print(vectorActual.get(j) + " ");
            }
            
            System.out.println(); // Salto de línea al terminar cada vector interno
        }

        // -----------------------------------------
        // 5. ACCESO Y MODIFICACIÓN DE UN ELEMENTO ESPECÍFICO
        // -----------------------------------------
        // Para acceder a un valor específico usamos: vectorPrincipal.get(fila).get(columna)
        // Por ejemplo, queremos ver el elemento de la fila 2, columna 1 (el número 70)
        int valorBuscado = vectorDeVectores.get(2).get(1);
        System.out.println("\nElemento ubicado en la fila 2, columna 1: " + valorBuscado);

        // Modificamos ese valor (cambiamos el 70 por un 999)
        vectorDeVectores.get(2).set(1, 999);
        System.out.println("Nuevo valor modificado en fila 2, columna 1: " + vectorDeVectores.get(2).get(1));
    }
}
