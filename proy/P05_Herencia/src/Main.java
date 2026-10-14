public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");
        System.out.println("        HERENCIA Y OBJETOS");
        System.out.println("-----------------------------------------");

        // Creamos objetos específicos (instancias)
        Perro miPerro = new Perro("Guaguencia", 3, 14.5, "Labrador");
        Gato miGato = new Gato("Michi", 2, 4.2, true);

        // Usamos los métodos del Perro (heredados y propios)
        System.out.println("--- ACCIONES DEL PERRO ---");
        miPerro.mostrarInformacion();
        miPerro.comer();
        miPerro.hacerSonido();
        miPerro.moverCola();

        // Usamos los métodos del Gato (heredados y propios)
        System.out.println("\n--- ACCIONES DEL GATO ---");
        miGato.mostrarInformacion();
        miGato.comer();
        miGato.hacerSonido();
        miGato.ronronear();
    }
}