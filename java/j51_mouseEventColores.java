import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class j51_mouseEventColores extends JPanel {
    // Coordenadas anteriores del ratón
    private int xPrev = -1;
    private int yPrev = -1;

    // Variable de estado para el color actual del trazo (inicia en azul)
    private Color colorActual = Color.BLUE;

    public j51_mouseEventColores() {
        setBackground(Color.WHITE);

        MouseAdapter adaptadorRaton = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xPrev = e.getX();
                yPrev = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int xActual = e.getX();
                int yActual = e.getY();

                Graphics g = getGraphics();
                // Usamos la variable colorActual en lugar de un color fijo
                g.setColor(colorActual);
                g.drawLine(xPrev, yPrev, xActual, yActual);

                xPrev = xActual;
                yPrev = yActual;
                g.dispose();
            }
        };

        addMouseListener(adaptadorRaton);
        addMouseMotionListener(adaptadorRaton);
    }

    // Método auxiliar para cambiar el color desde fuera del panel
    public void setColorActual(Color nuevoColor) {
        this.colorActual = nuevoColor;
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("j51_mouseEventColores - Mini Paint con Colores");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        ventana.setLayout(new BorderLayout());

        // 1. Creamos nuestro lienzo de dibujo y lo ponemos en el centro
        j51_mouseEventColores lienzo = new j51_mouseEventColores();
        ventana.add(lienzo, BorderLayout.CENTER);

        // 2. Creamos un panel superior para los dos botones de color
        JPanel barraColores = new JPanel(new FlowLayout());
        JButton btnAzul = new JButton("Azul");
        JButton btnRojo = new JButton("Rojo");

        // 3. Programamos los eventos de los botones
        btnAzul.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lienzo.setColorActual(Color.BLUE);
            }
        });

        btnRojo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lienzo.setColorActual(Color.RED);
            }
        });

        barraColores.add(new JLabel("Color del trazo:"));
        barraColores.add(btnAzul);
        barraColores.add(btnRojo);

        // 4. Colocamos la barra de botones arriba (NORTH)
        ventana.add(barraColores, BorderLayout.NORTH);

        ventana.setVisible(true);
    }
}