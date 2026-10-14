import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// Este archivo se encarga exclusivamente de
// hablar con la base de datos: crear la tabla
// insertar registros y consultarlos

public class PacienteDAO {

    // Crear la tabla si no existe
    public void crearTabla() {
        String sql = "CREATE TABLE IF NOT EXISTS pacientes ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " nombre TEXT NOT NULL,"
                + " especie TEXT NOT NULL,"
                + " edad INTEGER"
                + ");";

        try (Connection conn = Conexion.conectar();
             Statement stmt = conn.createStatement()) {
            if (conn != null) {
                stmt.execute(sql);
                System.out.println("[✔] Tabla 'pacientes' verificada/creada con éxito.");
            }
        } catch (SQLException e) {
            System.out.println("[✖] Error al crear la tabla: " + e.getMessage());
        }
    }

    // Insertar un paciente recibiendo el objeto
    public void insertar(Paciente paciente) {
        String sql = "INSERT INTO pacientes(nombre, especie, edad) VALUES(?, ?, ?)";

        try (Connection conn = Conexion.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, paciente.getNombre());
            pstmt.setString(2, paciente.getEspecie());
            pstmt.setInt(3, paciente.getEdad());

            pstmt.executeUpdate();
            System.out.println("[✔] Paciente guardado: " + paciente.getNombre());

        } catch (SQLException e) {
            System.out.println("[✖] Error al insertar paciente: " + e.getMessage());
        }
    }

    // Consultar todos los pacientes y devolverlos en una lista de objetos
    public List<Paciente> obtenerTodos() {
        String sql = "SELECT id, nombre, especie, edad FROM pacientes";
        List<Paciente> lista = new ArrayList<>();

        try (Connection conn = Conexion.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String especie = rs.getString("especie");
                int edad = rs.getInt("edad");

                // Creamos el objeto Paciente con los datos de la fila y lo agregamos a la lista
                Paciente p = new Paciente(id, nombre, especie, edad);
                lista.add(p);
            }

        } catch (SQLException e) {
            System.out.println("[✖] Error al consultar pacientes: " + e.getMessage());
        }

        return lista;
    }
}