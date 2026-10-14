public class Main {

    public static void main(String[] args) {

        // constructores sobrecargados = Permite a una clase tener muchos constructores
        //                               con diferente lista de parámetros
        //                               Los objetos se pueden iniciar de diferentes formas.

        // Permite que quienes usen la clase puedan crear objetos de varias formas distintas,
        // sin tener que pasar siempre todos los datos.

        System.out.println("---- Primera version del constructor ------");
        User user4 = new User();
        System.out.println("Nombre del usuario 4: " + user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);

        System.out.println("-------Segunda version del constructor -----");

        User user1 = new User("Fulgor");
        System.out.println("Nombre del usuario 1: " +user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);
        
        System.out.println("-------Tercera version del constructor -----");
        User user2 = new User("Sedano", "sedano@aol.com");
        System.out.println("Nombre del usuario 2: " +user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println("-------Cuarta version del constructor -----");
        User user3 = new User("Mata", "filomenomata@gmail.com", 27);
        System.out.println("Nombre del usuario 3: " + user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);


    }
}