public class Gato extends Animal {

    private boolean esCazador;

    // ----------------------------------------
    // Constructor que reutiliza el del padre usando 'super'
    public Gato(String nombre, int edad, double peso, boolean esCazador) {
        super(nombre, edad, peso);
        this.esCazador = esCazador;
    }

    // ----------------------------------------
    // Métodos exclusivos del Gato
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau, miau!");
    }

    public void ronronear() {
        System.out.println(nombre + " está ronroneando tranquilamente.");
    }

}