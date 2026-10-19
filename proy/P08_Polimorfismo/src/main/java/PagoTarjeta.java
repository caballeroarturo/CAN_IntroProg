public class PagoTarjeta implements MetodoPago {
    private String numero;

    public PagoTarjeta(String numero) { this.numero = numero; }

    @Override
    public void procesar(double monto) {
        String ultimos = numero.substring(numero.length() - 4);
        System.out.println("💳 Cobrando $" + monto + " a tarjeta ****" + ultimos);
        System.out.println("   -> Validando con banco...");
        System.out.println("   -> ¡Aprobado!");
    }

    @Override
    public String getNombre() { return "Tarjeta"; }
}