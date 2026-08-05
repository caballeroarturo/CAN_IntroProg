import javax.swing.*;
import java.awt.*;

public class TestChooser {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            JFileChooser chooser = new JFileChooser();

            int result = chooser.showOpenDialog(null);

            System.out.println(result);

        });

    }

}
