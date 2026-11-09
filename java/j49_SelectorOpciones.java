import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/* ¿Qué conceptos nuevos aprendemos aquí?
- JComboBox<String>: Es la lista desplegable clásica de 
    las interfaces gráficas. Entre los diamantes <String> 
    le indicamos que almacenará datos de tipo texto.

- comboLenguajes.getSelectedItem(): Es el método clave 
    que le pregunta a la lista desplegable cuál es la 
    opción exacta que está marcada en ese momento para 
    poder usarla en nuestra lógica.

- El evento integrado: Aunque el JComboBox puede usar 
    ItemListener (como las casillas), también se lleva 
    muy bien con el clásico ActionListener, ya que cada 
    vez que cambias de opción en el menú, se interpreta 
    como una "acción completada". 
    */
public class j49_SelectorOpciones {
    public static void main(String[] args) {
        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("j49_SelectorOpciones - Menú Desplegable");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 200);
        ventana.setLayout(new FlowLayout());
        ventana.setLocationRelativeTo(null);

        // 2. Creamos los elementos que contendrá la lista desplegable
        String[] lenguajes = {"Java", "Python", "JavaScript", "C++", "Ruby"};
        
        // Creamos el JComboBox pasándole el arreglo de opciones
        JComboBox<String> comboLenguajes = new JComboBox<>(lenguajes);
        
        JLabel etiqueta = new JLabel("Selecciona un lenguaje de la lista.");

        // --------------------
        // 3. PROGRAMANDO EL EVENTO CON ActionListener
        // --------------------
        
        comboLenguajes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtenemos el elemento exacto que el usuario seleccionó
                String seleccionado = (String) comboLenguajes.getSelectedItem();
                // Actualizamos la etiqueta con la opción elegida
                etiqueta.setText("Has elegido: " + seleccionado);
            }
        });

        // 4. Añadimos los componentes ordenadamente a la ventana
        ventana.add(new JLabel("Lenguaje favorito:"));
        ventana.add(comboLenguajes);
        ventana.add(etiqueta);

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }
}