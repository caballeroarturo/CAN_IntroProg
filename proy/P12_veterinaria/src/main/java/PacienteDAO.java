import java.sql.*;
import java.util.Vector;

public class PacienteDAO {

    // Método para guardar un paciente completo
    public static boolean guardarPaciente(
            String nomMascota, String fNac, String especie, String raza,
            String nomPpal, String telPpal, String sexoPpal, String domPpal,
            String nomSec, String telSec, String sexoSec,
            String vacuna
    ) {
        String sqlPaciente = "INSERT INTO pacientes(nombre, fecha_nacimiento, especie, raza) VALUES(?, ?, ?, ?)";
        String sqlDuenos = "INSERT INTO duenos(paciente_id, tipo, nombre, telefono, sexo, domicilio) VALUES(?, ?, ?, ?, ?, ?)";
        String sqlVacuna = "INSERT INTO vacunas(paciente_id, nombre_vacuna) VALUES(?, ?)";

        try (Connection conn = ConexionBD.conectar()) {
            conn.setAutoCommit(false); // Transacción segura

            // 1. Insertar Paciente y obtener su ID generado
            try (PreparedStatement pstmtP = conn.prepareStatement(sqlPaciente, Statement.RETURN_GENERATED_KEYS)) {
                pstmtP.setString(1, nomMascota);
                pstmtP.setString(2, fNac);
                pstmtP.setString(3, especie);
                pstmtP.setString(4, raza);
                pstmtP.executeUpdate();

                ResultSet rsKeys = pstmtP.getGeneratedKeys();
                if (rsKeys.next()) {
                    int pacienteId = rsKeys.getInt(1);

                    // 2. Insertar Dueño Principal
                    try (PreparedStatement pstmtD = conn.prepareStatement(sqlDuenos)) {
                        pstmtD.setInt(1, pacienteId);
                        pstmtD.setString(2, "Principal");
                        pstmtD.setString(3, nomPpal);
                        pstmtD.setString(4, telPpal);
                        pstmtD.setString(5, sexoPpal);
                        pstmtD.setString(6, domPpal);
                        pstmtD.executeUpdate();

                        // 3. Insertar Dueño Secundario (Si escribieron su nombre)
                        if (!nomSec.isEmpty()) {
                            pstmtD.setInt(1, pacienteId);
                            pstmtD.setString(2, "Secundario");
                            pstmtD.setString(3, nomSec);
                            pstmtD.setString(4, telSec);
                            pstmtD.setString(5, sexoSec);
                            pstmtD.setString(6, ""); // Sin domicilio obligatorio para el secundario
                            pstmtD.executeUpdate();
                        }
                    }

                    // 4. Insertar Vacuna (Si escribió alguna)
                    if (!vacuna.isEmpty()) {
                        try (PreparedStatement pstmtV = conn.prepareStatement(sqlVacuna)) {
                            pstmtV.setInt(1, pacienteId);
                            pstmtV.setString(2, vacuna);
                            pstmtV.executeUpdate();
                        }
                    }

                    conn.commit(); // Confirmamos todos los cambios en la BD
                    return true;
                }
            } catch (SQLException e) {
                conn.rollback();
                throw e;
            }
        } catch (SQLException e) {
            System.out.println("Error al guardar en la BD: " + e.getMessage());
        }
        return false;
    }

    // Método para buscar pacientes por nombre o especie para mostrarlos en una tabla
// Método para buscar pacientes por nombre o especie para mostrarlos en una tabla
    public static Vector<Vector<Object>> buscarPacientes(String filtro) {
        Vector<Vector<Object>> resultados = new Vector<>();
        // CORRECCIÓN: Se agregó 'LIKE' antes del segundo ?
        String sql = "SELECT p.id, p.nombre, p.especie, p.raza, d.nombre AS duenio, d.telefono " +
                "FROM pacientes p LEFT JOIN duenos d ON p.id = d.paciente_id " +
                "WHERE (p.nombre LIKE ? OR p.especie LIKE ?) AND (d.tipo = 'Principal' OR d.tipo IS NULL)";

        try (Connection conn = ConexionBD.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + filtro + "%");
            pstmt.setString(2, "%" + filtro + "%");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Vector<Object> fila = new Vector<>();
                fila.add(rs.getInt("id"));
                fila.add(rs.getString("nombre"));
                fila.add(rs.getString("especie"));
                fila.add(rs.getString("raza"));
                fila.add(rs.getString("duenio"));
                fila.add(rs.getString("telefono"));
                resultados.add(fila);
            }
        } catch (SQLException e) {
            System.out.println("Error en búsqueda: " + e.getMessage());
        }
        return resultados;
    }
}