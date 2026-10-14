public class Main {
    public static void main(String[] args) {

        /* constructor = Metodo para inicializar objetos
                        Podemos establecer parametros iniciales
        */

        // objeto student1 creado a partir de una instancia de la clase Estudiante
        // el objeto se crea con el operador "new" cuando crea la nueva instancia de la clase

        // La Clase es el qué (la definición).
        // El Objeto es el quién (la entidad viva en memoria).
        // El Constructor es el cómo (la forma en que ese objeto cobra vida y se configura).

        //                        Estudiante(String name, int age, double nota, int grupo, String sexo)
        Estudiante student1 = new Estudiante("Javier", 30, 9.2, 1, "Hombre",  "Licenciatura-1");
        Estudiante student2 = new Estudiante("Maria", 25, 8.5, 2, "Mujer", "Licenciatura-2");

        System.out.println("nombre: " + student1.name);
        System.out.println("grado: " + student1.grado);
        System.out.println("carrera: " + student1.carrera);

        student1.grado = "Cuatrimestre 1 - Ingeniería";
        System.out.println("grado: " + student1.grado);

        System.out.println("----------------------------");

        System.out.println("nombre: " + student2.name);
        System.out.println("grado: " + student2.grado);
        System.out.println("carrera: " + student2.carrera);
        









    }
}