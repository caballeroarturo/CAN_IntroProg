import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j37_interfaces {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal (JFrame)
        // titulo de la ventana
        JFrame ventana = new JFrame("Mi Primera Interfaz Gráfica");
        // tamaño de la ventana
        ventana.setSize(350, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(null); // Diseño libre para colocar los elementos por coordenadas

        // 2. Creamos una etiqueta de texto (JLabel)
        JLabel etiqueta = new JLabel("Escribe tu nombre:");
        etiqueta.setBounds(30, 30, 150, 25);
        ventana.add(etiqueta);

        // 3. Creamos un campo de texto (JTextField)
        // dond el usuario pondra su texto
        JTextField campoTexto = new JTextField();
        campoTexto.setBounds(30, 60, 260, 25);
        ventana.add(campoTexto);

        // 4. Creamos un botón (JButton)
        JButton botonSaludar = new JButton("Saludar");
        botonSaludar.setBounds(100, 100, 120, 30);
        ventana.add(botonSaludar);

        // 5. Programamos la acción del botón (Event Listener)
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenemos el texto que escribió el usuario
                String nombre = campoTexto.getText();
                
                // Validamos que no esté vacío
                if (!nombre.isEmpty()) {
                    // Mostramos una ventana emergente con el saludo (JOptionPane)
                    JOptionPane.showMessageDialog(ventana, "¡Hola, " + nombre + "! Bienvenido a Java Swing.");
                } else {
                    JOptionPane.showMessageDialog(ventana, "Por favor, escribe un nombre primero.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // 6. Hacemos visible la ventana
        ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        ventana.setVisible(true);
    }
}
