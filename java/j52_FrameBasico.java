import javax.swing.JFrame;

public class j52_FrameBasico {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j52 - Mi Primera Ventana Formateada");

        // Ancho y alto en píxeles
        frame.setSize(500, 350);

        // Cierra la aplicación al pulsar el botón cerrar de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Siempre al final para mostrar la ventana ya configurada
        frame.setVisible(true);
    }
}