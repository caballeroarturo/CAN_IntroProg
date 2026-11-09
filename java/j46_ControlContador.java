import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j46_ControlContador {
    // Variable de estado: aquí guardamos el valor numérico que irá cambiando
    private static int contador = 0;

    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j46_ControlContador - Contador Interactivo");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 200);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Creamos los componentes visuales
        JButton btnSumar = new JButton("+ Sumar");
        JButton btnRestar = new JButton("- Restar");
        JLabel etiquetaValor = new JLabel("Valor actual: 0");

        // ----------------------
        // 3. PROGRAMANDO LOS EVENTOS PARA CADA BOTÓN
        // ----------------------

        // Evento para el botón de sumar
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador++; // Aumentamos la variable en 1
                etiquetaValor.setText("Valor actual: " + contador); // Actualizamos la pantalla
            }
        });

        // Evento para el botón de restar
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador--; // Disminuimos la variable en 1
                etiquetaValor.setText("Valor actual: " + contador); // Actualizamos la pantalla
            }
        });

        // 4. Añadimos los elementos ordenadamente a la ventana
        ventana.add(btnSumar);
        ventana.add(btnRestar);
        ventana.add(etiquetaValor);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}