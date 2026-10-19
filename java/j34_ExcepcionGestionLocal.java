public class j34_ExcepcionGestionLocal {

    public static void main(String[] args) {
        try {
            // Intentamos hacer una operación matemática inválida
            int resultado = 5 / 0; 
            System.out.println(resultado);
            
        } catch (ArithmeticException e) {
            // Aquí gestionamos (atrapamos) el error localmente
            System.out.println("¡Atención! Ocurrió un error matemático: división entre cero.");
        }
        
        System.out.println("El programa continúa su ejecución normal gracias a la gestión local.");
    }
}
