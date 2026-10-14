public class Perro extends Animal {
    private String raza;

    // ----------------------------------------
    // Constructor que reutiliza el del padre usando 'super'
    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    // ----------------------------------------
    // Métodos exclusivos del Perro
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }

    public void moverCola() {
        System.out.println(nombre + " está moviendo la cola felizmente. Es de raza " + raza + ".");
    }
}