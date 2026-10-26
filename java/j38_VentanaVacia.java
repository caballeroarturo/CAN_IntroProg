
import javax.swing.JFrame;

public class j38_VentanaVacia {
    public static void main(String[] args) {
        // 1. Creamos la instancia de la ventana y le ponemos un título
        JFrame ventana = new JFrame("Nivel 1: Mi Primera Ventana");

        // 2. Definimos el tamaño de la ventana (ancho y alto en píxeles)
        ventana.setSize(400, 300);

        // 3. Indicamos qué debe hacer el programa cuando el usuario cierre la ventana 
        // (Esto es vital para que el proceso de Java termine correctamente al hacer clic en la "X")
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 4. Centramos la ventana en la pantalla del monitor
        ventana.setLocationRelativeTo(null);

        // 5. Por defecto las ventanas nacen ocultas, aquí la hacemos visible
        ventana.setVisible(true);
    }
}
