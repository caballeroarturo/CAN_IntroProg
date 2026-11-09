import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class j45_MultiplicacionNumeros {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j45_MultiplicacionNumeros - Multiplicar");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350, 250);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Creamos los componentes visuales
        JTextField campo1 = new JTextField(10); // Casilla para el primer número
        JTextField campo2 = new JTextField(10); // Casilla para el segundo número
        JButton botonCalcular = new JButton("Calcular");
        JLabel etiquetaResultado = new JLabel("Resultado: Esperando números...");

        // -----------------------
        // 3. PROGRAMANDO EL EVENTO DE CLIC CON ActionListener
        // -----------------------
        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Obtenemos el texto escrito en las casillas
                    String texto1 = campo1.getText();
                    String texto2 = campo2.getText();

                    // Convertimos el texto (String) a números decimales (double)
                    double num1 = Double.parseDouble(texto1);
                    double num2 = Double.parseDouble(texto2);

                    // Multiplicamos ambos valores
                    double resultado = num1 * num2;

                    // Mostramos el resultado en la etiqueta
                    etiquetaResultado.setText("¡Resultado: " + num1 + " × " + num2 + " = " + resultado + "!");

                } catch (NumberFormatException ex) {
                    // Si el usuario deja campos vacíos o escribe letras, el programa no colapsa
                    etiquetaResultado.setText("⚠️ Error: Por favor ingresa números válidos.");
                }
            }
        });

        // 4. Añadimos los elementos ordenadamente a la ventana
        ventana.add(new JLabel("Número 1:"));
        ventana.add(campo1);
        ventana.add(new JLabel("Número 2:"));
        ventana.add(campo2);
        ventana.add(botonCalcular);
        ventana.add(etiquetaResultado);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}