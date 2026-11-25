import javax.swing.*;
import java.awt.*;

public class j59_LayoutCombinado {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j60 - Combinando Layouts");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // Panel superior con FlowLayout para acciones rápidas
        JPanel barraSuperior = new JPanel(new FlowLayout(FlowLayout.LEFT));
        barraSuperior.add(new JButton("Nuevo"));
        barraSuperior.add(new JButton("Guardar"));

        // Panel central con GridLayout para una cuadrícula de opciones
        JPanel grillaCentral = new JPanel(new GridLayout(2, 2, 10, 10));
        grillaCentral.add(new JButton("Opción A"));
        grillaCentral.add(new JButton("Opción B"));
        grillaCentral.add(new JButton("Opción C"));
        grillaCentral.add(new JButton("Opción D"));

        frame.add(barraSuperior, BorderLayout.NORTH);
        frame.add(grillaCentral, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
