public class J35_ExcepcionPropagacion {

    public static void main(String[] args) {
        System.out.println("1. Inicio en el main");
        
        try {
            metodoA(); // El main llama al método A
        } catch (ArithmeticException e) {
            // ¡Aquí es atrapada! El error viajó desde el fondo hasta el main.
            System.out.println("4. ¡Excepción atrapada en el main! El error viajó con éxito.");
        }
        
        System.out.println("5. Fin del programa de forma segura");
    }

    public static void metodoA() {
        System.out.println("2. Entrando a metodoA");
        metodoB(); // metodoA llama a metodoB
    }

    public static void metodoB() {
        System.out.println("3. Entrando a metodoB (aquí ocurre el error)");
        int resultado = 10 / 0; // ¡PUM! Se genera una ArithmeticException (división entre cero)
        // Como aquí no hay un try-catch, la excepción se "propaga" (sube) hacia metodoA
    }
}
