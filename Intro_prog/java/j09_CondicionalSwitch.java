/*
Simula un robot controlado por texto que recibe órdenes escritas por el usuario y 
responde con acciones específicas. Es como un chat interactivo donde el robot entiende 
6 comandos básicos.
 */

// 1. IMPORTAR LA CLASE Scanner (necesaria para leer lo que el usuario escribe por teclado)
import java.util.Scanner;

// 2. DECLARAR LA CLASE PRINCIPAL (el nombre del archivo debe ser RobotSwitch.java)
public class j09_CondicionalSwitch {
    
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Robot activado. Comandos disponibles:");
        System.out.println("avanzar, retroceder, girar, saltar, estado, salir");

        while (true) {
            System.out.print("\nIngresa un comando: ");
            comando = scanner.nextLine().toLowerCase();

            switch (comando) {
                case "avanzar": // cuando comando = "avanzar"
                    System.out.println("El robot avanza 2 metros.");
                    break;

                case "retroceder": // cuando comando = "retroceder"
                    System.out.println("El robot retrocede 1 metro.");
                    break;

                case "girar":
                    System.out.println("El robot gira 90 grados a la derecha.");
                    break;

                case "saltar":
                    System.out.println("El robot salta 0.5 metros.");
                    break;

                case "estado":
                    System.out.println("Batería al 85% | Modo: Automático");
                    break;

                case "salir": // cuando comando = "salir"
                    System.out.println("Apagando robot... ¡Hasta luego!");
                    scanner.close();
                    return;

                default: // en cualquier otro caso
                    System.out.println("Comando no reconocido.");
                    break;
            }

        }

    }
}
// 26. FIN DE LA CLASE RobotSwitch
