public class Main {
    public static void main(String[] args) {

        // Object = Es una entidad que
        //  -- > tiene datos (atributos)
        //  ---> puede ejecutar acciones (métodos)

        // Para crear un objeto car1 usamos:
        // Clase objeto = nueva instancia de la clase
        
        Car vocho = new Car();
        Car audi  = new Car();
        // -------------------------------------

        // ----> Los atributos de los objetos

        // Para acceder a los elementos del objeto usamos el operador punto
        // seguido del nombre del atributo
        System.out.println(vocho.make);
        System.out.println(vocho.model);
        System.out.println(vocho.year);
        System.out.println(vocho.price);
        System.out.println(vocho.isRunning);
        System.out.println("---------------");

        vocho.make = "VW";
        vocho.model = "Vocho sedan";
        vocho.year = 2010;
        vocho.price = 100000.0;
        vocho.isRunning = false;

        System.out.println("---------------");
        System.out.println("Make: " +  vocho.make);
        System.out.println("Model: " + vocho.model);
        System.out.println("Year: " + vocho.year);
        System.out.println("Price: " + vocho.price);
        System.out.println("Esta encendido: " + vocho.isRunning);

        System.out.println("---------------");
        System.out.println("Make: " + audi.make);
        System.out.println("Model: " + audi.model);

        System.out.println("---------------");

        audi.make = "Audi";
        audi.model = "A4";
        audi.year = 2015;
        audi.price = 600000.0;
        audi.isRunning = true;

        System.out.println("---------------");

        System.out.println("Make: " +  audi.make);
        System.out.println("Model: " + audi.model);
        System.out.println("Year: " + audi.year);
        System.out.println("Price: " + audi.price);
        System.out.println("Esta encendido: " + audi.isRunning);
        
        System.out.println("---------------");

  

        

        // ---> las acciones que pueden hacer nuestros objetos

        System.out.println("---------------");
        System.out.println("Car1 esta encendido: "+ vocho.isRunning);
        System.out.println("Car2 esta encendido: "+ audi.isRunning);
        System.out.println("---------------");

        vocho.start();
        audi.stop();

        System.out.println("---------------");
        System.out.println("Car1 esta encendido: "+ vocho.isRunning);
        System.out.println("Car2 esta encendido: "+ audi.isRunning);
        System.out.println("---------------");
        
        vocho.brake();
        audi.drive();
    }
}