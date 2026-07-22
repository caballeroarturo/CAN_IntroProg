import java.util.ArrayList;

public class j19_ArrayList_2 {
    public static void main(String[] args) {
        // Usamos la clase wrapper Integer en lugar de int
        ArrayList<Integer> edades = new ArrayList<>();

        edades.add(25);
        edades.add(18);
        edades.add(30);
        edades.add(42);

        System.out.println("--- Registro de edades ---");
        // Recorrido sencillo usando for-each
        for (Integer edad : edades) {
            if (edad >= 21) {
                System.out.println("Edad " + edad + ": Es mayor de 21 años");
            } else {
                System.out.println("Edad " + edad + ": Menor de 21 años");
            }
        }
    }
}

