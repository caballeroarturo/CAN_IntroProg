public class PagoEfectivo implements MetodoPago {
    @Override
    public void procesar(double monto) {
        System.out.println("💵 Recibiendo $" + monto + " en efectivo");
        System.out.println("   -> Verificando billetes...");
        System.out.println("   -> ¡Recibido!");
    }

    @Override
    public String getNombre() { return "Efectivo"; }
}