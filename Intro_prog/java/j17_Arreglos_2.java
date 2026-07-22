public class j17_Arreglos_2 {
public static void main(String[] args) {
       
    // Inicialización directa con valores
        double[] precios = {19.99, 5.50, 12.00, 4.25};
        double total = 0;

        /* cómo recorrer un arreglo inicializado directamente para 
        calcular un total y un promedio
        */

        System.out.println("--- Lista de precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + i + ": $" + precios[i]);
            total += precios[i]; // Acumulamos el precio
        }

        double promedio = total / precios.length;
        System.out.println("\nTotal: $" + total);
        System.out.println("Promedio por producto: $" + promedio);
    }
}
