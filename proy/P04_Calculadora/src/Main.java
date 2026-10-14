public class Main {

    public static void main(String[] args) {

        // Se crea el objeto calculadora
        Operaciones calc1 = new Operaciones();

        // Se crea el objeto calc2
        Operaciones calc2 = new Operaciones();

        // imprimir el estado inicial de la calculadora
        System.out.println(calc1 .obtenerResultado());

        calc1 .sumar(5, 5);
        System.out.println("Resultado calc1: " + calc1 .obtenerResultado());
        System.out.println("----------------------");

        // recuerda que el objeto tiene un estado, que es el resultado de la
        // ultima operacion y usarlo para la siguiente
        calc1 .sumar(20);
        System.out.println("Resultado calc1: " + calc1 .obtenerResultado());

        calc1 .multiplicar(2);
        System.out.println("Resultado calc1: " + calc1 .obtenerResultado());

        System.out.println("----------------------");
        calc2.sumar(25);
        calc2.dividir(5);
        System.out.println("Resultado calc2: " + calc2.obtenerResultado());

        // para reiniciar la calculadora al estado inicial, que es 0
        calc2.reiniciar();
        System.out.println("Resultado calc2: " + calc2.obtenerResultado());
        System.out.println("Resultado calc1: " + calc1.obtenerResultado());



    }
}




