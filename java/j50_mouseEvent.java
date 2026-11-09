import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class j50_mouseEvent extends JPanel {
    // Variables para guardar las coordenadas anteriores del mouse
    private int xPrev = -1;
    private int yPrev = -1;

    public j50_mouseEvent() {
        // Fondo blanco para nuestro panel de dibujo
        setBackground(Color.WHITE);

        // Usamos un MouseAdapter para escuchar las acciones del ratón
        MouseAdapter adaptadorRaton = new MouseAdapter() {
            
            // 1. Cuando PRESIONAS el botón del ratón: guardamos el punto de partida
            @Override
            public void mousePressed(MouseEvent e) {
                xPrev = e.getX();
                yPrev = e.getY();
            }

            // 2. Cuando ARRASTRAS el ratón sin soltar el botón: dibujamos la línea
            @Override
            public void mouseDragged(MouseEvent e) {
                int xActual = e.getX();
                int yActual = e.getY();

                // Obtenemos el objeto gráfico (pincel) del panel
                Graphics g = getGraphics();
                g.setColor(Color.BLUE); // Color del trazo

                // Dibujamos una línea desde la posición anterior hasta la actual
                g.drawLine(xPrev, yPrev, xActual, yActual);

                // Actualizamos las coordenadas anteriores para que la línea sea continua
                xPrev = xActual;
                yPrev = yActual;
                
                g.dispose(); // Liberamos memoria gráfica
            }
        };

        // Conectamos los escuchas al panel (tanto para clics como para arrastrar)
        addMouseListener(adaptadorRaton);
        addMouseMotionListener(adaptadorRaton);
    }

    public static void main(String[] args) {
        // Creamos la ventana principal (JFrame)
        JFrame ventana = new JFrame("j50_mouseEvent - Mini Paint");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        
        // Añadimos nuestro panel interactivo a la ventana
        ventana.add(new j50_mouseEvent());
        
        // Hacemos visible la ventana
        ventana.setVisible(true);
    }
}