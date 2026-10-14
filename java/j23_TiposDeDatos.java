import java.util.ArrayList;

public class j23_TiposDeDatos {

        // CLASE PERSONALIZADA (Ejemplo de POO)
        static class Paciente {
        String nombre;
        int edad;

        // Constructor
        public Paciente(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        
        System.out.println("-------------");
        System.out.println(" 1. TIPOS DE DATOS PRIMITIVOS");
        System.out.println("-------------");
        
        byte edadPerro = 5;                       // Entero pequeño
        short anioNacimiento = 2021;              // Entero mediano
        int poblacionCiudad = 1500000;            // Entero estándar
        long distanciaEstelar = 9876543210L;      // Entero grande (requiere 'L' al final)
        float temperatura = 36.5f;                // Decimal de precisión simple (requiere 'f')
        double pi = 3.1415926535;                 // Decimal de alta precisión
        boolean esSano = true;                    // Verdadero o Falso
        char calificacion = 'A';                  // Un solo caracter entre comillas simples

        System.out.println("byte (edadPerro): " + edadPerro);
        System.out.println("short (anioNacimiento): " + anioNacimiento);
        System.out.println("int (poblacionCiudad): " + poblacionCiudad);
        System.out.println("long (distanciaEstelar): " + distanciaEstelar);
        System.out.println("float (temperatura): " + temperatura);
        System.out.println("double (pi): " + pi);
        System.out.println("boolean (esSano): " + esSano);
        System.out.println("char (calificacion): " + calificacion);


        System.out.println("-------------");
        System.out.println(" 2. TIPOS DE DATOS NO PRIMITIVOS (REFERENCIA)");
        System.out.println("-------------");

        // A. Cadenas de texto (String)
        String nombreClinica = "Clinica Veterinaria San Francisco";
        System.out.println("String: " + nombreClinica);

        // B. Clases Envoltorios (Wrappers) - Versión objeto de los primitivos
        Integer edadMaximaObj = 20; 
        Double pesoObj = 15.5;
        Boolean estadoObj = true;
        Character letraObj = 'X';
        System.out.println("Wrapper Integer: " + edadMaximaObj);
        System.out.println("Wrapper Double: " + pesoObj);

        // C. Arrays (Arreglos)
        int[] diasMes = {31, 28, 31, 30}; // Arreglo de enteros primitivos
        String[] nombresDoctores = {"Dr. House", "Dra. Grey", "Dr. Dolittle"}; // Arreglo de Strings
        
        System.out.println("Array (Primer día del mes): " + diasMes[0]);
        System.out.println("Array (Segundo doctor): " + nombresDoctores[1]);

        // D. Objetos definidos por el usuario (Creando una instancia de nuestra clase Paciente)

        // Clase    MiNomClase  OP new
        Paciente miMascota = new Paciente("Firulais", 3);
        System.out.println("Objeto Personalizado (Paciente): " + miMascota.nombre + ", " + miMascota.edad + " anios.");

        // E. Clases de la Biblioteca Estándar de Java (Ej: ArrayList)
        ArrayList listaMedicamentos = new ArrayList<>();
        listaMedicamentos.add("Vacuna Antirrabica");
        listaMedicamentos.add("Desparasitante");
        listaMedicamentos.add("Anestesico");

        System.out.println("Biblioteca Estándar (ArrayList): " + listaMedicamentos);
    }
}
