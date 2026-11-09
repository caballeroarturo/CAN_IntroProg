import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class j44_EventoKey {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j44_EventoKey - Eventos de Teclado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 250);
        ventana.setLayout(new FlowLayout());
         ventana.setLocationRelativeTo(null);

        // 2. Creamos los componentes: un campo de texto y una etiqueta
        JTextField campoTexto = new JTextField(20);
        JLabel etiqueta = new JLabel("Escribe algo en el campo de texto...");

        // -----------------
        // 3. PROGRAMANDO EL KEYEVENT CON KeyAdapter
        // -----------------
        // Conectamos el escuchas de teclado al campo de texto
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Evaluamos qué tecla exacta fue presionada usando su código
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Si presionaron la tecla Enter
                    etiqueta.setText("¡Presionaste ENTER! Texto: " + campoTexto.getText());
                } else {
                    // Si presionaron cualquier otra tecla, mostramos cuál fue
                    String nombreTecla = KeyEvent.getKeyText(e.getKeyCode());
                    etiqueta.setText("Tecla presionada: " + nombreTecla);
                }
            }
        });

        // 4. Añadimos los elementos a la ventana
        ventana.add(new JLabel("Escribe aquí:"));
        ventana.add(campoTexto);
        ventana.add(etiqueta);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }

    /*
    -El Componente Emisor (JTextField): Es una caja de texto donde 
        el usuario puede escribir libremente. Para que reciba las pulsaciones, 
        debe tener el foco de la ventana (basta con hacer clic dentro de ella).
    - El Contrato (KeyListener / KeyAdapter): En lugar de implementar todos 
        los métodos obligatorios de golpe, aquí usamos un KeyAdapter (un atajo 
        muy útil en Java que te permite usar solo el método que necesitas, 
        en este caso keyPressed).
    - El Objeto del Evento (KeyEvent e): Es la cajita de información que trae 
        los detalles de la tecla física. Gracias a métodos como e.getKeyCode() 
        y constantes como KeyEvent.VK_ENTER, la computadora puede saber exactamente 
        si pulsaste Enter, Escape, la letra A o cualquier otra tecla del teclado.
    - Gracias a getKeyText(), la computadora traduce ese 65 a la palabra "A" 
        para que la etiqueta muestre con claridad "Tecla presionada: A".
*/
}