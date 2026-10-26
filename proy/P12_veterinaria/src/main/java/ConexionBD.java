import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {
    private static final String URL = "jdbc:sqlite:veterinaria_completa.db";

    public static Connection conectar() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
        return conn;
    }

    public static void crearTablas() {
        try (Connection conn = conectar();
             Statement stmt = conn.createStatement()) {

            // 1. Tabla Pacientes
            stmt.execute("CREATE TABLE IF NOT EXISTS pacientes (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT NOT NULL, " +
                    "fecha_nacimiento TEXT, " +
                    "especie TEXT NOT NULL, " +
                    "raza TEXT" +
                    ");");

            // 2. Tabla Dueños (Guarda principal y secundario en una sola tabla diferenciados por 'tipo')
            stmt.execute("CREATE TABLE IF NOT EXISTS duenos (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "paciente_id INTEGER, " +
                    "tipo TEXT NOT NULL, " + // 'Principal' o 'Secundario'
                    "nombre TEXT NOT NULL, " +
                    "telefono TEXT, " +
                    "sexo TEXT, " +
                    "domicilio TEXT, " +
                    "FOREIGN KEY(paciente_id) REFERENCES pacientes(id)" +
                    ");");

            // 3. Tabla Vacunas
            stmt.execute("CREATE TABLE IF NOT EXISTS vacunas (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "paciente_id INTEGER, " +
                    "nombre_vacuna TEXT NOT NULL, " +
                    "FOREIGN KEY(paciente_id) REFERENCES pacientes(id)" +
                    ");");

            System.out.println("Tablas de la clínica creadas correctamente.");
        } catch (SQLException e) {
            System.out.println("Error al crear tablas: " + e.getMessage());
        }
    }
}