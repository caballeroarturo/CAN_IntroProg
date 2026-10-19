
// Polimorfismo significa muchas formas

/* Una sola instrucción (animal.hacerSonido()) se 
comporta de forma diferente dependiendo de la forma 
real que tenga el objeto en ese momento 
(si es un Perro ladra, si es un Gato maúlla, 
si es una Vaca hace muu).

No necesitas preguntar con un if de qué tipo de 
animal se trata; Java delega esa responsabilidad 
de forma automática en tiempo de ejecución (lo que 
se conoce como enlace dinámico).

*/

public class j31_Polimorfismo {
    public static void main(String[] args) {
        System.out.println("--------------");
        System.out.println("      POLIMORFISMO      ");
        System.out.println("--------------\n");

        // 1. Creamos objetos específicos pero los guardamos en variables 
        // de tipo Animal (esto es clave para el polimorfismo).
        Animal miPerro = new Perro();
        Animal miGato = new Gato();
        Animal miVaca = new Vaca();

        // 2. Creamos un arreglo (o lista) de tipo Animal
        // esta lista contiene objetos

        Animal[] animales = { miPerro, miGato, miVaca };

        // 3. POLIMORFISMO:
        /* Recorremos el arreglo llamando al mismo método 
        'hacerSonido()'.
        
        aunque todas las variables son de tipo 'Animal', Java sabe 
        exactamente qué método ejecutar dependiendo de la forma real 
        del objeto.

        */
       System.out.println("Cada clase hija sobre escribe el método 'hacerSonido()'");
        for (Animal animal : animales) {
            animal.hacerSonido(); 
            // ¡Mismo comando, comportamiento distinto!
        }

        System.out.println("Sin embargo no es indispensable que:" + 
        "\nlas clases hijas sobre escriban los metodos de la clase padre");
        miPerro.dormir();
        miGato.dormir();
        miVaca.dormir();
    }
}


// --------------------------------------------------------------------
// CLASE PADRE (SUPERCLASE)
// --------------------------------------------------------------------
class Animal {
    // Método genérico que será sobrescrito por las hijas
    // el método del padre sirve como una "regla" o "promesa" 
    // de que todos los hijos van a responder a esa misma orden

/* Java hace una revisión estricta en tiempo de compilación: 
"¿La clase Animal conoce un método llamado hacerSonido()?".
Si el método sí existe en Animal: Java dice: "De acuerdo, 
confío en que cualquier animal sabrá hacer un sonido", y deja 
compilar el código. 

Luego, en el momento de ejecutarlo (tiempo de ejecución), 
se da cuenta de que es un Perro y ejecuta el ladrido. 
Eso es el polimorfismo.
*/
public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

public void dormir() {
        System.out.println("El animal está durmiendo: Zzz...");
    }

}


// --------------------------------------------------------------------
// CLASE HIJA 1 (PERRO)
// --------------------------------------------------------------------
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Perro: ¡Guau, guau!");
    }
}


// --------------------------------------------------------------------
// CLASE HIJA 2 (GATO)
// --------------------------------------------------------------------
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Gato: ¡Miau, miau!");
    }
}


// --------------------------------------------------------------------
// CLASE HIJA 3 (VACA)
// --------------------------------------------------------------------
class Vaca extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Vaca: ¡Muuu, muuu!");
    }
}