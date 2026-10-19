import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {
    public static void main(String[] args) {
        List<MetodoPago> carrito = new ArrayList<>();
        carrito.add(new PagoTarjeta("1234567890123456"));
        carrito.add(new PagoPayPal("cliente@email.com"));
        carrito.add(new PagoEfectivo());

        double total = 150.00;

        System.out.println("=== DEMO DE POLIMORFISMO ===\n");

        for (MetodoPago pago : carrito) {
            System.out.println("--- " + pago.getNombre() + " ---");
            pago.procesar(total);
            System.out.println();
        }
    }
}