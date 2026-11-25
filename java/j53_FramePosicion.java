import javax.swing.JFrame;

public class j53_FramePosicion {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j53 - Centrada y Fija");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // null centra el frame respecto a la pantalla
        frame.setLocationRelativeTo(null);

        // Evita que el usuario cambie el tamaño arrastrando las esquinas
        frame.setResizable(false);

        frame.setVisible(true);
    }
}

