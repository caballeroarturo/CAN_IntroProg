import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j42_EventoSimple {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal (JFrame)
        JFrame ventana = new JFrame("j42_EventoSimple");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 200);
        ventana.setLayout(new FlowLayout()); // Organiza los elementos en orden

        // 2. Creamos los componentes visuales
        JButton boton = new JButton("¡Haz clic aquí!");
        JLabel etiqueta = new JLabel("Esperando tu acción...");

        // --------------------------------------------------------------------
        // 3. PROGRAMANDO EL EVENTO (El núcleo del modelo dirigido por eventos)
        // --------------------------------------------------------------------
        
        // Al botón le decimos que "escuche" los clics usando un 
        // ActionListener (el contrato - la interfaz ActionListener)
        boton.addActionListener(new ActionListener() {
            
            // Este método se ejecuta Automáticamente cuando ocurre 
            // el evento de clic
            // debemos iniciar con override porque es un contrato de la interfaz
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí programamos la reacción al evento
                etiqueta.setText("El botón fue presionado.");
            }
        });

        // 4. Añadimos el botón y la etiqueta a la ventana
        ventana.add(boton);
        ventana.add(etiqueta);

        // 5. Hacemos visible la ventana en la pantalla
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
