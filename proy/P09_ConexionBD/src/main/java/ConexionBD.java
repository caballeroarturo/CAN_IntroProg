// Creando la Conexión y la Tabla en SQLite

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    // Ruta donde se guardará nuestra base de datos local
    private static final String URL = "jdbc:sqlite:veterinaria.db";

    // Metodo para obtener la conexión
    public static Connection conectar() {
        Connection conn = null;
        try {
            // Intentamos conectarnos a SQLite
            conn = DriverManager.getConnection(URL);
            System.out.println("¡Conexión exitosa con la base de datos SQLite!");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
        return conn;
    }

    // Metodo para crear la tabla de pacientes si no existe
    public static void crearTablaPaciente() {
        String sql = "CREATE TABLE IF NOT EXISTS pacientes (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nombre TEXT NOT NULL, " +
                "especie TEXT NOT NULL" +
                ");";

        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("La tabla 'pacientes' está lista para usarse.");

        } catch (SQLException e) {
            System.out.println("Error al crear la tabla: " + e.getMessage());
        }
    }

    // Un pequeño main para probar que la base de datos se crea correctamente
    public static void main(String[] args) {
        crearTablaPaciente();
    }
}