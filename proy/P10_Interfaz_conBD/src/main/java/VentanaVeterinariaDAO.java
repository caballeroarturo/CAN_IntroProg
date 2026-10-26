import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class VentanaVeterinariaDAO {

    // Ruta de nuestra base de datos SQLite
    private static final String URL = "jdbc:sqlite:veterinaria.db";

    public static void main(String[] args) {
        // Aseguramos que la tabla exista al iniciar el programa
        crearTablaSiNoExiste();

        // 1. Creamos la ventana principal
        JFrame ventana = new JFrame("Sistema de Veterinaria - Registro de Pacientes");
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setLayout(null);

        // 2. Componentes visuales (Etiquetas y Campos de texto)
        JLabel lblNombre = new JLabel("Nombre de la Mascota:");
        lblNombre.setBounds(30, 30, 200, 25);
        ventana.add(lblNombre);

        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(30, 60, 320, 30);
        ventana.add(txtNombre);

        JLabel lblEspecie = new JLabel("Especie (Ej. Perro, Gato):");
        lblEspecie.setBounds(30, 100, 200, 25);
        ventana.add(lblEspecie);

        JTextField txtEspecie = new JTextField();
        txtEspecie.setBounds(30, 130, 320, 30);
        ventana.add(txtEspecie);

        // 3. Botón para guardar en la Base de Datos
        JButton btnGuardar = new JButton("Guardar en SQLite");
        btnGuardar.setBounds(110, 180, 160, 35);
        ventana.add(btnGuardar);

        // 4. Programamos la acción del botón
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText().trim();
                String especie = txtEspecie.getText().trim();

                // Validamos que no estén vacíos
                if (!nombre.isEmpty() && !especie.isEmpty()) {
                    // Llamamos al método que inserta en la BD
                    guardarPacienteEnBD(nombre, especie);

                    // Limpiamos los campos de texto
                    txtNombre.setText("");
                    txtEspecie.setText("");
                } else {
                    JOptionPane.showMessageDialog(ventana, "Por favor, llena todos los campos.", "Aviso", JOptionPane.WARNING_MESSAGE);
                }
            }
        });

        // 5. Hacemos visible la ventana
        ventana.setVisible(true);
    }

    // Metodo para crear la tabla automáticamente si no existe
    public static void crearTablaSiNoExiste() {
        String sql = "CREATE TABLE IF NOT EXISTS pacientes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT NOT NULL, " +
                "especie TEXT NOT NULL" +
                ");";
        try (Connection conn = DriverManager.getConnection(URL);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Error al crear tabla: " + e.getMessage());
        }
    }

    // Metodo para insertar un paciente usando consultas preparadas (PreparedStatement)
    public static void guardarPacienteEnBD(String nombre, String especie) {
        String sql = "INSERT INTO pacientes(nombre, especie) VALUES(?, ?)";

        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nombre); // reemplaza el primer signo de interrogacion
            pstmt.setString(2, especie); // reemplaza el segundo signo de interrogacion
            pstmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "¡Paciente guardado exitosamente en la base de datos!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}