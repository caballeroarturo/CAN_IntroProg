public class Main {
    public static void main(String[] args) {

        // Object = Es una entidad que
        //  -- > tiene datos (atributos)
        //  ---> puede ejecutar acciones (métodos)

        // Para crear un objeto car1 usamos:
        // Clase objeto = nueva instancia de la clase
        Car car1 = new Car();

        // Clase objeto de car2 = nueva instancia de la clase
        Car car2 = new Car();

        // Para acceder a los elementos del objeto usamos el operador punto
        // seguido del nombre del atributo
        System.out.println(car1.make);
        System.out.println(car1.model);
        System.out.println(car1.price);

        // se pueden modificar los atributos de una clase
        System.out.println("---------------");
        car1.year= 2018;
        car1.model = "Tucson";
        System.out.println(car1.year);
        System.out.println("Modelo de car1: " + car1.model);
        System.out.println("Modelo de car2: " + car2.model);

        // acciones del auto
        System.out.println("---------------");
        System.out.println("Car1 esta encendido: "+ car1.isRunning);
        System.out.println("Car2 esta encendido: "+ car2.isRunning);

        car2.start();
        System.out.println("Car2 esta encendido: "+ car2.isRunning);
        System.out.println("Car1 esta encendido: "+ car1.isRunning);

        car2.stop();
        System.out.println("Car2 esta encendido: "+ car2.isRunning);
        System.out.println("Car1 esta encendido: "+ car1.isRunning);
    }
}