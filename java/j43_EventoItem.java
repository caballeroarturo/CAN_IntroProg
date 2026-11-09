/* Da acceso a todos los componentes visuales que ves y 
tocas en una ventana, como los marcos (JFrame), botones 
(JButton), casillas de verificación (JCheckBox), etiquetas 
de texto (JLabel), etc.
*/
import javax.swing.*;

/* AWT (Abstract Window Toolkit) es la librería gráfica base 
¿Qué hace?: Proporciona las herramientas de soporte visual y 
de diseño, como los administradores de diseño (Layout Managers 
como FlowLayout) que ordenan los elementos en la pantalla, 
y clases de diseño como colores (Color), fuentes (Font) o 
gráficos (Graphics).
La agregamos porque necesitamos organizar cómo se acomodan los 
componentes en la ventana (usando FlowLayout) y manejar estilos 
visuales como los colores.
 */
import java.awt.*;

// Es la clase que representa el objeto del evento específico 
// para componentes de selección (como casillas o menús desplegables).
import java.awt.event.ItemEvent;

// Es la interfaz que define el comportamiento para los 
// eventos de cambio de estado de un componente de selección.
import java.awt.event.ItemListener;

public class j43_EventoItem {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j43_EventoItem - Selección de Estado");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 200);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null); // centra la ventana

        // 2. Creamos los componentes: una casilla de verificación y una etiqueta
        JCheckBox casilla = new JCheckBox("Suscribirse al boletín de noticias");
        JLabel etiqueta = new JLabel("Estado: No suscrito");

        // --------------------
        // 3. PROGRAMANDO EL ITEMEVENT CON ItemListener
        // --------------------
        
        // Usamos addItemListener en lugar de addActionListener
        casilla.addItemListener(new ItemListener() {
            @Override
            // Cuando el usuario cambia el estado de la casilla
            public void itemStateChanged(ItemEvent e) {
                // Evaluamos el estado actual del componente usando una condición
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Si el usuario marcó la casilla
                    etiqueta.setText("Estado: ¡Suscrito con éxito!");
                } else {
                    // Si el usuario desmarcó la casilla
                    etiqueta.setText("Estado: No suscrito");
                }
            }
        });

        // 4. Añadimos los elementos a la ventana
        ventana.add(casilla);
        ventana.add(etiqueta);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}
