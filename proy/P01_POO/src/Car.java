public class Car {

    // ¿Qué atributos tiene un auto?

    String make = "Hyundai";
    String model = "Creta";
    int year = 2026;
    double price = 58000.99;
    boolean isRunning = false;

    // ¿Qué acciones se pueden realizar con un auto?

    void start(){
        isRunning = true;
        System.out.println("Encendiste el auto " + model);
    }
    void stop(){
        isRunning = false;
        System.out.println("Apagaste el auto " + model);
    }

    void drive(){
        System.out.println("Manejas una " + model);
    }

    void brake(){
        System.out.println("Descompusiste el " + model);
    }
}
