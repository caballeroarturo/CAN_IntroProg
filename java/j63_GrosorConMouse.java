import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class j63_GrosorConMouse {
    private static int xPrev = -1;
    private static int yPrev = -1;
    private static Color colorActual = Color.BLUE;
    private static float grosorPincel = 3.0f;

    public static void main(String[] args) {
        int ancho = 540;
        int alto = 420;

        // 1. Imagen en memoria donde se guarda el dibujo
        BufferedImage lienzo = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gInicial = lienzo.createGraphics();
        gInicial.setColor(Color.WHITE);
        gInicial.fillRect(0, 0, ancho, alto);
        gInicial.dispose();

        JLabel etiquetaGrosor = new JLabel("Grosor: " + (int) grosorPincel + " px");

        // 2. Panel de dibujo con el ratón y rueda para el grosor
        JPanel panelDibujo = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(lienzo, 0, 0, null);
            }
        };
        panelDibujo.setBounds(0, 0, ancho, alto);

        MouseAdapter raton = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xPrev = e.getX();
                yPrev = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int xActual = e.getX();
                int yActual = e.getY();

                if (xPrev != -1 && yPrev != -1) {
                    Graphics2D g2 = lienzo.createGraphics();
                    g2.setColor(colorActual);
                    g2.setStroke(new BasicStroke(grosorPincel, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    g2.drawLine(xPrev, yPrev, xActual, yActual);
                    g2.dispose();
                    panelDibujo.repaint();
                }

                xPrev = xActual;
                yPrev = yActual;
            }

            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                // Girar arriba (negativo) engrosa; girar abajo (positivo) adelgaza
                int cambio = -e.getWheelRotation();
                grosorPincel = Math.max(1.0f, Math.min(30.0f, grosorPincel + cambio));
                etiquetaGrosor.setText("Grosor: " + (int) grosorPincel + " px");
            }
        };
        panelDibujo.addMouseListener(raton);
        panelDibujo.addMouseMotionListener(raton);
        panelDibujo.addMouseWheelListener(raton);

        // 3. Barra superior con cuadritos de colores y grosor actual
        JPanel barraColores = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 6));
        barraColores.add(new JLabel("Colores:"));

        JButton cuadritoAzul = crearCuadritoColor(Color.BLUE);
        JButton cuadritoRojo = crearCuadritoColor(Color.RED);
        JButton cuadritoVerde = crearCuadritoColor(new Color(20, 150, 60));
        JButton cuadritoNegro = crearCuadritoColor(Color.BLACK);

        cuadritoAzul.addActionListener(e -> colorActual = Color.BLUE);
        cuadritoRojo.addActionListener(e -> colorActual = Color.RED);
        cuadritoVerde.addActionListener(e -> colorActual = new Color(20, 150, 60));
        cuadritoNegro.addActionListener(e -> colorActual = Color.BLACK);

        barraColores.add(cuadritoAzul);
        barraColores.add(cuadritoRojo);
        barraColores.add(cuadritoVerde);
        barraColores.add(cuadritoNegro);
        barraColores.add(new JLabel(" | Rueda del ratón -> "));
        barraColores.add(etiquetaGrosor);

        // 4. Botón de guardar flotando sobre el área de dibujo
        JButton btnGuardar = new JButton("Guardar", crearIconoGuardar());
        btnGuardar.setBounds(ancho - 125, 12, 108, 30);
        btnGuardar.addActionListener(e -> {
            try {
                File salida = new File("dibujo_j63.png");
                ImageIO.write(lienzo, "png", salida);
                JOptionPane.showMessageDialog(null, "Guardado en: " + salida.getAbsolutePath());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            }
        });

        // 5. Capa superior con el lienzo y el botón guardar encima
        JLayeredPane capas = new JLayeredPane();
        capas.setPreferredSize(new Dimension(ancho, alto));
        capas.add(panelDibujo, JLayeredPane.DEFAULT_LAYER);
        capas.add(btnGuardar, JLayeredPane.PALETTE_LAYER);

        // 6. Ventana principal con BorderLayout
        JFrame ventana = new JFrame("j63 - Cuadritos, Grosor con Ratón y Guardar");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());
        ventana.add(barraColores, BorderLayout.NORTH);
        ventana.add(capas, BorderLayout.CENTER);

        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    private static JButton crearCuadritoColor(Color color) {
        JButton btn = new JButton();
        btn.setPreferredSize(new Dimension(26, 26));
        btn.setBackground(color);
        btn.setOpaque(true);
        btn.setContentAreaFilled(true);
        btn.setBorder(new LineBorder(Color.DARK_GRAY, 1));
        btn.setFocusPainted(false);
        return btn;
    }

    private static ImageIcon crearIconoGuardar() {
        BufferedImage img = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setColor(new Color(30, 90, 170));
        g2.fillRoundRect(1, 1, 14, 14, 3, 3);
        g2.setColor(Color.WHITE);
        g2.fillRect(4, 2, 8, 4);
        g2.dispose();
        return new ImageIcon(img);
    }
}