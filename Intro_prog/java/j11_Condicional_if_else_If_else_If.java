public class j11_Condicional_if_else_If_else_If {

    public static void main(String[] args) {

        // Declaramos una variable de tipo entero
        int calificacion = 108;

        // Evaluamos la calificación

        if (calificacion >= 90) {
            System.out.println("Sacaste A");

        } else if (calificacion >= 80) {
            System.out.println("Obtuviste B");

        } else if (calificacion >= 70) {

            System.out.println("Aprobaste con C");

        } else {
            System.out.println("Reprobaste");
        }

        // Este mensaje siempre se ejecuta,
        // sin importar cuál condición se haya cumplido.
        System.out.println("Fin del programa.");

    }
}
