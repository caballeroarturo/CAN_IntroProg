/*
                 switch-case

El switch-case es una estructura de control en Java que te 
permite tomar decisiones múltiples basadas en el valor de una 
única variable o expresión. Es una alternativa más limpia y 
legible que usar muchos if-else if encadenados.

switch (expresión): La expresión a evaluar. 
- Puede ser de tipo int, char, String, enum, etc.
- case valor:: Etiqueta que compara la expresión con un valor específico.
break;: Termina el bloque switch. Sin break, el programa continúa ejecutando los siguientes casos (esto se llama "fall-through").
default:: Opcional. Se ejecuta si ningún case coincide (como el else).


*/
import java.util.Scanner;
public class j08_CondicionalSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número del 1 al 7: ");
        int dia = scanner.nextInt();
        
        String nombreDia;
        
        switch (dia) {
            case 1: // aquí dice: cuando día sea igual a 1
                nombreDia = "Lunes";
                System.out.println("---------------");
                break;
            case 2: // aquí dice: si día no es 1 pero es 2
                nombreDia = "Martes";
                break;
            case 3: // si día no es 1 ni 2 pero es 3
                nombreDia = "Miércoles";
                break;
            case 4:// si día no es 1 ni 2 ni 3 pero es 4
                nombreDia = "Jueves";
                break;
            case 5: // si dia no es 1 ni 2 ni 3 ni 4 pero es 5
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7: // si día no es 1 ni 2 ni 3 ni 4 ni 5 ni 6 pero es 7
                nombreDia = "Domingo";
                break;
            default: // en cualquier otro caso (siempre que dia sea intero)
                System.out.println("---->");
                nombreDia = "Número inválido (debe ser 1-7)";
                System.out.println("---->");
                break;
        }
        
        System.out.println("El día es: " + nombreDia);
        scanner.close();
    }

    
}
