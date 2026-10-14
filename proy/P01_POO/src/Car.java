public class Car {

    // ¿Qué atributos tiene un auto?

    String make;
    String model;
    int year;
    double price;
    boolean isRunning = false;
    String motor; // disel, gasolina, electrico, hibrido, metanol
    String dueño;

    // ¿Qué acciones se pueden realizar con un auto?
    // las acciones se llaman métodos

    void start(){  
        isRunning = true;
        System.out.println("Encendiste el auto " + model);
    }
    void stop(){
        isRunning = false;
        System.out.println("Apagaste el auto " + model);
    }

    void drive(){
        System.out.println("Estas manejando un " + model);
    }

    void brake(){
        System.out.println("Descompusiste el " + model);
    }
}
