import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class j60_BotonGuardar extends JPanel {
    private int xPrev = -1;
    private int yPrev = -1;
    private Color colorActual = Color.BLUE;

    // Imagen en memoria donde se guardan todos los trazos
    private BufferedImage lienzoImagen;

    public j60_BotonGuardar(int ancho, int alto) {
        setBackground(Color.WHITE);
        crearLienzoBlanco(ancho, alto);

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

                if (lienzoImagen != null && xPrev != -1 && yPrev != -1) {
                    // Dibujamos directamente sobre el BufferedImage
                    Graphics2D g2 = lienzoImagen.createGraphics();
                    g2.setColor(colorActual);
                    g2.setStroke(new BasicStroke(2.5f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    g2.drawLine(xPrev, yPrev, xActual, yActual);
                    g2.dispose();
                }

                xPrev = xActual;
                yPrev = yActual;

                // Pedimos a Swing que repinte el panel mostrando la imagen actualizada
                repaint();
            }
        };

        addMouseListener(adaptadorRaton);
        addMouseMotionListener(adaptadorRaton);
    }

    // Inicializa o limpia el lienzo en color blanco
    private void crearLienzoBlanco(int ancho, int alto) {
        lienzoImagen = new BufferedImage(Math.max(1, ancho), Math.max(1, alto), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = lienzoImagen.createGraphics();
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, lienzoImagen.getWidth(), lienzoImagen.getHeight());
        g2.dispose();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (lienzoImagen != null) {
            g.drawImage(lienzoImagen, 0, 0, null);
        }
    }

    public void setColorActual(Color nuevoColor) {
        this.colorActual = nuevoColor;
    }

    // Guarda el BufferedImage en un archivo PNG elegido por el usuario
    public void guardarImagen(Component padre) {
        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setDialogTitle("Guardar dibujo como PNG");
        selectorArchivo.setSelectedFile(new File("dibujo.png"));
        selectorArchivo.setFileFilter(new FileNameExtensionFilter("Imágenes PNG (*.png)", "png"));

        int opcion = selectorArchivo.showSaveDialog(padre);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            File archivo = selectorArchivo.getSelectedFile();
            if (!archivo.getName().toLowerCase().endsWith(".png")) {
                archivo = new File(archivo.getAbsolutePath() + ".png");
            }

            try {
                ImageIO.write(lienzoImagen, "png", archivo);
                JOptionPane.showMessageDialog(
                        padre,
                        "Imagen guardada en:\n" + archivo.getAbsolutePath(),
                        "Guardado exitoso",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(
                        padre,
                        "No se pudo guardar la imagen: " + ex.getMessage(),
                        "Error al guardar",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }

    // Crea un ícono pequeño de disquete/archivo para el botón Guardar
    private static ImageIcon crearIconoGuardar() {
        int size = 16;
        BufferedImage img = new BufferedImage(size, size, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Cuerpo del ícono
        g2.setColor(new Color(45, 95, 165));
        g2.fillRoundRect(1, 1, 14, 14, 3, 3);

        // Etiqueta superior blanca
        g2.setColor(Color.WHITE);
        g2.fillRect(4, 2, 8, 4);

        // Área inferior clara
        g2.setColor(new Color(220, 232, 248));
        g2.fillRect(4, 8, 8, 5);

        g2.dispose();
        return new ImageIcon(img);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("j51_mouseEventColores - Mini Paint con Colores");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(new BorderLayout());

        j60_BotonGuardar lienzo = new j60_BotonGuardar(600, 540);
        ventana.add(lienzo, BorderLayout.CENTER);

        JPanel barraColores = new JPanel(new FlowLayout());
        JButton btnAzul = new JButton("Azul");
        JButton btnRojo = new JButton("Rojo");
        JButton btnGuardar = new JButton("Guardar", crearIconoGuardar());

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

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lienzo.guardarImagen(ventana);
            }
        });

        barraColores.add(new JLabel("Color del trazo:"));
        barraColores.add(btnAzul);
        barraColores.add(btnRojo);
        barraColores.add(btnGuardar);

        ventana.add(barraColores, BorderLayout.NORTH);
        ventana.setVisible(true);
    }
}
