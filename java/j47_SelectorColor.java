import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* 
- JRadioButton y ButtonGroup
    Los botones de opción permiten al usuario elegir una alternativa 
    entre varias. El ButtonGroup actúa como un conector lógico que 
    impide que marques dos al mismo tiempo (si marcas "Rojo", 
    automáticamente se desmarca "Verde" o "Azul").

- BorderLayout: Es un administrador de diseño que divide 
    la ventana en 5 zonas (North, South, East, West, 
    CENTER). Aquí lo usamos para poner el panel de color 
    en el centro ocupando toda la pantalla y los 
    botones cómodamente abajo (SOUTH).

- Modificación de propiedades en tiempo de ejecución: 
    El evento detecta el clic y de inmediato le ordena a 
    otro objeto (panelColor.setBackground(...)) que redibuje 
    su aspecto visual de forma fluida.
*/
public class j47_SelectorColor {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j47_SelectorColor - Selector de Colores");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(500, 500);
        
        // Usamos BorderLayout para organizar zonas
        // cuando se agregan los elementos al layout se indica en que zona
        // se va a colocar (North, South, East, West, CENTER)
        ventana.setLayout(new BorderLayout()); 

        ventana.setLocationRelativeTo(null);
        // 2. Creamos un panel central que será el que cambie de color de fondo
        JPanel panelColor = new JPanel();
        panelColor.setBackground(Color.WHITE); // Empieza en blanco

        // 3. Creamos un panel inferior para los botones de opción
        JPanel panelControles = new JPanel();
        panelControles.setLayout(new FlowLayout());

        JRadioButton rbRojo = new JRadioButton("Rojo");
        JRadioButton rbVerde = new JRadioButton("Verde");
        JRadioButton rbAzul = new JRadioButton("Azul");

        // EL GRUPO DE BOTONES: Vital para que solo se pueda seleccionar uno a la vez
        ButtonGroup grupoBotones = new ButtonGroup();
        grupoBotones.add(rbRojo);
        grupoBotones.add(rbVerde);
        grupoBotones.add(rbAzul);

        // =====================================================================
        // 4. PROGRAMANDO LOS EVENTOS DE CADA BOTÓN CON ActionListener
        // =====================================================================
        
        rbRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.RED); // Cambia el panel a rojo
            }
        });

        rbVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.GREEN); // Cambia el panel a verde
            }
        });

        rbAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelColor.setBackground(Color.BLUE); // Cambia el panel a azul
            }
        });

        // 5. Añadimos los radio buttons al panel inferior
        panelControles.add(rbRojo);
        panelControles.add(rbVerde);
        panelControles.add(rbAzul);

        // 6. Añadimos los paneles a la ventana principal en sus respectivas zonas
        ventana.add(panelColor, BorderLayout.CENTER);
        ventana.add(panelControles, BorderLayout.SOUTH);

        // 7. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}
