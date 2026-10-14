public class CuentaBancaria {
    // 1. Atributos privados (ocultos al exterior)
    private String titular;
    private double saldo;

    // Constructor para inicializar la cuenta
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // 2. Metodo Getter para consultar el titular (solo lectura)
    // Si usas getSaldo(): El código que usa tu clase no se entera del cambio.
    // Por fuera siguen llamando a getSaldo(), y tú por dentro modificas el código
    // para que haga la suma. Nadie se rompe
    // Si usaras cuenta.saldo directamente Todo el programa dependeria de esa variable exacta.
    //  Si cambias la estructura interna, tendrías que modificar el código de todo el proyecto
    public String getTitular() {
        return titular;
    }

    // 3. Metodo Getter para consultar el saldo (solo lectura controlada)
    public double getSaldo() {
        return saldo;
    }

    // 4. Metodo Modificador controlado para depositar dinero
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor a cero.");
        }
    }

    // 5. Metodo para retirar dinero con validación de seguridad
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Saldo restante: " + saldo);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}