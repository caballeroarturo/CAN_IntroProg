package file;

import javax.swing.JFileChooser;
import java.io.File;

public class FileChooser {

    public String selectFile() {

        System.out.println("Entré a selectFile()");
        System.out.println("Antes del diálogo");

        JFileChooser chooser = new JFileChooser();

        chooser.setDialogTitle("Seleccione un archivo Excel");

        System.out.println("Chooser creado");

        int result = chooser.showOpenDialog(null);

        System.out.println("Después del diálogo");

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = chooser.getSelectedFile();

            return file.getAbsolutePath();

        }

        return null;

    }

}
