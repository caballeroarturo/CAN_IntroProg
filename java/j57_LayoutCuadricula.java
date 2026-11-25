import javax.swing.*;
import java.awt.GridLayout;

public class j57_LayoutCuadricula {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j58 - GridLayout");
        frame.setSize(320, 240);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // 2 filas, 3 columnas, con 8 px de separación entre celdas
        frame.setLayout(new GridLayout(2, 3, 8, 8));

        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Tecla " + i));
        }

        frame.setVisible(true);
    }
}