public class Estudiante {

    // con esta clase definimos como serán o son los objetos que pertenecerán a esta clase

    // Atributos de la clase
    String name;
    int age;
    String sexo;
    double nota;
    boolean matriculado;
    int grupo;
    String grado;
    String carrera;
    String test;
    Boolean beca;

    // Metodo de la clase Estudiante - constructor
    Estudiante(String name, int age, double nota, int grupo, String sexo, String grado){

        // 'this' se refiere al objeto que se está creando,
        // por ejemplo 'Estudiante1', en lugar de eso se usa 'this'

        this.name = name;
        this.age = age;
        this.nota = nota;
        this.matriculado = true;
        this.grupo = grupo;
        this.grado = grado;
        this.sexo = sexo;
    }

    // Metodo dentro de la clase Estudiante
    // las acciones que puede hacer un estudiante
    void study(){
        // de nuevo se usa 'this' para evitar poner el nombre del objeto que se está creando
        System.out.println(this.name + " esta estudiando");
    }

    void clases(){
        // de nuevo se usa 'this' para evitar poner el nombre del objeto que se está creando
        System.out.println(this.name + " está tomando clase");
    }

    void tareas(){
        // de nuevo se usa 'this' para evitar poner el nombre del objeto que se está creando
        System.out.println(this.name + " esta haciendo su tarea");
    }
}