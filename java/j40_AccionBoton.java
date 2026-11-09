import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j40_AccionBoton {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("Nivel 3: Botones Interactivos");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        // 2. Componente de etiqueta
        JLabel etiqueta = new JLabel("Escribe tu nombre:");
        etiqueta.setBounds(30, 30, 150, 25);
        ventana.add(etiqueta);

        // 3. Campo de texto donde el usuario escribirá
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(30, 60, 300, 30);
        ventana.add(campoTexto);

        // 4. Botón de acción
        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(130, 110, 120, 35);
        ventana.add(botonSaludar);

        // 5. PROGRAMANDO EL EVENTO DEL BOTÓN (La magia de la interacción)
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenemos lo que el usuario escribió en el campo de texto
                String nombreIngresado = campoTexto.getText();

                // Validamos si el campo no está vacío
                if (!nombreIngresado.isEmpty()) {
                    // Mostramos una ventana emergente (JOptionPane) con el saludo
                    JOptionPane.showMessageDialog(ventana, "¡Hola, " + nombreIngresado + "! Qué gusto saludarte.");
                } else {
                    // Si está vacío, mostramos una alerta de advertencia
                    JOptionPane.showMessageDialog(ventana, "Por favor, escribe un nombre primero.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // 6. Hacemos visible la ventana
        ventana.setVisible(true);

        /*
        JTextField: Una caja de texto interactiva donde el usuario puede escribir 
        libremente desde el teclado.

        addActionListener: Es el "escucha" de eventos. Le dice al botón: 
        "Quédate atento; en el preciso instante en que el usuario haga clic sobre
        ti, ejecuta inmediatamente el código que está aquí adentro".

        JOptionPane.showMessageDialog: Una ventana emergente nativa de Java muy 
        útil para dar alertas rápidas.
 */
    }
}
