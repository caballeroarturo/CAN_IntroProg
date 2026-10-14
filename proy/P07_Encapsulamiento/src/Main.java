public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la clase CuentaBancaria
        CuentaBancaria cuenta = new CuentaBancaria("Ana Pérez", 500.0);

        // Si la variable saldo fuera public (pública),
        // cualquiera podría leerla y también modificarla a su antojo.
        // El metodo getSaldo() te da un control de solo lectura.
        // Permite que el exterior sepa cuánto dinero hay, pero sin darle
        // el poder de alterarlo directamente.

        // Si intentaras hacer esto, el compilador daría un error porque los atributos son privados:
        // cuenta.saldo = 1000.0;

        // Usamos los métodos públicos para interactuar de forma segura
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + cuenta.getSaldo());

        // Realizar operaciones
        cuenta.depositar(200.0);
        cuenta.retirar(100.0);

        // Intento de retiro inválido bloqueado por la regla de encapsulamiento
        cuenta.retirar(1000.0);
    }
}