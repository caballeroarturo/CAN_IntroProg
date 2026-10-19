public class PagoPayPal implements MetodoPago {
    private String email;

    public PagoPayPal(String email) { this.email = email; }

    @Override
    public void procesar(double monto) {
        System.out.println("🅿️  Cobrando $" + monto + " vía PayPal a " + email);
        System.out.println("   -> Redirigiendo a PayPal...");
        System.out.println("   -> ¡Completado!");
    }

    @Override
    public String getNombre() { return "PayPal"; }
}