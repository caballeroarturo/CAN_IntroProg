import javax.swing.*;
import java.awt.*;

public class j54_FrameFondoyLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j54 - Fondo y Distribución");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Cambiamos el color de fondo del contenedor principal
        frame.getContentPane().setBackground(new Color(235, 242, 250));

        // Definimos un administrador de diseño con separación entre elementos
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 20));

        JLabel titulo = new JLabel("Ventana con fondo suave y espaciado");
        titulo.setFont(new Font("SansSerif", Font.BOLD, 16));
        frame.add(titulo);

        frame.setVisible(true);
    }
}