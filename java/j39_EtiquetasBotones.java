import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class j39_EtiquetasBotones {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("Nivel 2: Componentes Básicos");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        
        // IMPORTANTE: Ponemos el layout en 'null' para poder ubicar 
        // los elementos midiendo píxeles exactos (coordenadas x, y).
        ventana.setLayout(null);

        // 2. Creamos una etiqueta de texto (JLabel)
        JLabel etiqueta = new JLabel("¡Hola! Esta es una etiqueta de texto.");
        // Coordenadas: x = 30, y = 40, ancho = 300, alto = 25
        etiqueta.setBounds(30, 40, 300, 25);
        ventana.add(etiqueta); // Añadimos la etiqueta a la ventana

        // 3. Creamos un botón (JButton)
        JButton boton = new JButton("Haz clic aquí");
        // Coordenadas: x = 30, y = 90, ancho = 150, alto = 30
        boton.setBounds(30, 90, 150, 30);
        ventana.add(boton); // Añadimos el botón a la ventana

        // 4. Hacemos visible la ventana
        ventana.setVisible(true);


        /* setLayout(null): Desactiva los acomodadores automáticos por defecto 
        para que tú decidas exactamente en qué píxel de la ventana quieres colocar 
        cada elemento usando setBounds(x, y, ancho, alto).

        JLabel y JButton: Son los componentes visuales que viven dentro de la 
        ventana. */
    }
}
