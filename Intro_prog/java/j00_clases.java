//        Reglas de convención en Java
// Elemento	Convención	Ejemplo
// Clases	Empiezan con mayúscula	Persona, Main, Calculadora
// Métodos	Empiezan con minúscula	saludar(), main(), calcular()
// Variables	Empiezan con minúscula	nombre, edad, persona1
// Constantes	TODAS MAYÚSCULAS	PI, MAX_VALUE
// Paquetes	Todo minúscula	java.util, mi.programa
// Esta clase NO es pública (solo visible dentro del archivo)



// Clase (sin main) que hace el trabajo pero no inicia nada
class Persona {
    // atributos
    String nombre;
    int edad;
    
    // ESTE de abajo es un metodo
    void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }
}

// La clase que tiene main → PUEDE ejecutarse sola (es el programa principal).
// La clase que NO tiene main → NO puede ejecutarse sola (es un "molde" o "herramienta" 
// que usa el programa principal).

// Esta clase SÍ es pública y tiene el main. EL main inicia la ejecución
public class j00_clases {

    // este de abajo es un metodo
    // es un metodo publico, es decir cualquiera puede llamarlo
    //  Este método es estático, lo que significa que puede ejecutarse 
    // sin crear un objeto de la clase.

    // el void significa que el método no devuelve ningún valor. Es decir, no retorna nada. El main solo ejecuta instrucciones y finaliza. 
    // No necesita devolver un resultado como una calculadora que devuelve un número.

    // String[] args Este es un parámetro que recibe el método. String[] es un arreglo (lista) de textos (String), 
    // y args es su nombre (puede llamarse como quieras).
    
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Ana";
        persona1.edad = 25;
        persona1.saludar();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Carlos";
        persona2.edad = 30;
        persona2.saludar();
    }
}
