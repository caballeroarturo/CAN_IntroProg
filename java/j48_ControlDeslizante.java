import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/* JSlider
    Es el componente gráfico de la barra deslizante. 
    Le indicamos su valor mínimo (0), máximo (100) y 
    dónde debe arrancar (50).

- El Contrato (ChangeListener): Es la interfaz encargada 
    de escuchar cambios continuos de estado. Obliga a 
    implementar el método stateChanged(ChangeEvent e).

- slider.getValue(): Es el método que le pregunta en 
    tiempo real a la barra en qué número exacto se 
    encuentra posicionada la perilla para reflejarlo 
    de inmediato en la interfaz.
 */

public class j48_ControlDeslizante {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j48_ControlDeslizante - Control Deslizante");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);
        
        // 2. Creamos los componentes: un slider (de 0 a 100, empezando en 50)
        JSlider deslizador = new JSlider(0, 100, 50);
        deslizador.setMajorTickSpacing(20); // Marcas principales cada 20 unidades
        deslizador.setPaintTicks(true);      // Mostrar las rayitas de las marcas
        deslizador.setPaintLabels(true);     // Mostrar los números en las marcas

        JLabel etiqueta = new JLabel("Valor actual: 50");

        // -----------------
        // 3. PROGRAMANDO EL CHANGEEVENT CON ChangeListener
        // -----------------
        
        deslizador.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Obtenemos el valor numérico actual en el que 
                // se soltó o movió la barra
                int valorActual = deslizador.getValue();
                
                // Actualizamos la etiqueta de texto en tiempo real
                etiqueta.setText("Valor actual: " + valorActual);
            }
        });

        // 4. Añadimos los elementos ordenadamente a la ventana
        ventana.add(new JLabel("Desliza la barra:"));
        ventana.add(deslizador);
        ventana.add(etiqueta);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}
