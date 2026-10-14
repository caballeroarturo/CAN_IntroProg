import java.util.ArrayList;

public class j19_ArrayList_2 {
    public static void main(String[] args) {
        // Usamos la clase wrapper Integer en lugar de int
        ArrayList<Integer> edades = new ArrayList<>();

        System.out.println("Lista inicial: " + edades);
        edades.add(25);
        edades.add(17);
        edades.add(18);
        edades.add(42);
        System.out.println("Lista inicial: " + edades);
        System.out.println("------------------------------");

        System.out.println("--- Registro de edades ---");
        // Recorrido sencillo usando for-each
        for (Integer edad : edades) {
            if (edad >= 18) {
                System.out.println("Edad " + edad + ": Es mayor o igual a 18 años");
            } else {
                System.out.println("Edad " + edad + ": Menor de 18 años");
            }
        }
    }
}

