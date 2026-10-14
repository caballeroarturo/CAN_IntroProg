import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaVeterinaria extends JFrame {

    private JTextField txtNombre, txtEspecie, txtEdad;
    private JButton btnGuardar;
    private PacienteDAO pacienteDAO;

    public VentanaVeterinaria() {
        // Configuraciones básicas de la ventana
        setTitle("Registro de Pacientes - Clínica Veterinaria");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Diseño libre para colocar elementos por coordenadas

        // Inicializamos nuestro DAO para poder guardar datos
        pacienteDAO = new PacienteDAO();
        pacienteDAO.crearTabla(); // Asegura que la tabla exista

        // Etiqueta y Campo para el Nombre
        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(30, 30, 80, 25);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(110, 30, 180, 25);
        add(txtNombre);

        // Etiqueta y Campo para la Especie
        JLabel lblEspecie = new JLabel("Especie:");
        lblEspecie.setBounds(30, 70, 80, 25);
        add(lblEspecie);

        txtEspecie = new JTextField();
        txtEspecie.setBounds(110, 70, 180, 25);
        add(txtEspecie);

        // Etiqueta y Campo para la Edad
        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(30, 110, 80, 25);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(110, 110, 180, 25);
        add(txtEdad);

        // Botón Guardar
        btnGuardar = new JButton("Guardar Paciente");
        btnGuardar.setBounds(110, 150, 180, 30);
        add(btnGuardar);

        // Acción al hacer clic en el botón
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. Capturamos los datos escritos en la interfaz
                String nombre = txtNombre.getText();
                String especie = txtEspecie.getText();

                try {
                    int edad = Integer.parseInt(txtEdad.getText());

                    // 2. Creamos el objeto Paciente
                    Paciente nuevoPaciente = new Paciente(nombre, especie, edad);

                    // 3. Usamos el DAO para guardarlo en SQLite
                    pacienteDAO.insertar(nuevoPaciente);

                    // Mensaje de éxito
                    JOptionPane.showMessageDialog(null, "¡Paciente guardado con éxito en la BD!");

                    // Limpiamos los campos
                    txtNombre.setText("");
                    txtEspecie.setText("");
                    txtEdad.setText("");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingresa un número válido para la edad.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        // Ejecutamos la ventana en el hilo principal de gráficos de Java
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaVeterinaria().setVisible(true);
            }
        });
    }
}