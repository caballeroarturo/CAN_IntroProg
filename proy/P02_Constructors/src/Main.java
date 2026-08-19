public class Main {
    public static void main(String[] args) {

        /* constructor = Metodo para inicializar objetos
                        Puedes pasar argumentos y
                          establecer parametros iniciales
        */

        // objeto student1 creado a partir de una instancia de la clase Estudiante
        Estudiante student1 = new Estudiante("Javier", 30, 9.2);
        Estudiante student2 = new Estudiante("Roberto", 34, 8.5);
        Estudiante student3 = new Estudiante("María", 27, 8.0);

        // Primer estudiante
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.nota);
        System.out.println(student1.isEnrolled);
        System.out.println("----------------");

        // Segundo estudiante
        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.nota);
        System.out.println(student2.isEnrolled);
        System.out.println("----------------");

        // Tercer estudiante
        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.nota);
        System.out.println(student3.isEnrolled);
        System.out.println("----------------");


        student1.study();
        student2.study();
        student3.study();
    }
}