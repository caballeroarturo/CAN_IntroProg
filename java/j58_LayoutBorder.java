import javax.swing.*;
import java.awt.BorderLayout;

public class j58_LayoutBorder {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j59 - BorderLayout");
        frame.setSize(420, 260);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // 10 px de separación horizontal y vertical entre zonas
        frame.setLayout(new BorderLayout(10, 10));

        frame.add(new JButton("Norte (Encabezado)"), BorderLayout.NORTH);
        frame.add(new JButton("Sur (Estado)"), BorderLayout.SOUTH);
        frame.add(new JButton("Oeste (Menú)"), BorderLayout.WEST);
        frame.add(new JButton("Este (Panel)"), BorderLayout.EAST);
        frame.add(new JButton("Centro (Área principal)"), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}