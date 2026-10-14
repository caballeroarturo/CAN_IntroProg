public class Animal {
    // Atributos protegidos para que las clases hijas puedan acceder a ellos
    protected String nombre;
    protected int edad;
    protected double peso;

    // ----------------------------------------

    // Constructor de la clase padre
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // ----------------------------------------
    // Métodos generales compartidos
    public void comer() {
        System.out.println(nombre + " está comiendo su alimento.");
    }

    public void mostrarInformacion() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " años | Peso: " + peso + " kg");
    }
}