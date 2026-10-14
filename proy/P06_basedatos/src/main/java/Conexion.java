import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:sqlite:veterinaria.db";

    // Este archivo centraliza la conexion con SQLite
    // Si cambias de base de datos en el futuro
    // solo modificas este archivo

    public static Connection conectar() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            return conn;
        } catch (SQLException e) {
            System.out.println("[✖] Error al conectar con la base de datos: " + e.getMessage());
            return null;
        }
    }
}