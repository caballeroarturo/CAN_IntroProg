// Todo el que quiera trabajar como metodo de pago
//  DEBE saber procesar un monto y decir su nombre

public interface MetodoPago {

    // procesar(double monto) → recibe un monto y no devuelve nada (void).
    void procesar(double monto);

    // getNombre() → devuelve un String.
    String getNombre();
}