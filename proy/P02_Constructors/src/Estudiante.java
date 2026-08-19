public class Estudiante {

    // Atributos de la clase
    String name;
    int age;
    double nota;
    boolean isEnrolled;

    // Metodo de la clase Estudiante
    Estudiante(String name, int age, double nota){

        // 'this' se refiere al objeto que se está creando,
        // por ejemplo 'Estudiante1', en lugar de eso se usa 'this'

        this.name = name;
        this.age = age;
        this.nota = nota;
        this.isEnrolled = true;
    }

    // Metodo dentro de la clase Estudiante
    void study(){
        // de nuevo se usa 'this' para evitar poner el nombre del objeto que se está creando
        System.out.println(this.name + " esta estudiando");
    }
}