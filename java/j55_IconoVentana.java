import javax.swing.*;
import java.awt.Image;

public class j55_IconoVentana {
    public static void main(String[] args) {
        JFrame frame = new JFrame("j56 - Ícono desde Imagen");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // 1. Cargamos el archivo de imagen desde tu disco o carpeta del proyecto
        ImageIcon iconoCargado = new ImageIcon("Alexander_Calder_Tejiendo_1949.png");

        // 2. Extraemos el objeto Image y lo asignamos al JFrame
        Image imagen = iconoCargado.getImage();
        frame.setIconImage(imagen);

        frame.setVisible(true);
    }
}
