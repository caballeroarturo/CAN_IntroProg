public class Paciente {
    // Este archivo define la estructura del objeto
    // Paciente en la memoria
    private int id;
    private String nombre;
    private String especie;
    private int edad;

    // Constructor para pacientes nuevos (aún sin ID en la base de datos)
    public Paciente(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Constructor completo (cuando ya viene consultado de la base de datos con su ID)
    public Paciente(int id, String nombre, String especie, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Getters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public int getEdad() { return edad; }

    @Override
    public String toString() {
        return "ID: " + id + " | Nombre: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años";
    }
}