import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;

public class j61_GuardarSobreImagen {
    private static int xPrev = -1;
    private static int yPrev = -1;

    public static void main(String[] args) {
        int ancho = 500;
        int alto = 400;

        // 1. Imagen en memoria donde se guarda el trazo
        BufferedImage lienzo = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gInicial = lienzo.createGraphics();
        gInicial.setColor(Color.WHITE);
        gInicial.fillRect(0, 0, ancho, alto);
        gInicial.dispose();

        // 2. Panel que muestra la imagen y recibe el arrastre del ratón
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
                    g2.setColor(Color.BLUE);
                    g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    g2.drawLine(xPrev, yPrev, xActual, yActual);
                    g2.dispose();
                    panelDibujo.repaint();
                }

                xPrev = xActual;
                yPrev = yActual;
            }
        };
        panelDibujo.addMouseListener(raton);
        panelDibujo.addMouseMotionListener(raton);

        // 3. Botón de guardar con ícono, posicionado encima de la imagen
        JButton btnGuardar = new JButton("Guardar", crearIconoGuardar());
        btnGuardar.setBounds(ancho - 125, 15, 105, 32);
        btnGuardar.addActionListener(e -> {
            try {
                File salida = new File("dibujo_j61.png");
                ImageIO.write(lienzo, "png", salida);
                JOptionPane.showMessageDialog(null, "Guardado en: " + salida.getAbsolutePath());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar: " + ex.getMessage());
            }
        });

        // 4. JLayeredPane para poner el botón en una capa superior sobre el dibujo
        JLayeredPane capas = new JLayeredPane();
        capas.setPreferredSize(new Dimension(ancho, alto));
        capas.add(panelDibujo, JLayeredPane.DEFAULT_LAYER);
        capas.add(btnGuardar, JLayeredPane.PALETTE_LAYER);

        // 5. Ventana principal
        JFrame ventana = new JFrame("j61 - Guardar sobre la imagen");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(capas);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
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