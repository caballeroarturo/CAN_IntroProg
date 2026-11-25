import javax.swing.*;
import java.awt.FlowLayout;

public class j56_LayoutFLow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j57 - FlowLayout");
        frame.setSize(320, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Alineación centrada, 10 px de separación horizontal, 15 px vertical
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 15));

        frame.add(new JButton("Uno"));
        frame.add(new JButton("Dos"));
        frame.add(new JButton("Tres"));
        frame.add(new JButton("Cuatro"));
        frame.add(new JButton("Cinco"));

        frame.setVisible(true);
    }
}