// se dedica a coordinar las acciones
// utilizando los objetos y el DAO.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("  SISTEMA VETERINARIO CON ARQUITECTURA DAO");
        System.out.println("-------------------------------------------");

        // Hablar de Arquitectura DAO (que en inglés significa
        // Data Access Object u Objeto de Acceso a Datos) se refiere a un
        // patrón de diseño de software clásico que sirve para organizar
        // el código de una forma muy específica: separar por completo la
        // lógica de tu aplicación de la forma en que te conectas y consultas
        // la base de datos.

        // Instanciamos el DAO que maneja las operaciones de base de datos
        PacienteDAO pacienteDAO = new PacienteDAO();

        // 1. Inicializar la tabla en SQLite
        pacienteDAO.crearTabla();

        // 2. Crear objetos Paciente en memoria
        Paciente p1 = new Paciente("Guaguencia", "Perro", 3);
        Paciente p2 = new Paciente("Michi", "Gato", 2);

        // 3. Guardarlos en la base de datos a través del DAO
        System.out.println("\n--- INSERTANDO REGISTROS ---");
        pacienteDAO.insertar(p1);
        pacienteDAO.insertar(p2);

        // 4. Consultar y mostrar todos los pacientes guardados
        System.out.println("\n--- LEYENDO DESDE LA BASE DE DATOS ---");
        List<Paciente> pacientesBD = pacienteDAO.obtenerTodos();

        for (Paciente p : pacientesBD) {
            System.out.println(p); // Llama automáticamente al metodo toString()
        }
    }
}