package app;

import util.Console;

public class Application {

    public void start() {

        Console console = new Console();

        console.showWelcome();
        console.showMenu();

        /* llama al metodo readOption(),
        Console le pide  al usuario que escriba un numero
        El usuario escribe su numero y
        el metodo devuelve el varlor escrito por el usuario*/
        int option = console.readOption();
        System.out.println("Elegiste la opción: " + option);
    }

}